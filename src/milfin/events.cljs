(ns milfin.events
  (:require
   [milfin.ethers :as e]
   [cljs.core.async :refer [go <!]]
   [clojure.string]
   [cljs.core.async.interop :refer-macros [<p!]]
   [re-frame.core :as re-frame]
   [milfin.covalent :as covalent]
   [milfin.db :as db]
   [day8.re-frame.tracing :refer-macros [fn-traced]]
   [milfin.chains :refer [chainId->chain]]
   [milfin.contracts :refer [chain->contracts]]
   [milfin.tokens :as tokenlist]))

(re-frame/reg-event-db
 ::initialize-db
 (fn-traced [_ _]
            db/default-db))


(re-frame/reg-event-db
 ::store
 (fn-traced [db [_ k v]]
            (assoc db k v)))

(re-frame/reg-event-db
 ::set-from-router
 (fn-traced [db [_ router]]
            (-> db
                (assoc-in [:migrator :from-router] router)
                (assoc-in [:migrator :from-token] {}))))

(re-frame/reg-event-db
 ::set-to-router
 (fn-traced [db [_ router]]
            (-> db
                (assoc-in [:migrator :to-router] router)
                )))

(re-frame/reg-event-db
 ::set-migrator-from-token
 (fn-traced [db [_ token]]
            (let [token (get (tokenlist/tokens (:chainId db)) token {})]
              (assoc-in db [:migrator :from-token] token))))


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
 (fn-traced [cofx]
            (let [
                  window-eth (:window-eth cofx)]
              {:eth-fetch [window-eth :addr :balance :network-name]})))

(re-frame/reg-event-fx
 ::fetch-balance
 [(re-frame/inject-cofx :window-eth)]
 (fn-traced [cofx ]
            (let [
                  window-eth (:window-eth cofx)]
              {:eth-fetch [window-eth :balance :network-name]})))

(re-frame/reg-event-fx
 ::fetch-covalent-balances
 (fn-traced [cofx ]
            (let [{:keys [chainId addr]} (:db cofx)]
              {:covalent-balances [chainId addr]})))

(re-frame/reg-event-fx
 ::load-contracts
 [(re-frame/inject-cofx :contracts)]
 (fn-traced [cofx [_ network]]
            (let [db (:db cofx)
                  ]
              {:db (assoc db :contracts (chain->contracts network))})))

(re-frame/reg-event-fx
 ::call-contract
 [(re-frame/inject-cofx :window-eth)]
 (fn-traced [cofx [_ contract fn keys a]]
            (let [window-eth (:window-eth cofx)]
              (js/console.log "In call-contract" (clj->js contract))
              {:eth-call (conj [window-eth contract fn keys] a)})))

(re-frame/reg-event-fx
 ::call-contract-write
 [(re-frame/inject-cofx :window-eth)]
 (fn-traced [cofx [_ contract fn keys args]]
            (let [window-eth (:window-eth cofx)]
              (js/console.log "In call-contract-write" (clj->js contract))
              {:eth-call-write (conj [window-eth contract fn keys] args)})))

(re-frame/reg-event-fx
 ::call-contract-write-paid
 [(re-frame/inject-cofx :window-eth)]
 (fn-traced [cofx [_ val contract fn keys args]]
            (let [window-eth (:window-eth cofx)]
              (js/console.log "In call-contract-write-paid" (clj->js contract))
              {:eth-call-write-paid (conj [window-eth val contract fn keys] args)})))

(re-frame/reg-event-fx
 ::get-erc20-bal
 [(re-frame/inject-cofx :window-eth) (re-frame/inject-cofx :contracts)]
 (fn-traced [cofx [_ token-addr wallet-addr]]
            (let [window-eth (:window-eth cofx)
                  contracts (:contracts cofx)
                  erc20 (:erc20 (:utils contracts))
                  contract (assoc erc20 :addr token-addr)]
              {:eth-call [window-eth contract "balanceOf" [:token-balances token-addr] [wallet-addr]]})))

