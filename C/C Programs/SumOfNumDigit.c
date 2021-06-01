#include<stdio.h>
void main()
{
	int num, rem, sum = 0;
	printf("\n enter the num \n");
	scanf("%d", &num);
	while(num != 0)
	{
		rem = num%10;
		num = num/10;
		sum +=rem;
	}
	printf("Sum of Numbers in Digit %d \n ", sum);
}
