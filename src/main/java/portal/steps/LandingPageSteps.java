package portal.steps;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import portal.pages.LandingPage;

public class LandingPageSteps extends BaseStep<LandingPage> {

    public LandingPageSteps(WebDriver webDriver) {
        setPageObject(PageFactory.initElements(webDriver, LandingPage.class));
    }

    public void verifyWelcomeLabelPresentedOnThePage(){
        pageObject().welcomeLabel().isVisible();
    }
}
