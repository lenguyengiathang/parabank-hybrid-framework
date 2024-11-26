package com.parabank.user;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import commons.BaseTest;
import commons.PageGeneratorManager;
import pageObjects.paraBank.user.UserCustomerLookupPageObject;
import pageObjects.paraBank.user.UserHomepageObject;
import pageObjects.paraBank.user.UserRegisterPageObject;
import utilities.DataHelper;

public class CustomerLookup extends BaseTest {
	@Parameters("browser")
	@BeforeClass
	public void beforeClass(String browser) {
		driver = getBrowserDriver(browser);
		homepage = PageGeneratorManager.getUserHomepage(driver);

		data = DataHelper.getDataHelper();
		firstName = data.getFirstName();
		lastName = data.getLastName();
		address = data.getAddress();
		city = data.getCity();
		state = data.getState();
		zipCode = data.getZipCode();
		ssn = data.getSocialSecurityNumber();
		username = firstName.concat(lastName).toLowerCase();
		password = data.getPassword();

		registerPage = homepage.clickRegisterLink();
		registerPage.sendKeysToFirstNameTextbox(firstName);
		registerPage.sendKeysToLastNameTextbox(lastName);
		registerPage.sendKeysToAddressTextbox(address);
		registerPage.sendKeysToCityTextbox(city);
		registerPage.sendKeysToStateTextbox(state);
		registerPage.sendKeysToZipCodeTextbox(zipCode);
		registerPage.sendKeysToSocialSecurityNumberTextbox(ssn);
		registerPage.sendKeysToUsernameTextbox(username);
		registerPage.sendKeysToPasswordTextbox(password);
		registerPage.sendKeysToConfirmPasswordTextbox(password);
		registerPage.clickRegisterButton();

		Assert.assertEquals(registerPage.getAccountCreatedSuccessfullyMessage(),
				"Your account was created successfully. You are now logged in.");
	}

	@Test
	public void TC_01_Look_Up_Customer_With_Empty_Data() {
		customerLookupPage = homepage.clickForgotLoginInfoLink();
		customerLookupPage.clickFindMyLoginInfoButton();

		Assert.assertEquals(customerLookupPage.getFirstNameErrorMessage(), "First name is required.");
		Assert.assertEquals(customerLookupPage.getLastNameErrorMessage(), "Last name is required.");
		Assert.assertEquals(customerLookupPage.getAddressErrorMessage(), "Address is required.");
		Assert.assertEquals(customerLookupPage.getCityErrorMessage(), "City is required.");
		Assert.assertEquals(customerLookupPage.getStateErrorMessage(), "State is required.");
		Assert.assertEquals(customerLookupPage.getZipCodeErrorMessage(), "Zip Code is required.");
		Assert.assertEquals(customerLookupPage.getSocialSecurityNumberErrorMessage(),
				"Social Security Number is required.");
	}

	@Test
	public void TC_02_Look_Up_Registered_Customer_With_Correct_Data() {
		customerLookupPage.sendKeysToFirstNameTextbox(firstName);
		customerLookupPage.sendKeysToLastNameTextbox(lastName);
		customerLookupPage.sendKeysToAddressTextbox(address);
		customerLookupPage.sendKeysToCityTextbox(city);
		customerLookupPage.sendKeysToStateTextbox(state);
		customerLookupPage.sendKeysToZipCodeTextbox(zipCode);
		customerLookupPage.sendKeysToSocialSecurityNumberTextbox(ssn);
		customerLookupPage.clickFindMyLoginInfoButton();

		Assert.assertEquals(customerLookupPage.getInfoMessage(),
				"Your login information was located successfully. You are now logged in.");
		Assert.assertTrue(customerLookupPage.getUsername().contains(username));
		Assert.assertTrue(customerLookupPage.getPassword().contains(password));

	}

	public void TC_03_Look_Up_Unregistered_Customer() {
		customerLookupPage.sendKeysToFirstNameTextbox(data.getFirstName());
		customerLookupPage.sendKeysToLastNameTextbox(data.getLastName());
		customerLookupPage.sendKeysToAddressTextbox(data.getAddress());
		customerLookupPage.sendKeysToCityTextbox(data.getCity());
		customerLookupPage.sendKeysToStateTextbox(data.getState());
		customerLookupPage.sendKeysToZipCodeTextbox(data.getZipCode());
		customerLookupPage.sendKeysToSocialSecurityNumberTextbox(data.getSocialSecurityNumber());
		customerLookupPage.clickFindMyLoginInfoButton();

		Assert.assertEquals(customerLookupPage.getInfoMessage(),
				"The customer information provided could not be found.");
	}

	@AfterClass(alwaysRun = true)
	public void afterClass() {
		closeBrowserAndDriver();
	}

	private WebDriver driver;
	private DataHelper data;
	private String firstName, lastName, address, city, state, zipCode, ssn, username, password;
	private UserHomepageObject homepage;
	private UserRegisterPageObject registerPage;
	private UserCustomerLookupPageObject customerLookupPage;
}
