package edu.neu.csye6200;

public class Driver {
	public static void main(String[] args) {
		new Store().demo();
	}
}

/**
 * 
 * Q.
 * 
 * Item Factory Java assignment

100 TOTAL POINTS

NOTE: 20 POINT DEDUCTION if Late or incorrect submission to Canvas.
Submission: Submit ON TIME your entire eclipse workspace (single .zip file) named workspace-eclipseVersion_your-name_Factory1, for example: eclipse workspace name:  ‘workspace-dan-peters-neon-javaFactory’, compressed zip file name: ‘workspace-eclipseVersion_your-name_Factory1.zip’

Requirements:

10 POINTS Create an Item superclass to use as an API.
30 POINTS Derive 3 classes from Item: FoodItem, ElectronicItem and ServiceItem
Each class must override toString()

Create all objects from CSV files (FoodItemCSV.txt, ElectronicItemCSV.txt, serviceItemCSV.txt)
For Example:
In a Comma Separated Value (CSV) text file (FoodItemCSV.txt) file, where each line will contain data for instantiating a single FoodItem object. 
10 POINTS Create a FileUtil class for reading and writing text files.

And a FoodItem class constructor which accepts a CSV string as its sole parameter should be responsible for 
parsing the CSV string and creating a FoodItem object.

Apply the Factory Design Pattern to Abstract the creation of ALL objects.
10 POINTS 1. FoodItemFactory, this implements Factory method pattern
10 POINTS 2. ElectronicItemFactory, this implements a Lazy Singleton and Factory method patterns
10 POINTS 3. ServiceItemFactory, this implements a Eager Singleton and Factory method patterns


10 POINTS Create an AbstractStore abstract class.
10 POINTS Derive a Store class from AbstractStore and use Store’s demo() method,  to create several 
objects USING the Factories and sort them by:
1. ID
2. Name
3. Price
 * 
 * 
 */

/**
 * Console output:
 * 
<<<<< Sort by ID >>>>>
ServiceItem [id= 3, name= Laundry, price= 5.99]
ServiceItem [id= 4, name= Plumbing, price= 59.99]
FoodItem [id= 8, name= Milk, price= 4.29]
ElectronicItem [id= 9, name= Laptop, price= 2450.0]
FoodItem [id= 10, name= Bread, price= 2.79]
ServiceItem [id= 11, name= Cleaning, price= 99.99]
FoodItem [id= 12, name= Eggs, price= 5.99]
ElectronicItem [id= 13, name= Xbox, price= 399.99]
ElectronicItem [id= 20, name= Smartphone, price= 1299.0]

<<<<< Sort by Name >>>>>
FoodItem [id= 10, name= Bread, price= 2.79]
ServiceItem [id= 11, name= Cleaning, price= 99.99]
FoodItem [id= 12, name= Eggs, price= 5.99]
ElectronicItem [id= 9, name= Laptop, price= 2450.0]
ServiceItem [id= 3, name= Laundry, price= 5.99]
FoodItem [id= 8, name= Milk, price= 4.29]
ServiceItem [id= 4, name= Plumbing, price= 59.99]
ElectronicItem [id= 20, name= Smartphone, price= 1299.0]
ElectronicItem [id= 13, name= Xbox, price= 399.99]

<<<<< Sort by Price >>>>>
FoodItem [id= 10, name= Bread, price= 2.79]
FoodItem [id= 8, name= Milk, price= 4.29]
FoodItem [id= 12, name= Eggs, price= 5.99]
ServiceItem [id= 3, name= Laundry, price= 5.99]
ServiceItem [id= 4, name= Plumbing, price= 59.99]
ServiceItem [id= 11, name= Cleaning, price= 99.99]
ElectronicItem [id= 13, name= Xbox, price= 399.99]
ElectronicItem [id= 20, name= Smartphone, price= 1299.0]
ElectronicItem [id= 9, name= Laptop, price= 2450.0]
 * 
 */

