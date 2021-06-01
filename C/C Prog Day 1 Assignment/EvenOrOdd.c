//Check if the given number is even or odd.
#include <stdio.h>
void main()
{
  int num;
  printf("enter num \n");
  scanf("%d", &num);
  if (num % 2 == 0)
  {
    printf("Numbe is Even");
  }
  else
  {
    printf("Numberr is Odd");
  }
}