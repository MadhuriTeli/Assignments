echo "Files in current directory with 0 byte are : "
find . -maxdepth 1 -type f -size 0

echo "enterr Y to delete files with size 0"
echo "enterr Q to quit Operation"

read -p "enter your choice: " c

case $c in
Y|y)
	find . -maxdepth 1 -type f -size 0 -delete
	echo "all files with 0 size are deleted successfully."
	;;
Q|q)	
	echo "Cancel"
	exit
	;;
*)
	echo "Invalid choice"
	;;
esac
