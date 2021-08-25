package elements;

import org.openqa.selenium.By;

public class CadastrarClienteElements {

	private By username = By.name("usernameRegisterPage");
	private By password = By.name("passwordRegisterPage");
	private By email = By.name("emailRegisterPage");
	private By confirmPassword = By.name("confirm_passwordRegisterPage");
	private By i_agree = By.name("i_agree");
	private By registerButton = By.id("register_btnundefined");
	private By expectedText = By.xpath("//*[@id=\"menuUserLink\"]/span");

	public By getUsername() {
		return username;
	}

	public By getPassword() {
		return password;
	}

	public By getEmail() {
		return email;
	}

	public By getConfirmPassword() {
		return confirmPassword;
	}

	public By getI_agree() {
		return i_agree;
	}

	public By getRegisterButton() {
		return registerButton;
	}

	public By getExpectedText() {
		return expectedText;
	}

}
