package com.stklili;

public class Node {
//data members
	private int data;
	private Node next;
	
	public Node()//def
	{
		this.data=0;
		this.next=null;
	}
	public Node(int data)//param.
	{
		this.data=data;
		this.next=null;
	}
	
	int getData()	
	{
		return this.data;
	}
	
	Node getNext()
	{
		return this.next;
	}
	
	void setData(int data )//local var
	{
	   this.data=data;
	}
	
	void setNext(Node next) //localvar
	{
		this.next=next;
	}
		
}
