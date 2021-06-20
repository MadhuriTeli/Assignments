package com.ds;

import com.ds.exception.StackEmptyException;

public class Stack {
	private int top;
	private int[] arr;
	public Stack(){
		top=-1;
		arr = new int[5];
	}
	
	public Stack(int size) {
		top=-1;
		arr = new int[size];
	}
	
	public boolean isFull() {
		return (top==arr.length-1);
	}
	
	public boolean isEmpty()
	{
		return (top==-1);
	}
	
	public void push(int element) {
		if(isFull()) {
			System.out.println("stack Full");
		}
		else {
			arr[++top]=element;
		}
	}
	
	public int pop() {
		if(isEmpty()) {
			throw new StackEmptyException();
		}
		else {
			return arr[top--];
		}
	}
	public int peek()
	{
		if (isEmpty())
		{
			throw new StackEmptyException();
		}
		else
		{
			return arr[top];
		}
	}
	

}
