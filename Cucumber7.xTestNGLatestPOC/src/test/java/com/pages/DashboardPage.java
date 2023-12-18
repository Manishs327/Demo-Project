package com.pages;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class DashboardPage {
	
	private WebDriver driver;
	private By logout_link = By.linkText("Logout");
	private WebDriverWait oWait;
	
	public DashboardPage(WebDriver driver) {
		this.driver=driver;
	}
	
	public boolean logoutlinkisDisplayed() {
		oWait = new WebDriverWait(driver, Duration.ofSeconds(20));
		oWait.until(ExpectedConditions.presenceOfElementLocated(logout_link));
		return driver.findElement(logout_link).isDisplayed();
		
	}

}
