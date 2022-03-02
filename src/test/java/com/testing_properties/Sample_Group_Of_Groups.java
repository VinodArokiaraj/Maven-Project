package com.testing_properties;

import org.testng.annotations.Ignore;
import org.testng.annotations.Test;

public class Sample_Group_Of_Groups {
	
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
	
	@Ignore
	@Test(groups = "Birds")
	public void eagle() {

		System.out.println("eagle");
	}
	
	@Test(groups = "Birds")
	public void hawk() {

		System.out.println("hawk");
	}
	
	@Test(groups = "Birds")
	public void vulture() {
		
		System.out.println("vulture");
	}
	
	@Test(groups = "Fish")
	public void whale() {

		System.out.println("whale");
	}
	
	@Test(groups = "Fish")
	public void shark() {

		System.out.println("shark");
	}
	
	@Ignore
	@Test(groups = "Fish")
	public void orca() {

		System.out.println("orca");
	}

}
