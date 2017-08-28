package portal.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import portal.utils.WebElementFacade;

/**
 * Homepage
 */
public class LoginPage extends PageObject{

	public LoginPage(WebDriver driver) {
		super(driver);
	}

	@FindBy(id = "WebLogin_UserName")
	private WebElement userNameTextField;

	@FindBy (id = "Password")
	private WebElement passwordTextField;

	@FindBy (id = "WebLogin_Login")
	private WebElement submitButton;

	@FindBy (id = "WebLogin_PasswordRecovery")
	private WebElement forgotPasswordLink;

	@FindBy (id = "WebLogin_PrivacyPolicy")
	private WebElement pivacyPolicyLink;

	public WebElementFacade userNameTextField() {
		return element(userNameTextField);
	}

	public WebElementFacade passwordTextField() {
		return element(passwordTextField);
	}

	public WebElementFacade submitButton() {
		return element(submitButton);
	}

	public void enterTextInUserNameTextField(String text) {
		userNameTextField().clear();
		userNameTextField().sendKeys(text);
	}

	public void enterTextInPasswordTextField(String text) {
		passwordTextField().sendKeys(text);
	}

	public void clickSubmitButton() {
		submitButton().click();
	}

}
