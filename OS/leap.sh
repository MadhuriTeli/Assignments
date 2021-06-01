#!/bin/bash
echo "enter year"
read year

if [ $(($year % 4)) -eq 0 ]
then
	if [ $(($year %100)) -eq 0 ]
	then
		if [ $(($year % 400)) -eq 0 ]
		then
			echo "Leap Year"
		else
			echo "Not Leap Year"
		fi
	else
		echo "Leap Year"
	fi
else
	echo "Not Leap Year"
fi
