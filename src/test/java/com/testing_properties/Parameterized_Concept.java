package com.testing_properties;

import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Parameterized_Concept {
	@Test
	@Parameters({"name" , "dob" , "age" , "gender" , "surname" , "nationality"})
	public void Personal_Details(String name , @Optional("14-03-1992")String dob , int age , String gender , String surname , String nationality) {

		System.out.println("Personal Details:");
		System.out.println("Name: "+name);
		System.out.println("D.O.B: "+dob);
		System.out.println("Age: "+age);
		System.out.println("Gender: "+gender);
		System.out.println("Sur Name: "+surname);
		System.out.println("Nationality: "+nationality);
	}
}
