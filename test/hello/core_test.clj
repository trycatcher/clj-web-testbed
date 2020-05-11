(ns hello.core-test
  (:require [hello.core :as sut]
            [clj-time.core :as t]
            [clojure.test :refer :all]))

;; FIXME:- Not a very useful test,
;; but should get us started for now
(deftest welcome-test
  (testing "Welcome should start with Hello world,"
    (is (clojure.string/starts-with?
         (sut/welcome-msg (t/now))
         "Hello world,"))))

