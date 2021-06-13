package practice_Code;

//// Java program to find number of integers with exactly 9 divisors

import java.io.*;
import java.util.Scanner;
import java.util.*;
public class Divisior
{
static int count_no_of_divisors(int num)
{
int count = 0;
for (int i = 1; i <= num; i++)
{
if (num % i == 0)
count = count + 1;
}
return count;
}

static void check_9_factors(int n)
{
int c = 0;
for (int i = 1; i <= n; i++)
{
if (count_no_of_divisors(i) == 9)
{
System.out.println(i);
c = c + 1;
}
}
System.out.print("Total = "+ c);

}

public static void main (String[] args)
{
int n;
System.out.print("\nEnter the number :");
Scanner sc = new Scanner(System.in);
n = sc.nextInt();
System.out.print("\nThe number which has exactly 9 divisors : ");
check_9_factors(n);
}
}

