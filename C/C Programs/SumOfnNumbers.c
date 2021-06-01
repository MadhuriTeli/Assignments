#include<stdio.h>
void main()
{
	int n , i , sum =0;
	printf("\n enter num \n");
	scanf("%d",  &n);
	for(i = 1; i <= n; i++)
	{
		sum +=i;
	}
	printf("Sum of Numbers %d", sum);
}
