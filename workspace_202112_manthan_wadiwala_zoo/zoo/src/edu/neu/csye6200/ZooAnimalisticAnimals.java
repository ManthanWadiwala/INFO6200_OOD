package edu.neu.csye6200;

import java.util.ArrayList;
import java.util.List;

public class ZooAnimalisticAnimals {

List<AnimalisticAPI> animalisticList= new ArrayList<>();
	
	
	public void add(AnimalisticAPI a)
	{
		animalisticList.add(a);
	}
	
	
	@Override
	public String toString(	) {
		StringBuilder sb=new StringBuilder();
		
		sb.append("\n").append(animalisticList.size()).append(" AnimalisticAPI objects in model list \n");
		for(AnimalisticAPI interfaceAnimal: animalisticList)
		{
			interfaceAnimal.speak();
			
			sb.append(interfaceAnimal.toString()).append("\n");
		}
		return sb.toString();
	}
	
	public static void demo() {
		
		
		System.out.println("\n\t" + ZooAnimalisticAnimals.class.getName() + ".demo()...");
		System.out.println("\n Using AnimalisticAPI...");
		ZooAnimalisticAnimals obj = new ZooAnimalisticAnimals();
		
		obj.add(new AnimalisticBird());
		obj.add(new AnimalisticCat());
		obj.add(new AnimalisticDog());
		System.out.println(obj);
		
		System.out.println("\n\t" + ZooAnimalisticAnimals.class.getName() + ".demo()...done!");
	}
}
