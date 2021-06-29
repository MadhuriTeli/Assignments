package com.ds;

public class RotateLinkedList {
	public Node head;

	public void insertAtEnd(int data) {
		Node newnode = new Node();
		newnode.setData(data);
		if (head == null) {
			head = newnode;
		} else {
			Node curr = head;
			while (curr.getNext() != null) {
				curr = curr.getNext();

			}
			curr.setNext(newnode);

		}

	}

	public int length() {
		int length = 0;
		Node curr = head;

		while (curr != null) {
			curr = curr.getNext();
			length++;
		}
		return length;
		// System.out.println("length of ll: " + length);
	}

	public void Rotate(int k) {
		Node curr = head;
		Node prev = null;
		int count = 0;
		int newpoint = 0;
		int length = length();
		k = k % length;
		if (k != 0) {
			newpoint = length - k;
		}

		if (k == 0) {
			return;
		}

		while (curr.getNext() != null && count != newpoint) {
			prev = curr;
			curr = curr.getNext();
			count++;
		}
		// System.out.println("current Node:"+curr.getData()+"
		// "+"previousnode:"+prev.getData());

		Node newcurr = curr;
		while (curr.getNext() != null) {
			curr = curr.getNext();
		}
		curr.setNext(head);
		head = newcurr;
		prev.setNext(null);

	}

	public void display() {
		Node curr = head;
		while (curr.getNext() != null) {
			System.out.print(curr.getData() + "-->");
			curr = curr.getNext();
		}
		System.out.println(curr.getData());
	}
}
