#include<stdio.h>
#include<math.h>
#include<stdlib.h>
void main()
{
	int num, temp, n=0, armnum=0, rem=0;
	printf("enter number \n");
	scanf("%d", &num);
	temp = num;
	while(temp != 0)
	{
		temp /= 10;
		n++;
	}
	//printf("n = %d", n);
	temp = num;
	while(num != 0)
	{
		rem = num% 10;
		armnum += pow(rem, n);
		num/=10;
	}
	//printf("arm %d", armnum);
	
	if(temp == armnum)
	{
		printf("Armstrong Num \n");
	}
	else
	{
		printf("Not Armstrong \n");
	}
}
