(ns milfin.tokens)

(def bsc-tokens
  {
   "0x0" {:name "Binance Token"
            :shortname "BNB"
            :type :native
            :address "0x0"}
   "0xf16e81dce15B08F326220742020379B855B87DF9" {:name "Ice Token"
                                                 :address "0xf16e81dce15B08F326220742020379B855B87DF9"
                                                 :shortname "ICE"
                                                 :type :erc20}
   "0xFE3171B9c20d002376D4B0097207EDf54b02EA3B" {:name "Ice-BNB PancakeSwap LP Token"
                                                 :address "0xFE3171B9c20d002376D4B0097207EDf54b02EA3B"
                                                 :shortname "ICE/BNB P-LP"
                                                 :exchange :pancake
                                                 :type :lp}
   "0x0E09FaBB73Bd3Ade0a17ECC321fD13a19e81cE82" {:name "PancakeSwap Cake Token"
                                                 :address "0x0E09FaBB73Bd3Ade0a17ECC321fD13a19e81cE82"
                                                 :shortname "CAKE"
                                                 :type :erc20}
   "0x51F914a192a97408D991FddDAFB8F8537C5Ffb0a" {:name "Ice-BNB SushiSwap LP Token"
                                                 :address "0x51F914a192a97408D991FddDAFB8F8537C5Ffb0a"
                                                 :type :lp
                                                 :exchange :sushi
                                                 :shortname "ICE/BNB S-LP"}
   "0xe9e7CEA3DedcA5984780Bafc599bD69ADd087D56" {:name "Binance-Peg BUSD Token"
                                                 :address "0xe9e7CEA3DedcA5984780Bafc599bD69ADd087D56"
                                                 :shortname "BUSD"
                                                 :type :erc20}
   })

(def ftm-tokens
  {
   "0x0" {:name "Fantom"
            :shortname "FTM"
            :type :native
          :address "0x0"}
   "0xf16e81dce15b08f326220742020379b855b87df9" {:name "Ice Token"
                                                 :address "0xf16e81dce15b08f326220742020379b855b87df9"
                                                 :shortname "ICE"
                                                 :type :erc20}
   "0x84311ecc54d7553378c067282940b0fdfb913675" {:name "ICE/FTM SushiSwap LP Token"
                                                 :address "0x84311ecc54d7553378c067282940b0fdfb913675"
                                                 :shortname "ICE/FTM Sushi LP"
                                                 :type :lp
                                                 :router-addr "0x1b02dA8Cb0d097eB8D57A175b88c7D8b47997506"
                                                 :exchange :sushi}
    "0x5cc61a78f164885776aa610fb0fe1257df78e59b" {:name "Spirit Token"
                                                 :address "0x5cc61a78f164885776aa610fb0fe1257df78e59b"
                                                 :shortname "SPIRIT"
                                                 :type :erc20
                                                 :router-addr "0x30748322B6E34545DBe0788C421886AEB5297789"}
   "0x30748322b6e34545dbe0788c421886aeb5297789" {:name "SPIRIT/FTM SpiritSwap LP Token"
                                                 :address "0x30748322b6e34545dbe0788c421886aeb5297789"
                                                 :shortname "SPIRIT/FTM Spirit LP"
                                                 :type :lp
                                                 :router-addr "0x16327e3fbdaca3bcf7e38f5af2599d2ddc33ae52"
                                                 }
   "0x623ee4a7f290d11c11315994db70fb148b13021d" {:name "ICE/FTM SpookySwap LP Token"
                                                 :address "0x623ee4a7f290d11c11315994db70fb148b13021d"
                                                 :shortname "ICE/FTM Spooky LP"
                                                 :type :lp
                                                 :router-addr "0xf491e7b69e4244ad4002bc14e878a34207e38c29"
                                                 }

   })


(def tokens
  {
   :bsc bsc-tokens
   :ftm ftm-tokens
   250 ftm-tokens
   97 bsc-tokens
   })
