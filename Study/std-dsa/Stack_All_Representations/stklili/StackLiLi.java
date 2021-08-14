package com.stklili;

public class StackLiLi {
private Node top;

public StackLiLi()
{
	this.top=null;
}

boolean push(int data)
{
	Node newNode=new Node(data);
	if(newNode==null)
	{
		return false;
	}
	//chk if stk is empty
	if(top==null)
	{
		top=newNode;//set newnode as first top
		return true;
	}
	//if non empty stack then make newnode as top
	newNode.setNext(top);
	top=newNode;
	return true;	
}

int pop()
{
	if(top==null) //empty stack 
		return -999;
	//non empty stack
	int val=top.getData();
	top=top.getNext();
	return val;
}


int peek()
{
	if(top==null) //empty stack 
		return -999;	
	//non empty stack
	int val=top.getData();
	
	return val;
}

void display()
{
   Node temp=top;
   System.out.println();
   while(temp!=null)
   {
	  System.out.print(temp.getData()+ "   " );   
	  temp=temp.getNext();
   }
}

}
