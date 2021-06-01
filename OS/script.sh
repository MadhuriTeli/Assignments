#!/bin/bash
echo "enter 1 to create user"
echo "enter 2 to deleter user"
echo "enter 3 to create group"
echo "enter 4 to delete group"
echo "entere q to quit"
read -p "enter  choice: " reply
case "$reply" in
1) echo "enter username"
read username
sudo useradd "$username";;
2) echo "enter username for which user is to be deleted"
read ud
sudo userdel "$ud";;
3) echo "enter groupname"
read grname"
sudo groupadd "$grname";;
4) echo "enter groupname for which group is to be deleted"
read gr
sudo groupdel "$gr";;
q) echo "quit"
exit 0;;
*) echo "invalidChoice"
exit 1;;
esac
