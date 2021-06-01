#include<stdio.h>
void main()
{
	int f1 = 0, f2 = 1 , f = 0, i, num;
	printf("enter num upto which fibb series \n");
	scanf("%d", &num);

	while(f <= num)
	{
		printf("%d ",f);
		f1 = f2;
		f2 = f;
		f = f1+f2;
		
	}
}

		
	
