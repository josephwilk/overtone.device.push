(ns push.device
  (:require
   [overtone.studio.midi :refer :all]
   [overtone.libs.event :refer :all]))

(defrecord Push [rcv dev interfaces])
