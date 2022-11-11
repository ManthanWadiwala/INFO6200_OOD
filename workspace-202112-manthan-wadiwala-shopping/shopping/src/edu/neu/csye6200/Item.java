package edu.neu.csye6200;

public class Item {

	private int id;
	private String name;
	private double price;

	public Item(int id, double price, String name) {
		super();
		this.id = id;
		this.name = name;
		this.price = price;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return id + "\t\t" + name + "\t\t" + price;
	}

	public static void demo() {

		System.out.println("\n\t" + Cart.class.getName() + ".demo()...");

		Item apple = new Item(1, 2.3, "Apple");
		Item banana = new Item(2, 5.5, "Banana");
		Item orange = new Item(3, 1.2, "Orange");
		Item mango = new Item(4, 4.4, "Mango");

		// create a object Cart.
		Cart cart = new Cart();
		double cash = 20;
		double total = 0;
		double change = 0;

		System.out.println("\n----------------Shopping-----------------\n");
		System.out.format("---------------------------------------------------");
		System.out.print("\nID \t\tName\t\tPrice ($)\n");
		System.out.format("---------------------------------------------------\n");
		
		System.out.println(apple.toString());	
		System.out.println(banana.toString());
		System.out.println(orange.toString());
		System.out.println(mango.toString());

		System.out.format("----------------------------------------------------\n");

		// Call the SillyCheckout method
		cart.sillyCheckout(cash, apple.getPrice(), total, change);
		cart.sillyCheckout(cash, banana.getPrice(), total, change);
		cart.sillyCheckout(cash, orange.getPrice(), total, change);
		cart.sillyCheckout(cash, mango.getPrice(), total, change);
		

		// Call the Checkout method
		cart.Checkout(cart, apple);
		cart.Checkout(cart, banana);
		cart.Checkout(cart, orange);
		cart.Checkout(cart, mango);
		System.out.println(cart);

		System.out.println("\n\t" + Cart.class.getName() + ".demo()...done!");

	}

}
