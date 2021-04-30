(ns milfin.tokens)

(def bsc-tokens
  {
   "0xf16e81dce15B08F326220742020379B855B87DF9" {:name "Ice Token"
                                                 :address "0xf16e81dce15B08F326220742020379B855B87DF9"
                                                 :shortname "ICE"
                                                 :type :bep20}
   "0xFE3171B9c20d002376D4B0097207EDf54b02EA3B" {:name "Ice-BNB PancakeSwap LP Token"
                                                 :address "0xFE3171B9c20d002376D4B0097207EDf54b02EA3B"
                                                 :shortname "ICE/BNB P-LP"
                                                 :exchange :pancake
                                                 :type :lp}
   "0x0E09FaBB73Bd3Ade0a17ECC321fD13a19e81cE82" {:name "PancakeSwap Cake Token"
                                                 :address "0x0E09FaBB73Bd3Ade0a17ECC321fD13a19e81cE82"
                                                 :shortname "CAKE"
                                                 :type :bep20}
   "0x51F914a192a97408D991FddDAFB8F8537C5Ffb0a" {:name "Ice-BNB SushiSwap LP Token"
                                                 :address "0x51F914a192a97408D991FddDAFB8F8537C5Ffb0a"
                                                 :type :lp
                                                 :exchange :sushi
                                                 :shortname "ICE/BNB S-LP"}
   "0xe9e7CEA3DedcA5984780Bafc599bD69ADd087D56" {:name "Binance-Peg BUSD Token"
                                                 :address "0xe9e7CEA3DedcA5984780Bafc599bD69ADd087D56"
                                                 :shortname "BUSD"
                                                 :type :bep20}
   })
