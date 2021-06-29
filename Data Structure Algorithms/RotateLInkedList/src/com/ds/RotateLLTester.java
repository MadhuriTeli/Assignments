package com.ds;

import java.util.Scanner;

public class RotateLLTester {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
	       RotateLinkedList rll=new RotateLinkedList();
	       rll.insertAtEnd(10);
	       rll.insertAtEnd(20);
	       rll.insertAtEnd(30);
	       rll.insertAtEnd(40);
	       rll.insertAtEnd(50);
	       //rll.insertAtEnd(60);       
	       System.out.println("linkedlist before rotate");
	       rll.display();
	       System.out.println("enter the no of times you want rotate linkedlist");
	       int k=sc.nextInt();
	       
	       rll.Rotate(k);
	       System.out.println("Rotated LinkedList is printed below");
	       rll.display();
		}
}
