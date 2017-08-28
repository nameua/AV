package portal.steps;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import portal.pages.LoginPage;

public class LoginPageSteps extends BaseStep<LoginPage>{

    public LoginPageSteps(WebDriver webDriver) {
        setPageObject(PageFactory.initElements(webDriver, LoginPage.class));
    }

    public void fillOutLoginTextField(String login){
        pageObject().userNameTextField().clear();
        pageObject().enterTextInUserNameTextField(login);
    }

    public void fillOutPasswordTextField(String password){
        pageObject().passwordTextField().clear();
        pageObject().enterTextInPasswordTextField(password);
    }

    public void clickOnLoginButton(){
        pageObject().clickSubmitButton();
    }
}
