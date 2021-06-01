echo "content of pwd"
ls -l
read -p "enterr filename : " f1
if [ ! -r $f1 ]
then 
echo "Not Readable"
else
echo "Readable"
read -p "enter file to copy data from $f1 : " f2
if [ ! -s $f2 ]
then
read -p "Do you want to overwrite [Y/N]?" c
case $c in
Y|y)
echo "Overwriting"
cat $f1>$f2
echo "---------Content of $f2-------"
cat $f2
;;
N|n)
echo "Overwriting cancelled"
;;

*)
echo "Invalid Choice"
;;
esac
else
cat $f1  >  $f2
echo "-----------Content of $f2----------"
cat $f2
fi
fi
