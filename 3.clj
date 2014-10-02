(def dx 0.0001)

(defn deriv [f]
  #(/ (- (f (+ % dx))
         (f %))
      dx))

(defn fixed-point-my
  "mock fixed-point function"
  [f guess]
  3)

(defn newton-my [f guess]
  (def df (deriv f))
  (fixed-point-my #(- % (/ (f %) (df %)))
                  guess))

(defn sqrt-my [x]
  (newton-my #(- x (* % %))
             1))

(sqrt-my 5)