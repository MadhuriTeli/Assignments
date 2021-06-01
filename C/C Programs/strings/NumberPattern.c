/*

Write a function to generate the following pyramid of numbers

      0
     101
    21012
   3210123
  432101234
 54321012345
  432101234
   3210123
    21012
     101
      0

*/

/*
#include <stdio.h>
int main()
{
  int n, x, y, k;
  printf("Enter the number of rows to show number paatern: ");
  scanf("%d", &n);
  for (x = 1; x <= n; x++)
  {
    for (y = x; y < n; y++)
    {
      printf(" ");
    }
    for (k = 1; k < (x * 2); k++)
    {
      printf("%d", k);
    }
    printf("\n");
  }
  for (x = 4; x >= 1; x--)
  {
    for (y = n; y > x; y--)
    {
      printf(" ");
    }
    for (k = 1; k < (x * 2); k++)
    {
      printf("%d", k);
    }
    printf("\n");
  }
  return 0;
}
*/

#include <stdio.h>
int main()
{
  int i, space, rows, k = 0, count = 0, count1 = 0;
  printf("Enter the number of rows: ");
  scanf("%d", &rows);
  for (i = 1; i <= rows; ++i)
  {
    for (space = 1; space <= rows - i; ++space)
    {
      printf("  ");
      ++count;
    }
    while (k != 2 * i - 1)
    {
      if (count <= rows - 1)
      {
        printf("%d ", i - 1 - k);
        ++count;
      }
      else
      {
        ++count1;
        printf("%d ", (i - 1 - k + 2 * count1));
      }
      ++k;
    }
    count1 = count = k = 0;
    printf("\n");
  }

  return 0;
}