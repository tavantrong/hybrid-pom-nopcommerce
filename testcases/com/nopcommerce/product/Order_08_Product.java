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

public class Order_08_Product extends BaseTest{
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
	public void Order_01_Add_Product_To_Cart() {
		
	}
	
	@Test
	public void Order_02_Edit_Product_To_Cart() {
		
	}
	
	@Test
	public void Order_02_Remove_Product_From_Cart() {
		
	}
	
	@Test
	public void Order_02_Update_Product_Shopping_Cart() {
		
	}
	
	@Test
	public void Order_02_Checkout_Payment_Method_By_Cheque() {
		
	}
	
	@Test
	public void Order_02_Checkout_Payment_Method_By_Card() {
		
	}
	
	
	
	@AfterClass(alwaysRun=true)
	public void afterClass() {
		closeBrowserAndDriver();
	}
}
