(ns milfin.app
  (:require [reagent.core :as r]
            [reagent.dom :as rdom]
            ["ethers" :as ethers-lib]
            ))


(def chainid->name
  {
   1 "ETH"
   10 "OETH"
   100 "XDAI"
   1001 "KLAY"
   1007 "NEW"
   56 "BSC"})

(defonce addr (r/atom "0x0"))
(defonce connected (r/atom false))
(defonce balance (r/atom 0))
(defonce network  (r/atom nil))

(def e ethers-lib/ethers)

(defn log
  [& args]
  (apply js/console.log args))

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

(defn get-network
  []
  (-> (get-web3-provider)
      .getNetwork
      ))

(defn connect-wallet
  []
  (let [eth (window-eth)]
    (-> eth
        .enable
        (.then #(do
                  (-> (get-network)
                      (.then (fn [n] (reset! network n))))
                  (get-addr)))
        (.then #(do
                  (reset! addr %)
                  (get-bal %)))
        (.then #(let [bal (/ % (Math/pow 10 18))]
                  (reset! balance bal))))
    (reset! connected true)
    )
  )

(defn wallet-btn
  []
  [:input {:type "button" :value "Connect Wallet"
           :on-click connect-wallet}])

(defn wallet-display
  []
  (if @connected
    [:div.status-bar
     [:p.status-bar-field (str "Address: " @addr)]
     [:p.status-bar-field (str "Network: " (if @network (.-name @network)))]
     [:p.status-bar-field (str "Balance: "  @balance)]]
    [wallet-btn]))

(defn window
  ([body]
   [:div.window
    [:div.window-body body]])
  ([title body]
   [:div.window
    [:div.title-bar
     [:div.title-bar-text title]]
    [:div.window-body body]]))

(defn app
  []
  [:div.app
   [window "welcome" [wallet-display]]])

(defn init []
  (rdom/render [app] (js/document.getElementById "root"))
  (js/console.log e))
