package pageObjects;

import org.openqa.selenium.WebDriver;

import commons.BasePage;
import pageUIs.AddressPageUI;
import pageUIs.BasePageUI;

public class AddressPageObject extends BasePage{
	WebDriver driver;
	
	public AddressPageObject (WebDriver driver) {
		this.driver = driver;
	}

	public void clickToAddNewButton() {
		waitForElementClickable(driver, AddressPageUI.ADD_NEW_BUTTON);
		clickToElement(driver, AddressPageUI.ADD_NEW_BUTTON);
		
	}

	public void clickToSaveButton() {
		waitForElementClickable(driver, AddressPageUI.SAVE_BUTTON);
		clickToElement(driver, AddressPageUI.SAVE_BUTTON);
		
	}

	public String getEmptyErrorMessageAtAddressPage(String dynamicValue) {
		waitForElementVisible(driver, AddressPageUI.DYNAMIC_ERROR_BY_EMPTY_DATA, dynamicValue);
		return getTextElement(driver, AddressPageUI.DYNAMIC_ERROR_BY_EMPTY_DATA, dynamicValue);
	}

	public void sendKeyToDynamicTextboxAtAddressPageWithValue(String dynamicValue, String sendkeyValue) {
		waitForElementVisible(driver, AddressPageUI.DYNAMIC_TEXTBOX_BY_ID, dynamicValue);
		sendkeyToElement(driver, AddressPageUI.DYNAMIC_TEXTBOX_BY_ID, sendkeyValue, dynamicValue);
	}

	public String getWrongEmailErrorMessage() {
		waitForElementVisible(driver, AddressPageUI.WRONG_EMAIL_MSG_AT_ADDRESS_PAGE);
		return getTextElement(driver, AddressPageUI.WRONG_EMAIL_MSG_AT_ADDRESS_PAGE);
	}

	public String getNewAddressResultInAddressPage(String dynamicValue) {
		waitForElementVisible(driver, AddressPageUI.DYNAMIC_ADDRESS_RESULT_AT_ADDRESS_LIST, dynamicValue);
		return getTextElement(driver, AddressPageUI.DYNAMIC_ADDRESS_RESULT_AT_ADDRESS_LIST, dynamicValue);
	}

	public void clickEditButtonAtAddressList() {
		waitForElementClickable(driver, AddressPageUI.EDIT_BUTTON_AT_ADDRESS_PAGE);
		clickToElement(driver, AddressPageUI.EDIT_BUTTON_AT_ADDRESS_PAGE);
	}

	public void selectCountryInDropdownButton(String dropdownName) {
		waitForElementClickable(driver, AddressPageUI.COUNTRY_DROPDOWN_BUTTON_AT_ADDRESS_PAGE, dropdownName);
		selectItemInDropdown(driver, AddressPageUI.COUNTRY_DROPDOWN_BUTTON_AT_ADDRESS_PAGE, dropdownName);
	}

	public void clickDeleteButtonAtAddressList() {
		waitForElementClickable(driver, AddressPageUI.DELETE_BUTTON_AT_ADDRESS_PAGE);
		clickToElement(driver, AddressPageUI.DELETE_BUTTON_AT_ADDRESS_PAGE);
	}

	public boolean isNoAddressesTextDisplayed() {
		waitForElementVisible(driver, AddressPageUI.NO_ADDRESS_TEXT_AT_ADDRESS_PAGE);
		return isElementDisplayed(driver, AddressPageUI.NO_ADDRESS_TEXT_AT_ADDRESS_PAGE);
	}

	public void clickOKAtPopup() {
		confirmOKAtAlert(driver);
	}

	public void clickLogoutLinktext() {
		waitForElementClickable(driver, BasePageUI.LOG_OUT_LINKTEXT);
		clickToElement(driver, BasePageUI.LOG_OUT_LINKTEXT);
	}



	
	
}
