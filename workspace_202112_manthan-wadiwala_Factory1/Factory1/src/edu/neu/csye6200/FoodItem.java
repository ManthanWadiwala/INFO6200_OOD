package edu.neu.csye6200;

import java.util.Scanner;

public class FoodItem extends Item {
	
	public FoodItem(String csvString) {
		super();
		Scanner s = new Scanner(csvString);
		s.useDelimiter(",");
		
		int id = 0;
		try {
			id = s.nextInt();
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		String name = s.next();
		 
		double price = 0; 
		try {
			price = s.nextDouble();
		} catch (Exception e1) {
			e1.printStackTrace();
		}
		
		setId(id);
		setName(name);
		setPrice(price);	
		s.close();
	}

	@Override
	public String toString() {
		return "FoodItem [id= " + getID() + ", name= " + getName() + ", price= " + getPrice() + "]";
	}
	
	
}
