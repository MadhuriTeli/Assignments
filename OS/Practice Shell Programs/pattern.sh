read num
for((i=1;i<=num;i++))
do
	for((j=1;j<=i;j++))
	do
		echo -n "$j"
	done
	for((j=i-1;j>=1;j--))
	do
		echo -n "$j"
	done
	echo 
done
