package com.impl;

public class DiscountableImpl implements Discountable {
	
	@Override
	public int getDiscountPrice(int price) {
		return (int) (price * ( 1 - DISCOUNT_RATE ));
	}

}
