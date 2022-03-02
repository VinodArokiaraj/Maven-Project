package com.sdp;

import org.openqa.selenium.WebDriver;

import com.pomclass.CreateAccount_Page;
import com.pomclass.Signup_Page;

public class Page_Obj_Manager {
	
	public WebDriver driver;
	
	private CreateAccount_Page cp;
	
	private Signup_Page sp;
	
	public Page_Obj_Manager(WebDriver driver2) {
		this.driver = driver2;
	}
	
	public CreateAccount_Page getInstanceCp() {
		if (cp==null) {
			cp = new CreateAccount_Page(driver);
		}
		return cp;
	}
	public Signup_Page getInstanceSp() {
		if (sp==null) {
			sp = new Signup_Page(driver);
}
		return sp;
	}

}
