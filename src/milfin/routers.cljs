(ns milfin.routers)

(def ftm-routers
  {
"0x1b02dA8Cb0d097eB8D57A175b88c7D8b47997506" {:address "0x1b02dA8Cb0d097eB8D57A175b88c7D8b47997506"
                                              :factory "0xc35DADB65012eC5796536bD9864eD8773aBc74C4"
                                              :init-hash "0xe18a34eb0e04b04f7a0ac29a6e80748dca96319b42c54d679cb821dca90c6303"
               :name "SushiSwap"}

"0x16327e3fbdaca3bcf7e38f5af2599d2ddc33ae52" {:address "0x16327e3fbdaca3bcf7e38f5af2599d2ddc33ae52"
   :factory "0xEF45d134b73241eDa7703fa787148D9C9F4950b0"
            :init-hash "0xe242e798f6cee26a9cb0bbf24653bf066e5356ffeac160907fe2cc108e238617"
               :name "SpiritSwap"}

"0xf491e7b69e4244ad4002bc14e878a34207e38c29" {:address "0xf491e7b69e4244ad4002bc14e878a34207e38c29"
                                              :factory "0x152eE697f2E276fA89E96742e9bB9aB1F2E61bE3"
                                              :init-hash "0xcdf2deca40a0bd56de8e3ce5c7df6727e5b1bf2ac96f283fa9c4b3e6b42ea9d2"
               :name "SpookySwap"}
   }
  )

(def matic-routers
  {
   "0xa5E0829CaCEd8fFDD4De3c43696c57F7D7A678ff" {:address "0xa5E0829CaCEd8fFDD4De3c43696c57F7D7A678ff"
                                                 :name "QuickSwap"}
   "0x1b02dA8Cb0d097eB8D57A175b88c7D8b47997506" {:address "0x1b02dA8Cb0d097eB8D57A175b88c7D8b47997506"
                                                 :factory "0xc35DADB65012eC5796536bD9864eD8773aBc74C4"
                                                 :name "SushiSwap"}

   })

(def routers
  {
   :bsc nil
   :ftm ftm-routers
   :matic matic-routers
   250 ftm-routers
   97 nil
   137 matic-routers
   })
