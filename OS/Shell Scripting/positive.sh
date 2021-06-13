#!/bin/bash
echo "enter size"
read n
i=1
pcount=0
ncount=0
zcount=0
echo "enter numbers"
while [ $i -le $n ]
do 
read num
#for ((j=0;  j<$num; i++))
#do 
	if [ $num -gt 0 ]
	then
		pcount=`echo "$pcount + 1" | bc`
	elif [ $num -lt 0 ] 
	then
		ncount=`echo "$ncount + 1" | bc`
	else
		zcount=`echo "$zcount + 1" |bc`
	fi
#done
i=$((i+1))
done
echo "positive numbeer $pcount"
echo "negative number $ncount"
echo "zeros $zcount"
