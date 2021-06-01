#include<stdio.h>
void main()
{
	int num, sum =0;
	printf("enter num \n");
	scanf("%d", &num);
	for(int i= 1; i<num; i++)
	{
		if(num % i == 0)
		{
			sum +=i;
		}
	}
	if(sum == num)
	{
		printf("Perfect Number \n");
	}
	else
	{
		printf("not perfect number \n");
	}
}

