(import java.util.Date)

(def project-version "1.0.0-SNAPSHOT")
(defproject blog-lein project-version
  :description "Trial Clojure project with Midje tests intended for Leiningen practising."
  :dependencies [[org.clojure/clojure "1.8.0"]]
  :profiles {:dev {:dependencies [[midje "1.8.3"]]}}
  :main blog-lein.core
  :manifest {"Build-Version" ~project-version
             "Built-Time" ~(str (Date.))})
