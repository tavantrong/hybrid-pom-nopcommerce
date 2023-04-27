package com.nopcommerce.product;

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

public class Sort_01_Product extends BaseTest{
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
		
		newEmailAddress = "selenium" + getRandomNumber() + "@gmail.com";
		
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
	public void Customer_02_Update_Info_With_Empty_Data() {
		
		log.info("Customer 02 - Step 01: Update 'First Name' with empty data");
		customerPage.sendKeyToFirstNameAtCustomerInfoPageWithValue("");
		
		log.info("Customer 02 - Step 02: Update 'Last Name' with empty data");
		customerPage.sendKeyToLastNameAtCustomerInfoPageWithValue("");
		
		log.info("Customer 02 - Step 03: Update 'Email' with empty data");
		customerPage.sendKeyToEmailAtCustomerInfoPageWithValue("");

		log.info("Customer 02 - Step 04: Click to 'Save' button");
		customerPage.clickToSaveButtonAtCustomerPage();
		
		log.info("Customer 02 - Step 05: Verify 'First name is required.' message displayed");
		verifyEquals(customerPage.getEmptyErrorMessageAtCustomerInfoPage("FirstName"), "First name is required.");
		
		log.info("Customer 02 - Step 06: Verify 'Last name is required.' message displayed");
		verifyEquals(customerPage.getEmptyErrorMessageAtCustomerInfoPage("LastName"), "Last name is required.");
		
		log.info("Customer 02 - Step 07: Verify 'Email is required.' message displayed");
		verifyEquals(customerPage.getEmptyErrorMessageAtCustomerInfoPage("Email"), "Email is required.");

	}
	
	@Test
	public void Customer_03_Update_Info_With_Invalid_Email() {
		log.info("Customer 03 - Step 01: Update 'First Name' with new value 'Automation'");
		customerPage.sendKeyToFirstNameAtCustomerInfoPageWithValue("Automation");
		
		log.info("Customer 03 - Step 02: Update 'Last Name' with new value 'Selenium'");
		customerPage.sendKeyToLastNameAtCustomerInfoPageWithValue("Selenium");
		
		log.info("Customer 03 - Step 03: Update 'Email' with new value: 'selenium'");
		customerPage.sendKeyToEmailAtCustomerInfoPageWithValue("selenium");
		
		log.info("Customer 03 - Step 04: Verify 'Wrong email' message displayed");
		verifyEquals(customerPage.getWrongEmailMessageAtCustomerInfoPage(), "Wrong email");
		
		log.info("Customer 03 - Step 05: Update 'Email' with new value: 'selenium@testing'");
		customerPage.sendKeyToEmailAtCustomerInfoPageWithValue("selenium@testing");
		
		log.info("Customer 03 - Step 06: Click to 'Save' button");
		customerPage.clickToSaveButtonAtCustomerPage();
		
		log.info("Customer 03 - Step 07: Verify 'New email is not valid' displayed");
		verifyEquals(customerPage.getIncorrectEmailErrorMessageAtCustomerInfoPage(), "New email is not valid");
	}
	
	@Test
	public void Customer_04_Update_Info_With_Valid_Data() {
		log.info("Customer 04 - Step 01: Update 'First Name' with new value 'Automation'");
		customerPage.sendKeyToFirstNameAtCustomerInfoPageWithValue("Automation");
		
		log.info("Customer 04 - Step 02: Update 'Last Name' with new value 'Selenium'");
		customerPage.sendKeyToLastNameAtCustomerInfoPageWithValue("Selenium");
		
		log.info("Customer 04 - Step 02: Update 'Day/ Month/ Year ' with new value '19/03/1987'");
		customerPage.selectDayInDropdownList("Day", "19");
		customerPage.selectMonthInDropdownList("Month", "March");
		customerPage.selectYearInDropdownList("Year", "1987");

		log.info("Customer 04 - Step 03: Update 'Email' with new value: " + newEmailAddress);
		customerPage.sendKeyToEmailAtCustomerInfoPageWithValue(newEmailAddress);
		
		log.info("Customer 04 - Step 04: Click to 'Save' button");
		customerPage.clickToSaveButtonAtCustomerPage();
		
		log.info("Customer 04 - Step 05: Verify new 'First Name' with value 'Automation' update successfully");
		verifyEquals(customerPage.getFirstNameValueAtCustomerPage(), "Automation");
		
		log.info("Customer 04 - Step 06: Verify new 'Last Name' with value 'Selenium' update successfully");
		verifyEquals(customerPage.getLastNameValueAtCustomerPage(), "Selenium");
		
		log.info("Customer 04 - Step 07: Verify new 'Email' with value: " + newEmailAddress + " update successfully");
		verifyEquals(customerPage.getEmailValueAtCustomerPage(), newEmailAddress);
		
		log.info("Customer 04 - Step 08: Verify 'Date Of Birth Day' with value: '19' update successfully");
		verifyEquals(customerPage.getDaySelectedItemInDropdownAtCuatomerInfoPage(), "19");
		
		log.info("Customer 04 - Step 09: Verify 'Date Of Birth Month' with value: 'March' update successfully");
		verifyEquals(customerPage.getMonthSelectedItemInDropdownAtCuatomerInfoPage("Month"), "March");
		
		log.info("Customer 04 - Step 10: Verify 'Date Of Birth Year' with value: '1987' update successfully");
		verifyEquals(customerPage.getYearSelectedItemInDropdownAtCuatomerInfoPage(), "1987");
		

	}
	
	
	
	
	
	@AfterClass(alwaysRun=true)
	public void afterClass() {
		closeBrowserAndDriver();
	}
}
