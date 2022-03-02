package com.testing_properties;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class Soft_Assert_Or_Verification {
	
	@Test
	public void SAOV() {

		String exp = "Vinod";
		String act = "Vinod";
		
		SoftAssert s = new SoftAssert();
		
		s.assertNotEquals(act, exp);
		
		System.out.println("SAOV");
	}

}
