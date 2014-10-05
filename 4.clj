(defn cons [a b]
  #(cond (= % 1) a
         (= % 2) b))

(defn car [x] (x 1))

(defn cdr [x] (x 2))

(def mkpoint cons)
(def point-x car)
(def point-y cdr)

(def mksegm cons)
(def segm-start car)
(def segm-end cdr)

(point-x (segm-end (mksegm (mkpoint 3 4)
                           (mkpoint 7 8))))
