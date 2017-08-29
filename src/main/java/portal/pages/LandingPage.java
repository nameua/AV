package portal.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import portal.utils.WebElementFacade;

public class LandingPage extends PageObject{


    public LandingPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(xpath = ".//*[@id='page-title']/h1[contains(text(), 'Welcome to MedAvante Portal')]")
    private WebElement welcomeLabel;

    public WebElementFacade welcomeLabel() {
        return element(welcomeLabel);
    }

}
