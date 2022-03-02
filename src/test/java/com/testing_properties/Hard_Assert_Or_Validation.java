package com.testing_properties;

import org.testng.Assert;
import org.testng.annotations.Test;


public class Hard_Assert_Or_Validation {
	
	@Test
	public void HAOV() {

		String exp = "Vinod";
		String act = "vind";
		
		Assert.assertNotEquals(act, exp);
		
		System.out.println("HAOV");
	}

}
