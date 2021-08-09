package com.stack;

public class Stack {
private int arr[];
private int top;
private int size;

public Stack()
{
	this.size=5;
	arr=new int [5];
	this.top=-1;
}

public Stack(int size)
{
	this.size=size;
	arr=new int [this.size];
	this.top=-1;
}
boolean isFull()
{
	/*if(top==size-1)
		return true;
	else
		return false;*/
	return (top==size-1);
}
boolean isEmpty()
{
	return (top==-1);
}

boolean push(int data)
{
	if(isFull())
	{
		System.out.println("stack full");
		return false;
	}
	arr[++top]=data;
	return true;
	
}

int pop()
{
	if(isEmpty())
	{
	  System.out.println("stack empty..");
	  return -999;
	}
	return arr[top--];
}
	 
int peek() {
	if(isEmpty())
	{
	  System.out.println("stack empty..");
	  return -999;
	}
	return arr[top];
}

void display()
{
	for(int i=top;i>=0;i--)
	{
		System.out.print(arr[i]+"  ");
	}
	System.out.println();
}

}
