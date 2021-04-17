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
      [:button {:aria-label "Help"}]
      [:button {:aria-label "Close"}]]]
    [:div.window-body body]]))
