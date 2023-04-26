package pageObjects;

import org.openqa.selenium.WebDriver;

import commons.BasePage;
import pageUIs.LoginPageUI;

public class LoginPageObject extends BasePage{
		WebDriver driver;
		//PageGeneratorManager pageGenerator;
		
		public LoginPageObject (WebDriver driver) {
			this.driver = driver;
			//pageGenerator = PageGeneratorManager.getPageGenerator();
		}


		public void enterToEmailTextbox(String emailTextbox) {
			waitForElementVisible(driver, LoginPageUI.EMAIL_TEXTBOX);
			sendkeyToElement(driver, LoginPageUI.EMAIL_TEXTBOX, emailTextbox);
			
		}

		public void enterToPasswordTextbox(String password) {
			waitForElementVisible(driver, LoginPageUI.PASSWORD_TEXTBOX);
			sendkeyToElement(driver, LoginPageUI.PASSWORD_TEXTBOX, password);
			
		}

		public HomePageObject clickToLoginButton() {
			waitForElementClickable(driver, LoginPageUI.LOGIN_BUTTON);
			clickToElement(driver, LoginPageUI.LOGIN_BUTTON);
			return PageGeneratorManager.getHomePage(driver);
			
		}


		public Object theCredentialsIncorrectMessageDisplayed() {
			waitForElementVisible(driver, LoginPageUI.PASSWORD_INCORRECT_ERROR_AT_LOGIN_FORM);
			return getTextElement(driver, LoginPageUI.PASSWORD_INCORRECT_ERROR_AT_LOGIN_FORM);
		}


		public Object noCustomerAccountFoundMessageDisplayed() {
			waitForElementVisible(driver, LoginPageUI.EMAIL_INCORRECT_ERROR_AT_LOGIN_FORM);
			return getTextElement(driver, LoginPageUI.EMAIL_INCORRECT_ERROR_AT_LOGIN_FORM);
		}


		public Object wrongEmailMessageDisplayed() {
			waitForElementVisible(driver, LoginPageUI.WRONG_EMAIL_ERROR_AT_LOGIN_FORM);
			return getTextElement(driver, LoginPageUI.WRONG_EMAIL_ERROR_AT_LOGIN_FORM);
		}


		public Object pleaseEnterYourEmailMessageDisplayed() {
			waitForElementVisible(driver, LoginPageUI.EMPTY_EMAIL_ERROR_AT_LOGIN_FORM);
			return getTextElement(driver, LoginPageUI.EMPTY_EMAIL_ERROR_AT_LOGIN_FORM);
		}


		public String getLoginPageUrl() {
			return getCurrentUrl(driver);
			
		}


		public void openLoginPageUrl(String pageUrl) {
			openUrl(driver, pageUrl);
			
		}
	}

