echo "1. Add Recorcd"
echo "2. Delete Record"
echo "3.Find Record"
echo "4 Exit"

read -p "Enter Choice" choice

case $choice in 

1)	read -p "Enter Roll NO: " rno
	read -p "Enter Name " fname
	read -p "enter last Name " lname
	read -p "enter course name " cname
	read -p "enter marks in subject1 " s1
	read -p "enter marks in subject2 " s2
	read -p "enter marks in subject3 " s3
	echo "$rno:$fnaem:$lname:$cname:$s1:$s2:$s3" >> database
	echo "Record is Added"
	;;
2)	read -p "Enter ROll No " rno
	grep -v "$rno" database > tmpfile && mv tmpfile database
	echo "Record is Deleted"
	;;
3)	read -p "enter Roll Number " rno
	echo "Roll NO : "
	grep "$rno" database | cut -d ':' -f 1

	echo "Name: " 
	grep "$rno" database | cut -d ':' -f 2,3
 
	echo "Course : "
	grep "$rno" database | cut -d ':' -f 4

	echo "Marks of subject1 : "
	grep "$rno" database | cut -d ':' -f 5
	
	echo "Marks of subject2 : " 
	grep "$rno" database | cut -d ':' -f 6

	echo "Marks of subject3 : "
	grep "Srno" database | cut -d ':' -f 7
	;;

4) 	echo "exit"
	exit
	;;

*)	echo "Invalid choice"
	;;
esac
