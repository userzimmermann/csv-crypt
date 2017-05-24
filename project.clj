(defproject csv-crypt "0.1-SNAPSHOT"
  :description "FIXME: write description"
  :url "http://example.com/FIXME"
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}

  :min-lein-version "2.0.0"
  :pedantic? :abort

  :dependencies
  [[buddy/buddy-core "1.2.0"]
   [cheshire "5.7.1"]
   [org.clojure/clojure "1.8.0"]
   [org.clojure/data.csv "0.1.3"]
   [org.clojure/tools.cli "0.3.5"]]

  :profiles
  {:uberjar
   {:main csv-crypt.core
    :aot :all}})