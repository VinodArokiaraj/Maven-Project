package com.testing_properties;

import org.testng.annotations.Ignore;
import org.testng.annotations.Test;

public class Sample_Groups {
	
	@Test(groups = "Animals")
	public void lion() {

		System.out.println("lion");
	}
	
	@Ignore
	@Test(groups = "Animals")
	public void tiger() {

		System.out.println("tiger");
	}
	
	@Test(groups = "Animals")
	public void bear() {
		
		System.out.println("tiger");
	}
	
	@Test(groups = "Birds")
	public void eagle() {

		System.out.println("eagle");
	}
	
	@Ignore
	@Test(groups = "Birds")
	public void hawk() {

		System.out.println("hawk");
	}
	
	@Test(groups = "Birds")
	public void vulture() {
		
		System.out.println("vulture");
	}

}
