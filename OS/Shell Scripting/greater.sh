#!/bin/bash
read -p "enter two  numbers" n1 n2
if test "$n1" -gt "$n2"
then
	echo "$n1 is greater"
else
	echo "$n2 is greater"
fi
