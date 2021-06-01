#include<stdio.h>
void main()
{
	int a, b, i, sum = 0;
	printf("enter range \n");
	scanf("%d %d", &a, &b);
	for(i=a; i<=b; i++)
	{
		sum += i;
	}
	printf("Sum %d", sum);
}
