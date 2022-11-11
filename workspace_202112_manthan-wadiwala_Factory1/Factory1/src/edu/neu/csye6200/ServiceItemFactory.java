package edu.neu.csye6200;

public class ServiceItemFactory {
	// Eager singleton
	private static final ServiceItemFactory instance = new ServiceItemFactory();
	
	private ServiceItemFactory() {}
	
	public static ServiceItemFactory getInstance() {
		return instance;
	}
	
	// Factory method
	public ServiceItem getObject(String CSVString) {
		return new ServiceItem(CSVString);
	}
}
