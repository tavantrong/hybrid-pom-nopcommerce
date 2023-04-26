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
		
		log.info("Review 01 - Step 02: Hover to 'Electronics' linktext menu");
		reviewPage.hoverMouseToDynamicMenu("Electronics");
		
		log.info("Review 01 - Step 03: Click to 'Cell phones' linktext");
		homePage = reviewPage.clickToDropdownDynamicMenuLinktext("Cell phones ");
		
		log.info("Review 01 - Step 04: Verify 'Cell phones' page displayed");
		verifyTrue(homePage.isCellPhonesTitlePageDisplayed());
		
		log.info("Review 01 - Step 05: Click to 'HTC One Mini Blue' linktext product");
		homePage.clickToProductNameAtMainPage("HTC One Mini Blue");
		
		log.info("Review 01 - Step 06: Verify 'HTC One Mini Blue' page displayed");
		verifyTrue(homePage.isHTCOneMiniPageDisplayed());
		
		log.info("Review 01 - Step 07: Click to 'Add your review' linktext");
		homePage.clickAddYourReviewLinkText("Add your review");
		
		log.info("Review 01 - Step 08: Verify 'Product reviews for HTC One Mini Blue' page displayed");
		verifyTrue(homePage.isProductReviewForTitleDisplayed());
		
		log.info("Review 01 - Step 09: Input to 'Review title' with value: 'HTC One Mini Blue'");
		homePage.inputToReviewTitleWithValue("HTC One Mini Blue");
		
		log.info("Review 01 - Step 10: Input to 'Review text' with value: 'Automation Review Text'");
		homePage.inputToReviewTextWithValue("Automation Review Text");
		
		log.info("Review 01 - Step 11: Click to review 'Good' at 4th Radio button");
		homePage.clickToReviewRadioButton();
		
		log.info("Review 01 - Step 12: Click to 'Submit review' button");
		homePage.clickToSubmitReviewButton();

		log.info("Review 01 - Step 13: Verify 'Product review is successfully added.' notice displayed");
		verifyTrue(homePage.isReviewAddSuccessfullyNoticeDisplayed());
		
		log.info("Review 01 - Step 14: Verify review title is 'HTC One Mini Blue'");
		verifyEquals(homePage.getProductReviewTitle("HTC One Mini Blue"), "HTC One Mini Blue");
		
		log.info("Review 01 - Step 15: Verify review rating is '80%'");
		verifyTrue(homePage.isGoodReviewRatingDisplayed());
		
		log.info("Review 01 - Step 16: Verify review content is 'Automation Review Text'");
		verifyEquals(homePage.getReviewContentValue(), "Automation Review Text");
		
		log.info("Review 01 - Step 17: Verify review user is: " + Common_01_Register.firstName);
		verifyEquals(homePage.getReviewUser(), Common_01_Register.firstName);

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
