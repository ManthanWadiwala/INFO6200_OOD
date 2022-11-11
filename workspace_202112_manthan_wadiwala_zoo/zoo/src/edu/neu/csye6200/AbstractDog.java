package edu.neu.csye6200;

public class AbstractDog extends AbstractAnimalAPI {

	@Override
	public void speak() {
		System.out.println(" AbstractDog ** DOG BARKS ** !!!");
	}
	
	@Override
	public String toString()
	{		return " AbstractDog ** Derived from AbstractAnimalAPI ** !!!";

	}

}
