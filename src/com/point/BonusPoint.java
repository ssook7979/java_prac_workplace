package com.point;

public class BonusPoint extends Point {

	@Override
	public void spendPoint(int point) {
		if (this.point > point) {
			this.point -= point;
			System.out.println(toString());
		} else {
			System.out.println("����Ʈ�� �����մϴ�." + toString());
		}
	}
	
	@Override
	public String toString() {
		return "���� ���ʽ� ����Ʈ�� " + point + "�� �Դϴ�.";
	}

}
