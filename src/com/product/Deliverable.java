package com.product;

public interface Deliverable {
	public static final int weightLimit = 10;
	public abstract boolean isDeliverable(int price, int weight);
}
