#! /bin/bash
sum=0
read -p "enter a num" num
copy=$num
while  [ "$num" -ne "0" ]
do
s=`echo  "$num % 10" | bc`
sum=`echo "$sum + $s" | bc`
num=`echo "$num / 10" | bc`
done
echo "sum of digit $sum"
