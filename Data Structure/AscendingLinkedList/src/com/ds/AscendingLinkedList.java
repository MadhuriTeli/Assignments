package com.ds;

public class AscendingLinkedList {
	public Node head;

	public void insertAccsort(int data) {
		Node newnode = new Node();
		newnode.setData(data);
		Node prev = null;
		if (head == null) {
			head = newnode;
		} else {
			Node curr = head;
			if (newnode.getData() > curr.getData()) {
				while (curr.getNext() != null) {

					if (curr.getData() > newnode.getData()) {
						prev.setNext(newnode);
						newnode.setNext(curr);
						break;
					}
					prev = curr;

					curr = curr.getNext();
				}
				if (curr.getNext() == null && newnode.getData() > curr.getData()) {
					curr.setNext(newnode);
				} else {
					prev.setNext(newnode);
					newnode.setNext(curr);
				}

			} else {
				newnode.setNext(curr);
				head = newnode;
			}
		}
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