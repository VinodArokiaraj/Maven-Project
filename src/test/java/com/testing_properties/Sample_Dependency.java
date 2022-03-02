package com.testing_properties;

import org.testng.annotations.Ignore;
import org.testng.annotations.Test;

public class Sample_Dependency {
	
	@Test
	public void age_criteria() {

		System.out.println("18 and above");
	}
	@Ignore
	@Test(dependsOnMethods = "age_criteria")
	public void license() {

		System.out.println("license-yes");
	}
	
	@Test(dependsOnMethods = "license")
	public void vehicle() {

		System.out.println("Can drive vehicle");
	}

}
