package com.point;

public abstract class Point {
	int point;
	
	public abstract void spendPoint(int point);
	
	public int getPoint() {
		return point;
	}
	public void setPoint(int point) {
		this.point = point;
	}

	@Override
	public String toString() {
		return "Point [point=" + point + "]";
	}
}
