package pageUIs;

public class ChangePasswordPageUI {
	
	public static final String OLD_PASSWORD_TEXTBOX = "//input[@id='OldPassword']";
	public static final String NEW_PASSWORD_TEXTBOX = "//input[@id='NewPassword']";
	public static final String CONFIRM_NEW_PASSWORD_TEXTBOX = "//input[@id='ConfirmNewPassword']";
	public static final String DYNAMIC_TEXTBOX_AT_CHANGE_PASSWORD_PAGE = "//input[@id='%s']";
	public static final String SUCCESS_CHANGE_PASSWORD_NOTICE = "//p[text()='Password was changed']";
	public static final String CLOSE_SUCCESS_CHANGE_PASSWORD_NOTICE = "//span[@class='close']";
	
	public static final String LOG_OUT_LINKTEXT = "//a[text()='Log out']";

	
	public static final String CHANGE_PASSWORD_BUTTON = "//button[text()='Change password']";
	
	//OldPassword/ NewPassword/ ConfirmNewPassword
	public static final String DYNAMIC_EMPTY_ERROR_MSG_AT_CHANGE_PASSWORD = "//span[@id='%s-error']";
	
	public static final String INVALID_PASSWORD_MSG_AT_CHANGE_PASSWORD = "//span[@id='NewPassword-error']//li";
	public static final String MISMATCH_PASSWORD_MSG_AT_CHANGE_PASSWORD = "//span[@id='ConfirmNewPassword-error' and contains(text(), 'password do not match')]";
	public static final String EXISTS_PASSWORD_MSG_AT_CHANGE_PASSWORD = "//li[contains(text(),'the same as one of the last passwords')]";
	public static final String WRONG_OLD_PASSWORD_MSG_AT_CHANGE_PASSWORD = "//li[contains(text(),'Old password doesn')]";
	
	



}
