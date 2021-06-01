// 6. Enter data for one matrix. Find its Transpose & display result.
#include <stdio.h>
void main()
{
  int arr[10][10], rows, cols;

  printf("enter rows and col \n");
  scanf("%d%d", &rows, &cols);
  printf("Enter elements in 2D array \n");
  for (int i = 0; i < rows; i++)
  {
    for (int j = 0; j < cols; j++)
    {
      scanf("%d", &arr[i][j]);
    }
  }
  printf("Matrix : \n");
  for (int i = 0; i < rows; i++)
  {
    for (int j = 0; j < cols; j++)
    {
      printf("%d \t", arr[i][j]);
    }
    printf("\n");
  }
  printf("Transpose Matrix : \n");

  for (int j = 0; j < cols; j++)
  {
    for (int i = 0; i < rows; i++)
    {
      printf("%d \t", arr[i][j]);
    }
    printf("\n");
  }
}