(defproject lein-antlr "0.3.1-pubnub-SNAPSHOT"
  :description "Generate source code from ANTLR grammars in Leiningen."
  :dependencies [[org.antlr/antlr4 "4.5"]]
  :profile {:dev {:dependencies [[org.clojure/clojure "1.4.0"]]}}
  :url "http://github.com/alexhall/lein-antlr"
  :eval-in-leiningen true
  :license {:name "Apache Software License, Version 2.0"
            :url "http://www.apache.org/licenses/LICENSE-2.0"
            :distribution :repo}
  :deploy-repositories [["snapshots" "http://maven.devbuild.pubnub.com:8081/artifactory/ext-snapshot-local"]
                        ["releases" "http://maven.devbuild.pubnub.com:8081/artifactory/ext-release-local"]]
  ; FIXME remove profiles when Lein build slave is configured
  :profiles {:pnbuild-temp {:deploy-repositories [["snapshots" {:url "http://maven.devbuild.pubnub.com:8081/artifactory/ext-snapshot-local"
                                                                :username :env/pn_maven_user
                                                                :password :env/pn_maven_password}]
                                                  ["releases" {:url "http://maven.devbuild.pubnub.com:8081/artifactory/ext-release-local"
                                                               :username :env/pn_maven_user
                                                               :password :env/pn_maven_password}]]}})
