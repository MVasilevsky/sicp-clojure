(defn summ [value a step b]
  (if (> a b)
    0
    (+ (value a)
       (summ value
            (step a)
            step
            b))))

(defn sum-int [a b]
  (summ #(* 2 %) a inc b))

(sum-int 1 6)