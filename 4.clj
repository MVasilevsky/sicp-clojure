(defn cons [a b]
  #(cond (= % 1) a
         (= % 2) b))

(defn car [x] (x 1))

(defn cdr [x] (x 2))

(defn mkpoint [a b]
  (cons a b))

(defn point-x [p]
  (car p))

(defn point-y [p]
  (cdr p))

(defn mksegm [a b]
  (cons a b))

(defn segm-start [x]
  (car x))

(defn segm-end [x]
  (cdr x))

(point-x (segm-end (mksegm (mkpoint 3 4)
                           (mkpoint 7 8))))
