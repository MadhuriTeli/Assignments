package com.ds;

public class BSTDemo {

	public static void main(String[] args) {
		BinarySearchTree tree = new BinarySearchTree();
		tree.insert(50);
		tree.insert(60);
		tree.insert(40);
		tree.insert(30);
		tree.insert(35);
		tree.insert(45);
		tree.insert(55);
		tree.insert(70);
		tree.insert(52);
		tree.insert(58);
		tree.insert(56);
		System.out.println("Inorder Traversal");
		tree.inorder();
		System.out.println();
		tree.delete(60);
		tree.inorder();
		System.out.println();
		tree.bft();
	}
}