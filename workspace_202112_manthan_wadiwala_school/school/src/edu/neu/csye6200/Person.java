package edu.neu.csye6200;

public class Person {
	
	protected int id;
	protected int age;
	protected String lastName;
	

	public Person(int id, int age, String lastName) {
		super();
		this.id = id;
		this.age = age;
		this.lastName = lastName;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	
	@Override
	public String toString() {
		return "Person [id= " + id + ", age= " + age + ", lastName= " + lastName + "]";
	}
		
	public static int compareById(Person p1,Person p2) {
		return Integer.compare(p1.getId(), p2.getId());
	}
	
	public static int compareByAge(Person p1, Person p2) {
		return Integer.compare(p1.getAge(),p2.getAge());
	}
		
	public static int compareByLastName(Person p1, Person p2) {
		return p1.getLastName().compareTo(p2.getLastName());
		
	}
	

}
