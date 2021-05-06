(ns advent.core-test
  (:require [clojure.test :refer :all]
            [advent.core :refer :all]))

(deftest a-test
  (testing "Example 1"
    (is (= (navigate "R2, L3") 5))))
