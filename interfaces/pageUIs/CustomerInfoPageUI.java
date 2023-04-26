package pageUIs;

public class CustomerInfoPageUI {
	
	public static final String FIRSTNAME_TEXTBOX = "//input[@id='FirstName']";
	public static final String LASTNAME_TEXTBOX = "//input[@id='LastName']";
	public static final String EMAIL_TEXTBOX = "//input[@id='Email']";
	public static final String COMPANY_TEXTBOX = "//input[@id='Company']";
	public static final String INCORRECT_EMAIL_MSG_AT_CUSTOMER_INFO = "//li[text()='New email is not valid']";
	public static final String WRONG_EMAIL_MSG_AT_CUSTOMER_INFO = "//span[@id='Email-error']";
	
	
	public static final String SAVE_BUTTON = "//button[@id='save-info-button']";
	
	public static final String DYNAMIC_GENDER_RADIO_BUTTON = "//input[@id='gender-%s']"; //male - female
	public static final String DYNAMIC_SELECT_CALENDAR_DROPDOWN = "//select[@name='DateOfBirth%s']"; //Day - Month - Year
	public static final String DYNAMIC_EMPTY_ERROR_MESSAGE_AT_CUSTOMER_INFO = "//span[@id='%s-error']"; //FirstName - LastName - Email
	
	
	


}
