(ns hello.handler
  (:require [hello.core :as hello]
            [ring.util.response :as r]))

(defn welcome-handler [request]
  (-> (r/response (hello/welcome-msg))
      (r/content-type "text/html")))
