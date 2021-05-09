(ns milfin.db
  (:require [milfin.routers :refer [ftm-routers]]
            [milfin.vaults :refer [ftm-vaults matic-vaults]]
            [milfin.tokens :refer [tokens]]))

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
   :enabled-routers {
                     250 ftm-routers
                     }
   :vaults {
            250 (into {} ftm-vaults)
            137 (into {} matic-vaults)
            }
   :enabled-tokens {
                    250 (into [] (keys (tokens 250)))
                    97 ["0xFE3171B9c20d002376D4B0097207EDf54b02EA3B"
                        "0xf16e81dce15B08F326220742020379B855B87DF9"
                        ]

                    }
   :migrator {:from ""
              :to "0x16327e3fbdaca3bcf7e38f5af2599d2ddc33ae52"
              :amt 0
              }
   :vaulter {:from ""
             :to "0x49b5988d48039794f6232b44D7ed8F9bF8b6F784"
             :amt 0
             :router ""
             :token ""}
   :zapper {
            :zap-direction :in
            :zapin-amt 0
            :zapin-token ""
            :zapout-token ""
            }})
