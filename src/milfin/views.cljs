(ns milfin.views
  (:require
   [re-frame.core :as re-frame]
   [milfin.subs :as subs]
   [milfin.tokens :as tokenlist]
   [milfin.events :as events :refer [fetch-pool-info]]
   [milfin.components :refer [window btn status-bar]]
   [milfin.widgets.vault-zap :refer [vault-zapper]]
   [milfin.widgets.liqmigrator :as liqmigrator]
   [milfin.ethers :as e]
   [milfin.chains :refer [chainId->chain]]
   ))

(def restricted false)

(defn wallet-btn
  []
  [btn {:text "Connect Wallet"
        :on-click #(re-frame/dispatch [::events/initialize-ether])}])

(defn contract-status-bar
  [contract chainId on-click]
  [status-bar
   [:div (str "Contract Address: " (:addr contract)) [:a {:href (str (if (= 250 chainId) "https://ftmscan.com/address/" "https://explorer-mainnet.maticvigil.com/address/") (:addr contract))
                                                          :style {:margin"0rem 0rem .1rem 2rem"}} "See on Explorer"]]
   (when chainId (str "Network: " (:name (chainId->chain chainId))))
   (when on-click [btn {:text "Refresh" :on-click on-click}])])

(defn refresh-zapper
  [tokens wallet-addr contract-addr]
  (doall
   (for [token tokens]
     (when-not (= "0x0" (:address token))
       (re-frame/dispatch [::events/get-erc20-allowance token wallet-addr contract-addr])
       (re-frame/dispatch [::events/get-erc20-bal token wallet-addr])))))

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


(defmulti contract-panel
  (fn [_ contract _] (:type contract)))

(defmethod contract-panel :pool
  [kw contract chainId]
  (let [addr (re-frame/subscribe [::subs/addr])
        _contract-state (re-frame/subscribe [::subs/contracts-state kw])
        contract-state (into {} @_contract-state)]
    [window (:name contract)
     [:div
      [status-bar
       (str "Contract Address: " (:addr contract))
       (when chainId (str "Network: " (:name (chainId->chain chainId))))
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
              (let [[stakingTokenAddr] poolInfo
                    stakingToken (tokenlist/bsc-tokens stakingTokenAddr)]
                [:p (str "Staking: " (:name stakingToken) " (" (:shortname stakingToken) ")")])
              (fetch-pool-info contract kw @addr))
            (when userInfo [:p (str "Staked Balance: " (.formatUnits e/utils (first userInfo)))])
            (when pendingReward [:p (str "Pending reward: " (.formatUnits e/utils pendingReward))])
            [btn {:text "Claim"
                  :on-click #(re-frame/dispatch [::events/call-contract-write contract "withdraw" [kw :withdraw poolId] [poolId 0]])}]]]))]]))

(defmethod contract-panel :utility
  [& _]
  nil)

(defmethod contract-panel nil
  [& _]
  nil)

(defn handle-zapout-token-change
  [token-addr wallet-addr]
  (re-frame/dispatch [::events/store-in [:zapper :zapout-token] token-addr])
  (re-frame/dispatch [::events/get-erc20-bal token-addr wallet-addr]))

(defn handle-zap
  [contract kw zap-direction zapin-token zapin-amt zapout-token chainId addr]
  (let [tokens (tokenlist/tokens chainId)
        zapin-type (:type (tokens zapin-token))
        zapout-type (:type (tokens zapout-token))
        zap-across (= :lp zapin-type zapout-type)
        router-addr (case zap-direction
                      :in (:router-addr (tokens zapout-token))
                      :out (:router-addr (tokens zapin-token)))
        ]
    (cond
      zap-across (let [_fromRouter (:router-addr (tokens zapin-token))
                       _toRouter (:router-addr (tokens zapout-token))]
                   (re-frame/dispatch [::events/call-contract-write-paid (.parseEther e/utils zapin-amt) contract "zapAcross" [kw :zapIn zapin-token zapout-token] [zapin-token (.parseEther e/utils zapin-amt) _fromRouter _toRouter]]))
      (= :in zap-direction) (if (= zapin-type :native)
                              (re-frame/dispatch [::events/call-contract-write-paid (.parseEther e/utils zapin-amt) contract "zapIn" [kw :zapIn zapin-token zapout-token] [zapout-token router-addr addr]])
                              (re-frame/dispatch [::events/call-contract-write contract "zapInToken" [kw :zapInToken zapin-token zapout-token] [zapin-token (.parseEther e/utils zapin-amt) zapout-token router-addr addr]]))
      (= :out zap-direction) (if (= zapout-type :native)
             (do
               (js/console.log [zapin-token  (.parseEther e/utils zapin-amt)  router-addr])
               (re-frame/dispatch [::events/call-contract-write contract "zapOut" [kw :zapOut zapin-token] [zapin-token (.parseEther e/utils zapin-amt) router-addr addr]]))
             (do
               (js/console.log [zapin-token  (.parseEther e/utils zapin-amt) zapout-token router-addr])
               (re-frame/dispatch [::events/call-contract-write contract "zapOutToken" [kw :zapOutToken zapin-token zapout-token] [zapin-token  (.parseEther e/utils zapin-amt) zapout-token router-addr addr]]))))
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
        formatted-balance (if @balance (.formatUnits e/utils @balance) "0.0")
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
      [contract-status-bar contract @chainId #(do
                                                (handle-zapin-token-change zapin-token @addr (:addr contract) @chainId)
                                                (handle-zapout-token-change zapout-token @addr))]
      [:section
       [:fieldset
        [:legend "Zapping From"]
        [:div
         [:select {:value (or zapin-token "")
                   :on-change #(handle-zapin-token-change (.. % -target -value) @addr (:addr contract) @chainId)}
          ^{:key "default"}[:option {:value ""} "-Select-"]
          ^{:key "native"}[:option {:value "0x0"} (str (:name native-token) " (" (:shortname native-token) ")")]
          (doall
           (for [token @token-addrs]
             (when (or (not (= :lp (:type token))) (= :spirit (:exchange token)) (not restricted))
               ^{:key (:address token)}[:option {:value (:address token)} (str (:shortname token))])))]
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
          ^{:key "default"}[:option {:value ""} "-Select-"]
          (when (= zap-direction :out)
           ^{:key "native"} [:option {:value "0x0"} (str (:name native-token) " (" (:shortname native-token) ")")])
          (doall
           (for [token (map chain-tokens @token-addrs)]
             (let [isLP (= :lp (:type token) )
                   isSpirit (= :spirit (:exchange token))
                   zapping-in (= :in zap-direction)
                   addr (:address token)]
               (when (xnor isLP zapping-in)
                 (when (and (or isSpirit (not isLP) (not restricted) (not (and (not zapping-in) (= "SPIRIT" (:shortname token))))) (not (= "0x0" (:address token)))) ^{:key addr}[:option {:value addr} (str (:shortname token))])))))]]]]
        [:section.component.zap-row
          [:div.field-row
           [:label {:for "zapin-amt"} "Amount"]
           [:input {:id "zapin-amt" :type "number" :value zapin-amt :on-change #(let [val (.. % -target -value)]
                                                                                (cond
                                                                                  (= "." val) (re-frame/dispatch [::events/store-in [:zapper :zapin-amt] (str "0" (.. % -target -value))])
                                                                                  (= "" val) (re-frame/dispatch [::events/store-in [:zapper :zapin-amt] "0"])
                                                                                  :else (re-frame/dispatch [::events/store-in [:zapper :zapin-amt] (.. % -target -value)])))}]]
          [:div.zap-btn
           [btn {:text "Max"
                 :on-click #(re-frame/dispatch [::events/store-in [:zapper :zapin-amt] (.formatEther e/utils (if (= "0x0" zapin-token)
                                                                                                               @native-balance
                                                                                                               (@balances zapin-token)))])}]]
          [:div.zap-btn
           [btn {:text "Zap"
                 :on-click #(handle-zap contract kw zap-direction zapin-token zapin-amt zapout-token @chainId @addr)}]]]
      ]]))

(defn intro
  []
  [:div
   [:p "We're preparing experiments in various cross-chain areas"]
   [:ul
    [:li "Automated asset conversions"]
    [:li "LP AMM Efficiency"]
   [:div "Follow us on " [:a {:href "https://twitter.com/mlnl_finance"} "twitter"] " to keep in touch"]])

(defn body
  []
  [:div
   [wallet-display]
   [intro]])

(defn main-panel []
  (let [name (re-frame/subscribe [::subs/addr])]
    [:div
     [window "welcome" [body]]
     (when (not (= "0x0" @name)) [vault-zapper])
     (when (not (= "0x0" @name)) [liqmigrator/migrator-display])
     [contracts-panel]]))
