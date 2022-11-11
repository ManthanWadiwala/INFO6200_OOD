package edu.neu.csye6200;

public interface IntQueueAPI {
	public int size();
	public boolean isEmpty();
	public boolean isFull();
	public void enqueue(int item);
	public int dequeue();
	public int peek();
}
