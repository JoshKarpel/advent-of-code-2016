(ns advent.core
  (:gen-class))

(defn -main
  "I don't do a whole lot ... yet."
  [& _args]
  (println "Hello, World!"))

(defn navigate
  [instructions]
  (prn (map
        (fn [instruction] split-at 1 instruction)
        (clojure.string/split instructions #", "))))
