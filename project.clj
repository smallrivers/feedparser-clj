(defproject org.clojars.smallrivers/feedparser-clj "0.5.2"
  :description "Parse RSS/Atom feeds with a simple, clojure-friendly API."
  :dependencies [[com.rometools/rome "1.11.0"]]
  :pedantic? :abort
  :profiles {:dev
             {:dependencies
              [[org.clojure/clojure "1.9.0"]]}
             :reflection {:global-vars {*warn-on-reflection* true}}})