(re-frame/reg-event-fx
 ::get-erc20-allowance
 [(re-frame/inject-cofx :window-eth) (re-frame/inject-cofx :contracts)]
 (fn-traced [cofx [_ token-addr wallet-addr contract-addr]]
            (let [window-eth (:window-eth cofx)
                  contracts (:contracts cofx)
                  erc20 (:erc20 (:utils contracts))
                  contract (assoc erc20 :addr token-addr)]
              {:eth-call [window-eth contract "allowance" [:token-allowances token-addr] [wallet-addr contract-addr]]})))

(re-frame/reg-event-fx
 ::approve-erc20
 [(re-frame/inject-cofx :window-eth) (re-frame/inject-cofx :contracts)]
 (fn-traced [cofx [_ token-addr contract-addr]]
            (let [window-eth (:window-eth cofx)
                  contracts (:contracts cofx)
                  erc20 (:erc20 (:utils contracts))
                  contract (assoc erc20 :addr token-addr)]
              (js/console.log (clj->js contract))
              {:eth-call-write [window-eth contract "approve" [:pending-token-approvals token-addr] [contract-addr (.toHexString (.parseEther e/utils "1000000000000"))]]})))



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
         signer (.getSigner provider)
         contract (-> addr
         (e/instantiate-contract abistr provider)
         (.connect signer)
         )]
     (do
       (js/console.log contract)
       contract)
     ))

(re-frame/reg-fx
 :eth-call
 (fn [[window-eth _contract f keys a]]
   (go
     (let [_ (<p! (.enable window-eth))
           contract (instantiate-contract _contract)
           result (<p! (apply js-invoke contract f a))]
       (re-frame/dispatch [::store-contract-state keys result])))))

(re-frame/reg-fx
 :eth-call-write
 (fn [[window-eth _contract f keys a]]
   (go
     (let [_ (<p! (.enable window-eth))
           contract (instantiate-contract-write _contract)
           args (into [] (conj a (clj->js {:gasLimit "1400000"})))
           result (<p! (apply js-invoke contract f args))]
       (re-frame/dispatch [::store-contract-state keys result])))))

(re-frame/reg-fx
 :eth-call-write-paid
 (fn [[window-eth val _contract f keys a]]
   (go
     (let [_ (<p! (.enable window-eth))
           contract (instantiate-contract-write _contract)
           args (into [] (conj a (clj->js {:value val :gasLimit "1400000"})))
           result (<p! (apply js-invoke contract f args))]
       (re-frame/dispatch [::store-contract-state keys result])))))

(re-frame/reg-fx
 :covalent-balances
 (fn [[chainId addr]]
   (go
     (let [response (<! (covalent/get-balances chainId addr))
           d (:data (:body response))
           ]
       (re-frame/dispatch [::store-in [:covalent :balances] d])))))

(re-frame/reg-fx
 :eth-fetch
 (fn [[window-eth & fields]]
   (go
     (let [_ (<p! (.enable window-eth))]
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
                               addr (<p! (e/get-addr))
                               kwd (keyword (clojure.string/lower-case (:chain chain)))]
                           (re-frame/dispatch [::load-contracts chainId])
                           (re-frame/dispatch [::store :chainId chainId])
                           (re-frame/dispatch [::fetch-covalent-balances chainId addr])
                           )))))))

(defn fetch-pool-info
  [contract kw addr]
  (doseq [poolId [0 1 2]]
    (re-frame/dispatch [::call-contract contract "userInfo" [kw :userInfo (str poolId)] [poolId addr]])
    (re-frame/dispatch [::call-contract contract (:pending-reward-fn-name contract) [kw :pendingReward (str poolId)] [poolId addr]])
    (re-frame/dispatch [::call-contract contract "poolInfo" [kw :poolInfo (str poolId)] [poolId]])))
