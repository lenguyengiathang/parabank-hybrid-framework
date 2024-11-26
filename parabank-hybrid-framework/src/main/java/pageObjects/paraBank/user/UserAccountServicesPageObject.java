package pageObjects.paraBank.user;

import org.openqa.selenium.WebDriver;

import commons.BasePage;
import pageUIs.paraBank.user.UserAccountServicesPageUI;

public class UserAccountServicesPageObject extends BasePage {
	private WebDriver driver;

	public UserAccountServicesPageObject(WebDriver driver) {
		this.driver = driver;
	}

	public String getWelcomeMessage() {
		waitForElementVisible(driver, UserAccountServicesPageUI.WELCOME_MESSAGE);
		return getElementText(driver, UserAccountServicesPageUI.WELCOME_MESSAGE);
	}
}
