package edu.neu.csye6200;

public class AbstractCat extends AbstractAnimalAPI {

	@Override
	public void speak() {
		System.out.println(" AbstractCat ** CAT MEOWS ** !!!");
	}
	
	@Override
	public String toString()
	{		return " AbstractCat ** Derived from AbstractAnimalAPI ** !!!";

	}

}
