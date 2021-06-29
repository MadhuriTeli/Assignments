package com.ds;

public class stackLLTester {

	public static void main(String[] args) {
		StackUsingLinkedList st = new StackUsingLinkedList();
		st.push(1);
		st.push(2);
		st.push(3);
		st.push(4);
		try {
		System.out.println(st.pop());
		System.out.println(st.pop());
		}
		catch(Exception e) {
			System.out.println(e.getMessage());
		}
		st.push(3);
		st.push(4);
		st.push(5);
		st.push(6);
		System.out.println("---------------------------------");
		while(!st.isEmpty()) {
			System.out.println(st.pop());
		}
		try {
		System.out.println(st.pop());
		}catch(Exception e) {
			System.out.println(e.getMessage());
		}

	}

}
