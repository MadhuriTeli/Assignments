#include<stdio.h>
#include<math.h>
void main()
{
	int num, i, flag = 0;
	printf("enter num \n");
	scanf("%d", &num);
	for(i=2; i<= num/2; i++)
	{
		if(num % i == 0)		
		{
			printf("num is not prime \n");
			flag =1;
			break;
		}
	}
		if(flag == 0)
			printf("Prime Num \n");
}
