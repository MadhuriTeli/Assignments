/* Display a menu to the user (like 1.Even Odd 2. Basic salary etc), 
ask the user to enter his choice,
 then based on that perform the desired operations.
 */
#include <stdio.h>
#include <math.h>
void main()
{
  int number, choice;
  printf("enter no. \n");
  scanf("%d", &number);
  printf("enter \n 1: Squre \n 2: cube  \n 3: power to 4 \n 4: squre root \n ");
  scanf("%d", &choice);
  switch (choice)
  {
  case 1:
    printf("Square :%d \n", number * number);
    break;
  case 2:
    printf("Cube :%d \n", number * number * number);
    break;
  case 3:
    printf("Power to 4 :%d \n", number * number * number * number);
    break;
  case 4:

    printf("Square root :%f \n", sqrt(number));
    break;

  default:
    printf("Invalid Choice \n");
    break;
  }
}