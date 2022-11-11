package edu.neu.csye6200;

public class Cat extends AnimalAPI{
	
	@Override
	public void speak() {
		System.out.println(" ConcreteCat ** CAT MEOWS ** !!!");
	}
	
	@Override
	public String toString()
	{		return " ConcreteCat ** Derived from AnimalAPI ** !!!";

	}
	

}
