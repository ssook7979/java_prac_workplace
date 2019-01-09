package com.point;

public class BonusPoint extends Point {

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
		return "현재 보너스 포인트는 " + point + "원 입니다.";
	}

}
