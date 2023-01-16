package com.qa.opencart.base;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;

import Com.QA.Opencart.pages.LoginPage;
import Com.QA.Opencart.pages.ResultsPage;
import Com.QA.Opencart.pages.AccountsPage;
import come.qa.opencart.factory.DriverFactory;


public class BaseTest {

	WebDriver driver;
	DriverFactory df;
	protected LoginPage loginPage;
	protected AccountsPage accountspage;
	public ResultsPage resultsPage;

	@BeforeTest
	public void setup() {
		df = new DriverFactory();
		driver = df.initDriver("chrome");
		loginPage = new LoginPage(driver);
	}
	
	@AfterTest
	public void tearDown() {
		driver.quit();
	}
	

}


