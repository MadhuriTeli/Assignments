#!/bin/bash

echo "first value=$1"
echo "second value=$2"
echo "third=$3"

case $2 in
+)
result=`echo "$1 + $3" | bc`
echo "additon: $result"
;;
-)
result=`echo "$1 - $3" | bc`
echo "substraction:  $result"
;;
/)
result=`echo "$1 / $3" | bc`
echo "Division: $result"
;;
x)
result=`echo "$1 * $3" | bc`
echo "Multiplication: $result"
;;
*)
echo "Invalid Choice"
;;

esac
