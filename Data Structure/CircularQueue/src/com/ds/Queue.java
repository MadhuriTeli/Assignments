package com.ds;

public class Queue {
	private int front, rear, count;
	private int[] arr;

	public Queue() {
		front = 0;
		rear = -1;
		count = 0;
		arr = new int[5];
	};

	public Queue(int size) {
		front = 0;
		rear = -1;
		count = 0;
		arr = new int[size];
	};

	public boolean isFull() {
		return (count == arr.length);
	}

	public boolean isEmpty() {
		return (count == 0);
	}

	public void enqueue(int element) {
		if (isFull()) {
			System.out.println("Queue is Full");
		} else {
			rear = (rear + 1) % arr.length;
			arr[rear] = element;
			count++;
		}
	}

	public int dequeue() {
		if (isEmpty()) {
			throw new RuntimeException("Queue is Emopty");
		} else {
			int temp;
			temp = arr[front];
			front = (front + 1) % arr.length;
			count--;
			return temp;
		}

	}

}
