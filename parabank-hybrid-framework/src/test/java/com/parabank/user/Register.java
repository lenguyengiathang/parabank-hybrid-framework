package com.parabank.user;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import commons.BaseTest;
import commons.PageGeneratorManager;
import pageObjects.paraBank.user.UserHomepageObject;
import pageObjects.paraBank.user.UserRegisterPageObject;
import utilities.DataHelper;

public class Register extends BaseTest {
	@Parameters("browser")
	@BeforeClass
	public void beforeClass(String browser) {
		driver = getBrowserDriver(browser);
		homepage = PageGeneratorManager.getUserHomepage(driver);

		data = DataHelper.getDataHelper();
		firstName = data.getFirstName();
		lastName = data.getLastName();
		username = firstName.concat(lastName).toLowerCase();
		password = data.getPassword();
	}

	@Test
	public void TC_01_Register_With_Empty_Data() {
		registerPage = homepage.clickRegisterLink();
		registerPage.clickRegisterButton();

		Assert.assertEquals(registerPage.getFirstNameErrorMessage(), "First name is required.");
		Assert.assertEquals(registerPage.getLastNameErrorMessage(), "Last name is required.");
		Assert.assertEquals(registerPage.getAddressErrorMessage(), "Address is required.");
		Assert.assertEquals(registerPage.getCityErrorMessage(), "City is required.");
		Assert.assertEquals(registerPage.getStateErrorMessage(), "State is required.");
		Assert.assertEquals(registerPage.getZipCodeErrorMessage(), "Zip Code is required.");
		Assert.assertEquals(registerPage.getSocialSecurityNumberErrorMessage(), "Social Security Number is required.");
		Assert.assertEquals(registerPage.getUsernameErrorMessage(), "Username is required.");
		Assert.assertEquals(registerPage.getPasswordErrorMessage(), "Password is required.");
		Assert.assertEquals(registerPage.getConfirmPasswordErrorMessage(), "Password confirmation is required.");

	}

	@Test
	public void TC_02_Register_With_Incorrect_Confirmation_Password() {
		registerPage.refreshCurrentPage(driver);
		registerPage.refreshCurrentPage(driver);

		registerPage.sendKeysToFirstNameTextbox(firstName);
		registerPage.sendKeysToLastNameTextbox(lastName);
		registerPage.sendKeysToAddressTextbox(data.getAddress());
		registerPage.sendKeysToCityTextbox(data.getCity());
		registerPage.sendKeysToStateTextbox(data.getState());
		registerPage.sendKeysToZipCodeTextbox(data.getZipCode());
		registerPage.sendKeysToSocialSecurityNumberTextbox(data.getSocialSecurityNumber());
		registerPage.sendKeysToUsernameTextbox(username);
		registerPage.sendKeysToPasswordTextbox(password);
		registerPage.sendKeysToConfirmPasswordTextbox("abc");
		registerPage.clickRegisterButton();

		Assert.assertEquals(registerPage.getConfirmPasswordErrorMessage(), "Passwords did not match.");
	}

	@Test
	public void TC_03_Register_Without_Phone() {
		registerPage.refreshCurrentPage(driver);
		registerPage.refreshCurrentPage(driver);

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

		Assert.assertEquals(registerPage.getWelcomeMessage(), "Welcome " + username);
		Assert.assertEquals(registerPage.getAccountCreatedSuccessfullyMessage(),
				"Your account was created successfully. You are now logged in.");

	}

	@Test
	public void TC_04_Register_With_Phone() {
		registerPage.refreshCurrentPage(driver);
		registerPage.refreshCurrentPage(driver);

		registerPage.sendKeysToFirstNameTextbox(firstName);
		registerPage.sendKeysToLastNameTextbox(lastName);
		registerPage.sendKeysToAddressTextbox(data.getAddress());
		registerPage.sendKeysToCityTextbox(data.getCity());
		registerPage.sendKeysToStateTextbox(data.getState());
		registerPage.sendKeysToZipCodeTextbox(data.getZipCode());
		registerPage.sendKeysToSocialSecurityNumberTextbox(data.getSocialSecurityNumber());
		registerPage.sendKeysToPhoneTextbox(data.getPhoneNumber());
		registerPage.sendKeysToUsernameTextbox(username + "01");
		registerPage.sendKeysToPasswordTextbox(password);
		registerPage.sendKeysToConfirmPasswordTextbox(password);
		registerPage.clickRegisterButton();

		Assert.assertEquals(registerPage.getWelcomeMessage(), "Welcome " + username + "01");
		Assert.assertEquals(registerPage.getAccountCreatedSuccessfullyMessage(),
				"Your account was created successfully. You are now logged in.");
	}

	@Test
	public void TC_04_Register_With_Existing_Username() {
		registerPage.refreshCurrentPage(driver);
		registerPage.refreshCurrentPage(driver);

		registerPage.sendKeysToFirstNameTextbox(firstName);
		registerPage.sendKeysToLastNameTextbox(lastName);
		registerPage.sendKeysToAddressTextbox(data.getAddress());
		registerPage.sendKeysToCityTextbox(data.getCity());
		registerPage.sendKeysToStateTextbox(data.getState());
		registerPage.sendKeysToZipCodeTextbox(data.getZipCode());
		registerPage.sendKeysToSocialSecurityNumberTextbox(data.getSocialSecurityNumber());
		registerPage.sendKeysToPhoneTextbox(data.getPhoneNumber());
		registerPage.sendKeysToUsernameTextbox(username);
		registerPage.sendKeysToPasswordTextbox(password);
		registerPage.sendKeysToConfirmPasswordTextbox(password);
		registerPage.clickRegisterButton();

		Assert.assertEquals(registerPage.getWelcomeMessage(), "Welcome " + username);
		Assert.assertEquals(registerPage.getUsernameErrorMessage(), "This username already exists.");
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
}
