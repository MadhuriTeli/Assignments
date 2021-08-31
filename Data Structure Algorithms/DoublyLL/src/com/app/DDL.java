package com.app;

public class DDL {
	
    public Node deleteNode(Node head, Node del)
    {
        // base case
        if (head == null || del == null)
            return null;
 
        /* If node to be deleted is head node */
        if (head == del)
            head = del.next;
 
        /* Change next only if node to be deleted
            is NOT the last node */
 
        if (del.next != null)
            del.next.prev = del.prev;
 
        /* Change prev only if node to be deleted
            is NOT the first node */
        if (del.prev != null)
            del.prev.next = del.next;
 
        del = null;
 
        return head;
    }
         
    /* function to delete all occurrences of the given
        key 'x' */
    public  Node deleteAllOccurOfX(Node head, int x)
    {
        // if list is empty
        if (head == null)
            return null;
 
        Node current = head;
        Node next;
 
        /* traverse the list up to the end */
        while (current != null)
        {
            // if node found with the value 'x'
            if (current.data == x)
            {
                     
                /* save current's next node in the
                pointer 'next' */
                next = current.next;
 
                /* delete the node pointed to by
                'current' */
                head = deleteNode(head, current);
 
                /* update current */
                current = next;
            }
 
            /* else simply move to the next node */
            else
                current = current.next;
 
        }
 
        return head;
 
    }
 
	

    /* Function to insert a node at the beginning
        of the Doubly Linked List */
    public Node push (Node head, int new_data)
    {
        // allocate node
        Node new_node = new Node();
             
        // put in the data
        new_node.data = new_data;
 
        /* since we are adding at the beginning,
        prev is always NULL */
        new_node.prev = null;
 
        // link the old list off the new node
        new_node.next = head;
 
        // change prev of head node to new node
        if (head != null)
            head.prev = new_node;
 
        // move the head to point to the new node
        head = new_node;
         
        return head;
    }
 
    /* Function to print nodes in a given doubly
        linked list */
    public void printList (Node temp)
    {
        if (temp == null)
            System.out.print("Doubly Linked list empty");
 
        while (temp != null)
        {
                System.out.print(temp.data + " ");
                temp = temp.next;
        }
    }
 
	// function to create and return a Node
	public Node GetNode(int data) {
		return new Node(data);
	}

	// function to insert a Node at required position
	public Node InsertPos(Node headNode, int position, int data) {
		Node head = headNode;
		if (position < 1)
			System.out.print("Invalid position");

		// if position is 1 then new node is
		// set infornt of head node
		// head node is changing.
		if (position == 1) {
			Node newNode = new Node(data);
			newNode.next = headNode;
			head = newNode;
		} else {
			while (position-- != 0) {
				if (position == 1) {
					// adding Node at required position
					Node newNode = GetNode(data);

					// Making the new Node to point to
					// the old Node at the same position
					newNode.next = headNode.next;

					// Replacing current with new Node
					// to the old Node to point to the new Node
					headNode.next = newNode;
					break;
				}
				headNode = headNode.next;
			}
			if (position != 1)
				System.out.print("Position out of range");
		}
		return head;
	}

	public void reverse()
	    {
	        Node temp = null;
	        Node current = head;
	 
	        /* swap next and prev for all nodes of
	         doubly linked list */
	        while (current != null) {
	            temp = current.prev;
	            current.prev = current.next;
	            current.next = temp;
	            current = current.prev;
	        }
	 
	        /* Before changing head, check for the cases like
	         empty list and list with only one node */
	        if (temp != null) {
	            head = temp.prev;
	        }
	    }
	 
	
}
