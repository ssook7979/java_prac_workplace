package com.product;

import com.unimp.Purchasable;

public class Product implements Purchasable {

	private int price;
	private String name;
	
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
	@Override
	public int generatePoint(int point) {
		// TODO Auto-generated method stub
		return 0;
	}

}
