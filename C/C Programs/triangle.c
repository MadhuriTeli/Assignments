// 2 . Write a C program to input angles of a triangle and check whether triangle is valid or not.
#include <stdio.h>
void main()
{
  float angle1, angle2, angle3, sum = 0;
  printf("enter angle of triangle \n");
  scanf("%f%f%f", &angle1, &angle2, &angle3);
  sum = angle1 + angle2 + angle3;
  if (sum == 180)
  {
    printf("It is Triangle \n");
  }
  else
  {
    printf("it is Not Triangle \n");
  }
}