package edu.neu.csye6200;

public class Bird extends AnimalAPI{
	
	@Override
	public void speak() {
		System.out.println(" ConcreteBird ** BIRD CHIRPS ** !!!");
	}
	
	@Override
	public String toString()
	{		return " ConcreteBird ** Derived from AnimalAPI ** !!!";

	}

}
