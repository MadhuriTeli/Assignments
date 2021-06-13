#!bin/bash
read num
count=0
countdiv=0
for((i=1;i<=num;i++))
do
	for((j=1;j<=num;j++))
	do
		if [ $i%$j == 0 ]
		then
			count=$((count+1))
		fi
	done
	if [ count == 9 ]
	then
		echo  "$i"
		countdiv=$((countdiv+1))
	fi
done
echo "$countdiv"
