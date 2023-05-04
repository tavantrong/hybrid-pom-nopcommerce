package pageObjects;

import org.openqa.selenium.WebDriver;

import commons.BasePage;
import pageUIs.BasePageUI;
import pageUIs.MyReviewPageUI;

public class MyReviewPageObject extends BasePage{
	WebDriver driver;
	
	public MyReviewPageObject (WebDriver driver) {
		this.driver = driver;
	}

	public Object getNoReviewNoticeInReviewPage() {
		waitForElementVisible(driver, MyReviewPageUI.NO_REVIEW_NOTICE_AT_MY_REVIEW_PAGE);
		return getTextElement(driver, MyReviewPageUI.NO_REVIEW_NOTICE_AT_MY_REVIEW_PAGE);
	}

	public void hoverMouseToDynamicMenu(String dynamicValue) {
		waitForElementClickable(driver, BasePageUI.DYNAMIC_TOP_MENU_PRODUCT_LINKTEXT, dynamicValue);
		hoverToElement(driver, BasePageUI.DYNAMIC_TOP_MENU_PRODUCT_LINKTEXT, dynamicValue);
	}

	public HomePageObject clickToDropdownDynamicMenuLinktext(String dynamicValue) {
		waitForElementClickable(driver, BasePageUI.DYNAMIC_TOP_MENU_PRODUCT_LINKTEXT, dynamicValue);
		 clickToElement(driver, BasePageUI.DYNAMIC_TOP_MENU_PRODUCT_LINKTEXT, dynamicValue);
		 return PageGeneratorManager.getHomePage(driver);
	}

	public Object getReviewTitleAtMyReviewPage() {
		waitForElementVisible(driver, MyReviewPageUI.REVIEW_TITLE_AT_MY_REVIEW_PAGE);
		return getTextElement(driver, MyReviewPageUI.REVIEW_TITLE_AT_MY_REVIEW_PAGE);
	}

	public boolean isGoodReviewRatingDisplayed() {
		waitForElementVisible(driver, MyReviewPageUI.REVIEW_RATING_AT_MY_REVIEW_PAGE);
		return isElementDisplayed(driver, MyReviewPageUI.REVIEW_RATING_AT_MY_REVIEW_PAGE);
	}

	public Object getReviewContentValue() {
		waitForElementVisible(driver, MyReviewPageUI.REVIEW_CONTENT_AT_MY_REVIEW_PAGE);
		return getTextElement(driver, MyReviewPageUI.REVIEW_CONTENT_AT_MY_REVIEW_PAGE);
	}

	public Object getProductNameAtMyReviewPage() {
		waitForElementVisible(driver, MyReviewPageUI.NAME_PRODUCT_REVIEW_AT_MY_REVIEW_PAGE);
		return getTextElement(driver, MyReviewPageUI.NAME_PRODUCT_REVIEW_AT_MY_REVIEW_PAGE);
	}

	public HomePageObject clickToProductNameAtMyReviewPage() {
		waitForElementClickable(driver, MyReviewPageUI.NAME_PRODUCT_REVIEW_AT_MY_REVIEW_PAGE);
		clickToElement(driver, MyReviewPageUI.NAME_PRODUCT_REVIEW_AT_MY_REVIEW_PAGE);
		return PageGeneratorManager.getHomePage(driver);
	}

	
	
}
