package com.ds;

public class QueueUsingLInkedList {
	private Node head;
	
	public QueueUsingLInkedList() {
		head = null;
	}
	
	
	public void enqueue(int element) {
		Node temp = new Node();
		temp.setInfo(element);
		if (head == null) {
			head = temp;
		} else {
			Node curr = head;
			while (curr.getNext() != null) {
				curr = curr.getNext();
			}
			curr.setNext(temp);
		}
	}
	
	public int dequeue() {
		if(head == null) {
			throw new RuntimeException("Queue is Emopty");
		}
		else 
		{
			Node temp = head;
			head = head.getNext();
			return temp.getInfo();
		}
	}
	public boolean isEmpty() {
		return (head == null);
	}
	
}
