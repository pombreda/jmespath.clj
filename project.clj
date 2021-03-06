(defproject jmespath "0.1.0"
  :description "Declaratively extract elements from a JSON document, in Clojure"
  :url "http://github.com/mtdowling/jmespath.clj"
  :license {:name "The MIT License"
            :url "http://opensource.org/licenses/mit-license.php"
            :distribution :repo}
  :dependencies [[org.clojure/clojure "1.7.0-alpha4"]
                 [instaparse "1.3.5"]
                 [cheshire "5.3.1"]]
  :main jmespath.core
  :resource-paths ["src/jmespath/resource"]
  :profiles {:dev {:dependencies [[rhizome "0.2.1"]]
                   :resource-paths ["test-resources"]}})
