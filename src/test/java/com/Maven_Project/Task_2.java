package com.Maven_Project;

import com.basics.BaseClass;
import com.pomclass.CreateAccount_Page;
import com.pomclass.Signup_Page;

public class Task_2 extends BaseClass{
	
	public static void main(String[] args) throws InterruptedException {
		
		BrowserLaunch("chrome");
		Launchurl("https://phptravels.org/login");
	    
		CreateAccount_Page cp = new CreateAccount_Page(driver);
		ClickonElement(cp.getRegister());
		
		Thread.sleep(1000);
		
		Signup_Page sp = new Signup_Page(driver);
		passinputvalue(sp.getFirstName(), "Vinod.A.");
		
		passinputvalue(sp.getLastName(), "Ranjith");
		
		passinputvalue(sp.getemailid(), "vayne_nic@rediffmail.com");
		
		ClickonElement(sp.getDialcode());
		
		ClickonElement(sp.getDialcode1());
		
		passinputvalue(sp.getMobNo(), "8220686939");
		
		passinputvalue(sp.getBcn(), "Abc-xyz");
	
		ClickonElement(sp.getBsa());
		
		passinputvalue(sp.getBsa2(), "Paper Mills Road");
		
		passinputvalue(sp.getBc(), "Chennai");
		
		passinputvalue(sp.getBs(), "Tamil Nadu");
		
		passinputvalue(sp.getBco(), "600011");
		
        selectbyvalue(sp.getcode(), "IN");
		
		passinputvalue(sp.getphone2(), "8220686939");
		
		passinputvalue(sp.getpasswrd(), "Qwerty@123456");
		
		passinputvalue(sp.getpasswrd2(), "Qwerty@123456");
		
		ClickonElement(sp.getreg());
	}

}
