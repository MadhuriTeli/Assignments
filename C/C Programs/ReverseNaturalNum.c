//12 Write a C program to print all natural numbers in reverse (from n to 1). - using while loop
#include <stdio.h>
void main()
{
  int num, i = 1;
  printf("enter num \n");
  scanf("%d", &num);
  while (num >= i)
  {
    printf("%d \t", num);
    num--;
  }
}