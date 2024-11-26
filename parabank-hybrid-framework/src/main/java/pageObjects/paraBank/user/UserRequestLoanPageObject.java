package pageObjects.paraBank.user;

import org.openqa.selenium.WebDriver;

import commons.BasePage;

public class UserRequestLoanPageObject extends BasePage {
	private WebDriver driver;

	public UserRequestLoanPageObject(WebDriver driver) {
		this.driver = driver;
	}
}
