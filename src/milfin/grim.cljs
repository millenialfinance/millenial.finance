(ns milfin.grim
  (:require ["./grimmer" :as grimmer]))

(def vaults
  (:default (js->clj grimmer :keywordize-keys true)))

