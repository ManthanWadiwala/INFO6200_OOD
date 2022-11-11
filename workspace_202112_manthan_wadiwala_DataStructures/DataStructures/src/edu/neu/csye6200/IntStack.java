package edu.neu.csye6200;

public class IntStack implements IntStackAPI {

	private int[] arr;
	private int capacity;
	private int top;

	public IntStack(int capacity) {
		this.arr = new int[capacity];
		this.capacity = capacity;
		this.top = -1;
	}
	@Override
	public int size() {
		return top + 1;
	}

	@Override
	public boolean isEmpty() {
		return top == -1;
	}

	@Override
	public boolean isFull() {
		return (top == capacity - 1);
	}

	@Override
	public void push(int item) {
		if (isFull()) {
			System.exit(1); // ERROR
		}
		System.out.println("Inserting " + item);
		arr[++top] = item;
	}

	@Override
	public int pop() {
		if (isEmpty()) {
			System.exit(1); // ERROR
		}
		System.out.println("Removing " + peek());
		return arr[top--];
	}

	@Override
	public int peek() {
		if (!isEmpty()) {
			return arr[top];
		} else {
			System.exit(1); // ERROR
		}
		return -1;
	}
	
	public static void demo() {
		System.out.println("### Stack data structure for int data types ###");
		IntStack q = new IntStack(5);
		q.push(1); // 1st in
		q.push(2); // 2nd in
		q.pop(); // 2nd out is 2
		q.pop(); // 1st out is 1
		q.push(2); // 3rd in
		System.out.println("Top element is: " + q.peek());
		System.out.println("Stack size is " + q.size());
		q.pop(); // 3rd out is 3
		if ( q.isEmpty() )
			System.out.println("Stack Is Empty");
		else
			System.out.println("Stack Is Not Empty");
		System.err.println("\n");
	}
	

}
