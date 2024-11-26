package pageObjects.paraBank.user;

import org.openqa.selenium.WebDriver;

import commons.BasePage;

public class UserFindTransactionsPageObject extends BasePage {
	private WebDriver driver;

	public UserFindTransactionsPageObject(WebDriver driver) {
		this.driver = driver;
	}
}
