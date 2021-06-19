(ns milfin.grim
  (:require ["./grimmer" :as grimmer]))

(identity grimmer)

(def vaults
  (:default (js->clj grimmer :keywordize-keys true)))

