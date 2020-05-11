(ns hello.handler
  (:require [hello.core :as hello]))

(defn welcome-handler [request]
  {:status 200
   :headers {"Content-type" "text/html"}
   :body (hello/welcome-msg)})
