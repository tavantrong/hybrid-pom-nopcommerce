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

public class Compare_06_Product extends BaseTest{
	WebDriver driver;
	HomePageObject homePage;
	CustomerInfoPageObject customerPage;
	LoginPageObject loginPage;
	


	@Parameters({ "browser", "url" })
	@BeforeClass
	public void beforeClass(String browserName, String urlValue) {
		driver = getBrowserDriver(browserName, urlValue);
		homePage = PageGeneratorManager.getHomePage(driver);
		
		
}
	
	@Test
	public void Compare_01_Add_Product_To_Compare() {
		
	}
	
	@Test
	public void Compare_02_Verify_Infor_Displayed() {
		
	}
	
	
	
	
	
	@AfterClass(alwaysRun=true)
	public void afterClass() {
		closeBrowserAndDriver();
	}
}
