/*Accept two numbers from user and an operator (+,-,/,*,%)
 based on that perform the desired operations.*/

#include <stdio.h>
void main()
{
  int num1, num2, add, div, sub, mult, mod;

  char operator;
  printf("enter Two Numbers \n enter operator\n");
  scanf("%d%d %c", &num1, &num2, &operator);
  // printf("enter operator\n");
  // scanf("");
  switch (operator)
  {
  case '+':
    add = num1 + num2;
    printf("%d \n", add);
    break;
  case '-':
    sub = num1 - num2;
    printf("%d \n", sub);
    break;
  case '/':
    div = num1 / num2;
    printf("%d", div);
    break;
  case '*':
    mult = num1 * num2;
    printf("%d", mult);
    break;
  case '%':
    mod = num1 % num2;
    printf("%d", mod);
    break;

  default:
    printf("invalid Case \n");
    break;
  }
}