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
   :enabled-tokens {
                    250 ["0xf16e81dce15b08f326220742020379b855b87df9"
                         "0x84311ecc54d7553378c067282940b0fdfb913675"]
                    97 ["0xFE3171B9c20d002376D4B0097207EDf54b02EA3B"
                        "0xf16e81dce15B08F326220742020379B855B87DF9"]

                    }
   :zapper {
            :zap-direction :in
            :zapin-amt 0
            :zapin-token ""
            :zapout-token ""
            }})
