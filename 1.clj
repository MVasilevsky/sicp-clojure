(defn average [a b]
  (/ (+ a b) 2))

(defn abs [n] (max n (- n)))

(defn good-enough? [guess x]
  (< (abs (- (* guess guess) x))
     0.001))

(defn improve [guess x]
  (average guess (/ x guess)))

(defn tryy [guess x]
  (if (good-enough? guess x)
    guess
    (tryy (improve guess x) x)))

(defn sqrtmy [x] (tryy 1 x))

(sqrtmy 4)