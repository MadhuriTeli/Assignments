package com.ds;

public class CircularQueueTester {

	public static void main(String[] args) throws ExceptionHandling {
		CircularQueueUsingLinkedList cqll = new CircularQueueUsingLinkedList();
		cqll.enQueue(10);
		cqll.enQueue(20);
		cqll.enQueue(30);
		cqll.enQueue(40);
		cqll.enQueue(50);
		System.out.println("Circular Queue after inserting elements");
		cqll.display();
		cqll.deQueue();
		cqll.deQueue();
		 
		System.out.println("Circular Queue after Dequeuing elements");
		cqll.display();
		cqll.deQueue();
		cqll.deQueue();
		cqll.deQueue();
		cqll.deQueue();


	}

}
