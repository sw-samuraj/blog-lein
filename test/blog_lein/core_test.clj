(ns blog-lein.core-test
  (:use [blog-lein.core])
  (:use [midje.sweet]))

(tabular
  (fact "The factorial"
    (factorial ?n) => ?f)
  ?n ?f
  0  1
  1  1
  2  2
  3  6
  4  24)

(tabular
  (fact "The binomial"
    (binomial ?n ?k) => ?b)
  ?n ?k ?b
  0  0  1
  1  0  1
  2  0  1
  2  1  2
  3  2  3
  4  2  6
  6  3  20)

(tabular
  (fact "The Catalan numbers"
    (catalan ?n) => ?c)
  ?n ?c
  0  1
  1  1
  2  2
  3  5
  4  14)

(fact "The Ultimate Question"
  (answer) => 42)
