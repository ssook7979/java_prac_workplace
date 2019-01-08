package com.product;

public class Clothes extends Product implements Deliverable {
	private int size;
	private String color;
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
	
	@Override
	public boolean isDeliverable(int price, int weight) {
		// TODO Auto-generated method stub
		return false;
	}
}
