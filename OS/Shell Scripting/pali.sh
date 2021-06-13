#!/bin/bash
read -p "enter a num" num
sum=0
copy=$num
while [ "$num" -gt "0" ]
do
r=`echo "$num % 10" | bc`
#echo "r=$r"
sum=`echo "$sum * 10 + $r"| bc`
#echo "sum=$sum"
num=`echo "$num / 10" | bc`
#echo "num $num"
done
#echo "reve $sum"
if [ "$sum" == "$copy" ]
then
echo "its a palindrome"
else
echo "Not a palindrome"

fi
