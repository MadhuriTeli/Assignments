package com.ds;

public class DoublyCircularLLTester {

	public static void main(String[] args) {
		DoublyCircularLinkedList dcll = new DoublyCircularLinkedList();
		dcll.insertAtEnd(20);
		dcll.insertAtEnd(10);
		dcll.insertAtEnd(30);
		dcll.insertAtEnd(40);
		dcll.insertAtEnd(50);
		dcll.insertAtEnd(60);
		
	dcll.traverseBackward();
	dcll.traverseForward();
	}

}
