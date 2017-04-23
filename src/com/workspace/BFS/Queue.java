package com.workspace.BFS;

public class Queue {

	private final int QUEUE_SIZE = 20;
	private int[] queueArray;
	private int front;
	private int rear;

	public Queue() {
		queueArray = new int[QUEUE_SIZE];
		front = 0;
		rear = -1;
	}

	public void insert(int j) {
		if (rear == QUEUE_SIZE - 1)
			rear = -1;
		queueArray[++rear] = j;
	}

	public int remove() {

		int temp = queueArray[front++];
		if (front == QUEUE_SIZE)
			front = 0;

		return temp;
	}

	public boolean isEmpty() {
		return ((rear + 1 == front) || (front + QUEUE_SIZE - 1 == rear));
	}

}