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

public class Admin01_Customer02_Edit extends BaseTest{
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
	public void Admin_01_Edit_Customer() {
	
	}
	
	@Test
	public void Admin_01_Add_New_Address_Customer() {
		
	}
	
	@Test
	public void Admin_01_Edit_Address_In_Customer_Detail() {
		
	}
	
	@Test
	public void Admin_01_Delete_Address_In_Customer_Detail() {
	

	}
	
	
	
	
	
	@AfterClass(alwaysRun=true)
	public void afterClass() {
		closeBrowserAndDriver();
	}
}
