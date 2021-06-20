package com.ds;

public class CircularQueueUsingLinkedList {
	
	public Node front;
	public Node rear;

	public void enQueue(int data) {
		Node newnode = new Node();
		newnode.setInfo(data);
		if (front == null) {
			front = rear = newnode;
		} else {

			rear.setNext(newnode);
			rear = newnode;
			rear.setNext(front);
		}
	}

	public void deQueue() throws ExceptionHandling {
		if (front == null) {
			throw new ExceptionHandling("Queue is Empty push some element ");
		} else if (front == rear) {
			rear=null;
			front=null;
			System.out.println("Circular queue is empty now");
			
		} else {
			//Node curr = front;
			front = front.getNext();
			rear.setNext(front);
		}
	}
	public void display() {
		Node curr = front;
		while (curr != rear) {
			System.out.print(curr.getInfo() + "|");
			curr = curr.getNext();
		}
		System.out.println(curr.getInfo() + "|");
	}
}
