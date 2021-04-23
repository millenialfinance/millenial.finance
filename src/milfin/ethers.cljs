(ns milfin.ethers
  (:require ["ethers" :as ethers-lib]
            [milfin.chains :refer [chains]]
            ))

(def e ethers-lib/ethers)
(def utils (.-utils e))


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

(defn get-addr
  []
  (-> (get-web3-provider)
      .getSigner
      .getAddress))

(defn get-bal
  [addr]
  (-> (get-web3-provider)
      (.getBalance addr)))

(defn instantiate-contract
  [address abi provider]
  (new (.-Contract e) address abi provider))
