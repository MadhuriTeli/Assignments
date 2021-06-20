package com.ds;

public class DoublyLLTester {

	public static void main(String[] args) {
		DoublyLinkedList dList= new DoublyLinkedList();
		dList.insertAtFront(10);
		dList.insertAtEnd(20);
		dList.insertAtEnd(30);
		dList.traverseBackward();
		dList.traverseForward();
	}

}
