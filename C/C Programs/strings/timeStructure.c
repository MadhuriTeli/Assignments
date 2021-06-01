/*
2: Define a structure to represent time in hours (0-23), minutes (0-59), 
and seconds (0-59), and then write a function that accepts an argument of type time 
represented by this structure and updates it by one second & 30 seconds.
*/

#include <stdio.h>
#include <string.h>

struct Time
{
  int hours;
  int minutes;
  int seconds;
};

struct Time(struct Time t1)
{
  printf("%d %d% d", t1);
};

int main()
{
  struct Time t1;
  printf("Enter the  time. \n");
  printf("Enter hours, minutes and seconds: ");
  scanf("%d %d %d", &t1.hours, &t1.minutes, &t1.seconds);
  printf("Displaying time:\n");
  printf("hr:min:sec = %d:%d:%d \n", t1.hours, t1.minutes, t1.seconds);
}
