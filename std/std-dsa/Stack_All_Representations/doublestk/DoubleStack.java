package com.doublestk;

public class DoubleStack {
private int arr[];
private int top1,top2;
private int size;

public DoubleStack()//default is size 10
{
	this.size=10;
	arr=new int [this.size];
	this.top1=-1;
	this.top2=this.size;
}

public DoubleStack(int size)
{
	this.size=size;
	arr=new int [this.size];
	this.top1=-1;
	this.top2=this.size;
}


boolean isFull()
{
	return (top2==top1+1);  //(top1==top2-1)
}
boolean isEmpty1()
{
	return (top1==-1 );
}
boolean isEmpty2()
{
	return ( top2==size);
}

boolean push1(int data)
{
	if(isFull())
	{
		System.out.println("stack full");
		return false;
	}
	arr[++top1 ]=data;
	return true;
	
}

boolean push2(int data)
{
	if(isFull())
	{
		System.out.println("stack full");
		return false;
	}
	arr[--top2]=data;
	return true;
	
}

int pop1()
{
	if(isEmpty1())
	{
	  System.out.println("stack empty..");
	  return -999;
	}
	return arr[top1--];
}

int pop2()
{
	if(isEmpty2())
	{
	  System.out.println("stack empty..");
	  return -999;
	}
	return arr[top2++];
}
	 
int peek1() {
	if(isEmpty1())
	{
	  System.out.println("stack empty..");
	  return -999;
	}
	return arr[top1];
}


int peek2() {
	if(isEmpty2())
	{
	  System.out.println("stack empty..");
	  return -999;
	}
	return arr[top2];
}


void stkwisedisplay()
{
	System.out.println("Stack1 :");
	for(int i=top1;i>=0;i--  )
	{
		System.out.print(arr[i]+"  ");
	}
	System.out.println();
	
	
	
	System.out.println("Stack2 :");
	for(int i=top2;i<=size-1;i++  )
	{
		System.out.print(arr[i]+"  ");
	}
	System.out.println();
}

}
