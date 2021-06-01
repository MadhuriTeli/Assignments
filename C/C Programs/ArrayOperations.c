/*
3. Write a program to create an array of integers and perform following operations on that array like
finding the sum, average, maximum and minimum number in that array. Accept the numbers of the
array from user.
*/
#include <stdio.h>
#include <stdlib.h>
void main()
{
  int sum = 0, min = 256, max = -256;
  int *ptr;
  int array_size = 0, i;

  printf("Enter number of elements:  \n");
  scanf("%d", &array_size);
  ptr = (int *)malloc(array_size * sizeof(int));

  if (ptr == NULL)
  {
    printf("Memory not allocated.\n");
    exit(0);
  }
  else
  {
    printf("Eneter Elements\n");

    for (i = 0; i < array_size; ++i)
    {
      //write the values in memory location
      scanf("%d", &ptr[i]);
    }
  }
  // Print the elements of the array
  printf("The elements of the array are: \n");
  for (i = 0; i < array_size; ++i)
  {
    printf("%d, ", ptr[i]);
  }

  //Sum of array a
  for (int i = 0; i < array_size; i++)
  {
    sum += ptr[i];
  }
  printf("\n Sum of Array: \t %d \n", sum);
  printf("Average of Array: \t %d \n", sum / array_size);

  for (int i = 0; i < array_size; i++)
  {
    if (ptr[i] < min)
    {
      min = ptr[i];
    }
    if (ptr[i] > max)
    {
      max = ptr[i];
    }
  }

  printf("The minimum element is %d", min);
  printf("\n");
  printf("The maximum element is %d", max);
}
