package com.ds;

public class QueueLLTester {

	public static void main(String[] args) {
		QueueUsingLInkedList q=new QueueUsingLInkedList();

		q.enqueue(300);
		q.enqueue(400);
		
		q.enqueue(10);
		q.enqueue(20);
		q.enqueue(30);
		System.out.println("------------------------");
		System.out.println(q.dequeue());
		System.out.println(q.dequeue());
		q.enqueue(40);
		q.enqueue(50);
		q.enqueue(60);
		System.out.println("------------------------");
		while(!q.isEmpty()) {
			System.out.println(q.dequeue());
		}
	}

}
