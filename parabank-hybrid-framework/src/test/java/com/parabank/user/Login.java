package com.parabank.user;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import commons.BaseTest;
import commons.PageGeneratorManager;
import pageObjects.paraBank.user.UserAccountServicesPageObject;
import pageObjects.paraBank.user.UserHomepageObject;
import pageObjects.paraBank.user.UserRegisterPageObject;
import utilities.DataHelper;

public class Login extends BaseTest {
	@Parameters("browser")
	@BeforeClass
	public void beforeClass(String browser) {
		driver = getBrowserDriver(browser);
		homepage = PageGeneratorManager.getUserHomepage(driver);

		firstName = data.getFirstName();
		lastName = data.getLastName();
		username = firstName.concat(lastName).toLowerCase();
		password = data.getPassword();

		registerPage.sendKeysToFirstNameTextbox(firstName);
		registerPage.sendKeysToLastNameTextbox(lastName);
		registerPage.sendKeysToAddressTextbox(data.getAddress());
		registerPage.sendKeysToCityTextbox(data.getCity());
		registerPage.sendKeysToStateTextbox(data.getState());
		registerPage.sendKeysToZipCodeTextbox(data.getZipCode());
		registerPage.sendKeysToSocialSecurityNumberTextbox(data.getSocialSecurityNumber());
		registerPage.sendKeysToUsernameTextbox(username);
		registerPage.sendKeysToPasswordTextbox(password);
		registerPage.sendKeysToConfirmPasswordTextbox(password);
		registerPage.clickRegisterButton();

		Assert.assertEquals(registerPage.getAccountCreatedSuccessfullyMessage(),
				"Your account was created successfully. You are now logged in.");
	}

	@Test
	public void TC_01_Login_With_Empty_Data() {
		homepage.sendKeysToLoginUsernameTextbox("");
		homepage.sendKeysToLoginPasswordTextbox("");
		homepage.clickLoginButton();

		Assert.assertEquals(homepage.getInfoMessage(), "Please enter a username and password.");
	}

	@Test
	public void TC_02_Login_With_Empty_Username() {
		homepage.sendKeysToLoginUsernameTextbox("");
		homepage.sendKeysToLoginPasswordTextbox(password);
		homepage.clickLoginButton();

		Assert.assertEquals(homepage.getInfoMessage(), "Please enter a username and password.");
	}

	@Test
	public void TC_03_Login_With_Empty_Password() {
		homepage.sendKeysToLoginUsernameTextbox(username);
		homepage.sendKeysToLoginPasswordTextbox("");
		homepage.clickLoginButton();

		Assert.assertEquals(homepage.getInfoMessage(), "Please enter a username and password.");
	}

	@Test
	public void TC_04_Login_With_Incorrect_Data() {
		homepage.sendKeysToLoginUsernameTextbox(username);
		homepage.sendKeysToLoginPasswordTextbox(data.getPassword());
		homepage.clickLoginButton();

		Assert.assertEquals(homepage.getInfoMessage(), "The username and password could not be verified.");
	}

	@Test
	public void TC_05_Login_With_Correct_Data() {
		accountServicesPage = homepage.logInAsExistingUser(username, password);

		Assert.assertEquals(accountServicesPage.getWelcomeMessage(), "Welcome " + username);
	}

	@AfterClass(alwaysRun = true)
	public void afterClass() {
		closeBrowserAndDriver();
	}

	private WebDriver driver;
	private DataHelper data;
	private String firstName, lastName, username, password;
	private UserHomepageObject homepage;
	private UserRegisterPageObject registerPage;
	private UserAccountServicesPageObject accountServicesPage;
}
