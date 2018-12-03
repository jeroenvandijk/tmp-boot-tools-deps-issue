(ns tools.deps.issue
  (:require [example.lib1]
            [example.lib2])
  (:gen-class))

(defn -main
  "I don't do a whole lot."
  [x]
  (example.lib1/foo)
  (example.lib2/foo)

  (println x "Hello, World from main!"))
