#include<stdio.h>
#include<sys/types.h>
#include<unistd.h>
#include<stdlib.h>

int main(void)
{
	int pid=fork();
	if(pid>0)
	{
		sleep(80);
	}
	else
	{
		exit(0);
	}
	return 0;
}
