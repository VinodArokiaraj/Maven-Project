package com.pomclass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Signup_Page {
public WebDriver driver;
	
	@FindBy(id = "inputFirstName")
	private WebElement FirstName;
	
	@FindBy(id = "inputLastName")
	private WebElement LastName;
	
	@FindBy(id = "inputEmail")
	private WebElement mailid;
	
	@FindBy(xpath = "//div[@class='iti-arrow']")
	private WebElement Dialcode;
	
	@FindBy(xpath = "//li[@data-dial-code='91']")
	private WebElement Dialcode1;
	
	@FindBy(id = "inputPhone")
	private WebElement MobNo;
	
	@FindBy(id = "inputCompanyName")
	private WebElement Bcn;
	
	@FindBy(id = "inputAddress1")
	private WebElement Bsa;
	
	@FindBy(id = "inputAddress2")
	private WebElement Bsa2;
	
	@FindBy(id = "inputCity")
	private WebElement Bc;
	
	@FindBy(id = "stateinput")
	private WebElement Bs;
	
	@FindBy(id = "inputPostcode")
	private WebElement Bco;
	
	@FindBy(id = "inputCountry")
	private WebElement code;
	
	@FindBy(id = "customfield2")
	private WebElement phone2;
	
	@FindBy(id = "inputNewPassword1")
	private WebElement passwrd;
	
	@FindBy(id = "inputNewPassword2")
	private WebElement passwrd2;
	
	@FindBy(xpath = "//input[@type='submit']")
	private WebElement reg;
	
	
	public Signup_Page(WebDriver driver2) {
		this.driver = driver2;
		PageFactory.initElements(driver, this);
	}
	
	public WebElement getFirstName() {
		return getFirstName();
	}
	public WebElement getLastName() {
		return getLastName();
	}
	public WebElement getemailid() {
		return getemailid();
	}
	public WebElement getDialcode() {
		return getDialcode();
	}
	public WebElement getDialcode1() {
		return getDialcode1();
	}
	public WebElement getMobNo() {
		return getMobNo();
	}
	public WebElement getBcn() {
		return getBcn();
	}
	public WebElement getBsa() {
		return getBsa();
	}
	public WebElement getBsa2() {
		return getBsa2();
	}
	public WebElement getBc() {
		return getBc();
	}
	public WebElement getBs() {
		return getBs();
	}
	public WebElement getBco() {
		return getBco();
	}
    public WebElement getcode() {
		return getcode();
	}
	public WebElement getphone2() {
		return getphone2();
	}
	public WebElement getpasswrd() {
		return getpasswrd();
	}
	public WebElement getpasswrd2() {
		return getpasswrd2();
	}
	public WebElement getreg() {
		return getreg();
	}

}
