package elements;

import org.openqa.selenium.By;

public class HomePageElements {
	
	private By menuUser = By.id("menuUser");
	private By creatNewAccount = By.xpath("//a[text()= 'CREATE NEW ACCOUNT']");
	private By first_nameRegisterPage = By.name("first_nameRegisterPage");
	private By last_nameRegisterPage = By.name("last_nameRegisterPage");
	private By phone_numberRegisterPage = By.name("phone_numberRegisterPage");
	private By cityRegisterPage = By.name("cityRegisterPage");
	private By addressRegisterPage = By.name("addressRegisterPage");
	private By stateprovinceregionRegisterPage = By.name("state_/_province_/_regionRegisterPage");
	private By postal_codeRegisterPage = By.name("postal_codeRegisterPage");
	private By countryListboxRegisterPage = By.name("countryListboxRegisterPage");
	
	
	public By getMenuUser() {
		return menuUser;
	}
	public By getCreatNewAccount() {
		return creatNewAccount;
	}
	
	public By getLast_nameRegisterPage() {
		return last_nameRegisterPage;
	}
	public By getPhone_numberRegisterPage() {
		return phone_numberRegisterPage;
	}
	public By getCityRegisterPage() {
		return cityRegisterPage;
	}
	public By getAddressRegisterPage() {
		return addressRegisterPage;
	}
	public By getStateprovinceregionRegisterPage() {
		return stateprovinceregionRegisterPage;
	}
	public By getPostal_codeRegisterPage() {
		return postal_codeRegisterPage;
	}
	public By getCountryListboxRegisterPage() {
		return countryListboxRegisterPage;
	}
	public By getFirst_nameRegisterPage() {
		return first_nameRegisterPage;
	}

	
}
