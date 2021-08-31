package Tester;
import com.app.DDL;
import com.app.Node;

public class DDLTester {

	public static void main(String[] args) {
		 // Start with the empty list
		
	DDL list  = new DDL();
        Node head = null;
 
        /* Create the doubly linked list:
        2<->2<->10<->8<->4<->2<->5<->2 */
        head = list.push(head, 10);
        head = list.push(head, 5);
        head =  list.push(head, 2);
        head =  list.push(head, 4);
        head =  list.push(head, 8);
        head =  list.push(head, 10);
        head =  list.push(head, 2);
        head =  list.push(head, 2);
 
        System.out.println("Original Doubly linked list: ");
        list.printList(head);
 
        int x = 10;
             
        // delete all occurrences of 'x'
        head =  list.deleteAllOccurOfX(head, x);
        System.out.println("\nDoubly linked list after deletion of" + x +":");
        list.printList(head);
        
        
    	System.out.print("\nLinked list before insertion: ");
    	list.printList(head);

		int data = 12, pos = 3;
		head = list.InsertPos(head, pos, data);
		System.out.print("\nLinked list after" + " insertion of 12 at position 3: ");
		list.printList(head);

		// front of the linked list
		data = 1;
		pos = 1;
		head = list.InsertPos(head, pos, data);
		System.out.print("\nLinked list after" + "insertion of 1 at position 1: ");
		list.printList(head);

		// insertion at end of the linked list
		data = 15;
		pos = 7;
		head = list.InsertPos(head, pos, data);
		System.out.print("\nLinked list after" + " insertion of 15 at position 7: ");
		list.printList(head);
		System.out.println("Original linked list ");
        list.printList(head);
 
        list.reverse();
        System.out.println("");
        System.out.println("The reversed Linked List is ");
        list.printList(head);
	}

}
