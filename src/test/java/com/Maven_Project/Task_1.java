package com.Maven_Project;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.basics.BaseClass;

public class Task_1 extends BaseClass{
	
	public static void main(String[] args) throws InterruptedException {
		
		BrowserLaunch("chrome");
		Launchurl("https://phptravels.org/login");
	
		WebElement register = driver.findElement(By.xpath("//a[@class='btn btn-outline btn-default']"));
		
		ClickonElement(register);
		
		Thread.sleep(1000);
		
		WebElement firstName = driver.findElement(By.id("inputFirstName"));
		passinputvalue(firstName, "Vinod.A.");
		
		WebElement lastName = driver.findElement(By.id("inputLastName"));
		passinputvalue(lastName, "Ranjith");
		
		WebElement Eadd = driver.findElement(By.id("inputEmail"));
		passinputvalue(Eadd, "vayne_nic@rediffmail.com");
		
		WebElement dialcode = driver.findElement(By.xpath("//div[@class='iti-arrow']"));
		ClickonElement(dialcode);
		
		WebElement dialcode1 = driver.findElement(By.xpath("//li[@data-dial-code='91']"));
		ClickonElement(dialcode1);
		
		WebElement MobNo = driver.findElement(By.id("inputPhone"));
		passinputvalue(MobNo, "8220686939");
		
		WebElement Bcn = driver.findElement(By.id("inputCompanyName"));
		passinputvalue(Bcn, "Abc-xyz");
	
		WebElement Bsa = driver.findElement(By.id("inputAddress1"));
		passinputvalue(Bsa, "69/33,Hemavathy Complex");
		
		WebElement Bsa2 = driver.findElement(By.id("inputAddress2"));
		passinputvalue(Bsa2, "Paper Mills Road");
		
		WebElement Bc = driver.findElement(By.id("inputCity"));
		passinputvalue(Bc, "Chennai");
		
		WebElement Bs = driver.findElement(By.id("stateinput"));
		passinputvalue(Bs, "Tamil Nadu");
		
		WebElement Bco = driver.findElement(By.id("inputPostcode"));
		passinputvalue(Bco, "600011");
		
        WebElement code = driver.findElement(By.id("inputCountry"));
        selectbyvalue(code, "IN");
		
		WebElement phone2 = driver.findElement(By.id("customfield2"));
		passinputvalue(phone2, "8220686939");
		
		WebElement psswrd = driver.findElement(By.id("inputNewPassword1"));
		passinputvalue(psswrd, "Qwerty@123456");
		
		WebElement psswrd2 = driver.findElement(By.id("inputNewPassword2"));
		passinputvalue(psswrd2, "Qwerty@123456");
		
		WebElement reg = driver.findElement(By.xpath("//input[@type='submit']"));
		ClickonElement(reg);
	}

}
