(ns milfin.widgets.vault-zap
  (:require
   [re-frame.core :as re-frame]
   [milfin.subs :as subs]
   [clojure.string]
   [milfin.events :as events]
   [milfin.ethers :as e]
   [milfin.tokens :as tokenlist]
   [milfin.components :refer [window btn status-bar]]
   [milfin.chains :refer [chainId->chain]]
   [milfin.vaults :refer [ftm-vaults matic-vaults]]
   [milfin.contracts  :refer [chain->contracts]]
   ))

(defn handle-vaultin-token-change
  [token-addr wallet-addr contract-addr chainId]
  (let [tokens (tokenlist/tokens chainId)
        token (tokens token-addr)
        type (:type token)]
    (js/console.log "Handling vaultin change: " (clj->js token))
    (case type
      :erc20 (do
               (re-frame/dispatch [::events/get-erc20-allowance token-addr wallet-addr contract-addr])
               (re-frame/dispatch [::events/get-erc20-bal token-addr wallet-addr]))
      :native
      (re-frame/dispatch [::events/fetch-balance])))
  (re-frame/dispatch [::events/store-in [:vaulter :from] token-addr]))

(defn handle-vaultout-change
  [vault-addr wallet-addr chainId]
  (let [{:keys [token router]} ((if (= 250 chainId) ftm-vaults matic-vaults) vault-addr)
        ]
    (re-frame/dispatch [::events/get-erc20-bal vault-addr wallet-addr])
    (re-frame/dispatch [::events/store-in [:vaulter :to] vault-addr])
    (re-frame/dispatch [::events/store-in [:vaulter :token] token])
    (re-frame/dispatch [::events/store-in [:vaulter :router] router])))

(defn handle-vault-provider-change
  [id-str]
  (re-frame/dispatch [::events/store-in [:vaulter :provider] (keyword id-str)] ))

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
        from (re-frame/subscribe [::subs/vault-from])
        amt (re-frame/subscribe [::subs/vault-amt])
        to (re-frame/subscribe [::subs/vault-to])
        chainId (re-frame/subscribe [::subs/chainId])
        providers (re-frame/subscribe [::subs/vault-providers ])
        chain-tokens (re-frame/subscribe [::subs/tokens])
        native-balance (re-frame/subscribe [::subs/balance])
        token-addrs (re-frame/subscribe [::subs/enabled-tokens])
        vaults (re-frame/subscribe [::subs/enabled-vaults])
        v (re-frame/subscribe [::subs/selected-vault])
        selected-provider (re-frame/subscribe [::subs/vault-provider])
        balances (re-frame/subscribe [::subs/token-balances])
        allowances (re-frame/subscribe [::subs/token-allowances])
        router (re-frame/subscribe [::subs/vault-router])
        ]
    (fn []
      [window "Vault Zap"
       [:div
        [contract-status-bar (:milzap (chain->contracts (if (= 250 @chainId) :ftm :matic)) ) @chainId ]

        [:blockquote "Deposit into your favorite vaults with whatever token you're already holding! Fee: 0.2%"
         [:footer "— Millennial Finance User Manual"]]
        [:section.component.fieldsets
         [:fieldset
          [:legend "Zapping From"]
          [:div

           [:label.mrp {:for "vzap-from"} "Token: "]
           [:select {:id "vzap-from"
                     :value (or @from "")
                     :on-change #(handle-vaultin-token-change (.. % -target -value) @addr (:addr (:milzap (chain->contracts (if (= 250 @chainId) :ftm :matic)) )   ) @chainId)}
            ^{:key "default"}[:option {:value ""} "-Select-"]
            (doall
             (for [token @token-addrs]
               (when-not (= :lp (:type token))
                 ^{:key (:address token)}[:option {:value (:address token)} (:shortname token)])))]
           [:p (str "Balance: "
                    (if (= "0x0" @from)
                      (.formatUnits e/utils (or @native-balance 0))
                      (if @balances (.formatUnits e/utils (or (@balances @from) 0)) 0)))]
           [:p (str "Token Address: " @from)]
           (when (not (= "0x0" @from))
             (if (not (if (get @allowances @from) (.eq (get @allowances @from) 0) true))
               [:p "Contract Approved"]
               [btn {:text "Approve"
                     :on-click #(re-frame/dispatch [::events/approve-erc20 @from (:addr   (:milzap (chain->contracts (if (= 250 @chainId) :ftm :matic)) ) )])}]
               ))
           ]]
         [:fieldset
          [:legend "Zapping Into Vault"]
          [:div
           [:div.field-row.vault-provider-row
            (doall
             (for [provider @providers]
               [:div.vault-provider
                [:input {:id (name provider) :checked (= provider @selected-provider) :type "radio" :name "vault-provider" :on-change #(handle-vault-provider-change (.. % -target -id))}]
                [:label {:for (name provider)} (clojure.string/capitalize (name provider))]]))
            ]
           [:label.mrp {:for "vzap-to"} "Vault: "]
           [:select.zapselect {:id "vzap-top"
                     :value (or @to "")
                     :on-change #(handle-vaultout-change (.. % -target -value) @addr @chainId)}
            ^{:key "default"}[:option {:value ""} "-Select-"]
            (doall
             (for [[vault-addr vault] @vaults]
               (let [n (:name vault)
                     selected (or (and (not (nil? @selected-provider )) (clojure.string/includes? (clojure.string/lower-case n) (name @selected-provider))) (nil? @selected-provider))]
                 (when selected ^{:key vault-addr}[:option {:value vault-addr} n]))))]
           [:div
            (when (:name @router) [:label.platformlabel (str "Platform: " (:name @router))])
            [:p (str "Balance: " (.formatUnits e/utils (or (get @balances @to) "0")))]
            [:p (str "Vault Address: " @to)]]]]]
        [:section.component.zap-row
         [:div.field-row
          [:label {:for "vault-amt"} "Amount"]
          [:input {:id "vault-amt" :type "number" :value @amt :on-change #(let [val (.. % -target -value)]
                                                                           (cond
                                                                             (= "." val) (re-frame/dispatch [::events/store-in [:vaulter :amt] "0."])
                                                                             :else (re-frame/dispatch [::events/store-in [:vaulter :amt] (.. % -target -value)])))}]]
         [:div.zap-btn
          [btn {:text "Max"
                :on-click #(re-frame/dispatch [::events/store-in [:vaulter :amt] (.formatEther e/utils (if (= "0x0" @from)
                                                                                                         @native-balance
                                                                                                         (@balances @from)))])}]]
         [:div.zap-btn
          [btn {:text "Zap"
                :on-click #(do
                             (js/console.log @amt)
                             (if (= @from "0x0")
                               (re-frame/dispatch [::events/call-contract-write-paid (.parseEther e/utils @amt) (:milzap (chain->contracts (if (= 250 @chainId) :ftm :matic)) )   (if (= :single (:type @v)) "zapInToSingleSidedVault" "zapInToLPVault") [:vaulter @from @to] [(:token @v) (:address @router) @to @addr]])
                               (re-frame/dispatch [::events/call-contract-write (:milzap (chain->contracts (if (= 250 @chainId) :ftm :matic)) )  (if (= :single (:type @v)) "zapInTokenToSingleSideVault" "zapInTokenToLPVault")  [:vaulter @from @to] [@from (.parseEther e/utils @amt) (:token @v ) (:address @router) @to @addr]])))}]]]]])
    ))
