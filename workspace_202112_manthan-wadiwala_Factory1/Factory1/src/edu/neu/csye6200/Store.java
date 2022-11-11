package edu.neu.csye6200;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Store extends AbstractStore {

	public void demo() {
		// Write FoodItem CSV String
		String foodItemsFileName="./FoodItemCSV.txt";
		String[] foodCSVString = {
				"10,Bread,2.79",
				"8,Milk,4.29",
				"12,Eggs,5.99"
		};
		FileUtil.write(foodItemsFileName, Arrays.asList(foodCSVString));
		
		// Write ElectronicItem CSV String
		String electronicItemsFileName="./ElectronicItemCSV.txt";
				String[] electronicCSVString = {
						"9,Laptop,2450.00",
						"20,Smartphone,1299.00",
						"13,Xbox,399.99"
				};
				
				FileUtil.write(electronicItemsFileName, Arrays.asList(electronicCSVString));
		
		// Write serviceItem CSV String
		String serviceItemsFileName="./serviceItemCSV.txt";
		String[] serviceCSVString = {
				"3,Laundry,5.99",
				"11,Cleaning,99.99",
				"4,Plumbing,59.99"
		};
		FileUtil.write(serviceItemsFileName, Arrays.asList(serviceCSVString));
		
		// New arraylist
		List<Item> items = new ArrayList<>();
		
		// Create FoodItem object
		FoodItemFactory foodItemFactory = new FoodItemFactory();
		List<String> foodItemsCSVString = FileUtil.read(foodItemsFileName);
		for(String s:foodItemsCSVString)
		{
			Item foodItem=foodItemFactory.getObject(s);
			items.add(foodItem);
		};
		
		// Create ElectronicItem object
		ElectronicItemFactory electronicItemFactory = ElectronicItemFactory.getInstance();
		List<String> electronicItemsCSVString = FileUtil.read(electronicItemsFileName);
		for(String s:electronicItemsCSVString)
		{
			Item electronicItem=electronicItemFactory.getObject(s);
			items.add(electronicItem);
		};
		
		
		// Create ServiceItem object
		ServiceItemFactory serviceItemFactory = ServiceItemFactory.getInstance();
		List<String> serviceItemsCSVString = FileUtil.read(serviceItemsFileName);
		for(String s:serviceItemsCSVString)
		{
			Item serviceItem=serviceItemFactory.getObject(s);
			items.add(serviceItem);
		};
		
		
		// Sort by ID
		System.out.println("<<<<< Sort by ID >>>>>");
		items.sort(Item::compareByID);
		items.forEach(System.out::println);
		System.out.println("");
		
		// Sort by Name
		System.out.println("<<<<< Sort by Name >>>>>");
		items.sort(Item::compareByName);
		items.forEach(System.out::println);
		System.out.println("");
		
		// Sort by Price
		System.out.println("<<<<< Sort by Price >>>>>");
		items.sort(Item::compareByPrice);
		items.forEach(System.out::println);
		
	}

}
