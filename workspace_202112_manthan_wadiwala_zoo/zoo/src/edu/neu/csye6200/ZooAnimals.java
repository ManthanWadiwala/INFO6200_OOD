package edu.neu.csye6200;

import java.util.ArrayList;
import java.util.List;

public class ZooAnimals {
	
	private List<AnimalAPI> animalList = new ArrayList<>();

	public void add(AnimalAPI a)
	{
		animalList.add(a);
	}
	
	
	@Override
	public String toString() {
		StringBuilder sb=new StringBuilder();
		
		sb.append("\n").append(animalList.size()).append(" AnimalAPI objects in model list \n");
		for(AnimalAPI animal: animalList)
		{
			animal.speak();
			
			sb.append(animal.toString()).append("\n");
		}
		return sb.toString();
	}
	
	public static void demo() {
		
		
		System.out.println("\n\t" + ZooAnimals.class.getName() + ".demo()...");
		System.out.println("\n Using AnimalAPI...");
		ZooAnimals obj = new ZooAnimals();
		
		obj.add(new Bird());
		obj.add(new Cat());
		obj.add(new Dog());
		System.out.println(obj);
		
		System.out.println("\n\t" + ZooAnimals.class.getName() + ".demo()...done!");
	}
}
