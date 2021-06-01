//Find the price of item when discount is given(specify different discount based on price)
#include <stdio.h>
void main()
{
  float price, discount, finalPrice;
  printf("enter  price \n");
  scanf("%f", &price);
  if (price >= 10000)
  {
    discount = price * 0.3;
  }
  else if (price >= 8000)
  {

    discount = price * 0.2;
  }
  else if (price >= 7000)
  {

    discount = price * 0.15;
  }
  else
  {

    discount = price * 0.1;
  }
  finalPrice = price - discount;
  printf("Final Price with Discount: %f ", finalPrice);
}