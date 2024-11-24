package commons;

import org.openqa.selenium.WebDriver;

import pageObjects.paraBank.user.UserHomepageObject;

public class PageGeneratorManager {
	public static UserHomepageObject getUserHomepage(WebDriver driver) {
		return new UserHomepageObject(driver);
	}
}
