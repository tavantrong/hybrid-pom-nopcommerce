package pageObjects;

import org.openqa.selenium.WebDriver;

import commons.BasePage;
import pageUIs.BasePageUI;
import pageUIs.CustomerInfoPageUI;

public class CustomerInfoPageObject extends BasePage{
	WebDriver driver;
	
	public CustomerInfoPageObject (WebDriver driver) {
		this.driver = driver;
	}

	public String getFirstNameValueAtCustomerPage() {
		waitForElementVisible(driver, CustomerInfoPageUI.FIRSTNAME_TEXTBOX);
		return getElementAttributeValue(driver, CustomerInfoPageUI.FIRSTNAME_TEXTBOX);
		
	}

	public String getLastNameValueAtCustomerPage() {
		waitForElementVisible(driver, CustomerInfoPageUI.LASTNAME_TEXTBOX);
		return getElementAttributeValue(driver, CustomerInfoPageUI.LASTNAME_TEXTBOX);
		
	}

	public String getEmailValueAtCustomerPage() {
		waitForElementVisible(driver, CustomerInfoPageUI.EMAIL_TEXTBOX);
		return getElementAttributeValue(driver, CustomerInfoPageUI.EMAIL_TEXTBOX);
		
	}

	public void sendKeyToFirstNameAtCustomerInfoPageWithValue(String keyValue) {
		waitForElementVisible(driver, CustomerInfoPageUI.FIRSTNAME_TEXTBOX);
		sendkeyToElement(driver, CustomerInfoPageUI.FIRSTNAME_TEXTBOX, keyValue);
		
	}

	public void sendKeyToLastNameAtCustomerInfoPageWithValue(String keyValue) {
		waitForElementVisible(driver, CustomerInfoPageUI.LASTNAME_TEXTBOX);
		sendkeyToElement(driver, CustomerInfoPageUI.LASTNAME_TEXTBOX, keyValue);
		
	}

	public void sendKeyToEmailAtCustomerInfoPageWithValue(String keyValue) {
		waitForElementVisible(driver, CustomerInfoPageUI.EMAIL_TEXTBOX);
		sendkeyToElement(driver, CustomerInfoPageUI.EMAIL_TEXTBOX, keyValue);
		
	}

	public void clickToSaveButtonAtCustomerPage() {
		waitForElementClickable(driver, CustomerInfoPageUI.SAVE_BUTTON);
		clickToElement(driver, CustomerInfoPageUI.SAVE_BUTTON);
		
	}

	public String getEmptyErrorMessageAtCustomerInfoPage(String dynamicValue) {
		waitForElementVisible(driver, CustomerInfoPageUI.DYNAMIC_EMPTY_ERROR_MESSAGE_AT_CUSTOMER_INFO, dynamicValue);
		return getTextElement(driver, CustomerInfoPageUI.DYNAMIC_EMPTY_ERROR_MESSAGE_AT_CUSTOMER_INFO, dynamicValue);
	}

	public String getIncorrectEmailErrorMessageAtCustomerInfoPage() {
		waitForElementVisible(driver, CustomerInfoPageUI.INCORRECT_EMAIL_MSG_AT_CUSTOMER_INFO);
		return getTextElement(driver, CustomerInfoPageUI.INCORRECT_EMAIL_MSG_AT_CUSTOMER_INFO);
	}

	public void selectDayInDropdownList(String dropdownName, String valueItem) {
		waitForElementClickable(driver, CustomerInfoPageUI.DYNAMIC_SELECT_CALENDAR_DROPDOWN, dropdownName);
		selectItemInDropdown(driver, CustomerInfoPageUI.DYNAMIC_SELECT_CALENDAR_DROPDOWN, valueItem, dropdownName);
		
	}

	public void selectMonthInDropdownList(String dropdownName, String valueItem) {
		waitForElementClickable(driver, CustomerInfoPageUI.DYNAMIC_SELECT_CALENDAR_DROPDOWN, dropdownName);
		selectItemInDropdown(driver, CustomerInfoPageUI.DYNAMIC_SELECT_CALENDAR_DROPDOWN, valueItem, dropdownName);
		
	}

	public void selectYearInDropdownList(String dropdownName, String valueItem) {
		waitForElementClickable(driver, CustomerInfoPageUI.DYNAMIC_SELECT_CALENDAR_DROPDOWN, dropdownName);
		selectItemInDropdown(driver, CustomerInfoPageUI.DYNAMIC_SELECT_CALENDAR_DROPDOWN, valueItem, dropdownName);
		
	}

	public String getWrongEmailMessageAtCustomerInfoPage() {
		waitForElementVisible(driver, CustomerInfoPageUI.WRONG_EMAIL_MSG_AT_CUSTOMER_INFO);
		return getTextElement(driver, CustomerInfoPageUI.WRONG_EMAIL_MSG_AT_CUSTOMER_INFO);
	}

	public String getDaySelectedItemInDropdownAtCuatomerInfoPage() {
		waitForElementVisible(driver, CustomerInfoPageUI.DYNAMIC_SELECT_CALENDAR_DROPDOWN, "Day");
		return getElementAttributeValue(driver, CustomerInfoPageUI.DYNAMIC_SELECT_CALENDAR_DROPDOWN, "Day");
	}

	public String getMonthSelectedItemInDropdownAtCuatomerInfoPage(String dropdownName) {
		waitForElementVisible(driver, CustomerInfoPageUI.DYNAMIC_SELECT_CALENDAR_DROPDOWN, dropdownName);
		return getSelectedItemInDropdown(driver, CustomerInfoPageUI.DYNAMIC_SELECT_CALENDAR_DROPDOWN, dropdownName);
	}

	public String getYearSelectedItemInDropdownAtCuatomerInfoPage() {
		waitForElementVisible(driver, CustomerInfoPageUI.DYNAMIC_SELECT_CALENDAR_DROPDOWN, "Year");
		return getElementAttributeValue(driver, CustomerInfoPageUI.DYNAMIC_SELECT_CALENDAR_DROPDOWN, "Year");
	}

	public AddressPageObject openAddressTabByText(String dynamicValue) {
		waitForElementClickable(driver, BasePageUI.DYNAMIC_MYACCOUNT_LINKNAME_TAB, dynamicValue);
		clickToElement(driver, BasePageUI.DYNAMIC_MYACCOUNT_LINKNAME_TAB, dynamicValue);
		return PageGeneratorManager.getAddressPage(driver);
	}

	public ChangePasswordPageObject openChangePasswordTabByText(String dynamicValue) {
		waitForElementClickable(driver, BasePageUI.DYNAMIC_MYACCOUNT_LINKNAME_TAB, dynamicValue);
		clickToElement(driver, BasePageUI.DYNAMIC_MYACCOUNT_LINKNAME_TAB, dynamicValue);
		return PageGeneratorManager.getChangePasswordPage(driver);
	}

	public MyReviewPageObject openMyReviewTabByText(String dynamicValue) {
		waitForElementClickable(driver, BasePageUI.DYNAMIC_MYACCOUNT_LINKNAME_TAB, dynamicValue);
		clickToElement(driver, BasePageUI.DYNAMIC_MYACCOUNT_LINKNAME_TAB, dynamicValue);
		return PageGeneratorManager.getReviewPage(driver);
	}

	public void clickLogoutLinktext() {
		waitForElementClickable(driver, BasePageUI.LOG_OUT_LINKTEXT);
		clickToElement(driver, BasePageUI.LOG_OUT_LINKTEXT);
	}



	
}
