(ns yaz.core
  (:require [blessed]
            [cljs.nodejs :as nodejs]))

(set! *warn-on-infer* true)

(nodejs/enable-util-print!)

(defn -main [& args]
  (println "Hello, world!"))

(set! *main-cli-fn* -main)
