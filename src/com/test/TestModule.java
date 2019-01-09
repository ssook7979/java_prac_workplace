package com.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import com.customer.Customer;
import com.product.Electronics;
import com.product.Product;

class TestModule {

	@Test
	void test() {
		Customer c = new Customer(100000);
		Product e = new Electronics(1000, "e", "hellG", 10);
		c.purchase(e);
	}

}
