//8. Write a C program to input month number and print number of days in that month.
#include <stdio.h>
void main()
{
  int month;
  printf("enter Month  Number \n");
  scanf("%d", &month);

  printf("number of day in %d month : ", month);
  switch (month)
  {
  case 1:
  case 3:
  case 5:
  case 7:
  case 8:
  case 12:
  case 10:
    printf("31");
    break;
  case 2:
    printf("29");
    break;
  case 4:
  case 6:
  case 9:
  case 11:
    printf("30");
    break;
  default:
    printf("invalid");
    break;
  }
}