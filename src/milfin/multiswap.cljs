(ns milfin.multiswap
  (:require
            ["@z80dev/v2-sdk" :as sdk-lib]
            ["@uniswap/sdk-core" :as core]
            [milfin.routers :as r]
            ))

;; callback event when response is recieved

(def sdk (js->clj sdk-lib :keywordize-keys true))
(def c (js->clj core :keywordize-keys true))

(def ICE (core/Token. 250 "0xf16e81dce15b08f326220742020379b855b87df9" 18))
(def WFTM (core/Token. 250 "0x21be370d5312f44cb42ce377bc9b8a0cef1a4c83" 18))

(def wftm "0x21be370d5312f44cb42ce377bc9b8a0cef1a4c83")
(def ori "0x0575f8738efda7f512e3654f277c77e80c7d2725")
(def ice "0xf16e81dce15b08f326220742020379b855b87df9")
(def tomb "0x6c021Ae822BEa943b2E66552bDe1D2696a53fbB7")
(def tshare "0x4cdF39285D7Ca8eB3f090fDA0C069ba5F4145B37")

(defn get-pair-address
  [chainId token-a token-b factory init-code-hash]
  (let [t0 (core/Token. chainId token-a)
        t1 (core/Token. chainId token-b)]
    (.getAddressForFactory sdk-lib/Pair t0 t1 factory init-code-hash)))

(def SPIRIT_FACTORY
  {:addr "0xEF45d134b73241eDa7703fa787148D9C9F4950b0"
   :k :spirit
   :init-hash "0xe242e798f6cee26a9cb0bbf24653bf066e5356ffeac160907fe2cc108e238617"})

(def SPOOKY_FACTORY
  {
   :addr "0x152eE697f2E276fA89E96742e9bB9aB1F2E61bE3"
   :k :spooky
   :init-hash "0xcdf2deca40a0bd56de8e3ce5c7df6727e5b1bf2ac96f283fa9c4b3e6b42ea9d2"
  })

(def HYPER_FACTORY
  {
   :addr "0x991152411A7B5A14A8CF0cDDE8439435328070dF"
   :k :hyper
   :init-hash "0xc7afa4a3485a5e46a8e6c01f3d79956707846c2145019cf4004d190147370afe"
  })

(def FACTORIES [ SPIRIT_FACTORY HYPER_FACTORY SPOOKY_FACTORY])

(defn get-lp-addresses
  [chainId tokens]
  (let [[token0 token1] (doall (map #(core/Token. chainId % 18) tokens))]
    (into {}
          (doall
           (for [{:keys [addr k init-hash]} FACTORIES]
             [k (.getAddressForFactory sdk-lib/Pair token0 token1 addr init-hash)])))))

(js/console.log (:spooky (get-lp-addresses 250 [wftm tomb])))
