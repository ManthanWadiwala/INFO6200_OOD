package edu.neu.csye6200;

public class AnimalisticDog implements AnimalisticAPI{
	
	@Override
	public void speak() {
		System.out.println(" AnimalisticDog ** DOG BARKS ** !!!");
	}
	
	@Override
	public String toString()
	{		return " AnimalisticDog ** Derived from AnimalisticAPI ** !!!";

	}

}
