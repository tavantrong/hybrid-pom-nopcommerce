package pageObjects;

import org.openqa.selenium.WebDriver;

import commons.BasePage;
import pageUIs.ChangePasswordPageUI;

public class ChangePasswordPageObject extends BasePage{
	WebDriver driver;
	
	public ChangePasswordPageObject (WebDriver driver) {
		this.driver = driver;
	}

	public void clickToChangePasswordButton() {
		waitForElementClickable(driver, ChangePasswordPageUI.CHANGE_PASSWORD_BUTTON);
		clickToElement(driver, ChangePasswordPageUI.CHANGE_PASSWORD_BUTTON);
	}

	public Object getDynamicEmptyErrorAtChangePasswordPage(String dynamicValue) {
		waitForElementVisible(driver, ChangePasswordPageUI.DYNAMIC_EMPTY_ERROR_MSG_AT_CHANGE_PASSWORD, dynamicValue);
		return getTextElement(driver, ChangePasswordPageUI.DYNAMIC_EMPTY_ERROR_MSG_AT_CHANGE_PASSWORD, dynamicValue);
	}

	public void reloadCurrentPage() {
		refreshPage(driver);
	}

	public void sendkeyToDynamicTextboxWithValue(String dynamicValue, String keyValue) {
		waitForElementVisible(driver, ChangePasswordPageUI.DYNAMIC_TEXTBOX_AT_CHANGE_PASSWORD_PAGE, dynamicValue);
		sendkeyToElement(driver, ChangePasswordPageUI.DYNAMIC_TEXTBOX_AT_CHANGE_PASSWORD_PAGE, keyValue, dynamicValue);
	}

	public Object getIncorrectOldPasswordErrorAtChangePasswordPage() {
		waitForElementVisible(driver, ChangePasswordPageUI.WRONG_OLD_PASSWORD_MSG_AT_CHANGE_PASSWORD);
		return getTextElement(driver, ChangePasswordPageUI.WRONG_OLD_PASSWORD_MSG_AT_CHANGE_PASSWORD);
	}

	public boolean isConflictWithOldPasswordErrorAtChangePasswordPageDisplayed() {
		waitForElementVisible(driver, ChangePasswordPageUI.EXISTS_PASSWORD_MSG_AT_CHANGE_PASSWORD);
		return isElementDisplayed(driver, ChangePasswordPageUI.EXISTS_PASSWORD_MSG_AT_CHANGE_PASSWORD);
	}

	public Object getInvalidPasswordErrorAtChangePasswordPage() {
		waitForElementVisible(driver, ChangePasswordPageUI.INVALID_PASSWORD_MSG_AT_CHANGE_PASSWORD);
		return getTextElement(driver, ChangePasswordPageUI.INVALID_PASSWORD_MSG_AT_CHANGE_PASSWORD);
	}

	public Object getMismatchPasswordErrorAtChangePasswordPage() {
		waitForElementVisible(driver, ChangePasswordPageUI.MISMATCH_PASSWORD_MSG_AT_CHANGE_PASSWORD);
		return getTextElement(driver, ChangePasswordPageUI.MISMATCH_PASSWORD_MSG_AT_CHANGE_PASSWORD);
	}

	public boolean isPasswordChangedDisplayed() {
		waitForElementVisible(driver, ChangePasswordPageUI.SUCCESS_CHANGE_PASSWORD_NOTICE);
		return isElementDisplayed(driver, ChangePasswordPageUI.SUCCESS_CHANGE_PASSWORD_NOTICE);
	}

	public HomePageObject clickToLogOutLinktext() {
		waitForElementClickable(driver, ChangePasswordPageUI.LOG_OUT_LINKTEXT);
		clickToElement(driver, ChangePasswordPageUI.LOG_OUT_LINKTEXT);
		return PageGeneratorManager.getHomePage(driver);
	}

	public void closeChangePasswordSuccessNotice() {
		clickToElementByJS(driver, ChangePasswordPageUI.CLOSE_SUCCESS_CHANGE_PASSWORD_NOTICE);
	}

	
	
}
