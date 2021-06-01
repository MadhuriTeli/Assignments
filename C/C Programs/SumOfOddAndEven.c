//13. Write a C program to find sum of all even and odd numbers between 1 to n.
#include <stdio.h>
void main()
{
  int num, evenSum = 0, oddSum = 0;
  printf("enter the n numver\n");
  scanf("%d", &num);
  for (int i = 1; i <= num; i++)
  {
    if (i % 2 == 0)
    {
      evenSum += i;
    }
    else
    {
      oddSum += i;
    }
  }
  printf("sum of all even number between 1 to %d = %d \n", num, evenSum);

  printf("sum of all Odd number between 1 to %d = %d \n", num, oddSum);
}