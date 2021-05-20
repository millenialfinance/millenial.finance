(ns milfin.widgets.balances
  (:require
   [re-frame.core :as re-frame]
   [milfin.subs :as subs]
   [milfin.ethers :as e]
   [milfin.components :refer [window btn status-bar]]
   ))

(defn balances-display
  []
  (let [bals (re-frame/subscribe [::subs/covalent-balances false])]
    (fn []
      [window
      "Balances"
      [:div
       (doall
        (for [bal @bals]
          [:div.field-row
           #_(when (:logo_url bal) [:img {:src (:logo_url bal)}])
           [:p (:contract_ticker_symbol bal)]
           [:div "Balance: " (.formatUnits e/utils (:balance bal))]
           [:div "Value: " (:quote bal)]
           [:div "Type " (:type bal)]
           ]))]])))
