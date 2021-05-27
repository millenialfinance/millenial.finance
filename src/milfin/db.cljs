(ns milfin.db
  (:require
            [milfin.vaults :refer [ftm-vaults matic-vaults providers]]
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
   :vaults {
            250 (into {} ftm-vaults)
            137 (into {} matic-vaults)
            }
   :vault-providers providers
   :enabled-tokens {
                    250 (into [] (keys (tokens 250)))
                    137 (into [] (keys (tokens 137)))
                    97 ["0xFE3171B9c20d002376D4B0097207EDf54b02EA3B"
                        "0xf16e81dce15B08F326220742020379B855B87DF9"
                        ]

                    }
   :migrator {:from ""
              :to "0x16327e3fbdaca3bcf7e38f5af2599d2ddc33ae52"
              :amt 0
              }
   :vaulter {:from ""
             :to ""
             :amt "0"
             :provider :grim
             :router ""
             :token ""}
   :zapper {
            :zap-direction :in
            :zapin-amt 0
            :zapin-token ""
            :zapout-token ""
            :token0 ""
            :token1 ""
            }})
