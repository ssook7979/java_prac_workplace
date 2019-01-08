package com.product;

public class Electronics extends Product implements Deliverable {
	private String manufacturer;

	public String getManufacturer() {
		return manufacturer;
	}

	public void setManufacturer(String manufacturer) {
		this.manufacturer = manufacturer;
	}

	@Override
	public boolean isDeliverable(int price, int weight) {
		// TODO Auto-generated method stub
		return false;
	}
}
