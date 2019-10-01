(ns test.stack-test
  (:require [clojure.test :refer :all]
            [test.stack :refer :all]))

(deftest push_and_pop_integer
  (testing "Push and pop integer"
    (is
     (= "ABC"
      (stack-top (stack-push (stack-new) "ABC"))))))

