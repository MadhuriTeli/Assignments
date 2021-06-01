#include<stdio.h>
void main()
{
	int num;
	printf("enter num \n");
	scanf("%d", &num);
	printf("Factores of %d : ", num);
	for(int i=1; i<=num; i++)
	{
		if(num % i == 0)
		{
			printf("%d \t", i);
		}
	}
}
