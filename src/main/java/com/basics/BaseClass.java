package com.basics;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.IOException;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BaseClass {

	public static WebDriver driver;

	public static WebDriver BrowserLaunch(String name) {

		if (name.equalsIgnoreCase("chrome")) {

			System.setProperty("webdriver.chrome.driver",
					System.getProperty("user.dir") + "\\Driver\\chromedriver.exe");
			driver = new ChromeDriver();
			driver.manage().window().maximize();
		}

		else if (name.equalsIgnoreCase("firefox")) {

			System.setProperty("webdriver.gecko.driver", System.getProperty("user.dir") + "\\Driver\\geckodriver.exe");
			driver = new FirefoxDriver();
			driver.manage().window().maximize();

		}
		return driver;
	}

	// Get URL
	public static void Launchurl(String url) {
		driver.get(url);
	}

	// Quit
	public static void quitthebrowser() {
		driver.quit();
	}

	// Close
	public static void closethebrowser() {
		driver.close();
	}

	// Navigate To
	public static void navigatetourl(String url) {
		driver.navigate().to(url);
	}

	// Navigate Back
	public static void navigateback() {
		driver.navigate().back();
	}

	// Navigate Forward
	public static void navigateforwd() {
		driver.navigate().forward();
	}

	// Navigate Refresh
	public static void navigaterefresh() {
		driver.navigate().refresh();
	}

	// Get Windows Handling
	public static void getwindowshandling() {
		Set<String> windowHandles = driver.getWindowHandles();
		for (String s : windowHandles) {
			String title = driver.switchTo().window(s).getWindowHandle();
			System.out.println(title);
		}
	}

	// Alert accept
	public static void alertaccept() {
		driver.switchTo().alert().accept();
	}

	// Alert dismiss
	public static void alertdismiss() {
		driver.switchTo().alert().dismiss();
	}

	// Alert sendKeys
	public static void alertexam(String input) {
		driver.switchTo().alert().sendKeys(input);
	}

	// Frame by ID
	public static void framebyID(String ID) {
		driver.switchTo().frame(ID);
	}

	// Frame by index
	public static void framebyindex(int index) {
		driver.switchTo().frame(index);
	}

	// Frame by WebElement
	public static void framebyWebElement(WebElement element) {
		driver.switchTo().frame(element);
	}

	// From fame to main page
	public static void frametomainpage() {
		driver.switchTo().defaultContent();
	}

	// Mouse actions click
	public static void mouseclick(WebElement element) {
		Actions ac = new Actions(driver);
		ac.click(element).build().perform();
	}

	// Mouse actions Right click
	public static void mousrighteclick(WebElement element) {
		Actions ac = new Actions(driver);
		ac.contextClick(element).build().perform();
	}

	// Mouse actions Double click
	public static void mousedoubleclick(WebElement element) {
		Actions ac = new Actions(driver);
		ac.doubleClick(element).build().perform();
	}

	// Robot VK up
	public static void VKup() throws AWTException {
		Robot r = new Robot();
		r.keyPress(KeyEvent.VK_UP);
		r.keyRelease(KeyEvent.VK_UP);
	}

	// Robot VK down
	public static void VKdown() throws AWTException {
		Robot r = new Robot();
		r.keyPress(KeyEvent.VK_DOWN);
		r.keyRelease(KeyEvent.VK_DOWN);
	}

	// Robot VK enter
	public static void VKenter() throws AWTException {
		Robot r = new Robot();
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
	}

	// drop down by value
	public static void dropdownbyvalue(WebElement element, String value) {
		Select s = new Select(element);
		s.selectByValue(value);
	}

	// drop down by index
	public static void dropdownbyindex(WebElement element, int index) {
		Select s = new Select(element);
		s.selectByIndex(index);
	}

	// drop down by visible text
	public static void dropdownbyvisibletext(WebElement element, String text) {
		Select s = new Select(element);
		s.selectByVisibleText(text);
	}

	// Check box
	public static void checkbox(WebElement element) {
		element.click();
	}

	// Is enabled
	public static void isenabled(WebElement element) {
		System.out.println(element.isEnabled());
	}

	// Is displayed
	public static void isdisplayed(WebElement element) {
		System.out.println(element.isDisplayed());
	}

	// Is selected
	public static void isselected(WebElement element) {
		System.out.println(element.isSelected());
	}

	// Get options
	public static void getoptions(WebElement element) {
		Select s = new Select(element);
		java.util.List<WebElement> options = s.getOptions();
		for (WebElement Element : options) {
			System.out.println(Element.getText());
		}
	}

	// Get title
	public static void gettitle() {
		System.out.println(driver.getTitle());
	}

	// Get current URL
	public static void getcurrenturl() {
		System.out.println(driver.getCurrentUrl());
	}

	// Get text
	public static void gettextex(WebElement element) {
		System.out.println(element.getText());
	}

	// Get attribute
	public static void getattribute(WebElement element, String input) {
		System.out.println(element.getAttribute(input));
	}

	// Implicit Wait
	public static void Implicitwait(int sec, TimeUnit unit) {
		driver.manage().timeouts().implicitlyWait(sec, unit);
	}

	// Explicit Wait
	public static void Explicitwait(int sec, WebElement element) {
		WebDriverWait wait = new WebDriverWait(driver, sec);
		wait.until(ExpectedConditions.visibilityOf(element));
	}

	// Take screenshot
	public static void takescreenshot(String location) throws IOException {
		TakesScreenshot sc = (TakesScreenshot) driver;
		File start = sc.getScreenshotAs(OutputType.FILE);
		File end = new File(location);
		FileUtils.copyFile(start, end);
	}

	// Scroll into view
	public static void scrollintoview(WebElement element) {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView();", element);
	}

	// Scroll by
	public static void scrollby(WebElement element) {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy();", element);
	}

	// Is multiple
	public static void ismulex(WebElement element) {
		Select s = new Select(element);
		System.out.println(s.isMultiple());
	}

	// Radio button
	public static void radiobuttonexam(WebElement element) {
		element.click();
	}

	// Pass input value
	public static void passinputvalue(WebElement element, String input) {
		element.sendKeys(input);
	}

	// Click on Element
	public static void ClickonElement(WebElement element) {
		element.click();
	}

	// Select by value
	public static void selectbyvalue(WebElement element, String value) {
		Select select = new Select(element);
		select.selectByValue(value);
	}
}
