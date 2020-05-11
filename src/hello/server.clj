(ns hello.server
  (:require [hello.handler :as handler]
            [ring.adapter.jetty :as jetty]))

(defonce server (atom nil))

(defn start! []
  (reset! server
         (jetty/run-jetty #'handler/welcome-handler
                          {:port  3000
                           :join? false})))

(defn stop! []
  (.stop @server))
