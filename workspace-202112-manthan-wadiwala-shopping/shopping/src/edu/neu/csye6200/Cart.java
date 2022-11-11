package edu.neu.csye6200;

public class Cart {

	private double myCash;
	private double myTotal;
	private double myChange;
	
	{
		this.myCash = 20;
		this.myTotal = 0;
		this.myChange = 0;
	}
	
	public Cart() {
		super();
	}
	
	public Cart(double myCash, double myTotal, double myChange) {
		super();
		this.myCash = myCash;
		this.myTotal = myTotal;
		this.myChange = myChange;
	}
	
	
	public double getMyCash() {
		return myCash;
	}

	public void setMyCash(double myCash) {
		this.myCash = myCash;
	}

	public double getMyTotal() {
		return myTotal;
	}

	public void setMyTotal(double myTotal) {
		this.myTotal = myTotal;
	}

	public double getMyChange() {
		return myChange;
	}

	public void setMyChange(double myChange) {
		this.myChange = myChange;
	}
	
	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("\n\t\t\tTotal: ").append(this.myTotal).append(" $");
		sb.append("\n\t\tCash Tendered: ").append(this.myCash).append(" $");
		sb.append("\n\t\t\tChange: ").append(this.myChange).append(" $");
		
		return sb.toString();
	}

	// SillyCheckout method
	public void sillyCheckout(double cash, double price, double total, double change) {
		total += price;
		change = cash - total;
//		System.out.println("\t\t\t"+change);
		
	}
	
	// Checkout method
	public double Checkout(Cart myCart, Item myItem) {
		myCart.setMyTotal(myCart.getMyTotal() + myItem.getPrice());
		myCart.setMyChange(myCart.getMyCash() - myCart.getMyTotal());
		return myCart.getMyChange();
		
	}
	
}
