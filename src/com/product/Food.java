package com.product;

import java.util.Date;

public class Food extends Product {

	private Date expirationDate;

	Food(int price, String name, Date expirationDate) {
		super(price, name);
		this.expirationDate = expirationDate;
		
		Date today = new Date();
		
		if (expirationDate.compareTo(today) < 0) {
			purchasable = false;
		}
	}
	
	@Override
	public String toString() {
		return super.toString() + 
				", Food [expirationDate=" + expirationDate +
				"]";
	}

	public Date getExpirationDate() {
		return expirationDate;
	}

	public void setExpirationDate(Date expirationDate) {
		this.expirationDate = expirationDate;
	}
}

