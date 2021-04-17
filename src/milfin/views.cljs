(ns milfin.views
  (:require
   [re-frame.core :as re-frame]
   [milfin.subs :as subs]
   [milfin.events :as events]
   [milfin.components :refer [window]]
   ))

(defn wallet-btn
  []
  [:input {:type "button" :value "Connect Wallet"
           :on-click #(re-frame/dispatch-sync [::events/initialize-ether])}])

(defn wallet-display
  []
  (let [connected (re-frame/subscribe [::subs/connected])
        addr (re-frame/subscribe [::subs/addr])
        balance (re-frame/subscribe [::subs/balance])
        ]
    (if connected
     [:div.status-bar
      [:p.status-bar-field (str "Address: " @addr)]
      [:p.status-bar-field (str "Network: " )]
      [:p.status-bar-field (str "Balance: "  @balance)]]
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
  [intro]
   ])

(defn main-panel []
  (let [name (re-frame/subscribe [::subs/addr])]
    [:div
     [window "welcome" [body]]
     ]))
