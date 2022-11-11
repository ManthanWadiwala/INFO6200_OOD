package edu.neu.csye6200;

public interface GenericStackAPI<T> {
	public int size();
	public boolean isEmpty();
	public boolean isFull();
	public void push(T item);
	public T pop();
	public T peek();

}
