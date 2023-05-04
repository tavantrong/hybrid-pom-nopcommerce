package pageUIs;

public class BasePageUI {
	
	public static final String HOME_PAGE_IMG = "//img[@alt='nopCommerce demo store']";
	public static final String SHOPPING_CART_LINK = "//div[@class='footer']//a[text()='Shopping cart']";
	public static final String ABOUT_US_PAGE_LINK = "//div[@class='footer']//a[text()='About us']";
	public static final String NEWS_PAGE_LINK = "//div[@class='footer']//a[text()='News']";
	public static final String SITE_MAP_LINK = "//div[@class='footer']//a[text()='Sitemap']";
	public static final String LOG_OUT_LINKTEXT = "//a[@class='ico-logout']";
	
	
	// Dynamic Page name
	public static final String DYNAMIC_FOOTER_PAGE_LINK_NAME = "//div[@class='footer']//a[text()='%s']";
	public static final String DYNAMIC_MYACCOUNT_LINKNAME_TAB = "//div[@class='block block-account-navigation']//a[text()='%s']";
	
	//Computers/ Electronics/ Apparel/ Digital downloads/ Books/ Jewelry/ Gift Cards
	public static final String DYNAMIC_TOP_MENU_PRODUCT_LINKTEXT = "//ul[@class='top-menu notmobile']//a[contains(text(),'%s')]";

}
