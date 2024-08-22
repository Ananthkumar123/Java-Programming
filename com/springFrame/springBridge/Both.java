package com.springFrame.springBridge;

public class Both {
	
	
	String product;
	public String getProduct() {
		return product;
	}
	public void setProduct(String product) {
		this.product = product;
	}
	public String getWeight() {
		return weight;
	}
	public void setWeight(String weight) {
		this.weight = weight;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	String weight;
	int price;
	@Override
	public String toString() {
		return "Both [product=" + product + ", weight=" + weight + ", price=" + price + "]";
	}
	public Both(String product, String weight, int price) {
		super();
		this.product = product;
		this.weight = weight;
		this.price = price;
	}
	public Both() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	

}
