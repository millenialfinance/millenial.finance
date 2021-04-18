(ns milfin.events
  (:require
   [milfin.ethers :as e ]
   [re-frame.core :as re-frame]
   [milfin.db :as db]
   [day8.re-frame.tracing :refer-macros [fn-traced]]
   [milfin.utils :refer [await]]
   ))

(re-frame/reg-event-db
 ::initialize-db
 (fn-traced [_ _]
   db/default-db))

(re-frame/reg-event-db
 ::store
 (fn-traced [db [_ k v]]
            (assoc db k v)))

(re-frame/reg-event-fx
 ::initialize-ether
 [(re-frame/inject-cofx :window-eth)]
 (fn-traced [cofx event]
            (let [db (:db cofx)
                  window-eth (:window-eth cofx)]
              {:eth-fetch [window-eth :addr :balance :network-name]
               })))

(re-frame/reg-cofx
 :window-eth
 (fn [cofx]
   (assoc cofx :window-eth (.-ethereum js/window))))

(re-frame/reg-fx
 :eth-fetch
 (fn [[window-eth & fields]]
   (.then (.enable window-eth) (fn []
                                 (re-frame/dispatch [::store :connected true])
                                 (doseq [f fields]
                                  (js/console.log f)
                                  (case f
                                    :addr (.then (e/get-addr) #(re-frame/dispatch [::store :addr %]))
                                    :balance (-> (e/get-addr)
                                                 (.then #(e/get-bal %))
                                                 (.then #(do
                                                           (js/console.log %)
                                                           (re-frame/dispatch [::store :balance %]))))
                                    :network-name (-> (e/get-web3-provider)
                                                      .getNetwork
                                                      (.then #(re-frame/dispatch [::store :chainId (.-chainId %)])))))))))
