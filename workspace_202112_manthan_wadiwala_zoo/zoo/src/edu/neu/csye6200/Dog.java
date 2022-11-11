package edu.neu.csye6200;

public class Dog extends AnimalAPI{
	
	@Override
	public void speak() {
		System.out.println(" ConcreteDog ** DOG BARKS ** !!!");
	}
	
	@Override
	public String toString()
	{		return " ConcreteDog ** Derived from AnimalAPI ** !!!";

	}
	

}
