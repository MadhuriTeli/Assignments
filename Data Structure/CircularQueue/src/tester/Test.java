package tester;

import com.ds.Queue;

public class Test {

	public static void main(String[] args) {
		Queue q=new Queue();
		q.enqueue(10);
		q.enqueue(20);
		q.enqueue(30);

		q.enqueue(300);
		System.out.println(q.dequeue());
		System.out.println(q.dequeue());
		q.enqueue(40);
		q.enqueue(50);
		q.enqueue(60);
		
		while(!q.isEmpty()) {
			System.out.println(q.dequeue());
		}
		
	}

}
