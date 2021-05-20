(ns milfin.covalent
  (:require-macros
   [milfin.env :as env]
   [cljs.core.async.macros :refer [go]])
  (:require [cljs-http.client :as http]
            [cljs.core.async :refer [<!]]))

(def api-key (env/covalent-api-key))
(def base-url "https://api.covalenthq.com/v1/")

(defn get-balances
  [chainId address]
  (http/get
   (str base-url chainId "/address/" address "/balances_v2/")
   {:basic-auth {:username api-key :password ""}}))

#_(go (let [response (<!)]
      (prn (:status response))
      (prn  (:body response))))
