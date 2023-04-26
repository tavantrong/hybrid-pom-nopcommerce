package pageUIs;

public class LoginPageUI {
	
	public static final String EMAIL_TEXTBOX = "//input[@id='Email']";
	public static final String PASSWORD_TEXTBOX = "//input[@id='Password']";
	public static final String LOGIN_BUTTON = "//button[@class='button-1 login-button']";
	public static final String PASSWORD_INCORRECT_ERROR_AT_LOGIN_FORM = "//div[@class='message-error validation-summary-errors']//li[text()='The credentials provided are incorrect']";
	public static final String EMAIL_INCORRECT_ERROR_AT_LOGIN_FORM = "//div[@class='message-error validation-summary-errors']//li[text()='No customer account found']";
	public static final String EMPTY_EMAIL_ERROR_AT_LOGIN_FORM = "//span[text()='Please enter your email']";
	public static final String WRONG_EMAIL_ERROR_AT_LOGIN_FORM = "//span[text()='Wrong email']";
	


}
