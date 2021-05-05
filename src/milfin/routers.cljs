(ns milfin.routers)

(def ftm-routers
  {
"0x1b02dA8Cb0d097eB8D57A175b88c7D8b47997506" {:address "0x1b02dA8Cb0d097eB8D57A175b88c7D8b47997506"
               :name "SushiSwap"}

"0x16327e3fbdaca3bcf7e38f5af2599d2ddc33ae52" {:address "0x16327e3fbdaca3bcf7e38f5af2599d2ddc33ae52"
               :name "SpiritSwap"}

"0xf491e7b69e4244ad4002bc14e878a34207e38c29" {:address "0xf491e7b69e4244ad4002bc14e878a34207e38c29"
               :name "SpookySwap"}
   }
  )

(def routers
  {
   :bsc nil
   :ftm ftm-routers
   250 ftm-routers
   97 nil
   })
