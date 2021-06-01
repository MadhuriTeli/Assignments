//Write a program to find greatest of three numbers using nested if - else.
#include <stdio.h>
void main()
{
  int num1, num2, num3;
  printf("Enter 3 numbers \n");
  scanf("%d%d%d", &num1, &num2, &num3);
  if (num1 != num2 || num1 != num3)
  {
    printf("numbers are  not equal\n");
    if (num1 > num2 && num1 >> num3)
    {
      printf("%d is greatest", num1);
    }
    else if (num2 > num1 && num2 > num3)
    {
      printf("%d is greatest", num2);
    }
    else
    {
      printf("%d is greatest", num3);
    }
  }
  else
  {
    printf("numbers are   equal\n");
  }
}