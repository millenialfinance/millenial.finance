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
  "0x74b23882a30290451A17c44f4F05243b6b58C76d" {:name "Wrapped Ether"
                                                :address "0x74b23882a30290451A17c44f4F05243b6b58C76d"
                                                 :shortname "wETH"
                                                 :type :erc20}
   "0x321162Cd933E2Be498Cd2267a90534A804051b11"{:name "Wrapped Bitcoin"
                                                :address "0x321162Cd933E2Be498Cd2267a90534A804051b11"
                                                 :shortname "wBTC"
                                                 :type :erc20}
    "0xAd84341756Bf337f5a0164515b1f6F993D194E1f"  {:name "fUSD"
                                                :address "0xAd84341756Bf337f5a0164515b1f6F993D194E1f"
                                                 :shortname "fUSD"
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
                                                 :exchange :spirit
                                                 :router-addr "0x16327e3fbdaca3bcf7e38f5af2599d2ddc33ae52"
                                                 }
   "0x623ee4a7f290d11c11315994db70fb148b13021d" {:name "ICE/FTM SpookySwap LP Token"
                                                 :address "0x623ee4a7f290d11c11315994db70fb148b13021d"
                                                 :shortname "ICE/FTM Spooky LP"
                                                 :type :lp
                                                 :exchange :spooky
                                                 :router-addr "0xf491e7b69e4244ad4002bc14e878a34207e38c29"
                                                 }
    "0x936d23c83c2469f6a14b9f5beaec13879598a5ac" {:name "ICE/FTM SpiritSwap LP Token"
                                                 :address "0x936d23c83c2469f6a14b9f5beaec13879598a5ac"
                                                 :shortname "ICE/FTM Spirit LP"
                                                 :type :lp
                                                 :exchange :spirit
                                                 :router-addr "0x16327e3fbdaca3bcf7e38f5af2599d2ddc33ae52"
                                                 }
   "0x74772FBe8ea1b9aD1D750D6334Cdb8C3e227D6ED" {:name "SPIRIT/fUSD SpiritSwap LP Token"
                                                 :address "0x74772FBe8ea1b9aD1D750D6334Cdb8C3e227D6ED"
                                                 :shortname "SPIRIT/fUSD Spirit LP"
                                                 :type :lp
                                                 :exchange :spirit
                                                 :router-addr "0x16327e3fbdaca3bcf7e38f5af2599d2ddc33ae52"
                                                 }

   "0x279b2c897737a50405ED2091694F225D83F2D3bA" {:name "FTM/wBTC SpiritSwap LP Token"
                                                 :address "0x279b2c897737a50405ED2091694F225D83F2D3bA"
                                                 :shortname "FTM/wBTC Spirit LP"
                                                 :type :lp
                                                 :exchange :spirit
                                                 :router-addr "0x16327e3fbdaca3bcf7e38f5af2599d2ddc33ae52"
                                                 }
   "0xD5FD7B691FCe916E4Fa920f126c2B5Ddb620d019" {:name "fUSD/wBTC SpiritSwap LP Token"
                                                 :address "0xD5FD7B691FCe916E4Fa920f126c2B5Ddb620d019"
                                                 :shortname "fUSD/wBTC Spirit LP"
                                                 :type :lp
                                                 :exchange :spirit
                                                 :router-addr "0x16327e3fbdaca3bcf7e38f5af2599d2ddc33ae52"
                                                 }
    "0x613BF4E46b4817015c01c6Bb31C7ae9edAadc26e" {:name "FTM/wETH SpiritSwap LP Token"
                                                  :address "0x613BF4E46b4817015c01c6Bb31C7ae9edAadc26e"
                                                 :shortname "FTM/wETH Spirit LP"
                                                 :type :lp
                                                 :exchange :spirit
                                                 :router-addr "0x16327e3fbdaca3bcf7e38f5af2599d2ddc33ae52"
                                                 }
   })


(def tokens
  {
   :bsc bsc-tokens
   :ftm ftm-tokens
   250 ftm-tokens
   97 bsc-tokens
   })
