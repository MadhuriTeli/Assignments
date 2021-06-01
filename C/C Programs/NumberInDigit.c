#include <stdio.h>
void main()
{
	int num, count = 0;
	printf("enter number \n");
	scanf("%d", &num);
	while (num != 0)
	{
		num = num / 10;
		count++;
	}
	printf("Number in Digits %d", count);
}
