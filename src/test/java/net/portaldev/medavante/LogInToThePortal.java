package net.portaldev.medavante;

import org.apache.log4j.Logger;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import portal.settings.Link;
import portal.steps.LoginPageSteps;
import portal.utils.PropertiesLoader;
import portal.utils.User;
import portal.utils.enums.Driver;

import java.io.File;
import java.util.Properties;

public class LogInToThePortal {

	private final Logger logger = Logger.getLogger(this.getClass());
	protected WebDriver webDriver;

	private String absoluteTestPath = new File(BROWSER_DRIVERS_PATH).getAbsolutePath();
	static final String BROWSER_DRIVERS_PATH = "./selenium/";
	private static final Properties testingProperties = PropertiesLoader.getTestingProperties();
	protected static final User ADMIN = new User(testingProperties.getProperty("admin.login"),
			testingProperties.getProperty("admin.password"));
	protected LoginPageSteps loginPageSteps;

	@Test
	public  void loginAsAdministrator() {
		navigateToTheLoginPage();
		loginAsAdministratorToTheApplication();
	}

	private WebDriver navigateToTheLoginPage() {
		System.setProperty(Driver.getBroserKey(Driver.CHROME.name()),absoluteTestPath +"/chromedriver");
		WebDriver webDriver = new ChromeDriver();
		webDriver.get(Link.LOCAL.getURL());
		logger.info("Trying to navigate login page: " + Link.LOCAL.getURL());
		return webDriver;
	}

	private void loginAsAdministratorToTheApplication() {
		webDriver = navigateToTheLoginPage();
		loginPageSteps = new LoginPageSteps(webDriver);
		loginPageSteps.fillOutLoginTextField(ADMIN.getLogin());
		loginPageSteps.fillOutPasswordTextField(ADMIN.getPassword());
		webDriver.close();
	}
}
