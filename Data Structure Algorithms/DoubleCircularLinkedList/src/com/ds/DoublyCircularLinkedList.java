package com.ds;

public class DoublyCircularLinkedList {
	private Node tail;
	
	public DoublyCircularLinkedList()
	{
		tail = null;
	}
	
	public void insertAtEnd(int element)
	{
		Node temp = new Node();
		temp.setInfo(element);
		
		if (tail == null)
		{
			tail = temp;
			tail.setNext(tail);
			tail.setPrev(tail);
		}
		else
		{
			// Set temp's next to head
			temp.setNext(tail.getNext());
			// set temp's prev to tail
			temp.setPrev(tail);
			// set head's prev to new last node(temp).
			tail.getNext().setPrev(temp);
			// set 2nd last node's (tail) next to last node (temp)
			tail.setNext(temp);
			tail = temp;
		}
	}
	
	public void traverseForward()
	{
		Node curr = tail.getNext();
		System.out.println("Traverse forward");
		do
		{
			System.out.println(curr.getInfo());
			curr = curr.getNext();
		}
		while (curr!=tail.getNext());
	}
	public void traverseBackward()
	{
		Node curr = tail;
		System.out.println("Traverse backward");
		do
		{
			System.out.println(curr.getInfo());
			curr = curr.getPrev();
		}
		while (curr != tail);
	}
}