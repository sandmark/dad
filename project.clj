(defproject daddy
  #=(clojure.string/trim #=(slurp "resources/version.txt"))
  :description "Small configuration management tool for Clojure"
  :url "https://github.com/liquidz/daddy"
  :license {:name "EPL-2.0 OR GPL-2.0-or-later WITH Classpath-exception-2.0"
            :url "https://www.eclipse.org/legal/epl-2.0/"}
  :deploy-repositories [["releases" :clojars]]
  :dependencies [[org.clojure/clojure "1.10.1"]
                 [org.clojure/tools.cli "0.4.2"]

                 [aero "1.1.3"]
                 [borkdude/sci "0.0.11-alpha.14"]
                 [camel-snake-kebab "0.4.0"]
                 [metosin/malli "0.0.1-SNAPSHOT"]]

  :main ^{:skip-aot true} daddy.core
  :profiles
  {:dev {:resource-paths ["test/resources"]}
   :uberjar {:aot [daddy.core]
             :prep-tasks ["compile"]
             :uberjar-name "daddy.jar"}}
  )
