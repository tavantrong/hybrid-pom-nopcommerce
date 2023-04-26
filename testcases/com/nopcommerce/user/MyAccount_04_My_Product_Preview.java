package com.nopcommerce.user;

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
import pageObjects.MyReviewPageObject;
import pageObjects.PageGeneratorManager;
import pageObjects.ProductPageObject;

public class MyAccount_04_My_Product_Preview extends BaseTest{
	WebDriver driver;
	HomePageObject homePage;
	LoginPageObject loginPage;
	CustomerInfoPageObject customerPage;
	MyReviewPageObject reviewPage;

	@Parameters({ "browser", "url" })
	@BeforeClass
	public void beforeClass(String browserName, String urlValue) {
		driver = getBrowserDriver(browserName, urlValue);
		homePage = PageGeneratorManager.getHomePage(driver);
		
		log.info("Pre-Condition - Step 01: Open Login Link At Home Page");
		loginPage = homePage.clickToLoginLink();

		log.info("Pre-Condition - Step 02: Input to 'Email' textbox with value: " + Common_01_Register.emailAddress);
		loginPage.enterToEmailTextbox(Common_01_Register.emailAddress);

		log.info("Pre-Condition - Step 03: Input to 'Password' textbox with value: " + Common_01_Register.passwordTextbox);
		loginPage.enterToPasswordTextbox(Common_01_Register.passwordTextbox);

		log.info("Pre-Condition - Step 04: Click to 'Login' button at Login page");
		homePage = loginPage.clickToLoginButton();

		log.info("Pre-Condition - Step 05: Click to 'My Account' linktext");
		customerPage = homePage.clickToMyAccountLink();

		log.info("Pre-Condition - Step 05: Click to 'My product reviews' tab");
		reviewPage = customerPage.openMyReviewTabByText("My product reviews");
}
	
	@Test
	public void MyReview_01_Add_Review() {
		log.info("Review 01 - Step 01: Verify 'You haven't written any reviews yet' notice displayed");
		verifyEquals(reviewPage.getNoReviewNoticeInReviewPage(), "You haven't written any reviews yet");
		
		log.info("Review 01 - Step 01: Hover to 'Electronics' linktext menu");
		reviewPage.hoverMouseToDynamicMenu("Electronics");
		
		log.info("Review 01 - Step 01: Click to 'Cell phones' linktext");
		homePage = reviewPage.clickToDynamicLinktext("Cell phones");
		
		log.info("Review 01 - Step 01: Verify 'Cell phones' page displayed");
		verifyTrue(homePage.isCellPhonesTitlePageDisplayed());
		
		log.info("Review 01 - Step 01: Click to 'HTC One Mini Blue' linktext product");
		homePage.clickToProductNameAtMainPage("HTC One Mini Blue");
		
		log.info("Review 01 - Step 01: Verify 'HTC One Mini Blue' page displayed");
		verifyTrue(homePage.isHTCOneMiniPageDisplayed());
		
		log.info("Review 01 - Step 01: Click to 'Add your review' linktext");
		
		
		log.info("Review 01 - Step 01: Verify 'Product reviews for HTC One Mini Blue' page displayed");
		
		log.info("Review 01 - Step 01: Input to 'Review title' with value: 'HTC One Mini Blue'");
		log.info("Review 01 - Step 01: Input to 'Review text' with value: 'Automation Review Text'");
		log.info("Review 01 - Step 01: Click to review 'Good' at 4th Radio button");
		log.info("Review 01 - Step 01: Click to 'Submit review' button");
		log.info("Review 01 - Step 01: Verify 'Product review is successfully added.' notice displayed");
		log.info("Review 01 - Step 01: Verify review title is 'HTC One Mini Blue'");
		log.info("Review 01 - Step 01: Verify review rating is '80%'");
		log.info("Review 01 - Step 01: Verify review content is 'Automation Review Text'");
		
		log.info("Review 01 - Step 01: Verify review user is: " + Common_01_Register.firstName);

		
		

		
	}
	
	@Test
	public void MyReview_02_Verify_Review_Display_In_My_Product_Review() {
		log.info("Pre-Condition - Step 05: Click to 'My Account' linktext");
		customerPage = homePage.clickToMyAccountLink();

		log.info("Pre-Condition - Step 05: Click to 'My product reviews' tab");
		reviewPage = customerPage.openMyReviewTabByText("My product reviews");
		
		log.info("Review 01 - Step 01: Verify review title is 'HTC One Mini Blue'");
		log.info("Review 01 - Step 01: Verify review rating is '80%'");
		log.info("Review 01 - Step 01: Verify review content is 'Automation Review Text'");
		log.info("Review 01 - Step 01: Verify 'Product review for: HTC One Mini Blue' text displayed");
		log.info("Review 01 - Step 01: Click 'HTC One Mini Blue' linktext at 'My Product Review' page");
		log.info("Review 01 - Step 01: Verify 'HTC One Mini Blue' page displayed");
		
		
	}
	
	
	
	
	
	
	@AfterClass(alwaysRun=true)
	public void afterClass() {
		closeBrowserAndDriver();
	}
}
