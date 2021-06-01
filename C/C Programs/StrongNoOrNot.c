#include<stdio.h>
int Factorial(int n)
{
	int i, fact=1;
	for(i=1; i<=n; i++)
	{
		fact = fact*i;
	}
	//printf("%d \n ", fact);
	return fact;
}

void main()
{
	int num, temp, rem, sum =0;
	printf("enter num \n");
	scanf("%d", &num);
	temp = num;
	
	while(temp != 0)
	{
		rem = temp % 10;
		temp /=10;

	sum += Factorial(rem);
	}
	//printf("sum %d \n", sum);
	
	if(sum == num)
	{
		printf("Strong Number \n");
	}
	else
	{
		printf("Not Strong Number \n");
	}
}
	
