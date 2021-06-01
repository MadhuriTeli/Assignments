//Finding  Celsius to Fahrenheit to

#include <stdio.h>
void main()
{
  float fahrnheit, celsius;
  printf("enter temperature in Celsius \n");
  scanf("%f", &celsius);
  fahrnheit = (1.8 * celsius) + 32;
  printf("%f", fahrnheit);
}