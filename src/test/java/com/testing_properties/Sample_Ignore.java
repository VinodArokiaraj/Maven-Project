package com.testing_properties;

import org.testng.annotations.Ignore;
import org.testng.annotations.Test;

public class Sample_Ignore {
	
	@Test
	public void lion() {

		System.out.println("lion");
	}
	@Test(enabled = false)
	public void tiger() {

		System.out.println("tiger");
	}
	@Ignore
	@Test
	public void eagle() {

		System.out.println("eagle");
	}
	@Test
	public void hawk() {

		System.out.println("hawk");
	}
	@Ignore
	@Test
	public void whale() {

		System.out.println("whale");
	}
	@Test(enabled = false)
	public void shark() {

		System.out.println("shark");
	}

}
