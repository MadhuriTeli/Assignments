package com.ds;

public class DoublyLinkedList {
	private Node head;
	private Node tail;

	public DoublyLinkedList() {
		head = tail = null;
	}

	public void insertAtEnd(int element) {
		Node temp = new Node();
		temp.setInfo(element);
		if (head == null) {
			head = tail = temp;
		} else {
			tail.setNext(temp);
			temp.setPrev(tail);
			tail = temp;
		}
	}

	public void insertAtFront(int element) {
		Node temp = new Node();
		temp.setInfo(element);
		if (head == null) {
			head = tail = temp;
		} else {
			temp.setNext(head);
			head.setPrev(temp);
			head = temp;
		}
	}
	
	public void insertAfter(int element, int after) {}
	
	public void traverseForward() {
		Node curr = head;
		System.out.println("Traverse Forward");
		while(curr != null) {
			System.out.print("-->" +curr.getInfo());;
			curr= curr.getNext();
	}
		System.out.println();
	}
	
	public void traverseBackward() {
		Node curr = tail;
		System.out.println("Traverse Backward");
		while(curr!=null) {
			System.out.print("-->" +curr.getInfo());
			curr= curr.getPrev();
		}System.out.println();
	}

}
