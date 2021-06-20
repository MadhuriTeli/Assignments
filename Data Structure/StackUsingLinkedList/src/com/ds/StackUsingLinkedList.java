package com.ds;

public class StackUsingLinkedList {
	private Node top;
	public StackUsingLinkedList() {
		top=null;
	}
	
	public void push(int element) {
		Node temp = new Node();
		temp.setInfo(element);
		if(isEmpty()) {
			top=temp;
		}
		else
		{
			temp.setNext(top);
			top=temp;
		}
	}
	
	public int pop() {
		if(isEmpty()) {
			throw new RuntimeException("Stack Empty");
		}
		else 
		{
			Node temp = top;
			top = top.getNext();
			return temp.getInfo();
		}
	}
	
	public boolean isEmpty()
	{
		return (top==null);
	}

}
