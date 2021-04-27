(ns milfin.events
  (:require
   [milfin.ethers :as e]
   [cljs.core.async :refer [go]]
   [cljs.core.async.interop :refer-macros [<p!]]
   [re-frame.core :as re-frame]
   [milfin.db :as db]
   [day8.re-frame.tracing :refer-macros [fn-traced]]
   [milfin.chains :refer [chainId->chain]]
   [milfin.contracts :refer [chain->contracts]]))

(re-frame/reg-event-db
 ::initialize-db
 (fn-traced [_ _]
            db/default-db))

(re-frame/reg-event-db
 ::store
 (fn-traced [db [_ k v]]
            (assoc db k v)))

(re-frame/reg-event-db
 ::store-in
 (fn-traced [db [_ ks v]]
            (assoc-in db ks v)))

(re-frame/reg-event-db
 ::store-contract-state
 (fn-traced [db [_ keys val]]
            (let [ks (apply conj [:contracts-state] keys)]
              (assoc-in db ks val))))

(re-frame/reg-event-fx
 ::initialize-ether
 [(re-frame/inject-cofx :window-eth)]
 (fn-traced [cofx event]
            (let [db (:db cofx)
                  window-eth (:window-eth cofx)]
              {:eth-fetch [window-eth :addr :balance :network-name]})))

(re-frame/reg-event-fx
 ::load-contracts
 [(re-frame/inject-cofx :contracts)]
 (fn-traced [cofx [_ network]]
            (let [db (:db cofx)
                  contracts (:contracts cofx)]
              {:db (assoc db :contracts (chain->contracts network))})))

(re-frame/reg-event-fx
 ::call-contract
 [(re-frame/inject-cofx :window-eth)]
 (fn-traced [cofx [_ contract fn keys & a]]
            (let [window-eth (:window-eth cofx)]
              {:eth-call (apply conj [window-eth contract fn keys] a)})))

(re-frame/reg-event-fx
 ::call-contract-write
 [(re-frame/inject-cofx :window-eth)]
 (fn-traced [cofx [_ contract fn keys args]]
            (let [window-eth (:window-eth cofx)]
              {:eth-call-write (conj [window-eth contract fn keys] args)})))

(re-frame/reg-event-fx
 ::get-bep20-bal
 [(re-frame/inject-cofx :window-eth) (re-frame/inject-cofx :contracts)]
 (fn-traced [cofx [_ token-addr wallet-addr]]
            (let [window-eth (:window-eth cofx)
                  contracts (:contracts cofx)
                  bep20 (:bep20 (:bsc contracts))
                  contract (assoc bep20 :addr token-addr)]
              {:eth-call [window-eth contract "balanceOf" [:token-balances token-addr] [wallet-addr]]})))

(re-frame/reg-cofx
 :window-eth
 (fn [cofx]
   (assoc cofx :window-eth (.-ethereum js/window))))

(re-frame/reg-cofx
 :contracts
 (fn [cofx]
   (assoc cofx :contracts chain->contracts)))

(defn instantiate-contract
  [{:keys [abistr addr]}]
  (let [provider (e/get-web3-provider)]
    (e/instantiate-contract addr abistr provider))
  )

(defn instantiate-contract-write
  [{:keys [abistr addr]}]
   (let [provider (e/get-web3-provider)
         signer (.getSigner provider)]
     (-> addr
         (e/instantiate-contract abistr provider)
         (.connect signer))))

(re-frame/reg-fx
 :eth-call
 (fn [[window-eth _contract f keys a]]
   (go
     (let [eth (<p! (.enable window-eth))
           contract (instantiate-contract _contract)
           result (<p! (apply js-invoke contract f a))]
       (re-frame/dispatch [::store-contract-state keys result])))))

(re-frame/reg-fx
 :eth-call-write
 (fn [[window-eth _contract f keys a]]
   (go
     (let [eth (<p! (.enable window-eth))
           contract (instantiate-contract-write _contract)
           result (apply js-invoke contract f a)]
       (re-frame/dispatch [::store-contract-state keys result])))))

(re-frame/reg-fx
 :eth-fetch
 (fn [[window-eth & fields]]
   (go
     (let [eth (<p! (.enable window-eth))]
       (re-frame/dispatch [::store :connected true])
       (doseq [f fields]
         (case f
           :addr (re-frame/dispatch [::store :addr (<p! (e/get-addr))])
           :balance (let [addr (<p! (e/get-addr))
                          bal (<p! (e/get-bal addr))]
                      (re-frame/dispatch [::store :balance bal]))
           :network-name (let [provider (e/get-web3-provider)
                               n (<p! (.getNetwork provider))
                               chainId (.-chainId n)
                               chain (chainId->chain chainId)
                               kwd (keyword (clojure.string/lower-case (:chain chain)))]
                           (re-frame/dispatch [::load-contracts kwd])
                           (re-frame/dispatch [::store :chainId chainId])
                           )))))))

(defn fetch-pool-info
  [contract kw addr]
  (doseq [poolId [0 1 2]]
    (re-frame/dispatch-sync [::call-contract contract "userInfo" [kw :userInfo poolId] [poolId addr]])
    (re-frame/dispatch-sync [::call-contract contract (:pending-reward-fn-name contract) [kw :pendingReward poolId] [poolId addr]])
    (re-frame/dispatch-sync [::call-contract contract "poolInfo" [kw :poolInfo poolId] [poolId]])))
