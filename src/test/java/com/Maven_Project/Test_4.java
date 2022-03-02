package com.Maven_Project;

import java.io.IOException;

import org.openqa.selenium.WebDriver;

import com.basics.BaseClass;
import com.properties.File_Reader_Manager;
import com.sdp.Page_Obj_Manager;

public class Test_4 extends BaseClass {
	
	public static WebDriver driver = BrowserLaunch("chrome");
	
	public static Page_Obj_Manager pom = new Page_Obj_Manager(driver);
	
	public static void main(String[] args) throws IOException, InterruptedException {
		
		String url = File_Reader_Manager.getInstanceRManager().getInstanceCR().geturl();
		Launchurl(url);
		
		ClickonElement(pom.getInstanceCp().getRegister());
		
		Thread.sleep(1000);
		
		String firsttName = File_Reader_Manager.getInstanceRManager().getInstanceCR().getfirsttName();
		
		passinputvalue(pom.getInstanceSp().getFirstName(), firsttName);
		
		String lastName = File_Reader_Manager.getInstanceRManager().getInstanceCR().getlastName();
		
		passinputvalue(pom.getInstanceSp().getLastName(), lastName);
		
		String mailid = File_Reader_Manager.getInstanceRManager().getInstanceCR().getmailid();
		
		passinputvalue(pom.getInstanceSp().getemailid(), mailid);
	}
}
