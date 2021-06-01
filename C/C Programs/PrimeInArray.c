// 2 : Find all prime no.'s in runtime array?
#include <stdio.h>
#include <stdlib.h>
#include <math.h>

void main()
{
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

  printf("\nPrime NO in Array : \n");
  for (int i = 0; i < array_size; i++)
  {
    int counter = 0;
    for (int j = 2; j < ptr[i]; j++)
    {
      if (ptr[i] % j == 0)
      {
        counter = 1;
        break;
      }
    }
    if (counter == 0)
    {
      printf("\t %d", ptr[i]);
    }
  }
}