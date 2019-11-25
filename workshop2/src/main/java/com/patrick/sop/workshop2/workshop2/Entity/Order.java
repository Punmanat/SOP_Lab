package com.patrick.sop.workshop2.workshop2.Entity;


public class Order {

	// Attribute
	private int orderId;
	private String ISBN;
	private String name;
	private int amount;
	private double pricePerBook;
	private double total;

	// Method
	public Order() {

	}
	
	

	public Order(int orderId, int amount) {
		super();
		this.orderId = orderId;
		this.amount = amount;
	}



	public Order(int orderId, String iSBN, String name, int amount, double pricePerBook, double total) {
		super();
		this.orderId = orderId;
		ISBN = iSBN;
		this.name = name;
		this.amount = amount;
		this.pricePerBook = pricePerBook;
		this.total = total;
	}

	
	public int getOrderId() {
		return orderId;
	}



	public void setOrderId(int orderId) {
		this.orderId = orderId;
	}



	public String getISBN() {
		return ISBN;
	}

	public void setISBN(String iSBN) {
		ISBN = iSBN;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAmount() {
		return amount;
	}

	public void setAmount(int amount) {
		this.amount = amount;
	}

	public double getPricePerBook() {
		return pricePerBook;
	}

	public void setPricePerBook(double pricePerBook) {
		this.pricePerBook = pricePerBook;
	}

	public double getTotal() {
		return total;
	}

	public void setTotal(double total) {
		this.total = total;
	}



	@Override
	public String toString() {
		return "Order [orderId=" + orderId + ", ISBN=" + ISBN + ", name=" + name + ", amount=" + amount
				+ ", pricePerBook=" + pricePerBook + ", total=" + total + "]";
	}

	

}
