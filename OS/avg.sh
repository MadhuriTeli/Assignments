#!/bin/bash

read -p "enter three numbers" n1 n2 n3
add=`echo "$n1 + $n2 + $n3" | bc`
echo "scale=2;$add/3" |bc

