package com.testing_properties;

import org.testng.annotations.Test;

public class Priority_Testing {
	
	@Test(priority = -5)
	public void lion() {

		System.out.println("lion");
	}
	@Test(priority = -3)
	public void tiger() {

		System.out.println("tiger");
	}
	@Test
	public void eagle() {

		System.out.println("eagle");
	}
	@Test(priority = 0)
	public void hawk() {

		System.out.println("hawk");
	}
	@Test(priority = 1)
	public void whale() {

		System.out.println("whale");
	}
	@Test(priority = 4 , invocationCount =5)
	public void shark() {

		System.out.println("shark");
	}

}
