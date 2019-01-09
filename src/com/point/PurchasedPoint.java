package com.point;

import com.impl.Purchasable;

public class PurchasedPoint extends Point implements Purchasable {
	static final double[] pointRates = new double[3];
	static {
		pointRates[0] = 0.1;
		pointRates[1] = 0.2;
		pointRates[2] = 0.3;
	}

	@Override
	public int generateBonusPoint() {
		if (this.point <= 100000) {
			 return (int) (this.point * pointRates[0]);
		} else if (this.point > 100000 && point <= 300000) {
			return (int) (this.point * pointRates[1]);		
		} else if (this.point > 300000){				
			return (int) (this.point * pointRates[2]);
		} else {
			return 0;
		}
	}
	
	public int getPrice() {
		return point;
	}

	public void setPrice(int price) {
		this.point = price;
	}

	@Override
	public void spendPoint(int point) {
		if (this.point > point) {
			this.point -= point;
			System.out.println(toString());
		} else {
			System.out.println("포인트가 부족합니다." + toString());
		}
	}
	
	@Override
	public String toString() {
		return "현재 구입한 포인트는 " + point + "원 입니다.";
	}
}
