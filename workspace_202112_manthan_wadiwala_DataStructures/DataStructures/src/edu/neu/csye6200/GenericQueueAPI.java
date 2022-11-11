package edu.neu.csye6200;

public interface GenericQueueAPI<T> {
	public int size();
	public boolean isEmpty();
	public boolean isFull();
	public void enqueue(T item);
	public T dequeue();
	public T peek();

}
