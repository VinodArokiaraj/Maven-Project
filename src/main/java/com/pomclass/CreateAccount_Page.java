package com.pomclass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CreateAccount_Page {
public WebDriver driver;
    
    @FindBy(xpath = "//a[@class='btn btn-outline btn-default")
    private WebElement register;
    
	public CreateAccount_Page(WebDriver driver2) {
		
		this.driver = driver2;
		PageFactory.initElements(driver, this);

	}
	public WebElement getRegister() {
		return register;      
}
}
