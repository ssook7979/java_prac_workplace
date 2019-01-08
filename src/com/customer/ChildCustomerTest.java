package com.customer;

import static org.junit.jupiter.api.Assertions.*;
import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

import org.junit.jupiter.api.Test;

class ChildCustomerTest {

	@Test
	void test() {
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
	    
	    System.out.println(result);
	}

}
