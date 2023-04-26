package pageObjects;

import org.openqa.selenium.WebDriver;

public class PageGeneratorManager {
	
	public static PageGeneratorManager getPageGenerator() {
		return new PageGeneratorManager();
	}
	
	//Dùng Static để gọi trực tiếp bằng Class.tên hàm
	public static HomePageObject getHomePage(WebDriver driver) {
		return new HomePageObject(driver);
	}
	
	public static LoginPageObject getLoginPage(WebDriver driver) {
		return new LoginPageObject(driver);
	}
	
	public static RegisterPageObject getRegisterPage(WebDriver driver) {
		return new RegisterPageObject(driver);
	}
	
	public static ChangePasswordPageObject getChangePasswordPage(WebDriver driver) {
		return new ChangePasswordPageObject(driver);
	}
	
	public static MyReviewPageObject getReviewPage(WebDriver driver) {
		return new MyReviewPageObject(driver);
	}
	
	public static OrderPageObject getOrderPage(WebDriver driver) {
		return new OrderPageObject(driver);
	}
	
	public static AddressPageObject getAddressPage(WebDriver driver) {
		return new AddressPageObject(driver);
	}
	
	public static CustomerInfoPageObject getCustomerInfoPage(WebDriver driver) {
		return new CustomerInfoPageObject(driver);
	}
	
	public static AboutUsPageObject getAboutUsPage(WebDriver driver) {
		return new AboutUsPageObject(driver);
	}
	
	public static NewsPageObject getNewsPage(WebDriver driver) {
		return new NewsPageObject(driver);
	}
	
	public static ShoppingCartPageObject getShoppingCartPage(WebDriver driver) {
		return new ShoppingCartPageObject(driver);
	}
	
	public static SiteMapPageObject getSiteMapPage(WebDriver driver) {
		return new SiteMapPageObject(driver);
	}
	
}
