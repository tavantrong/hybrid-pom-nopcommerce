package pageUIs;

public class RegisterPageUI {
	
	public static final String FIRSTNAME_TEXTBOX = "//input[@id='FirstName']"; 
	public static final String LASTNAME_TEXTBOX = "//input[@id='LastName']"; 
	public static final String EMAIL_TEXTBOX = "//input[@id='Email']"; 
	public static final String PASSWORD_TEXTBOX = "//input[@id='Password']"; 
	public static final String CONFIRM_PASSWORD_TEXTBOX = "//input[@id='ConfirmPassword']"; 
	public static final String CONTINUE_BUTTON = "//a[@class='button-1 register-continue-button']"; 
	public static final String REGISTER_BUTTON = "//button[@id='register-button']"; 
	public static final String REGISTERED_SUCCESS_MSG = "//div[@class='result' and text()='Your registration completed']";
	
	/* Error message */
	public static final String DYNAMIC_EMPTY_ERROR_MSG_AT_REGISTER_FORM = "//span[@id='%s-error']";
	public static final String DYNAMIC_ERROR_EMAIL_AT_REGISTER_FORM = "//li[text()='%s']";
	public static final String DYNAMIC_ERROR_PASSWORD_AT_REGISTER_FORM = "//span[@id='%s-error']";
	
	
	public static final String INVALID_ERROR_EMAIL_AT_REGISTER_FORM = "//li[text()='Wrong email']";
	public static final String EXISTS_ERROR_EMAIL_AT_REGISTER_FORM = "//li[text()='The specified email already exists']";
	public static final String INVALID_PASSWORD_AT_REGISTER_FORM = "//span[@id='Password-error']";
	public static final String MISMATCH_CONFIRM_PASSWORD_ERROR_AT_REGISTER_FORM = "//span[text()='The password and confirmation password do not match.']";


	
}
