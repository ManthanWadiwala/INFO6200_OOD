package edu.neu.csye6200;

import java.util.ArrayList;


import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;


//* NOTE: all classes and interfaces MUST BE inner to Driver class
//* 
//* GIVEN:
//* - Driver class code fragment
//* - StoreAPI inner interface
//* 
//* 
//* 1. 10 POINTS: design Sellable inner interface;
//* 2. 10 POINTS: design Item inner class which implements Sellable
//* 3. 15 POINTS: design abstract Person inner class
//* 4. 10 POINTS: design Employee inner class derived from Person
//* 5. 15 POINTS: design Store inner class which implements StoreAPI to contain both Employees 
//(MUST Use Person API) and Items (MUST Use Sellable API)
//* 6. 40 POINTS: complete design of Driver class main method.

/**
 * CONSOLE OUTPUT
 * 
 *
 * @author manthanwadiwala
 * 
 * CSYE6200 Midterm July 2022 ...
Sort employees by PERSON ID...
Employee [id=1, age=31, firstName=Bob, lastName=James, wage=15.99]
Employee [id=2, age=27, firstName=Don, lastName=Hope, wage=14.99]
Employee [id=3, age=21, firstName=James, lastName=Pope, wage=12.99]
Sort items by ITEM ID...
Item: [id: 1, price: 3.49, Name: OJ]
Item: [id: 2, price: 2.49, Name: Skim Milk]
Item: [id: 3, price: 1.49, Name: Wheat Bread]
The sorted list has been printed

Sort employees by PERSON LAST NAME...
Employee [id=2, age=27, firstName=Don, lastName=Hope, wage=14.99]
Employee [id=1, age=31, firstName=Bob, lastName=James, wage=15.99]
Employee [id=3, age=21, firstName=James, lastName=Pope, wage=12.99]
Sort items by ITEM NAME...
Item: [id: 1, price: 3.49, Name: OJ]
Item: [id: 2, price: 2.49, Name: Skim Milk]
Item: [id: 3, price: 1.49, Name: Wheat Bread]
The sorted list has been printed

Sort employees by PERSON FIRST NAME...
Employee [id=1, age=31, firstName=Bob, lastName=James, wage=15.99]
Employee [id=2, age=27, firstName=Don, lastName=Hope, wage=14.99]
Employee [id=3, age=21, firstName=James, lastName=Pope, wage=12.99]
Sort items by ITEM PRICE...
Item: [id: 3, price: 1.49, Name: Wheat Bread]
Item: [id: 2, price: 2.49, Name: Skim Milk]
Item: [id: 1, price: 3.49, Name: OJ]
The sorted list has been printed

Sort employees by PERSON AGE (YOUNGEST FIRST)...
Employee [id=3, age=21, firstName=James, lastName=Pope, wage=12.99]
Employee [id=2, age=27, firstName=Don, lastName=Hope, wage=14.99]
Employee [id=1, age=31, firstName=Bob, lastName=James, wage=15.99]
The sorted list has been printed

Sort employees by PERSON AGE (OLDEST FIRST)...
Employee [id=1, age=31, firstName=Bob, lastName=James, wage=15.99]
Employee [id=2, age=27, firstName=Don, lastName=Hope, wage=14.99]
Employee [id=3, age=21, firstName=James, lastName=Pope, wage=12.99]
The sorted list has been printed

Sort employees by HIGHEST WAGE...
Employee [id=1, age=31, firstName=Bob, lastName=James, wage=15.99]
Employee [id=2, age=27, firstName=Don, lastName=Hope, wage=14.99]
Employee [id=3, age=21, firstName=James, lastName=Pope, wage=12.99]
The sorted list has been printed

CSYE6200 Midterm July 2022 ... done!
 *
 *
 */

public class Driver {
	public static final int MAJOR_REVISION;
	public static final int MINOR_REVISION;
	private static String version;
	
