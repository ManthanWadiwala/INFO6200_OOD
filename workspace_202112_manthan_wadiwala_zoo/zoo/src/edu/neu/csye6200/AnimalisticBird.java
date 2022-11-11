package edu.neu.csye6200;

public class AnimalisticBird implements AnimalisticAPI{
	
	@Override
	public void speak() {
		System.out.println(" AnimalisticBird ** BIRD CHIRPS ** !!!");
	}
	
	@Override
	public String toString()
	{		return " AnimalisticBird ** Derived from AnimalisticAPI ** !!!";

	}

}
