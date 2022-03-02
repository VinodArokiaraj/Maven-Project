package com.testing_properties;

import java.util.InputMismatchException;
import java.util.Scanner;

import org.testng.annotations.Test;

public class Sample_ExpectedException {
	
	@Test(expectedExceptions = NullPointerException.class)
	public void demo() {

		String a=null;
		
		System.out.println(a.length());
		
	}
	
	@Test(expectedExceptions = ArithmeticException.class)
	public void demo1() {

		int a=10;
		int b=0;
		
		System.out.println(a/b);
		
	}
	
	@Test(expectedExceptions = InputMismatchException.class)
	public void demo2() {

		Scanner s = new Scanner(System.in);
		System.out.println("enter your value");
		int value = s.nextInt();
		System.out.println(value);
		
	}
	
	@Test(expectedExceptions = ArrayIndexOutOfBoundsException.class)
	public void demo3() {

		int a [] = new int[2];
		a[0]=10;
		a[1]=20;
		a[2]=30;
		
		System.out.println(a[0]);
		System.out.println(a[1]);
		System.out.println(a[2]);
		
	}

}
