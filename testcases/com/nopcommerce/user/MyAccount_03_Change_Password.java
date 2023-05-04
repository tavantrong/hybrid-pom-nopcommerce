package com.nopcommerce.user;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.nopcommerce.common.Common_01_Register;

import commons.BaseTest;
import pageObjects.ChangePasswordPageObject;
import pageObjects.CustomerInfoPageObject;
import pageObjects.HomePageObject;
import pageObjects.LoginPageObject;
import pageObjects.PageGeneratorManager;

public class MyAccount_03_Change_Password extends BaseTest{
	WebDriver driver;
	HomePageObject homePage;
	LoginPageObject loginPage;
	CustomerInfoPageObject customerPage;
	ChangePasswordPageObject changePasswordPage;

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

		log.info("Pre-Condition - Step 05: Click to 'Addresses' tab");
		changePasswordPage = customerPage.openChangePasswordTabByText("Change password");
}
	
	@Test
	public void Change_Password_01_Submit_With_Empty_Data() {
		log.info("Password 01 - Step 01: Click to 'Change Password' button");
		changePasswordPage.clickToChangePasswordButton();
		
		log.info("Password 01 - Step 02: Verify 'Old password is required.' error message displayed");
		verifyEquals(changePasswordPage.getDynamicEmptyErrorAtChangePasswordPage("OldPassword"), "Old password is required.");
		
		log.info("Password 01 - Step 03: Verify 'Password is required.' error message displayed at 'New Password' field");
		verifyEquals(changePasswordPage.getDynamicEmptyErrorAtChangePasswordPage("NewPassword"), "Password is required.");

		log.info("Password 01 - Step 04: Verify 'Password is required.' error message displayed at 'Confirm New Password' field");
		verifyEquals(changePasswordPage.getDynamicEmptyErrorAtChangePasswordPage("ConfirmNewPassword"), "Password is required.");

	}
	
	@Test
	public void Change_Password_02_Incorrect_Old_Password() {
		log.info("Password 02 - Step 01: Reset all field at 'Change Password' page");
		changePasswordPage.reloadCurrentPage();

		log.info("Password 02 - Step 02: Input at 'Old Password' with value '123123'");
		changePasswordPage.sendkeyToDynamicTextboxWithValue("OldPassword", "123123");

		log.info("Password 02 - Step 03: Input at 'New Password' with value 'Newpass123'");
		changePasswordPage.sendkeyToDynamicTextboxWithValue("NewPassword", "Newpass123");

		log.info("Password 02 - Step 04: Input at 'Confirm New Password' with value 'Newpass123'");
		changePasswordPage.sendkeyToDynamicTextboxWithValue("ConfirmNewPassword", "Newpass123");

		log.info("Password 02 - Step 05: Click to 'Change Password' button");
		changePasswordPage.clickToChangePasswordButton();

		log.info("Password 02 - Step 06: Verify 'Old password doesn't match' error message displayed");
		verifyEquals(changePasswordPage.getIncorrectOldPasswordErrorAtChangePasswordPage(), "Old password doesn't match");

	}
	
	@Test
	public void Change_Password_03_Using_Old_Password() {
		log.info("Password 03 - Step 01: Reset all field at 'Change Password' page");
		changePasswordPage.reloadCurrentPage();

		log.info("Password 03 - Step 02: Input at 'Old Password' with value: " + Common_01_Register.passwordTextbox);
		changePasswordPage.sendkeyToDynamicTextboxWithValue("OldPassword", Common_01_Register.passwordTextbox);

		log.info("Password 03 - Step 03: Input at 'New Password' with value: " + Common_01_Register.passwordTextbox);
		changePasswordPage.sendkeyToDynamicTextboxWithValue("NewPassword", Common_01_Register.passwordTextbox);

		log.info("Password 03 - Step 04: Input at 'Confirm New Password' with value: " + Common_01_Register.passwordTextbox);
		changePasswordPage.sendkeyToDynamicTextboxWithValue("ConfirmNewPassword", Common_01_Register.passwordTextbox);

		log.info("Password 03 - Step 05: Click to 'Change Password' button");
		changePasswordPage.clickToChangePasswordButton();

		log.info("Password 03 - Step 06: Verify 'New Password' same with 'Old Password' error message displayed");
		verifyTrue(changePasswordPage.isConflictWithOldPasswordErrorAtChangePasswordPageDisplayed());

	}
	
	@Test
	public void Change_Password_04_Invalid_New_Password() {
		log.info("Password 04 - Step 01: Reset all field at 'Change Password' page");
		changePasswordPage.reloadCurrentPage();

		log.info("Password 04 - Step 02: Input at 'Old Password' with value: " + Common_01_Register.passwordTextbox);
		changePasswordPage.sendkeyToDynamicTextboxWithValue("OldPassword", Common_01_Register.passwordTextbox);

		log.info("Password 04 - Step 03: Input at 'New Password' with value: '123'");
		changePasswordPage.sendkeyToDynamicTextboxWithValue("NewPassword", "123");
		
		log.info("Password 04 - Step 04: Click to 'Change Password' button");
		changePasswordPage.clickToChangePasswordButton();

		log.info("Password 04 - Step 05: Verify 'must have at least 6 characters' error message displayed");
		verifyEquals(changePasswordPage.getInvalidPasswordErrorAtChangePasswordPage(), "must have at least 6 characters");

	}
	
	@Test
	public void Change_Password_05_Mismatch_New_Password() {
		log.info("Password 05 - Step 01: Reset all field at 'Change Password' page");
		changePasswordPage.reloadCurrentPage();

		log.info("Password 05 - Step 02: Input at 'Old Password' with value: " + Common_01_Register.passwordTextbox);
		changePasswordPage.sendkeyToDynamicTextboxWithValue("OldPassword", Common_01_Register.passwordTextbox);

		log.info("Password 05 - Step 03: Input at 'New Password' with value: '123123'");
		changePasswordPage.sendkeyToDynamicTextboxWithValue("NewPassword", "123123");

		log.info("Password 05 - Step 04: Input at 'Confirm New Password' with value: '12345678'");
		changePasswordPage.sendkeyToDynamicTextboxWithValue("ConfirmNewPassword", "12345678");
		
		log.info("Password 05 - Step 05: Click to 'Change Password' button");
		changePasswordPage.clickToChangePasswordButton();

		log.info("Password 05 - Step 06: Verify 'The new password and confirmation password do not match.' error message displayed");
		verifyEquals(changePasswordPage.getMismatchPasswordErrorAtChangePasswordPage(), "The new password and confirmation password do not match.");

	}
	
	@Test
	public void Change_Password_06_Submit_With_Valid_Data() {
		log.info("Password 06 - Step 01: Reset all field at 'Change Password' page");
		changePasswordPage.reloadCurrentPage();

		log.info("Password 06 - Step 02: Input at 'Old Password' with value: " + Common_01_Register.passwordTextbox);
		changePasswordPage.sendkeyToDynamicTextboxWithValue("OldPassword", Common_01_Register.passwordTextbox);

		log.info("Password 06 - Step 03: Input at 'New Password' with value: 'Newpass123'");
		changePasswordPage.sendkeyToDynamicTextboxWithValue("NewPassword", "Newpass123");

		log.info("Password 06 - Step 04: Input at 'Confirm New Password' with value: 'Newpass123'");
		changePasswordPage.sendkeyToDynamicTextboxWithValue("ConfirmNewPassword", "Newpass123");

		log.info("Password 06 - Step 05: Click to 'Change Password' button");
		changePasswordPage.clickToChangePasswordButton();
		
		log.info("Password 06 - Step 06: Verify 'Password was changed' notice displayed");
		changePasswordPage.isPasswordChangedDisplayed();
		
		log.info("Password 06 - Step 07: Close 'Password was changed' notice");
		changePasswordPage.closeChangePasswordSuccessNotice();

		log.info("Password 06 - Step 08: Click 'Log Out' linktext");
		homePage = changePasswordPage.clickToLogOutLinktext();
		
		log.info("Password 06 - Step 09: Click 'Log In' linktext");
		loginPage = homePage.clickToLoginLink();

		log.info("Password 06 - Step 10: Input Email and 'New Password' with value: 'Newpass123'");
		loginPage.enterToEmailTextbox(Common_01_Register.emailAddress);
		loginPage.enterToPasswordTextbox("Newpass123");
		
		log.info("Password 06 - Step 11: Click to 'Login' button at Login page");
		homePage = loginPage.clickToLoginButton();

		log.info("Password 06 - Step 12: Verify 'My Account' link displayed");
		verifyTrue(homePage.isMyAccountLinkDisplayed());

	}
	
	
	
	
	
	@AfterClass(alwaysRun=true)
	public void afterClass() {
		log.info("Log out account");
		homePage.clickLogoutLinktext();
		closeBrowserAndDriver();
	}
}
