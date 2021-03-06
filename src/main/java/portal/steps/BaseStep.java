package portal.steps;

import org.apache.log4j.Logger;
import portal.pages.PageObject;
import portal.utils.WebElementFacade;

public class BaseStep <T extends PageObject>{

    private T pageObject;

    private final Logger logger = Logger.getLogger(this.getClass());

    public void setPageObject(T object) {
        this.pageObject = object;
    }

    public T pageObject() {
        return pageObject;
    }

    public Logger logger() {
        return logger;
    }

    public String getTextFromWebElement(WebElementFacade element){
        return pageObject().element(element).getText();
    }

    protected void visibleElementLogger(String elementText){
        logger().info("Should " + elementText + " element is visible");
    }

    protected void elementClickedLogger(String elementText){
        logger().info(("Click " + elementText + " element"));
    }

    public void clickOn(WebElementFacade element) {
        visibleElementLogger(element.getText());
        element.shouldBeVisible();
        elementClickedLogger(element.getText());
        element.click();
    }

}

