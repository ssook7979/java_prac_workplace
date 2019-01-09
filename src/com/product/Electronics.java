package com.product;

import com.impl.Discountable;
import com.impl.DiscountableImpl;

public class Electronics extends Product implements Deliverable, Discountable {
	private String manufacturer;
	private int weight;

	public Electronics(int price, String name, String manufacturer, int weight) {
		super(price, name);
		this.manufacturer = manufacturer;
		this.weight = weight;
	}
	
	DiscountableImpl l = new DiscountableImpl();
	
	@Override
	public boolean isDeliverable() {
		final int weightLimit = 30;
		final int priceLimit = 1000000;
		
		if (weight > weightLimit && price > priceLimit) {
			return true;
		} else {
			return false;			
		}
	}

	@Override
	public int getDiscountPrice(int price) {
		return l.getDiscountPrice(price);
	}
	
	@Override
	public String toString() {
		return super.toString() + 
				"Electronics [manufacturer=" + manufacturer + 
				", weight=" + weight + 
				", 할인가격=" + getDiscountPrice(price) + 
				", 배달가능=" + isDeliverable() + 
				"]";
	}

	public String getManufacturer() {
		return manufacturer;
	}
	
	public void setManufacturer(String manufacturer) {
		this.manufacturer = manufacturer;
	}
}
