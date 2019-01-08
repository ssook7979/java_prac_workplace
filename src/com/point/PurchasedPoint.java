package com.point;

import com.unimp.Purchasable;

public class PurchasedPoint implements Purchasable {
	private int price;

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	@Override
	public int generatePoint(int point) {
		// TODO Auto-generated method stub
		return 0;
	}

}
