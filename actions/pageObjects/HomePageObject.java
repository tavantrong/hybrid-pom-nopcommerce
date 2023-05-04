package pageObjects;

import org.openqa.selenium.WebDriver;

import commons.BasePage;
import pageUIs.BasePageUI;
import pageUIs.HomePageUI;

public class HomePageObject extends BasePage{
	WebDriver driver;
	//PageGeneratorManager pageGenerator;
	
	public HomePageObject (WebDriver driver) {
		this.driver = driver;
		//pageGenerator = PageGeneratorManager.getPageGenerator();
	}
	
	
	public RegisterPageObject ClickToRegisterLink() {
		waitForElementClickable(driver, HomePageUI.REGISTER_LINKTEXT);
		clickToElement(driver, HomePageUI.REGISTER_LINKTEXT);
		return PageGeneratorManager.getRegisterPage(driver);
	}

	
	public boolean isMyAccountLinkDisplayed() {
		waitForElementVisible(driver, HomePageUI.MYACCOUNT_LINKTEXT);
		return isElementDisplayed(driver, HomePageUI.MYACCOUNT_LINKTEXT);
	}

	public LoginPageObject clickToLoginLink() {
		waitForElementClickable(driver, HomePageUI.LOGIN_LINKTEXT);
		clickToElement(driver, HomePageUI.LOGIN_LINKTEXT);
		return PageGeneratorManager.getLoginPage(driver);
	}

	public CustomerInfoPageObject clickToMyAccountLink() {
		waitForElementClickable(driver, HomePageUI.MYACCOUNT_LINKTEXT);
		clickToElement(driver, HomePageUI.MYACCOUNT_LINKTEXT);
		return PageGeneratorManager.getCustomerInfoPage(driver);
	}

	public void isRegisterLinkUndisplayed() {
		waitForElementInvisible(driver, HomePageUI.REGISTER_LINKTEXT);
		isElementUndisplayed(driver, HomePageUI.REGISTER_LINKTEXT);
	}

	public void isLoginLinkUndisplayed() {
		waitForElementInvisible(driver, HomePageUI.LOGIN_LINKTEXT);
		isElementUndisplayed(driver, HomePageUI.LOGIN_LINKTEXT);	
	}

	public void isShoppingCartNoItemTooltopUndisplayed() {
		waitForElementInvisible(driver, HomePageUI.SHOPPING_CART_NOITEM_TOOLTIP);
		isElementUndisplayed(driver, HomePageUI.SHOPPING_CART_NOITEM_TOOLTIP);
		
	}


	public boolean isCellPhonesTitlePageDisplayed() {
		waitForElementVisible(driver, HomePageUI.CATEGORY_PRODUCT_TITLE);
		return isElementDisplayed(driver, HomePageUI.CATEGORY_PRODUCT_TITLE);
	}


	public void clickToProductNameAtMainPage(String dynamicValue) {
		waitForElementClickable(driver, HomePageUI.DYNAMIC_PRODUCT_MAINPAGE_LINKTEXT, dynamicValue);
		clickToElement(driver, HomePageUI.DYNAMIC_PRODUCT_MAINPAGE_LINKTEXT, dynamicValue);
	}


	public boolean isHTCOneMiniPageDisplayed() {
		waitForElementClickable(driver, HomePageUI.DETAIL_PRODUCT_TITLE);
		return isElementDisplayed(driver, HomePageUI.DETAIL_PRODUCT_TITLE);
	}


	public void clickAddYourReviewLinkText(String dynamicValue) {
		waitForElementClickable(driver, HomePageUI.DYNAMIC_PRODUCT_DETAILS_LINKTEXT, dynamicValue);
		clickToElement(driver, HomePageUI.DYNAMIC_PRODUCT_DETAILS_LINKTEXT, dynamicValue);
	}


	public boolean isProductReviewForTitleDisplayed() {
		waitForElementVisible(driver, HomePageUI.TITLE_OF_ADD_REVIEW_FORM);
		return isElementDisplayed(driver, HomePageUI.TITLE_OF_ADD_REVIEW_FORM);
	}


	public void inputToReviewTitleWithValue(String keyValue) {
		waitForElementVisible(driver, HomePageUI.REVIEW_TITLE_TEXTBOX);
		sendkeyToElement(driver, HomePageUI.REVIEW_TITLE_TEXTBOX, keyValue);
	}


	public void inputToReviewTextWithValue(String keyValue) {
		waitForElementVisible(driver, HomePageUI.REVIEW_CONTENT_TEXTBOX);
		sendkeyToElement(driver, HomePageUI.REVIEW_CONTENT_TEXTBOX, keyValue);
	}


	public void clickToReviewRadioButton() {
		waitForElementClickable(driver, HomePageUI.GOOD_REVIEW_RADIO_BUTTON);
		clickToElement(driver, HomePageUI.GOOD_REVIEW_RADIO_BUTTON);
	}


	public void clickToSubmitReviewButton() {
		waitForElementClickable(driver, HomePageUI.SUBMIT_REVIEW_BUTTON);
		clickToElement(driver, HomePageUI.SUBMIT_REVIEW_BUTTON);
	}


	public boolean isReviewAddSuccessfullyNoticeDisplayed() {
		waitForElementVisible(driver, HomePageUI.SUCCESSFULLY_ADD_REVIEW_NOTICE);
		return isElementDisplayed(driver, HomePageUI.SUCCESSFULLY_ADD_REVIEW_NOTICE);
	}


	public Object getProductReviewTitle(String dynamicValue) {
		waitForElementVisible(driver, HomePageUI.RESULT_REVIEW_TITLE_FORM, dynamicValue);
		return getTextElement(driver, HomePageUI.RESULT_REVIEW_TITLE_FORM, dynamicValue);
	}


	public boolean isGoodReviewRatingDisplayed() {
		waitForElementVisible(driver, HomePageUI.RESULT_REVIEW_RATING_FORM);
		return isElementDisplayed(driver, HomePageUI.RESULT_REVIEW_RATING_FORM);
	}


	public String getReviewContentValue() {
		waitForElementVisible(driver, HomePageUI.RESULT_REVIEW_CONTENT_FORM);
		return getTextElement(driver, HomePageUI.RESULT_REVIEW_CONTENT_FORM);
	}


	public String getReviewUser() {
		waitForElementVisible(driver, HomePageUI.RESULT_REVIEW_USER_FORM);
		return getTextElement(driver, HomePageUI.RESULT_REVIEW_USER_FORM);
	}


	public void clickLogoutLinktext() {
		waitForElementClickable(driver, BasePageUI.LOG_OUT_LINKTEXT);
		clickToElement(driver, BasePageUI.LOG_OUT_LINKTEXT);
	}
}
