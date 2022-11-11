package edu.neu.csye6200;

public class GenericQueue<T> implements GenericQueueAPI<T> {
	
	private T[] arr;
	private int capacity; // Max size
	private int front;
	private int rear;
	private int count; // elements in Queue
	public GenericQueue(int capacity) {
		this.arr = (T[]) new Object[capacity];
		this.capacity = capacity;
		this.front = 0;
		this.rear = -1;
		this.count = 0;
	}
	@Override
	public int size(){
		return count;
	}
	@Override
	public boolean isEmpty() {
		return (count== 0);
		}
	@Override
	public boolean isFull() {
		return (count == capacity);
		}
	@Override
	public void enqueue(T item) {
		if (isFull()) {
			System.exit(1); // ERROR
		}
		System.out.println("Adding " + item);
		rear = (rear + 1) % capacity; // circular index
		arr[rear] = item;
		count++;
		}
	@Override
	public T dequeue() {
		if (isEmpty()) {
		System.exit(1); // ERROR
		}
		T e = arr[front];
		System.out.println("Removing " + e);
		front = (front + 1) % capacity; // circular index
		count--;
		return e;
		}
	@Override
	public T peek() {
		if (isEmpty()) {
		System.exit(1); // ERROR
		}
		return arr[front];
		}
	
	public static void demo() {
		System.out.println("### Queue data structure for a Generic T data type ###");
		GenericQueue<String> q = new GenericQueue<>(5);
		q.enqueue("one"); // 1st in
		q.enqueue("two"); // 2nd in
		q.enqueue("three"); // 3rd in
		System.out.println("Front element is: " + q.peek());
		q.dequeue(); // 1st out is 1
		System.out.println("Front element is: " + q.peek());
		System.out.println("Queue size is " + q.size());
		q.dequeue(); // 2nd out is 2
		q.dequeue(); // 3rd out is 3
		if ( q.isEmpty() )
		     System.out.println("Queue Is Empty");
		else
		     System.out.println("Queue Is Not Empty");
		System.out.println("\n");
		}
		

}
