#!/bin/bash
read -p "enter number" n
flag=0
for ((i=1; i<=$n; i++))
do
flag=0
	for ((j = 2; j <= $i / 2; j++))
	do
		if [ $(( $i % $j )) -eq 0 ]
		then
			flag=1
#			echo "flag=1 $i"
			break
		fi
	done
	if [ "$flag" -eq 0 ]
	then
		echo "$i"
	fi
done
