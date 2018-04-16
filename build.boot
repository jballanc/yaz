(set-env!
 :resource-paths #{"src"}
 :dependencies '[[org.clojure/clojure "1.9.0"]
                 [org.clojure/clojurescript "1.10.238"]

                 ;; Boot plugins
                 [adzerk/boot-cljs "2.1.4" :scope "test"]])

(require
 '[adzerk.boot-cljs :refer [cljs]])

(task-options!
 cljs {:compiler-options
       {:infer-externs true
        :main 'yaz.core
        :language-in :ecmascript6
        :npm-deps {:blessed "0.1.81"}
        :target :nodejs}})

(deftask build
  []
  (comp (cljs)
     (target)))
