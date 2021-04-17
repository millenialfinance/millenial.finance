(ns milfin.events
  (:require
   [milfin.ethers :refer [get-web3-provider window-eth]]
   [re-frame.core :as re-frame]
   [milfin.db :as db]
   [day8.re-frame.tracing :refer-macros [fn-traced]]
   ))

(re-frame/reg-event-db
 ::initialize-db
 (fn-traced [_ _]
   db/default-db))

(re-frame/reg-event-db
 ::initialize-ether
 (fn-traced [db event]
            (-> db
                (assoc :provider (-> (window-eth)
                                  .enable
                                  (.then get-web3-provider)))
                (assoc :connected true))))

(re-frame/reg-event-db
 ::get-address
 (fn-traced [db event]
            (let [provider (:provider db)
                  addr (:addr db)]
              (assoc db :addr
                     (-> provider
                   (.getBalance addr)
                   (.then identity))))))
