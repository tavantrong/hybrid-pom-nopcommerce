package pageUIs;

public class HomePageUI {
	public static final String REGISTER_LINKTEXT = "//a[@class='ico-register']";
	public static final String LOGIN_LINKTEXT = "//a[@class='ico-login']";
	public static final String MYACCOUNT_LINKTEXT = "//a[@class='ico-account']";
	
	public static final String SHOPPING_CART_NOITEM_TOOLTIP = "//div[@class='count' and text()='You have no items in your shopping cart.']";
	public static final String UPLOAD_FILE_TYPE = "//input[@name='files[]']";
	public static final String CATEGORY_PRODUCT_TITLE = "//div[@class='page-title']/h1";
	
	//ProductName
	public static final String DYNAMIC_PRODUCT_MAINPAGE_LINKTEXT = "//div[@class='product-item']//a[text()='%s']";
	public static final String DYNAMIC_PRODUCT_DETAILS_LINKTEXT = "//div[@class='product-essential']//a[text()='%s']";
	public static final String DETAIL_PRODUCT_TITLE = "//div[@class='product-essential']//h1";
	public static final String TITLE_OF_ADD_REVIEW_FORM = "//div[@class='page-title']/h1";
	public static final String REVIEW_TITLE_TEXTBOX = "//input[@id='AddProductReview_Title']";
	public static final String REVIEW_CONTENT_TEXTBOX = "//textarea[@id='AddProductReview_ReviewText']";
	public static final String GOOD_REVIEW_RADIO_BUTTON = "//input[@aria-label='Good']";
	public static final String SUBMIT_REVIEW_BUTTON = "//button[text()='Submit review']";
	public static final String SUCCESSFULLY_ADD_REVIEW_NOTICE = "//div[contains(text(),'Product review is successfully added.')]";
	
	public static final String RESULT_REVIEW_TITLE_FORM = "//div[@class='review-title']/strong[text()='%s']";
	public static final String RESULT_REVIEW_RATING_FORM = "//div[@style='width: 80%']";
	public static final String RESULT_REVIEW_CONTENT_FORM = "//div[@class='review-text']";
	public static final String RESULT_REVIEW_USER_FORM = "//span[@class='user']/span";
	
	
		

}
