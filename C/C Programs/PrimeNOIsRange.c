#include <stdio.h>
void main()
{
  int num, flag;
  printf("enter num \n");
  scanf("%d", &num);
  printf("Prime Num \n");
  for (int i = 1; i <= num; i++)
  {
    flag = 0;
    for (int j = 2; j <= i / 2; j++)
    {
      if (i % j == 0)
      {
        //  printf("num is not prime \n");
        flag = 1;
        break;
      }
    }
    if (flag == 0)
      printf("%d \t", i);
  }
}
