package com.pages;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


public class LoginPage {
	
	private WebDriver driver;
	//OR
	private By emailId_txt = By.id("Email");
	private By password_txt = By.id("Password");
	private By signIn_btn = By.xpath("//button[text()='Log in']");
	//property file config, object Repo -propertyname= locatortype->locator
	//return WebElement method (property){//sepet}
	//lo
	//Object >> Hashmap(Page, Hashmap<element_name, WEbElement>)
	
	
	public LoginPage(WebDriver driver) {
		this.driver = driver;
	}
	
	public void enterURL(String url) {
		driver.get(url);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	}
	
	public String getPageTitle() {
		
		return driver.getTitle();
		
	}
	
	public void enterUserName(String email){
		WebDriverWait wait = new WebDriverWait (driver, Duration.ofSeconds(15));
		wait.until(ExpectedConditions.presenceOfElementLocated(emailId_txt));
		driver.findElement(emailId_txt).clear();
		driver.findElement(emailId_txt).sendKeys(email);
		TakesScreenshot oScr = (TakesScreenshot)driver;
		try {
		File oFile = new File(".//target//test.png");
		File myScrnshotFile = oScr.getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(myScrnshotFile, oFile);
		}
		catch(IOException e) {
			System.out.println(e.getMessage());
		}
	}

	public void enterPassword(String password) {
		WebDriverWait wait = new WebDriverWait (driver, Duration.ofSeconds(15));
		wait.until(ExpectedConditions.presenceOfElementLocated(password_txt));
		driver.findElement(password_txt).clear();
		driver.findElement(password_txt).sendKeys(password);
	}
	
	public DashboardPage clickLogin() {
		WebDriverWait wait = new WebDriverWait (driver, Duration.ofSeconds(15));
		wait.until(ExpectedConditions.presenceOfElementLocated(signIn_btn));
		driver.findElement(signIn_btn).click();
		return new DashboardPage(driver);
	}
}
