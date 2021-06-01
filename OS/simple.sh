x#!/bin/bash
read  -p "enter principle value " p
read -p  "enter rate of interest "  r
read -p "enter time  period " t
s=`echo "$p*$t*$r/100" | bc `
echo "the simple interest is"
echo $s
