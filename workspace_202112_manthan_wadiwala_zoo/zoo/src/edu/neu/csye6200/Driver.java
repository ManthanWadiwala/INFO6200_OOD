package edu.neu.csye6200;

public class Driver {

	public static void main(String[] args) {
	
		
		System.out.println(Driver.class.getName()+".main()...");
		ZooAbstractAnimals.demo();
		ZooAnimals.demo();
		ZooAnimalisticAnimals.demo();
		System.out.println(Driver.class.getName()+".main()...done!");

	}
	
/*
 * CONSOLE OUTPUT
 * 
 * edu.neu.csye6200.Driver.main()...

	edu.neu.csye6200.ZooAbstractAnimals.demo()...

 Using AbstractAnimalAPI...
 AbstractBird ** BIRD CHIRPS ** !!!
 AbstractCat ** CAT MEOWS ** !!!
 AbstractDog ** DOG BARKS ** !!!

3 AbstractAnimalAPI objects in model list 
 AbstractBird ** Derived from AbstractAnimalAPI ** !!!
 AbstractCat ** Derived from AbstractAnimalAPI ** !!!
 AbstractDog ** Derived from AbstractAnimalAPI ** !!!


	edu.neu.csye6200.ZooAbstractAnimals.demo()...done!

	edu.neu.csye6200.ZooAnimals.demo()...

 Using AnimalAPI...
 ConcreteBird ** BIRD CHIRPS ** !!!
 ConcreteCat ** CAT MEOWS ** !!!
 ConcreteDog ** DOG BARKS ** !!!

3 AnimalAPI objects in model list 
 ConcreteBird ** Derived from AnimalAPI ** !!!
 ConcreteCat ** Derived from AnimalAPI ** !!!
 ConcreteDog ** Derived from AnimalAPI ** !!!


	edu.neu.csye6200.ZooAnimals.demo()...done!

	edu.neu.csye6200.ZooAnimalisticAnimals.demo()...

 Using AnimalisticAPI...
 AnimalisticBird ** BIRD CHIRPS ** !!!
 AnimalisticCat ** CAT MEOWS ** !!!
 AnimalisticDog ** DOG BARKS ** !!!

3 AnimalisticAPI objects in model list 
 AnimalisticBird ** Derived from AnimalisticAPI ** !!!
 AnimalisticCat ** Derived from AnimalisticAPI ** !!!
 AnimalisticDog ** Derived from AnimalisticAPI ** !!!


	edu.neu.csye6200.ZooAnimalisticAnimals.demo()...done!
edu.neu.csye6200.Driver.main()...done!

 */

}
