#include <stdio.h>
void main()
{
	int a, b, lcm;
	printf("enter two numbers \n");
	scanf("%d %d", &a, &b);

	lcm = (a > b) ? a : b;

	while (1)
	{
		if (lcm % a == 0 && lcm % b == 0)
		{
			printf("lcm of %d and %d is %d \n", a, b, lcm);
			break;
		}
		++lcm;
	}
}
