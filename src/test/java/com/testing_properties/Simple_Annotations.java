package com.testing_properties;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Simple_Annotations {
	
	@BeforeSuite
	public void lion() {

		System.out.println("lion");
	}
	@BeforeTest
	public void tiger() {

		System.out.println("tiger");
	}
	@BeforeClass
	public void bear() {
		System.out.println("bear");

	}
	@BeforeMethod
	public void eagle() {

		System.out.println("eagle");
	}
	@Test
	public void hawk() {

		System.out.println("hawk");
	}
	@AfterMethod
	public void vulture() {
		
		System.out.println("vulture");
	}
	@AfterClass
	public void whale() {

		System.out.println("whale");
	}
	@AfterTest
	public void shark() {

		System.out.println("shark");
	}
	@AfterSuite
	public void orca() {
		
		System.out.println("orca");
	}

}
