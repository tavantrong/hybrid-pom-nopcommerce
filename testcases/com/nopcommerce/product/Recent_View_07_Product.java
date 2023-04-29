package com.nopcommerce.product;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import commons.BaseTest;
import pageObjects.CustomerInfoPageObject;
import pageObjects.HomePageObject;
import pageObjects.LoginPageObject;
import pageObjects.PageGeneratorManager;

public class Recent_View_07_Product extends BaseTest{
	WebDriver driver;
	HomePageObject homePage;
	CustomerInfoPageObject customerPage;
	LoginPageObject loginPage;
	
	String newEmailAddress;


	@Parameters({ "browser", "url" })
	@BeforeClass
	public void beforeClass(String browserName, String urlValue) {
		driver = getBrowserDriver(browserName, urlValue);
		homePage = PageGeneratorManager.getHomePage(driver);
		
		
}
	
	@Test
	public void Recent_View_01_View_Five_Products_Any() {
		
	}
	
	@Test
	public void Recent_View_02_Verify_Three_Last_Product_View_Displayed() {
		
	}
	

	
	
	
	
	
	@AfterClass(alwaysRun=true)
	public void afterClass() {
		closeBrowserAndDriver();
	}
}
