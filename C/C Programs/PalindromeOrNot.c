#include<stdio.h>
void main()
{
	int num, rev =0, rem, n;
	printf("enter num \n");
	scanf("%d", &num);
	n= num;
	while(num != 0)
	{
		rem = num % 10;
		rev = rev*10+ rem;
		num /= 10;
	}
	//printf("%d", rev);
	if(n == rev)
	{
		printf("Palindrome Num \n");
	}
	else
	{
		printf("Not Palindrome \n");
	}
}
	
