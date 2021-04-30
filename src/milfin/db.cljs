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
   :token-allowances {}
   :zapper {
            :zap-direction :in
            :zapin-amt 0
            :zapin-token ""
            :zapout-token ""
            }})
