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

public class WishList_05_Product extends BaseTest{
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
	public void Wishlist_01_Add_To_Wishlist() {
		
	}
	
	@Test
	public void Wishlist_02_Add_Product_To_Cart_From_Wishlist() {
		
	}
	
	@Test
	public void Wishlist_03_Remove_Product_From_Wishlist() {
		
	}
	
	
	
	
	
	
	@AfterClass(alwaysRun=true)
	public void afterClass() {
		closeBrowserAndDriver();
	}
}
