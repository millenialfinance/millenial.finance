(ns milfin.widgets.liqmigrator
  (:require
   [re-frame.core :as re-frame]
   [milfin.events :as events]
   [milfin.chains :refer [chainId->chain]]
   [milfin.subs :as subs]
   [milfin.contracts :refer [chain->contracts]]
   [milfin.ethers :as e]
   [milfin.components :refer [window btn status-bar]]))

(defn contract-status-bar
  [contract chainId on-click]
  [status-bar
   [:div (str "Contract Address: " (:addr contract)) [:a {:href (str (if (= 250 chainId) "https://ftmscan.com/address/" "https://explorer-mainnet.maticvigil.com/address/") (:addr contract))
                                                          :style {:margin"0rem 0rem .1rem 2rem"}} "See on Explorer"]]
   (when chainId (str "Network: " (:name (chainId->chain chainId))))
   (when on-click [btn {:text "Refresh" :on-click on-click}])])

(defn zap-from
  []
  (let [all-routers (re-frame/subscribe [::subs/routers])
        eligible-lp-tokens (re-frame/subscribe [::subs/migrator-lp-tokens])
        addr @(re-frame/subscribe [::subs/addr])
        from-token @(re-frame/subscribe [::subs/migrator-token])
        from-balance (re-frame/subscribe [::subs/migrator-from-balance])
        from-allowance (re-frame/subscribe [::subs/migrator-from-allowance])
        chainId (re-frame/subscribe [::subs/chainId])
        zapper-contract (:milzap (chain->contracts (if (= 250 @chainId) :ftm :matic)) )
        zapper-addr (:addr zapper-contract)
        source-router (re-frame/subscribe [::subs/migrator-source-router])]
    [:fieldset
     [:legend "Zapping From"]
     [:div.field-row
      [:label {:for "from-router"} "Source Dex"]
      [:select {:id "from-router" :value (or (:address @source-router) "")  :on-change #(do

                                                                                          (re-frame/dispatch [::events/set-from-router (.. % -target -value)]))}
       ^{:key "default"} [:option {:value ""} "-Select-"]
       (for [router @all-routers]
         ^{:key (:address router)} [:option {:value (:address router)} (:name router)])]
      [:label {:for "from-token"} "LP Token"]
      [:select {:id "from-token" :on-change #(do
                                               (re-frame/dispatch [::events/get-erc20-bal (.. % -target -value) addr])
                                               (re-frame/dispatch [::events/get-erc20-allowance (.. % -target -value) addr zapper-addr])
                                               (re-frame/dispatch [::events/set-migrator-from-token (.. % -target -value)]))}
       ^{:key "default"} [:option {:value ""} "-Select-"]
       (for [token @eligible-lp-tokens]
         ^{:key (:address token)} [:option {:value (:address token)} (:name token)])]]
     [:div

      (when @from-balance
        [:p "Balance: " (.formatUnits e/utils @from-balance)])
      (when (= "0" (str @from-allowance)) [btn {:text "Approve" :on-click #(re-frame/dispatch [::events/approve-erc20 (:address from-token) zapper-addr])}])]]))

(defn zap-to
  []
  (let [all-routers (re-frame/subscribe [::subs/routers])
        dest-router @(re-frame/subscribe [::subs/migrator-dest-router])
        ]
    [:fieldset
     [:legend "Zapping To"]
     [:div.field-row
      [:label {:for "to-router"} "Destination Dex"]
      [:select {:id "to-router" :value (or (:address dest-router) "") :on-change #(do
                                                                                    (re-frame/dispatch [::events/set-to-router (.. % -target -value)]))}
       ^{:key "default"} [:option {:value ""} "-Select-"]
       (for [router @all-routers]
         ^{:key (:address router)} [:option {:value (:address router)} (:name router)])]
      ]
     ]))

(defn zap-bar
  []
  (let [{:keys [from-token amt]} @(re-frame/subscribe [::subs/migrator-state])
        source-router (re-frame/subscribe [::subs/migrator-source-router])
        chainId (re-frame/subscribe [::subs/chainId])
        zapper-contract (:milzap (chain->contracts (if (= 250 @chainId) :ftm :matic)) )
        addr (re-frame/subscribe [::subs/addr])
        dest-router (re-frame/subscribe [::subs/migrator-dest-router])
        from-balance (re-frame/subscribe [::subs/migrator-from-balance])]
    [:section.component.zap-row
     [:div.field-row
      [:label {:for "migr-amt"} "Amount"]
      [:input {:id "migr-amt" :type "number" :value amt :on-change #(let [val (.. % -target -value)]
                                                                      (cond
                                                                        (= "." val) (re-frame/dispatch [::events/store-in [:migrator :amt] (str "0" (.. % -target -value))])
                                                                        (= "" val) (re-frame/dispatch [::events/store-in [:migrator :amt] "0"])
                                                                        :else (re-frame/dispatch [::events/store-in [:migrator :amt] (.. % -target -value)])))
               }]]
     [:div.zap-btn
      [btn {:text "Max"
            :on-click #(re-frame/dispatch [::events/store-in [:migrator :amt] (.formatEther e/utils @from-balance)])}]]
     [:div.zap-btn
      [btn {:text "Migrate"
            :on-click #(do
                         (re-frame/dispatch [::events/call-contract-write zapper-contract "zapAcross" [:migrator (:address from-token) @dest-router] [(:address from-token) (.parseEther e/utils amt) (:address @dest-router) @addr]]))}]

      ]]))

(defn migrator-display
  []
  (let [chainId (re-frame/subscribe [::subs/chainId])
        zapper-contract (:milzap (chain->contracts (if (= 250 @chainId) :ftm :matic)) )
        ]
    [window "LiqMigrator.exe"
     [:div
      [contract-status-bar zapper-contract @chainId]
      [:section.component.fieldsets
       [zap-from]
       [zap-to]]
      [zap-bar]]]))
