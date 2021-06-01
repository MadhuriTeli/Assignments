//1 Find all odd and even no.'s in runtime array?
#include <stdio.h>

#include <stdlib.h>
void main()
{
  int *arr;
  int array_size = 0, i;

  printf("Enter number of elements:  \n");
  scanf("%d", &array_size);
  arr = (int *)malloc(array_size * sizeof(int));

  if (arr == NULL)
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
      scanf("%d", &arr[i]);
    }
  }
  // Print the elements of the array
  printf("The elements of the array are: \n");
  for (i = 0; i < array_size; ++i)
  {
    printf("%d, ", arr[i]);
  }
  printf("\n Odd element in array : ");
  for (int i = 0; i < array_size; i++)
  {
    if (arr[i] % 2 != 0)
    {
      printf("%d \t", arr[i]);
    }
  }
  printf("\n Even Elements in Array: ");
  for (int i = 0; i < array_size; i++)
  {
    if (arr[i] % 2 == 0)
    {
      printf("%d \t", arr[i]);
    }
  }
}
