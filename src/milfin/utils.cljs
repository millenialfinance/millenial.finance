(ns milfin.utils)

(defn await
  [promise]
  (-> promise
      (.then identity)))
