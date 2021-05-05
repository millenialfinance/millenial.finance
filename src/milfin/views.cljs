(ns milfin.views
  (:require
   [re-frame.core :as re-frame]
   [milfin.subs :as subs]
   [milfin.tokens :as tokenlist]
   [milfin.events :as events :refer [fetch-pool-info]]
   [milfin.components :refer [window btn status-bar]]
   [milfin.routers :refer [routers]]
   [milfin.contracts  :refer [parse-abistr chain->contracts]]
   [milfin.ethers :as e]
   [milfin.chains :refer [chainId->chain]]
   [clojure.string :as str]))

(defn wallet-btn
  []
  [btn {:text "Connect Wallet"
        :on-click #(re-frame/dispatch-sync [::events/initialize-ether])}])
(defn contract-status-bar
  [contract chainId on-click]
  [status-bar
   (str "Contract Address: " (:addr contract))
   (when chainId (str "Network: " (:name (chainId->chain chainId))))
   (when on-click [btn {:text "Refresh" :on-click on-click}])])
(defn migrator-panel
  []
  (let [addr (re-frame/subscribe [::subs/addr])
        migrator-state (re-frame/subscribe [::subs/migrator-state])
        {:keys [from to amt]} @migrator-state
chainId (re-frame/subscribe [::subs/chainId])
        chain-tokens (tokenlist/tokens @chainId)
        chain-routers (routers @chainId)
        token-addrs (re-frame/subscribe [::subs/enabled-tokens @chainId])
        balances (re-frame/subscribe [::subs/token-balances])
        allowances (re-frame/subscribe [::subs/token-allowances])
        from-router (:router-addr (get chain-tokens from))
        contract (:milzap (chain->contracts :ftm) )
        parsed-amt (.parseEther e/utils (str (or amt 0.0)))
        ]
    [window "Liquidity Migrator"
     [:div
      [contract-status-bar contract @chainId #(refresh-zapper @token-addrs @addr (:addr contract))]
      [:section.component
       [:div.rowfields
        [:fieldset
         [:legend "Liquidity Token to Migrate"]
         [:div
          [:select {:value (or from "")
                    :on-change #(handle-migrate-in-change (.. % -target -value) @addr (:addr contract) @chainId)}
           [:option {:value ""} "-Select-"]
           (doall
            (for [t @token-addrs]
              (let [token (chain-tokens t)]
                (when (= (:type token) :lp)
                  [:option {:value t} (:name token)]))))]

          ]]]
        [:fieldset
        [:legend "Destination"]
        [:div
         [:select {:value to
                   :on-change #(handle-migrate-out-change (.. % -target -value) )}
          (doall
           (for [[router-addr router] (routers :ftm)]
             [:option {:value router-addr} (:name router)]))]

         ]]
       ]
      [:section.component
       [:section.component.zap-row
          [:div.field-row
           [:label {:for "migrate-amt"} "Amount"]
           [:input {:id "migrate-amt" :type "text" :value amt :on-change #(re-frame/dispatch [::events/store-in [:migrator :amt] (.. % -target -value)])}]]
          [:div.zap-btn
           [btn {:text "Max"
                 :on-click #(re-frame/dispatch [::events/store-in [:migrator :amt] (.formatEther e/utils (@balances from))])}]]
          [:div.zap-btn
           (if (not (if (get @allowances from) (.eq (get @allowances from) 0) true))
  [btn {:text "Migrate"
                 :on-click #(do
                              (js/console.log [from amt from-router to])
                              (re-frame/dispatch [::events/call-contract-write contract "zapAcross" [:migrator from to] [from parsed-amt from-router to]]))}]
             [btn {:text "Approve"
                   :on-click #(re-frame/dispatch [::events/approve-erc20 from (:addr contract)])}]
             )
           ]]]
      ]
     ]))

(defmulti contract-panel
  (fn [kw contract chainId] (:type contract)))

(defmethod contract-panel :pool
  [kw contract chainId]
  (let [addr (re-frame/subscribe [::subs/addr])
        _contract-state (re-frame/subscribe [::subs/contracts-state kw])
        contract-state (into {} @_contract-state)]
    [window (:name contract)
     [:div
      [status-bar
       (str "Contract Address: " (:addr contract))
       (if chainId (str "Network: " (:name (chainId->chain chainId))))
       [btn {:text "Refresh" :on-click #(fetch-pool-info contract kw @addr)}]]
      (for [poolId [0 1 2]]
        ^{:key poolId}
        (let [userInfo (get-in contract-state [:userInfo (str poolId)])
              pendingReward (get-in contract-state [:pendingReward (str poolId)])
              poolInfo (get-in contract-state [:poolInfo (str poolId)])]
          [:div.pool-info
           [:fieldset
            [:legend (str "Pool " poolId)]
            (if poolInfo
              (let [[stakingTokenAddr stakingTokenTotalAmount] poolInfo
                    stakingToken (tokenlist/bsc-tokens stakingTokenAddr)]
                [:p (str "Staking: " (:name stakingToken) " (" (:shortname stakingToken) ")")])
              (fetch-pool-info contract kw @addr))
            (if userInfo [:p (str "Staked Balance: " (.formatUnits e/utils (first userInfo)))])
            (if pendingReward [:p (str "Pending reward: " (.formatUnits e/utils pendingReward))])
            [btn {:text "Claim"
                  :on-click #(re-frame/dispatch [::events/call-contract-write contract "withdraw" [kw :withdraw poolId] [poolId 0]])}]]]))]]))

(defmethod contract-panel :utility
  [kw contract chainId]
  nil)

(defmethod contract-panel nil
  [kw contract chainId]
  nil)



(defn handle-migrate-out-change
  [router-addr ]
  (re-frame/dispatch [::events/store-in [:migrator :to] router-addr])
  )

(defn handle-migrate-in-change
  [token-addr wallet-addr contract-addr chainId]
  (let [tokens (tokenlist/tokens chainId)
        token (tokens token-addr)
        type (:type token)]
    (when (= type :lp)
      (do
        (re-frame/dispatch [::events/get-erc20-allowance token-addr wallet-addr contract-addr])
        (re-frame/dispatch [::events/get-erc20-bal token-addr wallet-addr])
        (re-frame/dispatch [::events/store-in [:migrator :from] token-addr])
        ))))

(defn handle-zapin-token-change
  [token-addr wallet-addr contract-addr chainId]
  (let [tokens (tokenlist/tokens chainId)
        token (tokens token-addr)
        type (:type token)]
    (case type
      :lp (do
            (re-frame/dispatch [::events/get-erc20-allowance token-addr wallet-addr contract-addr])
            (re-frame/dispatch [::events/get-erc20-bal token-addr wallet-addr])
            (re-frame/dispatch [::events/store-in [:zapper :zap-direction] :out]))
      :erc20 (do
               (re-frame/dispatch [::events/store-in [:zapper :zap-direction] :in])
               (re-frame/dispatch [::events/get-erc20-allowance token-addr wallet-addr contract-addr])
               (re-frame/dispatch [::events/get-erc20-bal token-addr wallet-addr]))
      :native (do
                (re-frame/dispatch [::events/store-in [:zapper :zap-direction] :in])
                (re-frame/dispatch [::events/fetch-balance]))))
  (re-frame/dispatch [::events/store-in [:zapper :zapin-token] token-addr]))

(defn refresh-zapper
  [tokens wallet-addr contract-addr]
  (doall
   (for [token tokens]
     (do
       (re-frame/dispatch-sync [::events/get-erc20-allowance token wallet-addr contract-addr])
       (re-frame/dispatch-sync [::events/get-erc20-bal token wallet-addr])))))

(defn handle-zapout-token-change
  [token-addr wallet-addr]
  (re-frame/dispatch [::events/store-in [:zapper :zapout-token] token-addr])
  (re-frame/dispatch [::events/get-erc20-bal token-addr wallet-addr]))

(defn handle-zap
  [contract kw zap-direction zapin-token zapin-amt zapout-token chainId]
  (let [tokens (tokenlist/tokens chainId)
        zapin-type (:type (tokens zapin-token))
        zapout-type (:type (tokens zapout-token))
        zap-across (= :lp zapin-type zapout-type)
        is-native-send (= :native zapin-type)
        router-addr (case zap-direction
                      :in (:router-addr (tokens zapout-token))
                      :out (:router-addr (tokens zapin-token)))
        parsed-amt (.parseEther e/utils zapin-amt)]
    (cond
      zap-across (let [_fromRouter (:router-addr (tokens zapin-token))
                       _toRouter (:router-addr (tokens zapout-token))]
                   (re-frame/dispatch [::events/call-contract-write-paid parsed-amt contract "zapAcross" [kw :zapIn zapin-token zapout-token] [zapin-token parsed-amt _fromRouter _toRouter]]))
      (= :in zap-direction) (if (= zapin-type :native)
            (re-frame/dispatch [::events/call-contract-write-paid parsed-amt contract "zapIn" [kw :zapIn zapin-token zapout-token] [zapout-token router-addr]])
            (re-frame/dispatch [::events/call-contract-write contract "zapInToken" [kw :zapInToken zapin-token zapout-token] [zapin-token parsed-amt zapout-token router-addr]]))
      (= :out zap-direction) (if (= zapout-type :native)
             (do
               (js/console.log (map str [zapin-token parsed-amt router-addr]))
               (re-frame/dispatch [::events/call-contract-write contract "zapOut" [kw :zapIn zapin-token zapout-token] [zapin-token parsed-amt router-addr]]))
             (do
               (js/console.log [zapin-token parsed-amt zapout-token router-addr])
               (re-frame/dispatch [::events/call-contract-write contract "zapOutToken" [kw :zapOutToken zapin-token zapout-token] [zapin-token parsed-amt zapout-token router-addr]]))))
    ))

(defn xnor
  [a b]
  (or (and a b) (and (not a) (not b))))

(defn contracts-panel
  []
  (let [contracts (re-frame/subscribe [::subs/contracts])
        chainId (re-frame/subscribe [::subs/chainId])]
    [:div
     (doall
      (for [[k v] @contracts]
        ^{:key k} [contract-panel k v @chainId]))]))

(defn wallet-display
  []
  (let [connected (re-frame/subscribe [::subs/connected])
        addr (re-frame/subscribe [::subs/addr])
        balance (re-frame/subscribe [::subs/balance])
        formatted-balance (.formatUnits e/utils @balance)
        chainId (re-frame/subscribe [::subs/chainId])
        network-name (:name (chainId->chain @chainId))]
    (if @connected
      [status-bar
       (str "Address: " @addr)
       (str "Network: " network-name)
       (str "Balance: " formatted-balance)]
      [wallet-btn])))

(defmethod contract-panel :milzap
  [kw contract]
  (let [chainId (re-frame/subscribe [::subs/chainId])
        addr (re-frame/subscribe [::subs/addr])
        token-addrs (re-frame/subscribe [::subs/enabled-tokens @chainId])
        chain-tokens (tokenlist/tokens @chainId)
        zapper-state (re-frame/subscribe [::subs/zapper-state])
        {:keys [zapin-token zapout-token zapin-amt zap-direction]} @zapper-state
        native-balance (re-frame/subscribe [::subs/balance])
        balances (re-frame/subscribe [::subs/token-balances])
        allowances (re-frame/subscribe [::subs/token-allowances])
        native-token (chain-tokens "0x0")]
    [window (:name contract)
     [:div
      [contract-status-bar contract @chainId #(refresh-zapper @token-addrs @addr (:addr contract))]
      [:section
       [:fieldset
        [:legend "Zapping From"]
        [:div
         [:select {:value (or zapin-token "")
                   :on-change #(handle-zapin-token-change (.. % -target -value) @addr (:addr contract) @chainId)}
          [:option {:value ""} "-Select-"]
          [:option {:value "0x0"} (str (:name native-token) " (" (:shortname native-token) ")")]
          (doall
           (for [t @token-addrs]
             (let [token (chain-tokens t)]
               [:option {:value t} (str (:name token) " (" (:shortname token) ")")])))]
         [:p (str "Balance: "
                    (if (= "0x0" zapin-token)
                      (.formatUnits e/utils (or @native-balance 0))
                      (if @balances (.formatUnits e/utils (or (@balances zapin-token) 0)) 0)))]
         [:p (str "Token Address: " zapin-token)]
         (when (not (= "0x0" zapin-token))
           (if (not (if (get @allowances zapin-token) (.eq (get @allowances zapin-token) 0) true))
             [:p "Contract Approved"]
             [btn {:text "Approve"
                   :on-click #(re-frame/dispatch [::events/approve-erc20 zapin-token (:addr contract)])}]
             ))
         ]]
       [:fieldset
        [:legend "Zapping To"]
        [:div
         [:select {:value (or zapout-token "")
                   :on-change #(handle-zapout-token-change (.. % -target -value) @addr)}
          [:option {:value ""} "-Select-"]
          (when (= zap-direction :out)
            [:option {:value "0x0"} (str (:name native-token) " (" (:shortname native-token) ")")])
          (doall
           (for [token (map chain-tokens @token-addrs)]
             (let [isLP (= :lp (:type token))
                   zapping-in (= :in zap-direction)
                   addr (:address token)]
               (when (xnor isLP zapping-in)
                 [:option {:value addr} (str (:name token) " (" (:shortname token) ")")]))))]]]]
        [:section.component.zap-row
          [:div.field-row
           [:label {:for "zapin-amt"} "Amount"]
           [:input {:id "zapin-amt" :type "text" :value zapin-amt :on-change #(re-frame/dispatch [::events/store-in [:zapper :zapin-amt] (.. % -target -value)])}]]
          [:div.zap-btn
           [btn {:text "Max"
                 :on-click #(re-frame/dispatch [::events/store-in [:zapper :zapin-amt] (.formatEther e/utils (@balances zapin-token))])}]]
          [:div.zap-btn
           [btn {:text "Zap"
                 :on-click #(handle-zap contract kw zap-direction zapin-token zapin-amt zapout-token @chainId)}]]]
      ]]))

(defn intro
  []
  [:div
   [:p "We're preparing experiments in various cross-chain areas"]
   [:ul
    [:li "Collaborative art (NFT DAOs)"]
    [:li "LP AMM Efficiency"]
    [:li "Priviledged LP Tokens (NFT-like benefits for holders)"]]
   [:p "Follow us on " [:a {:href "https://twitter.com/milfinance"} "twitter"] " to keep in touch"]])

(defn body
  []
  [:div
   [wallet-display]
   [intro]])

(defn main-panel []
  (let [name (re-frame/subscribe [::subs/addr])]
    [:div
     [window "welcome" [body]]
     [migrator-panel]
     [contracts-panel]]))