	static {
		MAJOR_REVISION=1;
		MINOR_REVISION=0;
		version=Integer.valueOf(MAJOR_REVISION) + "." + Integer.valueOf(MINOR_REVISION);	
		}

	private abstract class Person {

		public abstract int getId();

		public abstract void setId(int id);

		public abstract int getAge();

		public abstract void setAge(int age);

		public abstract String getFirstName();

		public abstract void setFirstName(String firstName);

		public abstract String getLastName();

		public abstract void setLastName(String lastName);

		public abstract double getWage();

		public abstract void setWage(int wage);

	}

	private class Employee extends Person {

		private int id;
		private int age;
		private String firstName;
		private String lastName;
		private double wage;

		public Employee(int id, int age, String firstName, String lastName, double wage) {
			super();
			this.id = id;
			this.age = age;
			this.firstName = firstName;
			this.lastName = lastName;
			this.wage = wage;
		}

		@Override
		public int getId() {
			return id;
		}

		@Override
		public void setId(int id) {
			this.id = id;

		}

		@Override
		public int getAge() {
			return age;
		}

		@Override
		public void setAge(int age) {
			this.age = age;

		}

		@Override
		public String getFirstName() {
			return firstName;
		}

		@Override
		public void setFirstName(String firstName) {
			this.firstName = firstName;

		}

		@Override
		public String getLastName() {
			return lastName;
		}

		@Override
		public void setLastName(String lastName) {
			this.lastName = lastName;

		}

		@Override
		public void setWage(int wage) {
			this.wage = wage;

		}

		@Override
		public String toString() {
			return "Employee [id=" + id + ", age=" + age + ", firstName=" + firstName + ", lastName=" + lastName
					+ ", wage=" + wage + "]";
		}

		@Override
		public double getWage() {
			return wage;
		}

	}

	private interface Sellable {

		void setId(int id);

		void setPrice(double price);

		void setItemName(String itemName);

		int getId();

		double getPrice();

		String getItemName();

	}

	private class Item implements Sellable {

		private int id;
		private double price;
		private String itemName;

		public Item(int id, double price, String itemName) {
			super();
			this.id = id;
			this.price = price;
			this.itemName = itemName;
		}

		public int getId() {
			return id;
		}

		public void setId(int id) {
			this.id = id;
		}

		public double getPrice() {
			return price;
		}

		public void setPrice(double price) {
			this.price = price;
		}

		public String getItemName() {
			return itemName;
		}

		public void setItemName(String itemName) {
			this.itemName = itemName;
		}

		@Override
		public String toString() {
			return "Item: [id: " + id + ", price: " + price + ", Name: " + itemName + "]";
		}

	}

	private interface StoreAPI {
		void add(Employee person);

		void add(Sellable item);

		void sortEmployees(Comparator<Person> c);

		void sortItems(Comparator<Sellable> c);
	}

	private class Store implements StoreAPI {

		List<Person> employees = new ArrayList<>();
		List<Sellable> items = new ArrayList<>();

		@Override
		public void add(Employee person) {
			employees.add(person);

		}

		@Override
		public void add(Sellable item) {
			items.add(item);

		}

		@Override
		public void sortEmployees(Comparator<Person> c) {
			Collections.sort(employees, c);
			employees.forEach(e -> System.out.println(e));

		}

		@Override
		public void sortItems(Comparator<Sellable> c) {
			Collections.sort(items, c);
			items.forEach(e -> System.out.println(e));

		}

		@Override
		public String toString() {

			return "The sorted list has been printed" + "\n";

		}

	}

