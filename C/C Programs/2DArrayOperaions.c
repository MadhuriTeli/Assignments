/*
4. Write a program to create an 2Darray of integers and perform following operations on that array like
finding the sum, average, maximum and minimum number in that array. Accept the numbers of the
array from user.
*/
#include <stdio.h>
void main()
{
  int arr[10][10], rows, cols, sum = 0, min = 256, max = -256;
  float avg;
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

  for (int i = 0; i < rows; i++)
  {
    for (int j = 0; j < cols; j++)
    {
      sum += arr[i][j];
      printf("%d \t", arr[i][j]);
    }
    printf("\n");
  }
  avg = sum / (rows * cols);

  printf("\n Sum of 2DArray: \t %d \n", sum);
  printf("Average of 2DArray: \t %f \n", avg);

  for (int i = 0; i < rows; i++)
  {
    for (int j = 0; j < cols; j++)
    {
      if (arr[i][j] < min)
      {
        min = arr[i][j];
      }
      if (arr[i][j] > max)
      {
        max = arr[i][j];
      }
    }
  }

  printf("The minimum element in 2D array is %d", min);
  printf("\n");
  printf("The maximum element in 2D array is %d", max);
}