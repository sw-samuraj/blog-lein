(ns blog-lein.core
  (:gen-class))

(def question
  "A definition of the Ultimate Question."
  (str
    "What is the Answer to the Ultimate Question of Life,"
    \newline
    "the Universe, and Everything?"))

(defn factorial [n]
  "Counts a factorial."
  (apply * (range 2 (inc n))))

(defn binomial [n k]
  "Counts a binomial coefficient."
  (/ (factorial n)
     (* (factorial k)
        (factorial (- n k)))))

(defn catalan [n]
  "Counts a Catalan number."
  (* (/ 1 (+ n 1))
     (binomial (* 2 n) n)))

(defn answer []
  "An answer to the Ultimate Question."
  (catalan 5))

(defn -main []
  (println question)
  (println (str (answer))))
