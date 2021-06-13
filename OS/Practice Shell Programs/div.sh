read num
for((i=1;i<=$num;i++))
do
count=0
        for((j=1;j<=$i;j++))
        do
		mod=$(($i%$j))
       		if [ $mod -eq 0 ]
                then
                        count=$(($count+1))
                fi
        done
count=0
        if [ $count -eq 9 ]
        then
                echo  "$i"
                countdiv=$(($countdiv+1))
        fi
done
 echo  "$countdiv"
