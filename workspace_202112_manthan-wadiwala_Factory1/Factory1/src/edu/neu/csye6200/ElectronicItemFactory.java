package edu.neu.csye6200;

public class ElectronicItemFactory {
	
	private ElectronicItemFactory() {}
	
	// Lazy singleton
	private static ElectronicItemFactory instance = null;
	
	public static ElectronicItemFactory getInstance() {
		if (instance==null)
			instance = new ElectronicItemFactory();
		return instance;
	}
	// Factory method
	public ElectronicItem getObject(String CSVString) {
		return new ElectronicItem(CSVString);
	}
}
