package com.qa.mystepdefs;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import io.cucumber.java.en.Then;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import com.factory.DriverFactory;
import com.pages.DashboardPage;
import com.pages.LoginPage;

public class LoginStepDefinitions {
	
	
	private LoginPage loginPage = new LoginPage(DriverFactory.getDriver());
	private DashboardPage dashboard;
	
	
	
	@Given("i am in the login page with {}")
	public void i_am_in_the_login_page(String title) {
		loginPage.enterURL("https://admin-demo.nopcommerce.com/login?ReturnUrl=%2Fadmin%2F");
		String actualTitle=loginPage.getPageTitle();
		Assert.assertEquals(actualTitle, title);
	}
	
	@When("i have entered the email as {}")
	public void i_have_entered_the_email(String email) {
		loginPage.enterUserName(email);
	}
	
	

	@And("i have entered the password as {}")
	public void i_have_entered_the_password(String password) {
		loginPage.enterPassword(password);
	}

	@And("i have clicked on the Sign In button")
	public void i_have_clicked_on_the_sign_in_button() {
		dashboard = loginPage.clickLogin();
	}

	@And("I should be logged in to the application")
	public void i_should_be_logged_in_to_the_application() {
		dashboard.logoutlinkisDisplayed();
	}

	@Then("the title of the page should be {}")
	public void the_title_of_the_page_should_be(String string) {
		Assert.assertEquals(loginPage.getPageTitle(), string);
	}

}

