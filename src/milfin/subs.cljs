(ns milfin.subs
  (:require
   [re-frame.core :as re-frame]
   [milfin.routers :refer [routers]]
   [milfin.vaults :refer [vaults]]
   [milfin.tokens :as tokenlist]))

(re-frame/reg-sub
 ::name
 (fn [db]
   (:name db)))

(re-frame/reg-sub
 ::addr
 (fn [db]
   (:addr db)))

(re-frame/reg-sub
 ::balance
 (fn [db]
   (:balance db)))


(re-frame/reg-sub
 ::connected
 (fn [db]
   (:connected db)))

(re-frame/reg-sub
 ::chainId
 (fn [db]
   (:chainId db)))

(re-frame/reg-sub
 ::contracts
 (fn [db]
   (:contracts db)))

(re-frame/reg-sub
 ::zapper-contract
 :<- [::contracts]
 (fn [contracts ]
   (:milzap contracts)))

(re-frame/reg-sub
 ::contracts-state
 (fn [db [_ contract-kw]]
   (contract-kw (:contracts-state db))))

(re-frame/reg-sub
 ::zapin-token
 (fn [db]
   (:zapin-token (:zapper db))))

(re-frame/reg-sub
 ::zapin-amt
 (fn [db]
   (:zapin-amt (:zapper db))))

(re-frame/reg-sub
 ::zapper-state
 (fn [db]
   (:zapper db)))

(re-frame/reg-sub
 ::zapout-token
 (fn [db]
   (:zapout-token (:zapper db))))

(re-frame/reg-sub
 ::token-balances
 (fn [db]
   (:token-balances (:contracts-state db))))

(re-frame/reg-sub
 ::token-allowances
 (fn [db]
   (:token-allowances (:contracts-state db))))

(re-frame/reg-sub
 ::all-enabled-tokens
 (fn [db]
   (:enabled-tokens db) ))

(re-frame/reg-sub
 ::enabled-tokens
 :<- [::chainId]
 :<- [::all-enabled-tokens]
 (fn [[chainId allTokens]]
   (get allTokens chainId)))

(re-frame/reg-sub
 ::migrator-state
 (fn [db]
   (:migrator db)))

(re-frame/reg-sub
 ::vaulter-state
 (fn [db]
   (:vaulter db)))

(re-frame/reg-sub
 ::all-enabled-vaults
 (fn [db ]
   (:vaults db)))

(re-frame/reg-sub
 ::enabled-vaults
 :<- [::chainId]
 :<- [::all-enabled-vaults]
 (fn [[chainId allVaults]]
   (get allVaults chainId)))

(re-frame/reg-sub
 ::vault-provider
 (fn [db]
   (:provider (:vaulter db))))

(re-frame/reg-sub
 ::all-vault-providers
 (fn [db]
   (:vault-providers db) ))

(re-frame/reg-sub
 ::vault-providers
 :<- [::chainId]
 :<- [::all-vault-providers]
 (fn [[chainId vaults]]
   (get vaults chainId)))

(re-frame/reg-sub
 ::tokens
 :<- [::chainId]
 (fn [chainId]
   (tokenlist/tokens chainId)))

(re-frame/reg-sub
 ::migrator-dest-router
 :<- [::chainId]
 :<- [::migrator-state]
 (fn [[chainId {:keys [to-router]}]]
   (get-in routers [chainId to-router] {})))

(re-frame/reg-sub
 ::migrator-amt
 :<- [::migrator-state]
 (fn [state]
   (:amt state)))


(re-frame/reg-sub
 ::migrator-source-router
 :<- [::chainId]
 :<- [::migrator-state]
 (fn [[chainId {:keys [from-router]}]]
   (get-in routers [chainId from-router] {})))

(re-frame/reg-sub
 ::migrator-token
 (fn [db]
   (:from-token (:migrator db))))



(re-frame/reg-sub
 ::migrator-lp-tokens
 :<- [::migrator-source-router]
 :<- [::tokens]
 (fn [[source-router tokens]]
   (let [router-addr  (:address source-router)
         isLP #(= :lp (:type %))
         is-selected #(and (isLP %) (= (:router-addr %) router-addr))]
     (filter is-selected (vals tokens)))))

(re-frame/reg-sub
 ::routers
 :<- [::chainId]
 (fn [chainId]
   (vals (into {} (filter #(string? (first %)) (routers chainId))))))

(re-frame/reg-sub
 ::selected-vault
 :<- [::chainId]
 :<- [::vaulter-state]
 (fn [[chainId {:keys [to]}]]
   (get-in vaults [chainId to])))

(re-frame/reg-sub
 ::vault-from
 :<- [::vaulter-state]
 (fn [{:keys [from]}]
   from))

(re-frame/reg-sub
 ::vault-to
 :<- [::vaulter-state]
 (fn [{:keys [to]}]
   to))

(re-frame/reg-sub
 ::vault-amt
 :<- [::vaulter-state]
 (fn [{:keys [amt]}]
   amt))

(re-frame/reg-sub
 ::vault-router
 :<- [::chainId]
 :<- [::selected-vault]
 (fn [[chainId {:keys [router]}]]
   (js/console.log "Router: " (clj->js router))
   (get-in routers [chainId router] {})))

(re-frame/reg-sub
 ::cov-bals
 (fn [db]
   (get-in db [:covalent :balances :items] [])))

(re-frame/reg-sub
 ::covalent-balances
 :<- [::cov-bals]
 (fn [token-bals [_ include-dust]]
   (if-not include-dust
     (filter #(not= "dust" (:type %)) token-bals)
     token-bals)))

(re-frame/reg-sub
 ::migrator-from-balance
 :<- [::migrator-token]
 :<- [::token-balances]
 (fn [[token token-bals]]
   (get token-bals (:address token) 0)))

(re-frame/reg-sub
 ::migrator-from-allowance
 :<- [::migrator-token]
 :<- [::token-allowances]
 (fn [[token token-allowances]]
   (get token-allowances (:address token) 0)))
