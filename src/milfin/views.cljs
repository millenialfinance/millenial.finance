(ns milfin.views
  (:require
   [re-frame.core :as re-frame]
   [milfin.subs :as subs]
   [milfin.events :as events]
   [milfin.components :refer [window]]
   [milfin.ethers :as e]
   [milfin.chains :refer [chainId->chain]]
   ))

(:name (chainId->chain 1))

(defn wallet-btn
  []
  [:input {:type "button" :value "Connect Wallet"
           :on-click #(re-frame/dispatch-sync [::events/initialize-ether])}])

(defn wallet-display
  []
  (let [connected (re-frame/subscribe [::subs/connected])
        addr (re-frame/subscribe [::subs/addr])
        balance (re-frame/subscribe [::subs/balance])
        formatted-balance (.formatUnits e/utils @balance)
        chainId (re-frame/subscribe [::subs/chainId])
        network-name (:name (chainId->chain @chainId))
        ]
    (if @connected
     [:div.status-bar
      [:p.status-bar-field (str "Address: " @addr)]
      [:p.status-bar-field "Network: " network-name]
      [:p.status-bar-field "Balance: "  formatted-balance]]
     [wallet-btn])))

(defn intro
  []
  [:div
   [:p "We're preparing experiments in various blockchain areas"]
   [:ul
    [:li "Collaborative art (NFT DAOs)"]
    [:li "LP AMM Efficiency"]
    [:li "LP tokens as collateral"]
    [:li "LP tokens as NFT-like priviledged token"]]
   [:p "Follow us on " [:a {:href "https://twitter.com/milfinance"} "twitter"] " to keep in touch"]])

(defn body
  []
  [:div
    [wallet-display]
    [intro]
   ])

(defn main-panel []
  (let [name (re-frame/subscribe [::subs/addr])]
    [:div
     [window "welcome" [body]]
     ]))
