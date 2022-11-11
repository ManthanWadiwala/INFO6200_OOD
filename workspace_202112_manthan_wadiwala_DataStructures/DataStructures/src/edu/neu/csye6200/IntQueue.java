package edu.neu.csye6200;

public class IntQueue implements IntQueueAPI {

	private int[] arr;
	private int capacity; // Max size
	private int front;
	private int rear;
	private int count; // elements in Queue
	public IntQueue(int capacity)
	{
		this.arr = new int[capacity];
		this.capacity = capacity;
		this.front = 0;
		this.rear = -1;
		this.count = 0;
	}
	
	@Override
	public int size() {
		return count;
	}

	@Override
	public boolean isEmpty() {
		return (count==0);
	}

	@Override
	public boolean isFull() {
		return (count == capacity);
	}

	@Override
	public void enqueue(int item) {
		if (isFull()) {
			System.exit(1); // ERROR
		}
		System.out.println("Adding " + item);
		rear = (rear + 1) % capacity; // circular index
		arr[rear] = item;
		count++;

	}

	@Override
	public int dequeue() {
		if (isEmpty()) {
			System.exit(1); // ERROR
			}
			int e = arr[front];
			System.out.println("Removing " + e);
			front = (front + 1) % capacity; // circular index
			count--;
			return e;
		
	}

	@Override
	public int peek() {
		if (isEmpty()) {
			System.exit(1); // ERROR
			}
			return arr[front];
	}
	
	public static void demo() {
		System.out.println("### Queue data structure for int data types ###");
		IntQueue q = new IntQueue(5);
		q.enqueue(1);	// 1st in
		q.enqueue(2);	// 2nd in
		q.enqueue(3);	// 3rd in
		System.out.println("Front element is: " + q.peek());
		q.dequeue();	// 1st out is 1
		System.out.println("Front element is: " + q.peek());
		System.out.println("Queue size is " + q.size());

		q.dequeue();	// 2nd out is 2
		q.dequeue();	// 3rd out is 3
		if ( q.isEmpty() )
		     System.out.println("Queue Is Empty");
		else
		     System.out.println("Queue Is Not Empty");

		System.out.println("\n");
		
	}
 
}
