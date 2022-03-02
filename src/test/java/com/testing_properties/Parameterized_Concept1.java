package com.testing_properties;

import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Parameterized_Concept1 {
	
	@Test
	@Parameters({"name" , "dob" , "age" , "gender" , "surname" , "qualification"})
	public void my_resume(String name , @Optional("Mar 14, 1992")String dob , int age , String gender , String surname , String qualification) {

		    System.out.println("\n My Resume:");
			System.out.println("Name: "+name);
			System.out.println("D.O.B: "+dob);
			System.out.println("Age: "+age);
			System.out.println("Gender: "+gender);
			System.out.println("Sur Name: "+surname);
			System.out.println("Qualification: "+qualification);
		}
	}
