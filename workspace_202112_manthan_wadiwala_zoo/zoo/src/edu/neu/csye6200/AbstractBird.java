package edu.neu.csye6200;

public class AbstractBird extends AbstractAnimalAPI {

	
	@Override
	public void speak() {
		System.out.println(" AbstractBird ** BIRD CHIRPS ** !!!");
	}
	
	@Override
	public String toString()
	{		return " AbstractBird ** Derived from AbstractAnimalAPI ** !!!";

	}
	


}
