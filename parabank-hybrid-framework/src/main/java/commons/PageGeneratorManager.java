package commons;

import org.openqa.selenium.WebDriver;

import pageObjects.paraBank.user.UserHomepageObject;
import pageObjects.paraBank.user.UserRegisterPageObject;

public class PageGeneratorManager {
	public static UserHomepageObject getUserHomepage(WebDriver driver) {
		return new UserHomepageObject(driver);
	}

	public static UserRegisterPageObject getUserRegisterPage(WebDriver driver) {
		return new UserRegisterPageObject(driver);
	}
}
