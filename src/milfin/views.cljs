(ns milfin.views
  (:require
   [re-frame.core :as re-frame]
   [milfin.subs :as subs]
   [milfin.tokens :refer [bsc-tokens]]
   [milfin.events :as events]
   [milfin.components :refer [window btn status-bar]]
   [milfin.contracts :refer [parse-abistr]]
   [milfin.ethers :as e]
   [milfin.chains :refer [chainId->chain]]))

(defn wallet-btn
  []
  [btn {:text "Connect Wallet"
        :on-click #(re-frame/dispatch-sync [::events/initialize-ether])}])

(defn contract-fn
  [f on-click]
  [:div.contract-fn
   [:fieldset
    [:legend (or (:name f) "Constructor")]
    [:p
     (str f)]]])

(defn render-abi
  [abistr]
  (let [abi (parse-abistr abistr)
        fs (filter #(contains? % :outputs) abi)]
    [:div
     [:section.component
      [:h3 "Functions"]
      [:div
       (for [f fs]
         ^{:key (or (:name f) "constructor")} [contract-fn f])]]]))

(defn fetch-pool-info
  [contract kw addr]
  (doseq [poolId [0 1]]
    (re-frame/dispatch-sync [::events/call-contract contract "userInfo" [kw :userInfo poolId] [poolId addr]])
    (re-frame/dispatch-sync [::events/call-contract contract (:pending-reward-fn-name contract) [kw :pendingReward poolId] [poolId addr]])
    (re-frame/dispatch-sync [::events/call-contract contract "poolInfo" [kw :poolInfo poolId] [poolId]])))

(defmulti contract-panel
  (fn [kw contract chainId] (:type contract)))

(defmethod contract-panel :pool
  [kw contract chainId]
  (let [addr (re-frame/subscribe [::subs/addr])
        contracts-state (re-frame/subscribe [::subs/contracts-state])
        contract-state (kw @contracts-state)]
    [window (:name contract)
     [:div
      [status-bar
       (str "Contract Address: " (:addr contract))
       (if chainId (str "Network: " (:name (chainId->chain chainId))))
       [btn {:text "Refresh" :on-click #(fetch-pool-info contract kw @addr)}]]
      (for [poolId [0 1]]
        ^{:key poolId}
        (let [userInfo (get-in contract-state [:userInfo poolId])
              pendingReward (get-in contract-state [:pendingReward poolId])
              poolInfo (get-in contract-state [:poolInfo poolId])]
          [:div.pool-info
           [:fieldset
            [:legend (str "Pool " poolId)]
            (if poolInfo
              (let [[stakingTokenAddr stakingTokenTotalAmount] poolInfo
                    stakingToken (bsc-tokens stakingTokenAddr)]
                [:p (str "Staking: " (:name stakingToken) " (" (:shortname stakingToken) ")")])
              (fetch-pool-info contract kw @addr))
            (if userInfo [:p (str "Balance: " (.formatUnits e/utils (first userInfo)))])
            (if pendingReward [:p (str "Pending reward: " (.formatUnits e/utils pendingReward))])
            [btn {:text "Claim"
                  :on-click #(re-frame/dispatch [::events/call-contract-write contract "withdraw" [kw :withdraw poolId] [poolId 0]])}]]]))]]))

(defmethod contract-panel :utility
  [kw contract chainId]
  nil)

(defmethod contract-panel nil
  [kw contract chainId]
  nil)

(defn get-zapper-info
  [contract kw]
  (doseq [i (take 3 (range))]
    (re-frame/dispatch [::events/call-contract contract "tokens" [kw :tokens i] [i]])))

(defmethod contract-panel :zap
  [kw contract chainId]
  (let [addr (re-frame/subscribe [::subs/addr])
        zapin-token (re-frame/subscribe [::subs/zapin-token])
        zapout-token (re-frame/subscribe [::subs/zapout-token])
        zapin-amt (re-frame/subscribe [::subs/zapin-amt])
        contracts-state (re-frame/subscribe [::subs/contracts-state])
        balances (re-frame/subscribe [::subs/token-balances])
        contract-state (kw @contracts-state)
        tokens (:tokens contract-state)]
    [window (:name contract)
     [:div
      (if tokens
        [:section
         [:fieldset
          [:legend "Zapping From"]
          [:div
           [:select {:value (or @zapin-token "")
                     :on-change #(doall
                                  (re-frame/dispatch-sync [::events/store-in [:zapper :zapin-token] (.. % -target -value)])
                                  (re-frame/dispatch-sync [::events/get-bep20-bal @zapin-token @addr]))}
            [:option {:value ""} "-Select-"]
            (doall
             (for [token-addr (map #(.-val %) tokens)]
               (let [token (bsc-tokens token-addr)]
                 [:option {:value token-addr} (str (:name token) " (" (:shortname token) ")")])))]
           [:p (str "Balance: " (if @balances (.formatUnits e/utils (or (@balances @zapin-token) 0)) 0))]
           [:p (str "Token Address: " @zapin-token)]]
          ]
         [:fieldset
          [:legend "Zapping To"]
          [:div
           [:select {:value (or @zapout-token "")
                     :on-change #(doall
                                  (re-frame/dispatch-sync [::events/store-in [:zapper :zapout-token] (.. % -target -value)])
                                  (re-frame/dispatch-sync [::events/get-bep20-bal @zapout-token @addr]))}
            [:option {:value ""} "-Select-"]
            (doall
             (for [token-addr (map #(.-val %) tokens)]
               (let [token (bsc-tokens token-addr)]
                 [:option {:value token-addr} (str (:name token) " (" (:shortname token) ")")])))]
           [:p (str "Balance: " (if @balances (.formatUnits e/utils (or (@balances @zapout-token) 0)) 0))]
           [:p (str "Token Address: " @zapout-token)]]
          ]
         [:section.component.zap-row
          [:div.field-row
           [:label {:for "zapin-amt"} "Amount"]
           [:input {:id "zapin-amt" :type "text" :value @zapin-amt :on-change #(re-frame/dispatch-sync [::events/store-in [:zapper :zapin-amt] (.. % -target -value)])}]]
          [:div.zap-btn
           [btn {:text "Max"
                 :on-click #(re-frame/dispatch-sync [::events/store-in [:zapper :zapin-amt] (.formatEther e/utils (@balances @zapin-token))])}]]
          [:div.zap-btn
           [btn {:text "Zap"
                 :on-click #(re-frame/dispatch-sync [::events/call-contract-write contract "zapInToken" [kw :zapInToken @zapin-token @zapout-token] [@zapin-token (.parseEther e/utils @zapin-amt) @zapout-token]])}]]]

         ]
        (get-zapper-info contract kw))]]))

(defn contracts-panel
  []
  (let [contracts (re-frame/subscribe [::subs/contracts])
        chainId (re-frame/subscribe [::subs/chainId])
        contracts-state (re-frame/subscribe [::subs/contracts-state])]
    [:div
     (doall
      (for [[k v] @contracts]
        ^{:key k} [contract-panel k v @chainId]))]))

(defn debug-panel
  []
  [window
   [:div
    [:p "Test Panel"]]])

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
   [intro]])

(defn main-panel []
  (let [name (re-frame/subscribe [::subs/addr])]
    [:div
     [window "welcome" [body]]
     [contracts-panel]]))
