package edu.neu.csye6200;

public class AnimalisticCat implements AnimalisticAPI{
	
	@Override
	public void speak() {
		System.out.println(" AnimalisticCat ** CAT MEOWS ** !!!");
	}

	@Override
	public String toString()
	{		return " AnimalisticCat ** Derived from AnimalisticAPI ** !!!";

	}
}
