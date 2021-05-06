(defproject advent "0.1.0-SNAPSHOT"
  :description "My Advent of Code 2016 solutions."
  :url "https://github.com/JoshKarpel/advent-of-code-2016"
  :dependencies [[org.clojure/clojure "1.8.0"]]
  :plugins [[lein-cljfmt "0.7.0"]]
  :main ^:skip-aot advent.core
  :target-path "target/%s"
  :profiles {:uberjar {:aot :all}})
