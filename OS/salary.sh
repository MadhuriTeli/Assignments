#!/bin/bash
read -p "enter basic salary" basic
dp=`echo "$basic*0.5" | bc`
b=`echo "$basic+dp" | bc`
da=`echo "$b*0.35" |bc`
hra=`echo "$b*0.08" | bc`
ma=`echo "$b*0.03" | bc`
pf=`echo "$b*0.1" | bc`
salary=`echo "$basic+$dp+$da+$hra+$ma-$pf" | bc`
echo "Total Salary= $salary"
