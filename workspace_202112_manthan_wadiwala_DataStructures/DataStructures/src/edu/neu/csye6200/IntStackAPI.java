package edu.neu.csye6200;

public interface IntStackAPI {
	public int size();
	public boolean isEmpty();
	public boolean isFull();
	public void push(int item);
	public int pop();
	public int peek();
}
