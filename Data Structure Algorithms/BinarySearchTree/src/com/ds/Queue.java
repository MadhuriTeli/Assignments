package com.ds;

//Queue of Nodes
public class Queue {
	private int front;
	private int rear;
	private int count;
	private Node[] arr;
	/*
	public Queue()
	{
		front = 0;
		rear = -1;
		count = 0;
		arr = new int[5];
	}
	*/
	public Queue(int size)
	{
		front = 0;
		rear = -1;
		count = 0;
		arr = new Node[size];
	}
	public boolean isFull()
	{
		return (count == arr.length);
	}
	public boolean isEmpty()
	{
		return (count == 0);
	}

	public void enqueue(Node element)
	{
		if (isFull())
		{
			System.out.println("Queue is full.");
		}
		else
		{
			rear = (rear+1) % arr.length;
			arr[rear] = element;
			count++;
		}
	}
	
	public Node dequeue()
	{
		if (isEmpty())
		{
			throw new RuntimeException("Queue is empty.");
		}
		else
		{
			Node temp= arr[front];
			front = ( front + 1) % arr.length;
			count--;
			return temp;
		}
	}
}