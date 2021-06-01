#include <stdio.h>
void main()
{
  int i, j, k, n = 5, m = 1;
  for (int i = n; i >= 1; i--)
  {
    for (int j = 1; j < m; j++)
    {
      printf(" ");
    }
    for (int k = 1; k <= 2 * i - 1; k++)
    {
      printf("*");
    }
    m++;

    printf("\n");
  }
}