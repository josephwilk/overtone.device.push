(ns push.device
  (:require
   [overtone.studio.midi :refer :all]
   [overtone.libs.event :refer :all]))

(defrecord Push [rcv dev interfaces])

(def control-grid-notes
  [(range 20 28)
   (range 102 110)])

(def grid-notes
  [(range 92 100)
   (range 84 92)
   (range 76 84)
   (range 68 76)
   (range 60 68)
   (range 52 60)
   (range 44 52)
   (range 36 44)])

(def dial-note (range 0 11))

(def control-dial
  [(range 71 80) ;; Top
   (range 14 16)]) ;;Left
