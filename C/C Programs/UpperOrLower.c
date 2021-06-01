#include<stdio.h>
void main()
{
	char ch;
	printf("enter character \n ");
	scanf("%c", &ch);
	
	if(ch>=65 && ch <= 90)
	{
		printf("character is Uppercase \n");
	}
	else if(ch >= 97 && ch <= 122)
	{
		printf("character is Lowecase \n ");
	}
	else if(ch >= 48 && ch <= 57)
	{
        printf("it is number \n");
    }
	else
	{
		printf("character is special character \n");
	}
}
