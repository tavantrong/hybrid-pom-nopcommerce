package com.nopcommerce.common;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import commons.BaseTest;
import commons.DataHelper;
import pageObjects.HomePageObject;
import pageObjects.PageGeneratorManager;
import pageObjects.RegisterPageObject;

public class Common_01_Register extends BaseTest {
	WebDriver driver;
	DataHelper dataTest;
	String registerPageUrl;

	public static String emailAddress, passwordTextbox, firstName, lastName;

	@Parameters({ "browser", "url" })
	@BeforeTest
	public void beforeTest(String browserName, String urlValue) {
		driver = getBrowserDriver(browserName, urlValue);
		homePage = PageGeneratorManager.getHomePage(driver);
		dataTest = DataHelper.getData();

		emailAddress = "automationkfc" + getRandomNumber() + "@testing.com";
		passwordTextbox = "123456?Aa";
		firstName = dataTest.getFirstName();
		lastName = dataTest.getLastName();
		
		log.info("Register 01 - Step 01: Open Register Link at Home Page");
		registerPage = homePage.ClickToRegisterLink();
		registerPageUrl = registerPage.getRegisterPageUrl();
		
	}

	
	public void Register_01_With_Empty_Data() {
		log.info("Register 01 - Step 02: Click to Register button at Register page");
		registerPage.clickToRegisterButton();

		log.info("Register 01 - Step 03: Verify error message displayed");
		verifyTrue(registerPage.errorMessageDisplayed("FirstName"));
		verifyTrue(registerPage.errorMessageDisplayed("LastName"));
		verifyTrue(registerPage.errorMessageDisplayed("Email"));
		verifyTrue(registerPage.errorMessageDisplayed("Password"));
		verifyTrue(registerPage.errorMessageDisplayed("ConfirmPassword"));

	}

	
	public void Register_02_With_Invalid_Email() {
		registerPage.openRegisterPageUrl(registerPageUrl);
		log.info("Register 02 - Step 01: Input to FirstName with value");
		registerPage.enterToFirstNameTextbox(firstName);

		log.info("Register 02 - Step 02: Input to LastName with value");
		registerPage.enterToLastNameTextbox(lastName);

		log.info("Register 02 - Step 03: Input to Email Textbox with value: testing@123");
		registerPage.enterToEmailTextbox("testing@123");

		log.info("Register 02 - Step 04: Input to Password Textbox with value: " + passwordTextbox);
		registerPage.enterToPasswordTextbox(passwordTextbox);
		registerPage.enterToConfirmPasswordTextbox(passwordTextbox);

		log.info("Register 02 - Step 05: Click to Register button at Register page");
		registerPage.clickToRegisterButton();

		log.info("Register 02 - Step 06: Verify 'Wrong email' error message displayed");
		verifyEquals(registerPage.isElementEquals("Wrong email"), "Wrong email");
	}
	
	@Test(groups = "register")
	public void Register_03_With_Valid_Data() {
		registerPage.openRegisterPageUrl(registerPageUrl);
		log.info("Register 03 - Step 02: Input to FirstName with value: " + firstName);
		registerPage.enterToFirstNameTextbox(firstName);

		log.info("Register 03 - Step 03: Input to LastName with value: " + lastName);
		registerPage.enterToLastNameTextbox(lastName);

		log.info("Register 03 - Step 04: Input to Email Textbox with value: " + emailAddress);
		registerPage.enterToEmailTextbox(emailAddress);

		log.info("Register 03 - Step 05: Input to Password Textbox with value: " + passwordTextbox);
		registerPage.enterToPasswordTextbox(passwordTextbox);
		registerPage.enterToConfirmPasswordTextbox(passwordTextbox);

		log.info("Register 03 - Step 06: Click to Register button at Register page");
		registerPage.clickToRegisterButton();

		log.info("Register 03 - Step 07: Verify Success message displayed");
		verifyTrue(registerPage.isSuccessMessageDisplayed());

		log.info("Register 03 - Step 09: Click to Continue button at Register page and navigate to Home page");
		homePage = registerPage.clickToContinueButton();
	}

	
	public void Register_04_With_Exists_Email() {
		registerPage.openRegisterPageUrl(registerPageUrl);
		log.info("Register 04 - Step 01: Open Register Link at Home Page");
		registerPage = homePage.ClickToRegisterLink();
		
		log.info("Register 04 - Step 02: Input to FirstName with value");
		registerPage.enterToFirstNameTextbox(firstName);

		log.info("Register 04 - Step 03: Input to LastName with value");
		registerPage.enterToLastNameTextbox(lastName);

		log.info("Register 04 - Step 04: Input to Email Textbox with value: " + emailAddress);
		registerPage.enterToEmailTextbox(emailAddress);

		log.info("Register 04 - Step 05: Input to Password Textbox with value: " + passwordTextbox);
		registerPage.enterToPasswordTextbox(passwordTextbox);
		registerPage.enterToConfirmPasswordTextbox(passwordTextbox);

		log.info("Register 04 - Step 06: Click to Register button at Register page");
		registerPage.clickToRegisterButton();

		log.info("Register 04 - Step 07: Verify 'The specified email already exists' error message displayed");
		verifyEquals(registerPage.isElementEquals("The specified email already exists"), "The specified email already exists");
	}

	
	public void Register_05_With_Invalid_Password() {
		registerPage.openRegisterPageUrl(registerPageUrl);
		log.info("Register 05 - Step 01: Input to 'Password' Textbox with value: 123");
		registerPage.enterToPasswordTextbox("123");
				
		log.info("Register 05 - Step 02: Click to Register button at Register page");
		registerPage.clickToRegisterButton();
		
		log.info("Register 05 - Step 03: Verify 'Invalid Password Error' displayed");
		verifyEquals(registerPage.isInvalidErrorPasswordMessageDisplayed(), "Password must meet the following rules:\n" + "must have at least 6 characters");

	}

	
	public void Register_06_With_ConfirmPassword_Not_Match() {
		registerPage.openRegisterPageUrl(registerPageUrl);
		log.info("Register 06 - Step 01: Input to 'Confirm Password' Textbox with value: '123456'");
		registerPage.enterToConfirmPasswordTextbox("123456");
		
		log.info("Register 06 - Step 02: Click to Register button at Register page");
		registerPage.clickToRegisterButton();
		
		log.info("Register 06 - Step 03: Verify 'Password Mismatch Error' displayed");
		verifyEquals(registerPage.isMismatchErrorConfirmPasswordMessageDisplayed(), "The password and confirmation password do not match.");

	}

	

	@AfterClass(alwaysRun=true)
	public void afterTest() {
		closeBrowserAndDriver();
	}

	HomePageObject homePage;
	RegisterPageObject registerPage;
}
