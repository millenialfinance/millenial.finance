(ns milfin.core
  (:require
   [reagent.dom :as rdom]
   [re-frame.core :as re-frame]
   [milfin.covalent :as covalent]
   [milfin.events :as events]
   [milfin.views :as views]
   [milfin.config :as config]
   ))


(defn dev-setup []
  (when config/debug?
    (println "dev mode")))

(defn ^:dev/after-load mount-root []
  (re-frame/clear-subscription-cache!)
  (let [root-el (.getElementById js/document "app")]
    (rdom/unmount-component-at-node root-el)
    (rdom/render [views/main-panel] root-el)))

(defn init []
  (re-frame/dispatch-sync [::events/initialize-db])
  (re-frame/dispatch [::events/initialize-ether])
  (dev-setup)
  (mount-root))
