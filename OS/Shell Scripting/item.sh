touch item.dat
n=0
select var in add show exit
do
case $var in
add)
read -p "enter Quantity : " q

if [ $q -gt 0 ]
then 
read -p "enter rate : " r
if [ $r -gt 100 -a $r -lt 10000 ]
then

count=`tail -n 1 item.dat | cut -d " " -f 1`
cout=$((count+1))
echo "$count $q $r" >> item.dat
else
echo "Rate should be between 100 to 10000"
fi
else
echo "Quntity should be greater than 0"
fi
;;
show)
echo "Content of  item.dat filr"
cat item.dat
;;

exit)
break
;;
esac
done
