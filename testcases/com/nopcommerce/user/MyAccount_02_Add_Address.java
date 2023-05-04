package com.nopcommerce.user;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.nopcommerce.common.Common_01_Register;

import commons.BaseTest;
import commons.DataHelper;
import pageObjects.AddressPageObject;
import pageObjects.CustomerInfoPageObject;
import pageObjects.HomePageObject;
import pageObjects.LoginPageObject;
import pageObjects.PageGeneratorManager;

public class MyAccount_02_Add_Address extends BaseTest {
	WebDriver driver;
	HomePageObject homePage;
	CustomerInfoPageObject customerPage;
	LoginPageObject loginPage;
	AddressPageObject addressPage;
	DataHelper dataTest;
	String firstName, lastName, emailAdress, streetAddress, city, zipCode, phoneNumber, company;

	@Parameters({ "browser", "url" })
	@BeforeClass
	public void beforeClass(String browserName, String urlValue) {
		driver = getBrowserDriver(browserName, urlValue);
		dataTest = DataHelper.getData();
		homePage = PageGeneratorManager.getHomePage(driver);

		firstName = dataTest.getFirstName();
		lastName = dataTest.getLastName();;
		emailAdress = dataTest.getEmail();
		streetAddress = dataTest.getStreetAddress();
		city = dataTest.getCity();
		company = dataTest.getCompany();
		zipCode = dataTest.getZipCode();
		phoneNumber = dataTest.getPhoneNumber();

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

		log.info("Pre-Condition - Step 05: Click to 'Addresses' tab");
		addressPage = customerPage.openAddressTabByText("Addresses");
	}

	@Test
	public void Address_01_Submit_Address_With_Empty_Data() {
		log.info("Address 01 - Step 01: Click to 'Add New' button");
		addressPage.clickToAddNewButton();
		
		log.info("Address 01 - Step 02: Click to 'Save' button");
		addressPage.clickToSaveButton();
		
		log.info("Address 01 - Step 03: Verify 'First name is required.' error message displayed");
		verifyEquals(addressPage.getEmptyErrorMessageAtAddressPage("FirstName"), "First name is required.");
		
		log.info("Address 01 - Step 04: Verify 'Last name is required.' error message displayed");
		verifyEquals(addressPage.getEmptyErrorMessageAtAddressPage("LastName"), "Last name is required.");

		log.info("Address 01 - Step 05: Verify 'Email is required.' error message displayed");
		verifyEquals(addressPage.getEmptyErrorMessageAtAddressPage("Email"), "Email is required.");

		log.info("Address 01 - Step 06: Verify 'City is required' error message displayed");
		verifyEquals(addressPage.getEmptyErrorMessageAtAddressPage("City"), "City is required");

		log.info("Address 01 - Step 07: Verify 'Street address is required' error message displayed");
		verifyEquals(addressPage.getEmptyErrorMessageAtAddressPage("Address1"), "Street address is required");

		log.info("Address 01 - Step 08: Verify 'Zip / postal code is required' error message displayed");
		verifyEquals(addressPage.getEmptyErrorMessageAtAddressPage("ZipPostalCode"), "Zip / postal code is required");

		log.info("Address 01 - Step 09: Verify 'Phone is required' error message displayed");
		verifyEquals(addressPage.getEmptyErrorMessageAtAddressPage("PhoneNumber"), "Phone is required");

	}

