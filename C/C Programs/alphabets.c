//28. Write a C program to print all alphabets from a to z
#include <stdio.h>
void main()
{
  printf("all alphabets from a to z \n");

  for (char ch = 'a'; ch <= 'z'; ch++)
  {
    printf("%c \t", ch);
  }
}