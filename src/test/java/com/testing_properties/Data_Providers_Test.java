package com.testing_properties;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Data_Providers_Test {
	
	@Test(dataProvider = "credentials1")
	public void login(String username, String password) {

		System.out.println("Username is: "+username);
		System.out.println("Password is: "+password);
	}
	
	@DataProvider
	public Object[][] credentials() {

		return new Object[][] {
			
			{"Vinod" , "qwerty"},
			{"Arokiaraj" , "asdfgh"},
			{"Ranjith" , "zxcvbn"}
			
		};
		
	}
	
	@DataProvider
	public Object[][] credentials1() {

		return new Object[][] {
			
			{"Fire" , "123"},
			{"Water" , "456"},
			{"Air" , "789"}
			
		};
		
	}

}
