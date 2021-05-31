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

(def matic-tokens
  {
   "0x0" {:name "MATIC"
          :shortname "MATIC"
          :type :native
          :address "0x0"}
   "0x7ceB23fD6bC0adD59E62ac25578270cFf1b9f619" {:name "Wrapped Ethereum"
                                                 :address "0x7ceB23fD6bC0adD59E62ac25578270cFf1b9f619"
                                                 :shortname "wETH"
                                                 :type :erc20}
 "0x1BFD67037B42Cf73acF2047067bd4F2C47D9BfD6"  {:name "Wrapped Bitcoin"
                                                :address "0x1BFD67037B42Cf73acF2047067bd4F2C47D9BfD6"
                                                 :shortname "wBTC"
                                                 :type :erc20}
  #_ "0x2cf7252e74036d1da831d11089d326296e64a728" #_{:name "USDC/USDT Quickswap LP Token"
                                                 :address "0x2cf7252e74036d1da831d11089d326296e64a728"
                                                 :exchange :quick
                                                 :router-addr "0xa5E0829CaCEd8fFDD4De3c43696c57F7D7A678ff"
                                                 :shortname "USDC/USDT Q-LP"
                                                 :type :lp}
   "0xdC9232E2Df177d7a12FdFf6EcBAb114E2231198D" {:name "wBTC/ETH Quickswap LP Token"
                                                 :address "0xdC9232E2Df177d7a12FdFf6EcBAb114E2231198D"
                                                 :exchange :quick
                                                 :router-addr "0xa5E0829CaCEd8fFDD4De3c43696c57F7D7A678ff"
                                                 :shortname "wBTC/ETH Q-LP"
                                                 :type :lp}
   })

