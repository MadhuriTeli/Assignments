#include<stdio.h>
#include<sys/types.h>
#include<unistd.h>

int main(void)
{
	fork();
	printf("Hello there ! \n ");
	return 0;
}
