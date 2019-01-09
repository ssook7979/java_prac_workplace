package com.customer;

import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

import com.impl.Discountable;
import com.product.Deliverable;
import com.product.Product;

public class Customer {
	static int count = 0;
	private int money;
	private int bonusPoint = 0;
	final private String customerNumber;
	
	{
		++count;
	    Random r = new Random();
	    String result = "";
	    
	    for (int i = 0; i<10; i++) {
	    	
	    	if (i < 5) {
	    		result += (char)(r.nextInt(26) + 'a');
	    	}
	    	else {
	    		result += ThreadLocalRandom.current().nextInt(1, 10);
	    	}
	    }
	    customerNumber = result;
	}
	
	public Customer (int money) {
		this(money, 0);
	}
	
	Customer (int money, int bonusPoint) {
		this.money = money;
		this.bonusPoint = bonusPoint;
	}
	
	public void purchase(Product p) {
		if (p instanceof Discountable ) {
			this.money -= ((Discountable) p).getDiscountPrice(p.getPrice());
			System.out.println(p.toString());			
		}
		else if ( ( p.getPrice() > this.money ) && p.isPurchasable() ) {
			this.money -= p.getPrice(); 
			System.out.println(p.toString());
		}
		else {
			System.out.println("잔액이 부족합니다.");
		}
	}

	public int getMoney() {
		return money;
	}


	public void setMoney(int money) {
		this.money = money;
	}


	public int getBonusPoint() {
		return bonusPoint;
	}


	public void setBonusPoint(int bonusPoint) {
		this.bonusPoint = bonusPoint;
	}

	public String getCustomerNumber() {
		return customerNumber;
	}
}
