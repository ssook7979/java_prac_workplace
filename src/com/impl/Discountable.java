package com.impl;

public interface Discountable {
	public final static double DISCOUNT_RATE = 0.3; 

	public abstract int getDiscountPrice(int price);
}
