(ns milfin.ethers
  (:require ["ethers" :as ethers-lib]
            ))

(def e ethers-lib/ethers)

(defn window-eth
  []
  (-> js/window
      .-ethereum))

(defn get-web3-provider
  []
  (let [eth (window-eth)
        web3 (-> e
                 .-providers
                 .-Web3Provider)]
    (new web3 eth)))
