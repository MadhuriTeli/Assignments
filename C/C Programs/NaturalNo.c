//11. Write a C program to print all natural numbers from 1 to n. - using while loop
#include <stdio.h>
void main()
{
  int num, i = 1;
  printf("enter num \n");
  scanf("%d", &num);
  while (i <= num)
  {
    printf("%d \t", i);
    i++;
  }
}
