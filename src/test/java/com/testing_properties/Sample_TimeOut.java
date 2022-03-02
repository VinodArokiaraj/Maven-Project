package com.testing_properties;

import org.testng.annotations.Test;

public class Sample_TimeOut {
	
	@Test(timeOut = 7000)
	public void age_criteria() throws InterruptedException {

		Thread.sleep(1000);
		System.out.println("18 and above");

		Thread.sleep(2000);
		System.out.println("license-yes");

		Thread.sleep(3000);
		System.out.println("Can drive vehicle");
	}

}
