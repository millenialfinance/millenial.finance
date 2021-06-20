(ns milfin.routers)

(def sushi-ftm {:address "0x1b02dA8Cb0d097eB8D57A175b88c7D8b47997506"
                                              :factory "0xc35DADB65012eC5796536bD9864eD8773aBc74C4"
                                              :init-hash "0xe18a34eb0e04b04f7a0ac29a6e80748dca96319b42c54d679cb821dca90c6303"
               :name "SushiSwap"})

(def spirit {:address "0x16327e3fbdaca3bcf7e38f5af2599d2ddc33ae52"
   :factory "0xEF45d134b73241eDa7703fa787148D9C9F4950b0"
            :init-hash "0xe242e798f6cee26a9cb0bbf24653bf066e5356ffeac160907fe2cc108e238617"
               :name "SpiritSwap"})

(def spooky {:address "0xf491e7b69e4244ad4002bc14e878a34207e38c29"
                                              :factory "0x152eE697f2E276fA89E96742e9bB9aB1F2E61bE3"
                                              :init-hash "0xcdf2deca40a0bd56de8e3ce5c7df6727e5b1bf2ac96f283fa9c4b3e6b42ea9d2"
               :name "SpookySwap"})

(def waka {:address "0x7B17021FcB7Bc888641dC3bEdfEd3734fCaf2c87"
           :name "Waka"})

(def hyperjump {:address "0x53c153a0df7E050BbEFbb70eE9632061f12795fB"
                :name "Hyperjump"})

(def paint {:address "0xfD000ddCEa75a2E23059881c3589F6425bFf1AbB"
            :name "PaintSwap"})

(def opera {:address "0xE372753F66644A1197AB85Ff529ed02995ED2d6C"
            :name "Opera"})

(def steak {:address "0x16327E3FbDaCA3bcF7E38F5Af2599D2DDc33aE52"
            :name "Stake Steak"})

(def ftm-routers
  {
   "0x1b02dA8Cb0d097eB8D57A175b88c7D8b47997506" sushi-ftm
   :sushi sushi-ftm

   "0x16327e3fbdaca3bcf7e38f5af2599d2ddc33ae52" spirit
   :spirit spirit

   :tomb spooky

   :steak steak

   :popsicle sushi-ftm

   :opera opera

   "0xf491e7b69e4244ad4002bc14e878a34207e38c29" spooky
   :spooky spooky

   :wakafinance waka

   :hyperjump hyperjump

   :chad paint

   }
  )

(def quick {:address "0xa5E0829CaCEd8fFDD4De3c43696c57F7D7A678ff"
                                                 :name "QuickSwap"})

(def cometh {:address "0x93BCDc45F7e62F89A8E901dc4a0e2C6c427d9f25"
                                                 :name "Cometh"})

(def sushi-matic {:address "0x1b02dA8Cb0d097eB8D57A175b88c7D8b47997506"
                                                 :factory "0xc35DADB65012eC5796536bD9864eD8773aBc74C4"
                                                 :name "SushiSwap"})

(def matic-routers
  {
   "0xa5E0829CaCEd8fFDD4De3c43696c57F7D7A678ff" quick
   :quick quick
   "0x93BCDc45F7e62F89A8E901dc4a0e2C6c427d9f25" cometh
   :cometh cometh
   "0x1b02dA8Cb0d097eB8D57A175b88c7D8b47997506" sushi-matic
   :sushi sushi-matic
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
