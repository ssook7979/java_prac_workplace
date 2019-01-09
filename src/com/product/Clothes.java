package com.product;

import com.impl.Discountable;
import com.impl.DiscountableImpl;

public class Clothes extends Product implements Deliverable, Discountable {
	private int size;
	private String color;
	private int weight;
	
	public Clothes(int price, String name, int size, String color, int weight) {
		super(price, name);
		this.size = size;
		this.color = color;
		this.weight = weight;
	}

	DiscountableImpl l = new DiscountableImpl();
	
	@Override
	public boolean isDeliverable() {
		final int weightLimit = 10;
		final int priceLimit = 300000;
		
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
				"Clothes [size=" + size + 
				", color=" + color + 
				", weight=" + weight + 
				", 할인가격=" + getDiscountPrice(price) + 
				", 배달가능=" + isDeliverable() +
				"]";
	}

	public int getSize() {
		return size;
	}
	public void setSize(int size) {
		this.size = size;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
}
