package pageObjects.paraBank.user;

import org.openqa.selenium.WebDriver;

import commons.BasePage;
import commons.PageGeneratorManager;
import pageUIs.paraBank.user.UserHomepageUI;

public class UserHomepageObject extends BasePage {
	private WebDriver driver;

	public UserHomepageObject(WebDriver driver) {
		this.driver = driver;
	}

	public UserRegisterPageObject clickRegisterLink() {
		waitForElementClickable(driver, UserHomepageUI.REGISTER_LINK);
		clickElement(driver, UserHomepageUI.REGISTER_LINK);
		return PageGeneratorManager.getUserRegisterPage(driver);
	}
}
