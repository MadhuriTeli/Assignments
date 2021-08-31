package com.app;


public interface IDoublyLinkedList {
	
//	 public void addAtRear(int ele);
//	 public void addAtFront(int ele);
//	 public int getNodeCount();
//	 public int[] getAllElement();
//	 public void GetAllElementsInReverseOrder();
//	 public boolean addElementAtPosition(int ele,int position);
//	 public Node deleteAllOccurOfX(Node head, int x);
//	 public Node deleteNode(Node head, Node del);
	 public void printList (Node temp);
	 public Node push (Node head, int new_data);
	public  Node deleteAllOccurOfX(Node head, int x);
	public Node InsertPos(Node headNode, int position, int data) ;
}
