package com.nopcommerce.common;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import commons.BaseTest;
import pageObjects.HomePageObject;
import pageObjects.LoginPageObject;
import pageObjects.PageGeneratorManager;

public class Common_02_Login extends BaseTest {
	WebDriver driver;
	HomePageObject homePage;
	LoginPageObject loginPage;
	String loginPageUrl;

	@Parameters({ "browser", "url" })
	@BeforeClass
	public void beforeClass(String browserName, String urlValue) {
		driver = getBrowserDriver(browserName, urlValue);
		homePage = PageGeneratorManager.getHomePage(driver);
		
		log.info("Login 01 - Step 01: Open Login Link At Home Page");
		loginPage = homePage.clickToLoginLink();
		loginPageUrl = loginPage.getLoginPageUrl();
	}
	
	
	public void Login_01_With_Empty_Data() {
		log.info("Login 01 - Step 02: Click to Login button at Login page");
		loginPage.clickToLoginButton();
		
		log.info("Login 01 - Step 03: Verify 'Please enter your email' error displayed");
		verifyEquals(loginPage.pleaseEnterYourEmailMessageDisplayed(), "Please enter your email");
	}
	
	
	public void Login_02_With_Invalid_Email() {
		loginPage.openLoginPageUrl(loginPageUrl);
		log.info("Login 02 - Step 01: Input to Email textbox with value: 'AutomationEmail@'");
		loginPage.enterToEmailTextbox("AutomationEmail@");
		
		log.info("Login 02 - Step 02: Input to Email textbox with value: " + Common_01_Register.passwordTextbox);
		loginPage.enterToPasswordTextbox(Common_01_Register.passwordTextbox);
		
		log.info("Login 02 - Step 03: Click to Login button at Login page");
		loginPage.clickToLoginButton();
		
		log.info("Login 02 - Step 04: Verify 'Wrong Email' error displayed");
		verifyEquals(loginPage.wrongEmailMessageDisplayed(), "Wrong email");

	}
	
	
	public void Login_03_With_Unregister_Email() {
		loginPage.openLoginPageUrl(loginPageUrl);
		log.info("Login 03 - Step 01: Input to 'Email' textbox with value: 'automated@123.345'");
		loginPage.enterToEmailTextbox("automated@123.345");
		
		log.info("Login 03 - Step 02: Input to 'Password' textbox with value: " + Common_01_Register.passwordTextbox);
		loginPage.enterToPasswordTextbox(Common_01_Register.passwordTextbox);
		
		log.info("Login 03 - Step 03: Click to 'Login' button at Login page");
		loginPage.clickToLoginButton();
		
		log.info("Login 03 - Step 04: Verify 'No customer account found' error displayed");
		verifyEquals(loginPage.noCustomerAccountFoundMessageDisplayed(), "No customer account found");
	}
	
	
	public void Login_04_With_Empty_Password() {
		loginPage.openLoginPageUrl(loginPageUrl);
		log.info("Login 04 - Step 01: Input to 'Email' textbox with value: " + Common_01_Register.emailAddress);
		loginPage.enterToEmailTextbox(Common_01_Register.emailAddress);
		
		log.info("Login 04 - Step 02: Input to 'Password' textbox with empty value");
		loginPage.enterToPasswordTextbox("");
		
		log.info("Login 04 - Step 03: Click to 'Login' button at Login page");
		loginPage.clickToLoginButton();
		
		log.info("Login 04 - Step 04: Verify 'The credentials provided are incorrect' error displayed");
		verifyEquals(loginPage.theCredentialsIncorrectMessageDisplayed(), "The credentials provided are incorrect");

	}

	
	public void Login_05_With_Incorrect_Password() {
		loginPage.openLoginPageUrl(loginPageUrl);
		log.info("Login 05 - Step 01: Input to 'Email' textbox with value: " + Common_01_Register.emailAddress);
		loginPage.enterToEmailTextbox(Common_01_Register.emailAddress);
		
		log.info("Login 05 - Step 02: Input to 'Password' textbox with value: '123456'");
		loginPage.enterToPasswordTextbox("123456");
		
		log.info("Login 05 - Step 03: Click to 'Login' button at Login page");
		loginPage.clickToLoginButton();
		
		log.info("Login 05 - Step 04: Verify 'The credentials provided are incorrect' error displayed");
	}
	
	@Test (groups = "login")
	public void Login_06_With_Valid_Data() {
		loginPage.openLoginPageUrl(loginPageUrl);
		log.info("Login 06 - Step 01: Input to 'Email' textbox with value: " + Common_01_Register.emailAddress);
		loginPage.enterToEmailTextbox(Common_01_Register.emailAddress);

		log.info("Login 06 - Step 02: Input to 'Password' textbox with value: " + Common_01_Register.passwordTextbox);
		loginPage.enterToPasswordTextbox(Common_01_Register.passwordTextbox);

		log.info("Login 06 - Step 03: Click to 'Login' button at Login page");
		homePage = loginPage.clickToLoginButton();

		log.info("Login 06 - Step 04: Verify 'My Account' link displayed");
		verifyTrue(homePage.isMyAccountLinkDisplayed());
	}



	@AfterClass(alwaysRun=true)
	public void afterClass() {
		closeBrowserAndDriver();
	}

	
	
}
