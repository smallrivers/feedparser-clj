(defproject org.clojars.smallrivers/feedparser-clj "0.5.3"
  :description "Parse RSS/Atom feeds with a simple, clojure-friendly API."
  :deploy-repositories {"releases" {:url "https://repo.clojars.org"
                                    :username :env/clojars_user
                                    :password :env/clojars_pass}}
  :dependencies [[com.rometools/rome "1.12.0"]]
  :pedantic? :abort
  :profiles {:dev
             {:dependencies
              [[org.clojure/clojure "1.9.0"]]}
             :reflection {:global-vars {*warn-on-reflection* true}}})
