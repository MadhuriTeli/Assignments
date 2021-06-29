package com.ds;

public class QueueUsingLInkedList {
	private Node front;
	private Node rear;
	public QueueUsingLInkedList() {
		rear = null;
		front = null;
	}
	
	
	public void enqueue(int element) {
		Node temp = new Node();
		temp.setInfo(element);
		if (rear == null) {
			rear=front = temp;
		} else {
			Node curr = rear;
			while (curr.getNext() != null) {
				curr = curr.getNext();
			}
			curr.setNext(temp);
		}
	}
	
	public int dequeue() {
		if(front == null) {
			throw new RuntimeException("Queue is Emopty");
		}
		else 
		{
			Node temp = front;
			front = front.getNext();
			return temp.getInfo();
		}
	}
	public boolean isEmpty() {
		return (rear == null);
	}
	
}
