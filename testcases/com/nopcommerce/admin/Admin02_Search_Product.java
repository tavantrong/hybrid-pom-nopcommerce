package com.nopcommerce.admin;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.nopcommerce.common.Common_01_Register;

import commons.BaseTest;
import pageObjects.CustomerInfoPageObject;
import pageObjects.HomePageObject;
import pageObjects.LoginPageObject;
import pageObjects.PageGeneratorManager;

public class Admin02_Search_Product extends BaseTest{
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
	public void Customer_01_Verify_CustomerInfo_With_Register() {
		log.info("Customer 01 - Step 01: Verify 'First Name' in Customer Page match with: " + Common_01_Register.firstName);
		verifyEquals(customerPage.getFirstNameValueAtCustomerPage(), Common_01_Register.firstName);
		
		log.info("Customer 01 - Step 02: Verify 'Last Name' in Customer Page match with: " + Common_01_Register.lastName);
		verifyEquals(customerPage.getLastNameValueAtCustomerPage(), Common_01_Register.lastName);
		
		log.info("Customer 01 - Step 03: Verify 'Email' in Customer Page match with: " + Common_01_Register.emailAddress);
		verifyEquals(customerPage.getEmailValueAtCustomerPage(), Common_01_Register.emailAddress);

	}
	
	@Test
	public void Admin_01_Customer01_Create_New_Customer() {
		
	}
	
	@Test
	public void Admin_02_Customer01_Verify_Customer_Information() {
		
	}
	

	
	
	
	
	
	@AfterClass(alwaysRun=true)
	public void afterClass() {
		closeBrowserAndDriver();
	}
}
