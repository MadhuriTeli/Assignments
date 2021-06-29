package com.ds;

public class CircularLinkedList {
	private Node tail;

	public CircularLinkedList() {
		tail = null;
	}

	public void insertAtEnd(int element) {
		Node temp = new Node();
		temp.setInfo(element);
		if (tail == null) {
			tail = temp;
			tail.setNext(tail);
		} else {
			temp.setNext(tail.getNext());
			tail.setNext(temp);
			tail = temp;
		}
	}

	public void traverse() {
		if (tail != null) {
			Node curr = tail.getNext();
			do {
				System.out.print("->" + curr.getInfo());
				curr = curr.getNext();
			} while (curr != tail.getNext());
		} else {
			System.out.println("List is empty");
		}
	}

	public int deleteElementAtStart() {
		Node curr = null;
		// no node
		if (tail == null) {
			throw new RuntimeException("Empty Circulaar Linked List");
		}
		// if only one node
		else if (tail.getNext() == tail) {
			curr = tail.getNext();
			tail = null;
			return curr.getInfo();
		}
		// more than 1 node exists
		else {
			System.out.println("deltionfrom Front");
			curr = tail.getNext();
			tail.setNext(curr.getNext());
			return curr.getInfo();
		}

	}

}
