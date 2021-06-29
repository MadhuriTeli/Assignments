package com.ds;

public class LinkedListTester {

	public static void main(String[] args) {
		LinkedList l = new LinkedList();
		l.insertAtEnd(5);
		l.insertAtEnd(6);		
		l.insertAtEnd(7);
		l.insertAtEnd(8);
		l.insertAfter(1, 7);
		l.display();
		System.out.println();

		System.out.println("delete at front" );
		System.out.println(l.deleteAtFront());
		System.out.println("-----------------------" );
		l.display();
		System.out.println();
		System.out.println("element inserted  at front" );
		l.insertFront(100);
		System.out.println("-----------------------");
		l.display();
	}

}
