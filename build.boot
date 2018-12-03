#!/usr/bin/env boot

(set-env!
  :resource-paths #{}
  :dependencies
  '[
    [seancorfield/boot-tools-deps "0.4.6" :scope "test"]
  ])

(require '[boot-tools-deps.core :refer [deps]])

(deftask uberjar
   "Builds an uberjar of this project that can be run with java -jar"
   []
   (comp
    (deps
        :overwrite-boot-deps true
        ;:quick-merge true
        :verbose 1)
    #_(aot :namespace '#{tools.deps.issue})
    (uber)
    (jar :file "project.jar")
    (show :fileset true)
    (sift :include #{#"project.jar"})
    (target)))