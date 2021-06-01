#include<stdio.h>
void main()
{
	int a , b, gcd;
	printf("enter two numbers \n");
	scanf("%d %d", &a, &b);
	int i;
	for(int i = 1; i <= a && i<= b ; i++)
	{
		if((a%i == 0) && (b%i == 0))
		{
			gcd = i;
		}
	}
	printf("gcd of two %d and %d  is  %d \n", a, b , gcd);
}
