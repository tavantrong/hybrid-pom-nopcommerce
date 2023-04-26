package pageUIs;

public class AddressPageUI {
	
	public static final String ADD_NEW_BUTTON = "//button[text()='Add new']";
	public static final String SAVE_BUTTON = "//button[text()='Save']";
	public static final String WRONG_EMAIL_MSG_AT_ADDRESS_PAGE = "//span[@id='Address_Email-error' and text()='Wrong email']";
	public static final String EDIT_BUTTON_AT_ADDRESS_PAGE = "//button[@class='button-2 edit-address-button']";
	public static final String DELETE_BUTTON_AT_ADDRESS_PAGE = "//button[@class='button-2 delete-address-button']";
	public static final String COUNTRY_DROPDOWN_BUTTON_AT_ADDRESS_PAGE = "//select[@id='Address_CountryId']";
	public static final String NO_ADDRESS_TEXT_AT_ADDRESS_PAGE = "//div[text()='No addresses']";
	
	
	public static final String FULLNAME_MSG_AT_ADDRESS_LIST = "//div[@class='section address-item']//li[@class='name']";
	public static final String EMAIL_AT_ADDRESS_LIST = "//div[@class='section address-item']//li[@class='email']";
	public static final String PHONE_NUMBER_AT_ADDRESS_LIST = "//div[@class='section address-item']//li[@class='phone']";
	public static final String STREET_AT_ADDRESS_LIST = "//div[@class='section address-item']//li[@class='address1']";
	public static final String CITY_AND_ZIPCODE_AT_ADDRESS_LIST = "//div[@class='section address-item']//li[@class='city-state-zip']";
	//name/ email/ phone/ address1/ city-state-zip
	public static final String DYNAMIC_ADDRESS_RESULT_AT_ADDRESS_LIST = "//div[@class='section address-item']//li[@class='%s']";
	
	
	
	//FirstName/ LastName/ Email/ City/ Address1/ ZipPostalCode/ PhoneNumber
	public static final String DYNAMIC_TEXTBOX_BY_ID = "//input[@id='Address_%s']";
	public static final String DYNAMIC_ERROR_BY_EMPTY_DATA = "//span[@id='Address_%s-error']";



}
