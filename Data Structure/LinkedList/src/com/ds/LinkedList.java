package com.ds;

public class LinkedList {
	private Node head;

	public LinkedList() {
		head = null;
	}
//////////////Insert Operations//////////
	//Insert at end of linkedLIst
	public void insertAtEnd(int element) {
		Node temp = new Node();
		temp.setInfo(element);
		if (head == null) {
			head = temp;
		} else {
			Node curr = head;
			while (curr.getNext() != null) {
				curr = curr.getNext();
			}
			curr.setNext(temp);
		}
	}
	
	public void insertFront(int element) {
		Node temp = new Node();
		temp.setInfo(element);
		if(head==null) {
			head=temp;
		}
		else
		{
			temp.setNext(head);
			head = temp;
		}
	}
	// insert Before specified element
	public void insertBefore(int element , int before) {}
	public void insertAtPosition(int element, int position) {}
	
	// insert After specified element
	public void insertAfter(int element, int after) {
		Node temp = new Node();
		temp.setInfo(element);
		Node curr = head;

		while ((curr!=null) && (curr.getInfo()!= after)) 
			curr = curr.getNext();
			if (curr != null) {
				temp.setNext(curr.getNext());
				curr.setNext(temp);
			}
			else
			{
				System.out.println("node with element  " + after + " does not exist ");
			}
		
	}
//Delete at  Front same as pop for stack using linked list
	public int deleteAtFront() {
		if(head == null) {
			throw new RuntimeException("LinkedList Empty");
		}
		else 
		{
			Node temp = head;
			head = head.getNext();
			return temp.getInfo();
		}
	}
	
	//Traversal linked List
	void display() {
		Node curr = head;
		while (curr != null) {
			System.out.print(curr.getInfo() + "-->");
			curr = curr.getNext();
		}
	}
}
