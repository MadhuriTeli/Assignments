/*
Accept the price from user. Ask the user if he is a student (user may say yes or no). 
If he is a student and he has purchased more than 500 than discount is 20% otherwise discount 
is 10%. But if he is not a student then if he has purchased more than 600 discount is 15% 
otherwise there is not discount.
*/
#include <stdio.h>
void main()
{
  float price, discount = 0;
  char student;
  printf("enter price \n If Student then enter 'y' for yes otherwise 'n' for no \n");
  scanf("%f %c", &price, &student);
  switch (student)
  {
  case 'y':
    if (price > 500)
    {
      discount = price * 0.2;
    }
    else
    {
      discount = price * 01;
    }
    printf("total Price : %f", price - discount);

    break;
  case 'n':
    if (price > 600)
    {
      discount = price * 0.15;
    }
    else
    {
      printf("NO discount");
    }
    printf("total Price : %f", price - discount);

    break;
  default:
    printf("Invalid Case");
    break;
  }
}