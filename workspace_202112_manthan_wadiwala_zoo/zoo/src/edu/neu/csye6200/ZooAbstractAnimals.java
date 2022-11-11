package edu.neu.csye6200;

import java.util.ArrayList;
import java.util.List;

public class ZooAbstractAnimals {
	
	List<AbstractAnimalAPI> abstractAnimalList= new ArrayList<>();
	
	
	public void add(AbstractAnimalAPI a)
	{
		abstractAnimalList.add(a);
	}
	
	
	@Override
	public String toString(	) {
		StringBuilder sb=new StringBuilder();
		
		sb.append("\n").append(abstractAnimalList.size()).append(" AbstractAnimalAPI objects in model list \n");
		for(AbstractAnimalAPI abstractAnimal: abstractAnimalList)
		{
			abstractAnimal.speak();
			
			sb.append(abstractAnimal.toString()).append("\n");
		}
		return sb.toString();
	}
	
	public static void demo() {
		
		
		System.out.println("\n\t" + ZooAbstractAnimals.class.getName() + ".demo()...");
		System.out.println("\n Using AbstractAnimalAPI...");
		ZooAbstractAnimals obj = new ZooAbstractAnimals();
		
		obj.add(new AbstractBird());
		obj.add(new AbstractCat());
		obj.add(new AbstractDog());
		System.out.println(obj);
		
		System.out.println("\n\t" + ZooAbstractAnimals.class.getName() + ".demo()...done!");
	}
}
