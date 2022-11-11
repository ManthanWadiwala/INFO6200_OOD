package edu.neu.csye6200;

public class FoodItemFactory {
	public FoodItemFactory() {}
	
	// Factory method
	public FoodItem getObject(String CSVString) {
		return new FoodItem(CSVString);
	}
	
}
