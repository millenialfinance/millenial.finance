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
