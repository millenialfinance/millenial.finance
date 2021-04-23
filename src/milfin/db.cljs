(ns milfin.db)

(def default-db
  {:name "re-frame"
   :addr "0x0"
   :balance 0
   :chainId 0
   :contracts []
   :provider nil
   :contracts-state {}
   :token-balances {}
   :zapper {
            :zapin-token nil
            :zapout-token nil
            }})
