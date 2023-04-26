package commons;

import java.util.Locale;

import com.github.javafaker.Faker;

public class DataHelper {

	private Locale locale = new Locale("en");
	private Faker faker = new Faker(locale);
	
	public static DataHelper getData() {
		return new DataHelper();
	}
	
	public String getFirstName() {
		return faker.name().firstName();
	}
	
	public String getLastName() {
		return faker.name().lastName();
	}
	
	public String getEmail() {
		return faker.internet().emailAddress();
	}
	
	public String getCompany() {
		return faker.company().name();
	}
	
	public String getStreetAddress() {
		return faker.address().streetAddress();
	}
	
	public String getZipCode() {
		return faker.address().zipCode();
	}
	
	public String getCity() {
		return faker.address().cityName();
	}
		
	public String getPhoneNumber() {
		return faker.phoneNumber().phoneNumber();
				
	}
}
