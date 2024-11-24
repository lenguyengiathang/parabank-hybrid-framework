package pageObjects.paraBank.user;

import org.openqa.selenium.WebDriver;

import commons.BasePage;

public class UserHomepageObject extends BasePage {
	private WebDriver driver;

	public UserHomepageObject(WebDriver driver) {
		this.driver = driver;
	}
}
