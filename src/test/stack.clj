(ns test.stack)

(defn stack-new [] nil)
(defn stack-push [s e] (cons e s))
(defn stack-top [s] (first s))
(defn stack-pop [s] (rest s))
(defn stack-empty? [s] (empty? s))