	public static void main(String[] args) {
		System.out.println("CSYE6200 Midterm July 2022 ...");

		Driver driver = new Driver();
		Store store = driver.new Store();

		Employee e1 = driver.new Employee(3, 21, "James", "Pope", 12.99);
		Employee e2 = driver.new Employee(1, 31, "Bob", "James", 15.99);
		Employee e3 = driver.new Employee(2, 27, "Don", "Hope", 14.99);
		store.add(e1);
		store.add(e2);
		store.add(e3);

		Item i1 = driver.new Item(3, 1.49, "Wheat Bread");
		Item i2 = driver.new Item(1, 3.49, "OJ");
		Item i3 = driver.new Item(2, 2.49, "Skim Milk");
		store.add(i1);
		store.add(i2);
		store.add(i3);

		/**
		 * add employees to store
		 * 
		 * (by parsing the following CSV Strings)
		 * 
		 * "3,21,James,Pope,12.99" "1,31,Bob,James,15.99" "2,27,Don,Hope,14.99"
		 */
		// TODO BY STUDENT 10 POINTS:

		/**
		 * add items to store inventory
		 * 
		 * (by parsing the following CSV Strings
		 * 
		 * "3,1.49,Wheat Bread" "1,3.49,OJ" "2,2.49,Skim Milk"
		 */
		// TODO BY STUDENT 10 POINTS:

		/**
		 * show original store state
		 */
		// TODO BY STUDENT

		/**
		 * Sorting to be completed by Studend as indicated (TODO) 10 POINTS:
		 */

		System.out.println("Sort employees by PERSON ID...");
		store.sortEmployees(new Comparator<Person>() {

			@Override
			public int compare(Person o1, Person o2) {
				return o1.getId() - (o2.getId());
			}
		});

		System.out.println("Sort items by ITEM ID...");
		store.sortItems(new Comparator<Sellable>() {

			@Override
			public int compare(Sellable o1, Sellable o2) {
				return o1.getId() - (o2.getId());
			}
		});

		System.out.println(store);

		System.out.println("Sort employees by PERSON LAST NAME...");
		store.sortEmployees(new Comparator<Person>() {

			@Override
			public int compare(Person o1, Person o2) {
				return o1.getLastName().compareTo(o2.getLastName());
			}
		});

		System.out.println("Sort items by ITEM NAME...");
		store.sortItems(new Comparator<Sellable>() {

			@Override
			public int compare(Sellable o1, Sellable o2) {
				return o1.getItemName().compareTo(o2.getItemName());
			}
		});
		System.out.println(store);

		System.out.println("Sort employees by PERSON FIRST NAME...");
		store.sortEmployees(new Comparator<Person>() {

			@Override
			public int compare(Person o1, Person o2) {
				return o1.getFirstName().compareTo(o2.getFirstName());
			}
		});

		System.out.println("Sort items by ITEM PRICE...");
		store.sortItems(new Comparator<Sellable>() {

			@Override
			public int compare(Sellable o1, Sellable o2) {
				Double p1 = o1.getPrice();
				Double p2 = o2.getPrice();
				return p1.compareTo(p2);
			}
		});
		System.out.println(store);

		System.out.println("Sort employees by PERSON AGE (YOUNGEST FIRST)...");
		store.sortEmployees(new Comparator<Person>() {

			@Override
			public int compare(Person o1, Person o2) {
				return o1.getAge() - (o2.getAge());
			}
		});

		System.out.println(store);

		System.out.println("Sort employees by PERSON AGE (OLDEST FIRST)...");
		// TODO BY STUDENT
		store.sortEmployees(new Comparator<Person>() {

			@Override
			public int compare(Person o1, Person o2) {
				return o2.getAge() - (o1.getAge());
			}
		});

		System.out.println(store);

		System.out.println("Sort employees by HIGHEST WAGE...");
		store.sortEmployees(new Comparator<Person>() {

			@Override
			public int compare(Person o1, Person o2) {
				Double p1 = o1.getWage();
				Double p2 = o2.getWage();
				return p2.compareTo(p1);
			}
		});
		System.out.println(store);

		System.out.println("CSYE6200 Midterm July 2022 ... done!");
	}

}