	@Test
	public void Address_02_Submit_Address_With_Data() {
		log.info("Address 02 - Step 01: Input 'First Name' with new value: " + firstName);
		addressPage.sendKeyToDynamicTextboxAtAddressPageWithValue("FirstName", firstName);
		
		log.info("Address 02 - Step 02: Input 'Last Name' with new value: " + lastName);
		addressPage.sendKeyToDynamicTextboxAtAddressPageWithValue("LastName",lastName);
		
		log.info("Address 02 - Step 03: Input 'Email' with new value: 'automationtesting'");
		addressPage.sendKeyToDynamicTextboxAtAddressPageWithValue("Email","automationtesting");
		
		log.info("Address 02 - Step 04: Verifi 'Wrong email' error message displayed");
		verifyEquals(addressPage.getWrongEmailErrorMessage(), "Wrong email");
		
		log.info("Address 02 - Step 05: Input 'Email' with new value: " + emailAdress);
		addressPage.sendKeyToDynamicTextboxAtAddressPageWithValue("Email", emailAdress);
		
		log.info("Address 02 - Step 06: Input 'City' with new value: " + city);
		addressPage.sendKeyToDynamicTextboxAtAddressPageWithValue("City",city);
		
		log.info("Address 02 - Step 07: Input 'Street Address' with new value: " + streetAddress);
		addressPage.sendKeyToDynamicTextboxAtAddressPageWithValue("Address1",streetAddress);
		
		log.info("Address 02 - Step 08: Input 'Zip Postal Code' with new value: " + zipCode);
		addressPage.sendKeyToDynamicTextboxAtAddressPageWithValue("ZipPostalCode", zipCode);
		
		log.info("Address 02 - Step 09: Input 'Phone Number' with new value: " + phoneNumber);
		addressPage.sendKeyToDynamicTextboxAtAddressPageWithValue("PhoneNumber", phoneNumber);
		
		log.info("Address 02 - Step 10: Click to 'Save' button");
		addressPage.clickToSaveButton();
		
		log.info("Address 02 - Step 11: Verify 'Full Name' match with: " + firstName + " " + lastName);
		verifyEquals(addressPage.getNewAddressResultInAddressPage("name"), firstName + " " + lastName);

		log.info("Address 02 - Step 12: Verify 'Email' match with: " + emailAdress);
		verifyEquals(addressPage.getNewAddressResultInAddressPage("email"), "Email: " + emailAdress);
		
		log.info("Address 02 - Step 13: Verify 'Street Address' match with: " + streetAddress);
		verifyEquals(addressPage.getNewAddressResultInAddressPage("address1"), streetAddress);

		log.info("Address 02 - Step 14: Verify 'City & Zip Postal Code' match with: " + city + ", " + zipCode);
		verifyEquals(addressPage.getNewAddressResultInAddressPage("city-state-zip"), city + ", " + zipCode);

		log.info("Address 02 - Step 15: Verify 'Phone Number' match with: " + phoneNumber);
		verifyEquals(addressPage.getNewAddressResultInAddressPage("phone"), "Phone number: " + phoneNumber);

	}

	@Test
	public void Address_03_Edit_Update_Address_With_New_Data() {
		log.info("Address 03 - Step 01: Click at 'Edit' button at 'Address List'");
		addressPage.clickEditButtonAtAddressList();
		
		log.info("Address 03 - Step 02: Input 'Company' textbox with value: " + company);
		addressPage.sendKeyToDynamicTextboxAtAddressPageWithValue("Company", company);
		
		log.info("Address 03 - Step 03: Select 'Country' dropdown with value 'Viet Nam'");
		addressPage.selectCountryInDropdownButton("Viet Nam");
		
		log.info("Address 03 - Step 04: Click 'Save' button");
		addressPage.clickToSaveButton();
		
		log.info("Address 03 - Step 05: Verify 'Company' match with: " + company);
		verifyEquals(addressPage.getNewAddressResultInAddressPage("address1"), streetAddress);
		
		log.info("Address 03 - Step 06: Verify 'Country' is 'Viet Nam'");
		verifyEquals(addressPage.getNewAddressResultInAddressPage("country"), "Viet Nam");

	}

	@Test
	public void Address_04_Delete_Address() {
		log.info("Address 04 - Step 01: Click at 'Delte' button at 'Address List'");
		addressPage.clickDeleteButtonAtAddressList();
		
		log.info("Address 04 - Step 01: Click 'OK' button at 'Are you sure?' alert");
		addressPage.clickOKAtPopup();
		
		log.info("Address 04 - Step 01: Verify 'No Addresses' text displayed");
		verifyTrue(addressPage.isNoAddressesTextDisplayed());
	}

	@AfterClass(alwaysRun = true)
	public void afterClass() {
		log.info("Log out account");
		addressPage.clickLogoutLinktext();
		closeBrowserAndDriver();
	}
}
