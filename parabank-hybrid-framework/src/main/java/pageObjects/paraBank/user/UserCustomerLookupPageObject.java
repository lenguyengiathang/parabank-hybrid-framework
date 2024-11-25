package pageObjects.paraBank.user;

import org.openqa.selenium.WebDriver;

import commons.BasePage;
import pageUIs.paraBank.user.UserAccountServicesPageUI;

public class UserCustomerLookupPageObject extends BasePage {
	private WebDriver driver;

	public UserCustomerLookupPageObject(WebDriver driver) {
		this.driver = driver;
	}

	public void clickFindMyLoginInfoButton() {
		waitForElementClickable(driver, UserAccountServicesPageUI.FIND_MY_LOGIN_INFO_BUTTON);
		clickElement(driver, UserAccountServicesPageUI.FIND_MY_LOGIN_INFO_BUTTON);
	}
}
