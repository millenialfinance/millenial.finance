(ns milfin.env)

(defmacro covalent-api-key []
  (System/getenv "COVALENT_API_KEY"))
