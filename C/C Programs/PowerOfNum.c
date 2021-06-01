#include<stdio.h>
void main()
{
	int num , power, i, result = 1;
	printf("enter the num and power \n");
	scanf("%d %d",  &num, &power);
	for(i=0; i<power; i++)
	{
		result *= num;
	}
	printf("result %d \n", result);
}
