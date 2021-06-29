package com.ds;


public class BinarySearchTree {
	private Node root;
	public BinarySearchTree()
	{
		root = null;
	}
	public void insert(int element)
	{
		Node temp = new Node();
		temp.setInfo(element);
		
		if (root == null)
		{
			root = temp;
		}
		else
		{
			Node curr = root;
			Node parent = null;
			while (curr!=null)
			{
				parent = curr;
				if (element <= curr.getInfo())
					curr = curr.getLeft();
				else
					curr = curr.getRight();
			}
			// After the above loop completes execution, temp node will be
			// made a child of parent node.
			
			if (element <= parent.getInfo())
				parent.setLeft(temp);
			else
				parent.setRight(temp);
		}
	}
	
	protected void inorder(Node treeroot)
	{
		if (treeroot != null)
		{
			inorder(treeroot.getLeft());
			System.out.print(treeroot.getInfo() + ", ");
			inorder(treeroot.getRight());
		}
	}
// Overload the method inorder
	public void inorder()
	{
		inorder(root);
	}
	
	public void delete(int element)
	{
		Node curr,parent=null;
		if (root == null)
		{
			System.out.println("Tree is empty");
		}
		else
		{
			curr = root;
			// Keep traversing the tree and search for the node 
			// to be deleted until node is not found (curr becomes null) or
			// until the node is found (curr.getInfo() will match the element)
			while ((curr != null) && (curr.getInfo()!=element))
			{
				parent = curr;
				if (element > curr.getInfo())
					curr = curr.getRight();
				else
					curr = curr.getLeft();
			}
			// After the above loop
			// If curr is null, element not found
			// otherwise curr is the node to be deleted.
			// parent is the parent node of curr.
			
			// If node not found
			if (curr == null)
			{
				System.out.println("Node not present");
			}
			// Node to be removed is the root node
			else if (parent == null)
			{
				System.out.println("Node to be removed is the root node.");
			}
			// Node to be removed is a leaf node
			else if (curr.getLeft() == null && curr.getRight() == null)
			{
				System.out.println("Node to be removed is a leaf node.");
				// Check whether curr is the left child or right child of the parent.
				// Set appropriate reference to null.
				if (parent.getLeft() == curr)
					parent.setLeft(null);
				else
					parent.setRight(null);
			}
			// Node to be removed has only 1 child
			else if (curr.getLeft() == null || curr.getRight() == null)
			{
				System.out.println("Node to be removed has only 1 child");
				// Check if curr has left child
				if(curr.getLeft()!=null) {
					Node temp = curr.getLeft();
					
					// If curr is left child of its Parent
					if(curr==parent.getLeft())
						parent.setLeft(temp);
					else
						// Otherwise curr is right child of its parent
						parent.setRight(temp);
				}
				// Otherwise curr has right child
				else {
					Node temp = curr.getRight();
					if(curr==parent.getRight())
						parent.setRight(temp);
					else
						parent.setLeft(temp);
				}
			}
			else
			{
				System.out.println("Node to be removed has 2 children");
				
				// set temp to curr's left
				Node temp = curr.getLeft();
				
				// set temp to rightmost descendant of LST
				while (temp.getRight() != null)
					temp = temp.getRight();
				
				temp.setRight(curr.getRight()); // RST is merged with LST
				
				curr.setRight(null);
				
				// Examine if curr is the right or left child of its parent
				if (parent.getRight()==curr)
					parent.setRight(curr.getLeft());
				else
					parent.setLeft(curr.getLeft());
				curr.setLeft(null);
			}
				
		}
	}
	
	// Breadth First Traversal of a BST
	// Queue of Nodes
	public void bft()
	{
		Queue q = new Queue(10);
		q.enqueue(root);
		while (!q.isEmpty())
		{
			Node temp = q.dequeue();
			if (temp.getLeft()!=null)
				q.enqueue(temp.getLeft());
			if (temp.getRight()!=null)
				q.enqueue(temp.getRight());
			System.out.println(temp.getInfo());
		}
	}

}