echo "Your HOme directory is $HOME"
echo
echo "date	time	permission	file name"
echo
echo "----------------------------------------------"

ls -l | while read perm bsize user group size month day time file; do echo "$month $day $time $perm $file "; done
echo "----------------------------------------------"
echo "Total number of files: "
find . -maxdepth 1 | wc -l

echo "Total number of normal files :"
find . -maxdepth 1 -type f | wc -l

echo "Total number of directories:"
find . -maxdepth 1 -type d | wc -l
