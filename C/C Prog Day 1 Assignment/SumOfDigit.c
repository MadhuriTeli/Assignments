//Accept a 3 digit number from user and find the sum of the digits and also reverse the number
#include <stdio.h>
int SumOfDigit(int);
int ReverseNumber(int);

int SumOfDigit(int num)
{
  int rem, sum = 0;
  while (num != 0)
  {
    rem = num % 10;
    num = num / 10;
    sum = sum + rem;
  }
  return sum;
}

int ReverseNumber(int num)
{
  int rem, rev = 0;
  while (num != 0)
  {
    rem = num % 10;
    rev = rev * 10 + rem;
    num = num / 10;
  }
  return rev;
}

void main()
{
  int num;
  printf("enter 3 digit Number \n ");
  scanf("%3d", &num);
  printf("Sum of Digit : %d \n", SumOfDigit(num));
  printf("Reverse of Number : %d", ReverseNumber(num));
}