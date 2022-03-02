package com.testing_properties;

import org.junit.Assert;
import org.testng.annotations.Test;

public class Sample_IRetry_Analyzer {
	
	@Test
	public void demo1() {

		String exp = "Vinod";
		String act = "Vinod";
		
		Assert.assertEquals(exp, act);
	}
	
	@Test(retryAnalyzer = Sample_IRetry_Analyzer1.class)
	public void demo2() {

		int a = 10;
		int b = 5;
		
		Assert.assertEquals(a, b);
		
	}

}
