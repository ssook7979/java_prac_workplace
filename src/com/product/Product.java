package com.product;

import com.impl.Purchasable;

public class Product implements Purchasable {

	int price;
	String name;
	boolean purchasable = true;
	
	Product (int price, String name) {
		this.price = price;
		this.name = name;
	}

	@Override
	public int generateBonusPoint() {
		return (int)( price * 0.01 );
	}
	
	@Override
	public String toString() {
		return "Product [price=" + price + ", name=" + name + ", purchasable=" + purchasable + "]";
	}
	
	public boolean isPurchasable() {
		return purchasable;
	}

	public void setPurchasable(boolean purchasable) {
		this.purchasable = purchasable;
	}
	
	public int getPrice() {
		return price;
	}
	
	public void setPrice(int price) {
		this.price = price;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
}
