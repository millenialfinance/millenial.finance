(ns milfin.components)

(defn window
  ([body]
   [:div.window
    [:div.window-body body]])
  ([title body]
   [:div.window
    [:div.title-bar
     [:div.title-bar-text title]
     [:div.title-bar-controls
      ^{:key "help"}[:button {:aria-label "Help"}]
      ^{:key "close"}[:button {:aria-label "Close"}]]]
    [:div.window-body body]]))

(defn btn
  [{:keys [text on-click]}]
  [:input {:type "button" :value text
           :on-click on-click}])

(defn status-bar
  [& contents]
  [:div.status-bar
   (for [c contents]
     ^{:key (str c)}[:p.status-bar-field c])])
