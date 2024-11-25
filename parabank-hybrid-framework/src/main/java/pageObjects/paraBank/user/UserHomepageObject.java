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

	public void sendKeysToLoginUsernameTextbox(String username) {
		waitForElementVisible(driver, UserHomepageUI.LOGIN_USERNAME_TEXTBOX);
		sendKeysToElement(driver, UserHomepageUI.LOGIN_USERNAME_TEXTBOX, username);
	}

	public void sendKeysToLoginPasswordTextbox(String password) {
		waitForElementVisible(driver, UserHomepageUI.LOGIN_PASSWORD_TEXTBOX, password);
		sendKeysToElement(driver, UserHomepageUI.LOGIN_PASSWORD_TEXTBOX, password);
	}

	public UserAccountServicesPageObject clickLoginButton() {
		waitForElementClickable(driver, UserHomepageUI.REGISTER_LINK);
		clickElement(driver, UserHomepageUI.REGISTER_LINK);
		return PageGeneratorManager.getAccountServicesPage(driver);
	}

	public UserAccountServicesPageObject logInAsExistingUser(String username, String password) {
		sendKeysToLoginUsernameTextbox(username);
		sendKeysToLoginPasswordTextbox(password);
		return clickLoginButton();
	}

	public UserRegisterPageObject clickRegisterLink() {
		waitForElementClickable(driver, UserHomepageUI.REGISTER_LINK);
		clickElement(driver, UserHomepageUI.REGISTER_LINK);
		return PageGeneratorManager.getUserRegisterPage(driver);
	}

	public UserCustomerLookupPageObject clickForgotLoginInfoLink(WebDriver driver) {
		waitForElementClickable(driver, UserHomepageUI.FORGOT_LOGIN_INFO_LINK);
		clickElement(driver, UserHomepageUI.FORGOT_LOGIN_INFO_LINK);
		return PageGeneratorManager.getUserCustomerLookupPage(driver);
	}

}
