package com.Maven_Project;

import org.openqa.selenium.WebDriver;

import com.basics.BaseClass;
import com.sdp.Page_Obj_Manager;

public class Task_3 extends BaseClass {
	
	public static WebDriver driver = BrowserLaunch("chrome");
	
	public static Page_Obj_Manager pom = new Page_Obj_Manager(driver);
	
	public static void main(String[] args) throws InterruptedException {
		
		Launchurl("https://phptravels.org/login");
		
		ClickonElement(pom.getInstanceCp().getRegister());
		
		Thread.sleep(1000);
		
		passinputvalue(pom.getInstanceSp().getFirstName(), "Vinod");
		passinputvalue(pom.getInstanceSp().getLastName(), "Ranjith");
		passinputvalue(pom.getInstanceSp().getemailid(), "vayne_nic@rediffmail.com");
		
	}

}
