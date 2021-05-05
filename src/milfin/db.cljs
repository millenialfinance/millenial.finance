(ns milfin.db
  (:require [milfin.routers :refer [ftm-routers]]))

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
   :enabled-tokens {
                    250 ["0xf16e81dce15b08f326220742020379b855b87df9"
                         "0x84311ecc54d7553378c067282940b0fdfb913675"
                         "0x5cc61a78f164885776aa610fb0fe1257df78e59b"
                         "0x30748322b6e34545dbe0788c421886aeb5297789"
                         "0x623ee4a7f290d11c11315994db70fb148b13021d"]
                    97 ["0xFE3171B9c20d002376D4B0097207EDf54b02EA3B"
                        "0xf16e81dce15B08F326220742020379B855B87DF9"
                        ]

                    }
   :migrator {:from ""
              :to "0x16327e3fbdaca3bcf7e38f5af2599d2ddc33ae52"
              :amt 0}
   :zapper {
            :zap-direction :in
            :zapin-amt 0
            :zapin-token ""
            :zapout-token ""
            }})
