(ns milfin.widgets.vault-zap
  (:require
   [re-frame.core :as re-frame]
   [milfin.subs :as subs]
   [milfin.events :as events :refer [fetch-pool-info]]
   [milfin.ethers :as e]
   [milfin.tokens :as tokenlist]
   [milfin.components :refer [window btn status-bar]]
   [milfin.routers :refer [routers]]
   [milfin.chains :refer [chainId->chain]]
   [milfin.vaults :refer [ftm-vaults matic-vaults]]
   [milfin.contracts  :refer [parse-abistr chain->contracts]]
   ))

(defn contract-status-bar
  [contract chainId on-click]
  [status-bar
   [:div (str "Contract Address: " (:addr contract)) [:a {:href (str (if (= 250 chainId) "https://ftmscan.com/address/" "https://explorer-mainnet.maticvigil.com/address/") (:addr contract))
                                                          :style {:margin"0rem 0rem .1rem 2rem"}} "See on Explorer"]]
   (when chainId (str "Network: " (:name (chainId->chain chainId))))
   (when on-click [btn {:text "Refresh" :on-click on-click}])])

(defn vault-zapper
  []
  (let [addr (re-frame/subscribe [::subs/addr])
        vaulter-state (re-frame/subscribe [::subs/vaulter-state])
        {:keys [from to amt router token]} @vaulter-state
        chainId (re-frame/subscribe [::subs/chainId])
        chain-tokens (tokenlist/tokens @chainId)
        chain-routers (routers @chainId)
        native-balance (re-frame/subscribe [::subs/balance])
        token-addrs (re-frame/subscribe [::subs/enabled-tokens @chainId])
        vault-addrs (re-frame/subscribe [::subs/enabled-vaults @chainId])
        vault (if (= @chainId 250) (ftm-vaults to) (matic-vaults to))
        balances (re-frame/subscribe [::subs/token-balances])
        allowances (re-frame/subscribe [::subs/token-allowances])
        contract (:milzap (chain->contracts (if (= 250 @chainId) :ftm :matic)) )
        native-token (get chain-tokens "0x0")
        ]
    [window "Vault Zap"
     [:div
      [contract-status-bar contract @chainId #(refresh-zapper @token-addrs @addr (:addr contract))]
      [:section
       [:fieldset
        [:legend "Zapping From"]
        [:div
         [:select {:value (or from "")
                   :on-change #(handle-vaultin-token-change (.. % -target -value) @addr (:addr contract) @chainId)}
          ^{:key "default"}[:option {:value ""} "-Select-"]
          ^{:key "native"}[:option {:value "0x0"} (str (:name native-token) " (" (:shortname native-token) ")")]
          (doall
           (for [t @token-addrs]
             (let [token (chain-tokens t)]
               (when-not (= :lp (:type token))
                 ^{:key t}[:option {:value t} (str (:shortname token))]))))]
         [:p (str "Balance: "
                  (if (= "0x0" from)
                      (.formatUnits e/utils (or @native-balance 0))
                      (if @balances (.formatUnits e/utils (or (@balances from) 0)) 0)))]
         [:p (str "Token Address: " from)]
         (when (not (= "0x0" from))
           (if (not (if (get @allowances from) (.eq (get @allowances from) 0) true))
             [:p "Contract Approved"]
             [btn {:text "Approve"
                   :on-click #(re-frame/dispatch [::events/approve-erc20 from (:addr contract)])}]
             ))
         ]]
       [:fieldset
        [:legend "Zapping Into Vault"]
        [:div
         [:select {:value (or to "")
                   :on-change #(handle-vaultout-change (.. % -target -value) @addr @chainId)}
          ^{:key "default"}[:option {:value ""} "-Select-"]
          (doall
           (for [[vault-addr vault] @vault-addrs]
             (do
               (let [name (:name vault)]
                 ^{:key vault-addr}[:option {:value vault-addr} name]))))]
         [:div
          [:p (str "Balance: " (.formatUnits e/utils (or (get @balances to) "0")))]
          [:p (str "Vault Address: " to)]]]]]
      [:section.component.zap-row
          [:div.field-row
           [:label {:for "vault-amt"} "Amount"]
           [:input {:id "vault-amt" :type "number" :value amt :on-change #(let [val (.. % -target -value)]
                                                                                (cond
                                                                                  (= "." val) (re-frame/dispatch [::events/store-in [:vaulter :amt] "0."])
                                                                                  true (re-frame/dispatch [::events/store-in [:vaulter :amt] (.. % -target -value)])))}]]
          [:div.zap-btn
           [btn {:text "Max"
                 :on-click #(re-frame/dispatch [::events/store-in [:vaulter :amt] (.formatEther e/utils (if (= "0x0" from)
                                                                                                               @native-balance
                                                                                                               (@balances from)))])}]]
          [:div.zap-btn
           [btn {:text "Zap"
                 :on-click #(do
                              (if (= from "0x0")
                                (re-frame/dispatch [::events/call-contract-write-paid (.parseEther e/utils amt)  contract "zapInToVault" [:vaulter from to] [(:token vault) (:router vault) to]])
                                (re-frame/dispatch [::events/call-contract-write contract "zapInTokenToVault" [:vaulter from to] [from (.parseEther e/utils amt) (:token vault) (:router vault) to]])))}]]]]]
    ))
