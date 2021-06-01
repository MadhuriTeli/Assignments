#include<stdio.h>
#include<sys/types.h>
#include<unistd.h>
#include<stdlib.h>

int main(void)
{
	int pid=fork();
	if(pid>0)
	{
		exit(0);
	}
	else if(pid==0)
	{
		sleep(80);
	}
	return 0;
}
