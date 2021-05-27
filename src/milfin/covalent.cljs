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

(defn get-top-pairs-2
  []
  (http/post
   "https://api.thegraph.com/subgraphs/name/sushiswap/fantom-exchange"
   {:json-params {:query "
{
	pairs(first: 10, orderBy: volumeUSD, orderDirection: desc) {
    id
    token0 {
      id
      name
    }
    token1 {
      id
      name
    }
  }
}
"}
    }))

(defn get-top-pairs
  []
  (http/post
   "https://api.thegraph.com/subgraphs/name/sushiswap/fantom-exchange"
   {:body  "
{\"query\":
{
	pairs(first: 10, orderBy: volumeUSD, orderDirection: desc) {
    id
    token0 {
      id
      name
    }
    token1 {
      id
      name
    }
  }
}
}
"
    }))

#_(go
  (let [response (<! (get-top-pairs))]
      (prn (:status response))
      (prn  (:body response))))
