//3. Accept a number and display it multiplication table.
#include <stdio.h>
void main()
{
  int num;
  printf("enter num \n");
  scanf("%d", &num);
  for (int i = 1; i <= 10; i++)
  {
    printf("%d \n", num * i);
  }
}