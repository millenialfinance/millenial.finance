(ns milfin.subs
  (:require
   [re-frame.core :as re-frame]))

(re-frame/reg-sub
 ::name
 (fn [db]
   (:name db)))

(re-frame/reg-sub
 ::addr
 (fn [db]
   (:addr db)))

(re-frame/reg-sub
 ::balance
 (fn [db]
   (:balance db)))


(re-frame/reg-sub
 ::connected
 (fn [db]
   (:connected db)))

(re-frame/reg-sub
 ::chainId
 (fn [db]
   (:chainId db)))

(re-frame/reg-sub
 ::contracts
 (fn [db]
   (:contracts db)))

(re-frame/reg-sub
 ::contracts-state
 (fn [db [_ contract-kw]]
   (contract-kw (:contracts-state db))))

(re-frame/reg-sub
 ::zapin-token
 (fn [db]
   (:zapin-token (:zapper db))))

(re-frame/reg-sub
 ::zapin-amt
 (fn [db]
   (:zapin-amt (:zapper db))))

(re-frame/reg-sub
 ::zapper-state
 (fn [db]
   (:zapper db)))

(re-frame/reg-sub
 ::zapout-token
 (fn [db]
   (:zapout-token (:zapper db))))

(re-frame/reg-sub
 ::token-balances
 (fn [db]
   (:token-balances (:contracts-state db))))

(re-frame/reg-sub
 ::token-allowances
 (fn [db]
   (:token-allowances (:contracts-state db))))