(def ftm-tokens
  {
   "0x0" {:name "Fantom"
            :shortname "FTM"
            :type :native
          :address "0x0"}
   "0xb3654dc3d10ea7645f8319668e8f54d2574fbdc8" {:name "Chainlink Token"
                                                 :address "0xb3654dc3d10ea7645f8319668e8f54d2574fbdc8"
                                                 :shortname "LINK"
                                                 :type :erc20}
   "0x04068da6c83afcfa0e13ba15a6696662335d5b75" {:name "USDC"
                                                 :address "0x04068da6c83afcfa0e13ba15a6696662335d5b75"
                                                 :shortname "USDC"
                                                 :type :erc20}
   "0xae75a438b2e0cb8bb01ec1e1e376de11d44477cc" {:name "Sushi"
                                                 :address "0xae75a438b2e0cb8bb01ec1e1e376de11d44477cc"
                                                 :shortname "SUSHI"
                                                 :type :erc20}
   "0xd67de0e0a0fd7b15dc8348bb9be742f3c5850454" {:name "Binance Token"
                                                 :address "0xd67de0e0a0fd7b15dc8348bb9be742f3c5850454"
                                                 :shortname "BNB"
                                                 :type :erc20}
   "0x6a07a792ab2965c72a5b8088d3a069a7ac3a993b" {:name "AAVE"
                                                 :address "0x6a07a792ab2965c72a5b8088d3a069a7ac3a993b"
                                                 :shortname "AAVE"
                                                 :type :erc20}
   "0x1e4f97b9f9f913c46f1632781732927b9019c68b" {:name "Curve DAO"
                                                 :address "0x1e4f97b9f9f913c46f1632781732927b9019c68b"
                                                 :shortname "CRV"
                                                 :type :erc20}
   "0x657a1861c15a3ded9af0b6799a195a249ebdcbc6" {:name "Cream"
                                                 :address "0x657a1861c15a3ded9af0b6799a195a249ebdcbc6"
                                                 :shortname "CREAM"
                                                 :type :erc20}
   "0xaf319e5789945197e365e7f7fbfc56b130523b33" {:name "Frax"
                                                 :address "0xaf319e5789945197e365e7f7fbfc56b130523b33"
                                                 :shortname "FRAX"
                                                 :type :erc20}
   "0x956DE13EA0FA5b577E4097Be837BF4aC80005820" {:name "FTM-BNB SpookySwap LP Token"
                                                 :address "0x956DE13EA0FA5b577E4097Be837BF4aC80005820"
                                                 :router-addr "0xf491e7b69e4244ad4002bc14e878a34207e38c29"
                                                 :shortname "FTM/BNB LP"
                                                 :type :lp}
   "0xf16e81dce15b08f326220742020379b855b87df9" {:name "Ice Token"
                                                 :address "0xf16e81dce15b08f326220742020379b855b87df9"
                                                 :shortname "ICE"
                                                 :type :erc20}
   #_"0x841FAD6EAe12c286d1Fd18d1d525DFfA75C7EFFE"  #_{:name "Boo Token"
                                                  :address "0x841FAD6EAe12c286d1Fd18d1d525DFfA75C7EFFE"
                                                 :shortname "BOO"
                                                 :type :erc20}
  "0x74b23882a30290451A17c44f4F05243b6b58C76d" {:name "Wrapped Ether"
                                                :address "0x74b23882a30290451A17c44f4F05243b6b58C76d"
                                                 :shortname "wETH"
                                                 :type :erc20}
   "0x321162Cd933E2Be498Cd2267a90534A804051b11"{:name "Wrapped Bitcoin"
                                                :address "0x321162Cd933E2Be498Cd2267a90534A804051b11"
                                                 :shortname "wBTC"
                                                 :type :erc20}
    #_"0xAd84341756Bf337f5a0164515b1f6F993D194E1f"  #_{:name "fUSD"
                                                :address "0xAd84341756Bf337f5a0164515b1f6F993D194E1f"
                                                 :shortname "fUSD"
                                                 :type :erc20}
   "0x84311ecc54d7553378c067282940b0fdfb913675" {:name "FTM/ICE SushiSwap LP Token"
                                                 :address "0x84311ecc54d7553378c067282940b0fdfb913675"
                                                 :shortname "FTM/ICE Sushi LP"
                                                 :type :lp
                                                 :router-addr "0x1b02dA8Cb0d097eB8D57A175b88c7D8b47997506"
                                                 :exchange :sushi}
    #_"0x5cc61a78f164885776aa610fb0fe1257df78e59b" #_{:name "Spirit Token"
                                                 :address "0x5cc61a78f164885776aa610fb0fe1257df78e59b"
                                                 :shortname "SPIRIT"
                                                 :type :erc20
                                                  :router-addr "0x16327e3fbdaca3bcf7e38f5af2599d2ddc33ae52"}
   "0x30748322b6e34545dbe0788c421886aeb5297789" {:name "SPIRIT/FTM SpiritSwap LP Token"
                                                 :address "0x30748322b6e34545dbe0788c421886aeb5297789"
                                                 :shortname "SPIRIT/FTM Spirit LP"
                                                 :type :lp
                                                 :exchange :spirit
                                                 :router-addr "0x16327e3fbdaca3bcf7e38f5af2599d2ddc33ae52"
                                                 }
   "0x623ee4a7f290d11c11315994db70fb148b13021d" {:name "FTM/ICE SpookySwap LP Token"
                                                 :address "0x623ee4a7f290d11c11315994db70fb148b13021d"
                                                 :shortname "FTM/ICE Spooky LP"
                                                 :type :lp
                                                 :exchange :spooky
                                                 :router-addr "0xf491e7b69e4244ad4002bc14e878a34207e38c29"
                                                 }
    "0x936d23c83c2469f6a14b9f5beaec13879598a5ac" {:name "FTM/ICE SpiritSwap LP Token"
                                                 :address "0x936d23c83c2469f6a14b9f5beaec13879598a5ac"
                                                 :shortname "FTM/ICE Spirit LP"
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
   "0xfdb9ab8b9513ad9e419cf19530fee49d412c3ee3"  {:name "FTM/wBTC SpookySwap LP Token"
                                                 :address "0xfdb9ab8b9513ad9e419cf19530fee49d412c3ee3"
                                                 :shortname "FTM/wBTC Spooky LP"
                                                 :type :lp
                                                 :exchange :spooky
                                                 :router-addr "0xf491e7b69e4244ad4002bc14e878a34207e38c29"
                                                 }
   "0xf0702249f4d3a25cd3ded7859a165693685ab577"  {:name "FTM/wETH SpookySwap LP Token"
                                                  :address "0xf0702249f4d3a25cd3ded7859a165693685ab577"
                                                 :shortname "FTM/wETH Spooky LP"
                                                 :type :lp
                                                 :exchange :spooky
                                                 :router-addr "0xf491e7b69e4244ad4002bc14e878a34207e38c29"
                                                 }
   "0x2b4c76d0dc16be1c31d4c1dc53bf9b45987fc75c"  {:name "USDC/FTM SpookySwap LP Token"
                                                  :address "0x2b4c76d0dc16be1c31d4c1dc53bf9b45987fc75c"
                                                 :shortname "USDC/FTM Spooky LP"
                                                 :type :lp
                                                 :exchange :spooky
                                                 :router-addr "0xf491e7b69e4244ad4002bc14e878a34207e38c29"
                                                 }
   "0x5965e53aa80a0bcf1cd6dbdd72e6a9b2aa047410"  {:name "fUSDT/FTM SpookySwap LP Token"
                                                  :address "0x5965e53aa80a0bcf1cd6dbdd72e6a9b2aa047410"
                                                 :shortname "fUSDT/FTM Spooky LP"
                                                 :type :lp
                                                 :exchange :spooky
                                                 :router-addr "0xf491e7b69e4244ad4002bc14e878a34207e38c29"
                                                 }
   "0xebf374bb21d83cf010cc7363918776adf6ff2bf6"  {:name "FTM/AAVE SpookySwap LP Token"
                                                  :address "0xebf374bb21d83cf010cc7363918776adf6ff2bf6"
                                                 :shortname "FTM/AAVE Spooky LP"
                                                 :type :lp
                                                 :exchange :spooky
                                                 :router-addr "0xf491e7b69e4244ad4002bc14e878a34207e38c29"
                                                 }
   "0x1c94665fd3ecfa969feda7ed01e35522e6982022"  {:name "FTM/BADGER SpookySwap LP Token"
                                                  :address "0x1c94665fd3ecfa969feda7ed01e35522e6982022"
                                                 :shortname "FTM/BADGER Spooky LP"
                                                 :type :lp
                                                 :exchange :spooky
                                                 :router-addr "0xf491e7b69e4244ad4002bc14e878a34207e38c29"
                                                 }
   "0x91b39d5584e2a7dc829f696235742cc293f2e8cf"  {:name "FTM/BAND SpookySwap LP Token"
                                                  :address "0x91b39d5584e2a7dc829f696235742cc293f2e8cf"
                                                 :shortname "FTM/BAND Spooky LP"
                                                 :type :lp
                                                 :exchange :spooky
                                                 :router-addr "0xf491e7b69e4244ad4002bc14e878a34207e38c29"
                                                 }
   "0x5dc7848bf215f1d99f2af3d2bf78fcdf238ee34b"  {:name "FTM/COVER SpookySwap LP Token"
                                                  :address "0x5dc7848bf215f1d99f2af3d2bf78fcdf238ee34b"
                                                  :shortname "FTM/COVER Spooky LP"
                                                  :type :lp
                                                  :exchange :spooky
                                                  :router-addr "0xf491e7b69e4244ad4002bc14e878a34207e38c29"
                                                 }
   "0xb471ac6ef617e952b84c6a9ff5de65a9da96c93b"  {:name "CRV/FTM SpookySwap LP Token"
                                                  :address  "0xb471ac6ef617e952b84c6a9ff5de65a9da96c93b"
                                                  :shortname "FTM/CRV Spooky LP"
                                                  :type :lp
                                                  :exchange :spooky
                                                  :router-addr "0xf491e7b69e4244ad4002bc14e878a34207e38c29"
                                                 }
   "0xe120ffbda0d14f3bb6d6053e90e63c572a66a428" {:name "FTM/DAI SpookySwap LP Token"
                                                 :address "0xe120ffbda0d14f3bb6d6053e90e63c572a66a428"
                                                  :shortname "FTM/DAI Spooky LP"
                                                  :type :lp
                                                  :exchange :spooky
                                                  :router-addr "0xf491e7b69e4244ad4002bc14e878a34207e38c29"
                                                 }
   "0x89d9bc2f2d091cfbfc31e333d6dc555ddbc2fd29" {:name "FTM/LINK SpookySwap LP Token"
                                                 :address "0x89d9bc2f2d091cfbfc31e333d6dc555ddbc2fd29"
                                                  :shortname "FTM/LINK Spooky LP"
                                                  :type :lp
                                                  :exchange :spooky
                                                  :router-addr "0xf491e7b69e4244ad4002bc14e878a34207e38c29"
                                                 }
   "0x01424c64c4744769299019be64f3d82898ff28f3" {:name "FTM/SFI SpookySwap LP Token"
                                                 :address "0x01424c64c4744769299019be64f3d82898ff28f3"
                                                  :shortname "FTM/SFI Spooky LP"
                                                  :type :lp
                                                  :exchange :spooky
                                                  :router-addr "0xf491e7b69e4244ad4002bc14e878a34207e38c29"
                                                 }
   "0x06d173628be105fe81f1c82c9979ba79ebcafcb7" {:name "FTM/SNX SpookySwap LP Token"
                                                 :address "0x06d173628be105fe81f1c82c9979ba79ebcafcb7"
                                                 :shortname "FTM/SNX Spooky LP"
                                                 :type :lp
                                                 :exchange :spooky
                                                 :router-addr "0xf491e7b69e4244ad4002bc14e878a34207e38c29"
                                                 }
   "0xf84e313b36e86315af7a06ff26c8b20e9eb443c3"  {:name "FTM/SUSHI SpookySwap LP Token"
                                                  :address "0xf84e313b36e86315af7a06ff26c8b20e9eb443c3"
                                                 :shortname "FTM/SUSHI Spooky LP"
                                                 :type :lp
                                                 :exchange :spooky
                                                 :router-addr "0xf491e7b69e4244ad4002bc14e878a34207e38c29"
                                                 }
   #_"0xbf4d61d4cec3a9dff7452d8987e1cc2943e2eb4c" #_{:name "FTM/YFI SpookySwap LP Token"
                                                 :address "0xbf4d61d4cec3a9dff7452d8987e1cc2943e2eb4c"
                                                 :shortname "FTM/YFI Spooky LP"
                                                 :type :lp
                                                 :exchange :spooky
                                                 :router-addr "0xf491e7b69e4244ad4002bc14e878a34207e38c29"
                                                 }
"0xb77b223490e1f5951ec79a8d09db9eab2adcb934"   {:name "FTM/CREAM SpookySwap LP Token"
    :address "0xb77b223490e1f5951ec79a8d09db9eab2adcb934"
                                                 :shortname "FTM/CREAM Spooky LP"
                                                 :type :lp
                                                 :exchange :spooky
                                                 :router-addr "0xf491e7b69e4244ad4002bc14e878a34207e38c29"
                                                 }
   "0xEc7178F4C41f346b2721907F5cF7628E388A7a58" {:name "FTM/BOO SpookySwap LP Token"
                                                 :address "0xEc7178F4C41f346b2721907F5cF7628E388A7a58"
                                                 :shortname "FTM/BOO Spooky LP"
                                                 :type :lp
                                                 :exchange :spooky
                                                 :router-addr "0xf491e7b69e4244ad4002bc14e878a34207e38c29"
                                                 }
   })


(def tokens
  {
   :bsc bsc-tokens
   :ftm ftm-tokens
   :matic matic-tokens
   250 ftm-tokens
   97 bsc-tokens
   137 matic-tokens
   })
