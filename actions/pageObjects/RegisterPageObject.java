package pageObjects;

import org.openqa.selenium.WebDriver;

import commons.BasePage;
import pageUIs.RegisterPageUI;

public class RegisterPageObject extends BasePage{
	WebDriver driver;
	
	public RegisterPageObject (WebDriver driver) {
		this.driver = driver;
	}

	public void enterToFirstNameTextbox(String firstName) {
		waitForElementVisible(driver, RegisterPageUI.FIRSTNAME_TEXTBOX);
		sendkeyToElement(driver, RegisterPageUI.FIRSTNAME_TEXTBOX, firstName);
		
	}

	public void enterToLastNameTextbox(String lastName) {
		waitForElementVisible(driver, RegisterPageUI.LASTNAME_TEXTBOX);
		sendkeyToElement(driver, RegisterPageUI.LASTNAME_TEXTBOX, lastName);
		
	}

	public void enterToEmailTextbox(String emailTextbox) {
		waitForElementVisible(driver, RegisterPageUI.EMAIL_TEXTBOX);
		sendkeyToElement(driver, RegisterPageUI.EMAIL_TEXTBOX, emailTextbox);
		
	}

	public void enterToPasswordTextbox(String password) {
		waitForElementVisible(driver, RegisterPageUI.PASSWORD_TEXTBOX);
		sendkeyToElement(driver, RegisterPageUI.PASSWORD_TEXTBOX, password);
		
	}

	public void enterToConfirmPasswordTextbox(String password) {
		waitForElementVisible(driver, RegisterPageUI.CONFIRM_PASSWORD_TEXTBOX);
		sendkeyToElement(driver, RegisterPageUI.CONFIRM_PASSWORD_TEXTBOX, password);
		
	}

	public void clickToRegisterButton() {
		waitForElementClickable(driver, RegisterPageUI.REGISTER_BUTTON);
		clickToElement(driver, RegisterPageUI.REGISTER_BUTTON);
		
	}

	public boolean isSuccessMessageDisplayed() {
		waitForElementVisible(driver, RegisterPageUI.REGISTERED_SUCCESS_MSG);
		return isElementDisplayed(driver, RegisterPageUI.REGISTERED_SUCCESS_MSG);
		
	}

	public HomePageObject clickToContinueButton() {
		waitForElementClickable(driver, RegisterPageUI.CONTINUE_BUTTON);
		clickToElement(driver, RegisterPageUI.CONTINUE_BUTTON);
		return PageGeneratorManager.getHomePage(driver);
		
	}

	public boolean errorMessageDisplayed(String dynamicValue) {
		waitForElementVisible(driver, RegisterPageUI.DYNAMIC_EMPTY_ERROR_MSG_AT_REGISTER_FORM, dynamicValue);
		return isElementDisplayed(driver, RegisterPageUI.DYNAMIC_EMPTY_ERROR_MSG_AT_REGISTER_FORM, dynamicValue);
				
	}

	public String isElementEquals(String dynamicValue) {
		waitForElementVisible(driver, RegisterPageUI.DYNAMIC_ERROR_EMAIL_AT_REGISTER_FORM, dynamicValue);
		return getTextElement(driver, RegisterPageUI.DYNAMIC_ERROR_EMAIL_AT_REGISTER_FORM, dynamicValue);
	}

	public String isInvalidErrorPasswordMessageDisplayed() {
		waitForElementVisible(driver, RegisterPageUI.INVALID_PASSWORD_AT_REGISTER_FORM);
		return getTextElement(driver, RegisterPageUI.INVALID_PASSWORD_AT_REGISTER_FORM);
	}

	public String isMismatchErrorConfirmPasswordMessageDisplayed() {
		waitForElementVisible(driver, RegisterPageUI.MISMATCH_CONFIRM_PASSWORD_ERROR_AT_REGISTER_FORM);
		return getTextElement(driver, RegisterPageUI.MISMATCH_CONFIRM_PASSWORD_ERROR_AT_REGISTER_FORM);
	}

	public String getRegisterPageUrl() {
		return getCurrentUrl(driver);
		
	}

	public void openRegisterPageUrl(String pageUrl) {
		openUrl(driver, pageUrl);
	}

	
}
