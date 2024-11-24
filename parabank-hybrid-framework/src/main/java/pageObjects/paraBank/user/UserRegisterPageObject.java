package pageObjects.paraBank.user;

import org.openqa.selenium.WebDriver;

import commons.BasePage;
import pageUIs.paraBank.user.UserRegisterPageUI;

public class UserRegisterPageObject extends BasePage {
	private WebDriver driver;

	public UserRegisterPageObject(WebDriver driver) {
		this.driver = driver;
	}

	public void sendKeysToFirstNameTextbox(String firstName) {
		waitForElementVisible(driver, UserRegisterPageUI.FIRST_NAME_TEXTBOX);
		sendKeysToElement(driver, UserRegisterPageUI.FIRST_NAME_TEXTBOX, firstName);
	}

	public void sendKeysToLastNameTextbox(String lastName) {
		waitForElementVisible(driver, UserRegisterPageUI.LAST_NAME_TEXTBOX);
		sendKeysToElement(driver, UserRegisterPageUI.LAST_NAME_TEXTBOX, lastName);
	}

	public void sendKeysToAddressTextbox(String address) {
		waitForElementVisible(driver, UserRegisterPageUI.ADDRESS_TEXTBOX);
		sendKeysToElement(driver, UserRegisterPageUI.ADDRESS_TEXTBOX, address);
	}

	public void sendKeysToCityTextbox(String city) {
		waitForElementVisible(driver, UserRegisterPageUI.CITY_TEXTBOX);
		sendKeysToElement(driver, UserRegisterPageUI.CITY_TEXTBOX, city);
	}

	public void sendKeysToStateTextbox(String state) {
		waitForElementVisible(driver, UserRegisterPageUI.STATE_TEXTBOX);
		sendKeysToElement(driver, UserRegisterPageUI.STATE_TEXTBOX, state);
	}

	public void sendKeysToZipCodeTextbox(String zipCode) {
		waitForElementVisible(driver, UserRegisterPageUI.ZIP_CODE_TEXTBOX);
		sendKeysToElement(driver, UserRegisterPageUI.ZIP_CODE_TEXTBOX, zipCode);
	}

	public void sendKeysToPhoneTextbox(String phone) {
		waitForElementVisible(driver, UserRegisterPageUI.PHONE_TEXTBOX);
		sendKeysToElement(driver, UserRegisterPageUI.PHONE_TEXTBOX, phone);
	}

	public void sendKeysToSocialSecurityNumberTextbox(String ssn) {
		waitForElementVisible(driver, UserRegisterPageUI.SOCIAL_SECURITY_NUMBER_TEXTBOX);
		sendKeysToElement(driver, UserRegisterPageUI.SOCIAL_SECURITY_NUMBER_TEXTBOX, ssn);
	}

	public void sendKeysToUsernameTextbox(String username) {
		waitForElementVisible(driver, UserRegisterPageUI.USERNAME_TEXTBOX);
		sendKeysToElement(driver, UserRegisterPageUI.USERNAME_TEXTBOX, username);
	}

	public void sendKeysToPasswordTextbox(String password) {
		waitForElementVisible(driver, UserRegisterPageUI.PASSWORD_TEXTBOX);
		sendKeysToElement(driver, UserRegisterPageUI.PASSWORD_TEXTBOX, password);
	}

	public void sendKeysToConfirmPasswordTextbox(String confirmPassword) {
		waitForElementVisible(driver, UserRegisterPageUI.CONFIRM_PASSWORD_TEXTBOX);
		sendKeysToElement(driver, UserRegisterPageUI.CONFIRM_PASSWORD_TEXTBOX, confirmPassword);
	}

	public void clickRegisterButton() {
		waitForElementClickable(driver, UserRegisterPageUI.REGISTER_BUTTON);
		clickElement(driver, UserRegisterPageUI.REGISTER_BUTTON);
	}

	public String getFirstNameErrorMessage() {
		waitForElementVisible(driver, UserRegisterPageUI.FIRST_NAME_ERROR_MESSAGE);
		return getElementText(driver, UserRegisterPageUI.FIRST_NAME_ERROR_MESSAGE);
	}

	public String getLastNameErrorMessage() {
		waitForElementVisible(driver, UserRegisterPageUI.LAST_NAME_ERROR_MESSAGE);
		return getElementText(driver, UserRegisterPageUI.LAST_NAME_ERROR_MESSAGE);
	}

	public String getAddressErrorMessage() {
		waitForElementVisible(driver, UserRegisterPageUI.ADDRESS_ERROR_MESSAGE);
		return getElementText(driver, UserRegisterPageUI.ADDRESS_ERROR_MESSAGE);
	}

	public String getCityErrorMessage() {
		waitForElementVisible(driver, UserRegisterPageUI.CITY_ERROR_MESSAGE);
		return getElementText(driver, UserRegisterPageUI.CITY_ERROR_MESSAGE);
	}

	public String getStateErrorMessage() {
		waitForElementVisible(driver, UserRegisterPageUI.STATE_ERROR_MESSAGE);
		return getElementText(driver, UserRegisterPageUI.STATE_ERROR_MESSAGE);
	}

	public String getZipCodeErrorMessage() {
		waitForElementVisible(driver, UserRegisterPageUI.ZIP_CODE_ERROR_MESSAGE);
		return getElementText(driver, UserRegisterPageUI.ZIP_CODE_ERROR_MESSAGE);
	}

	public String getSocialSecurityNumberErrorMessage() {
		waitForElementVisible(driver, UserRegisterPageUI.SOCIAL_SECURITY_NUMBER_ERROR_MESSAGE);
		return getElementText(driver, UserRegisterPageUI.SOCIAL_SECURITY_NUMBER_ERROR_MESSAGE);
	}

	public String getUsernameErrorMessage() {
		waitForElementVisible(driver, UserRegisterPageUI.USERNAME_ERROR_MESSAGE);
		return getElementText(driver, UserRegisterPageUI.USERNAME_ERROR_MESSAGE);
	}

	public String getPasswordErrorMessage() {
		waitForElementVisible(driver, UserRegisterPageUI.PASSWORD_ERROR_MESSAGE);
		return getElementText(driver, UserRegisterPageUI.PASSWORD_ERROR_MESSAGE);
	}

	public String getConfirmPasswordErrorMessage() {
		waitForElementVisible(driver, UserRegisterPageUI.CONFIRM_PASSWORD_ERROR_MESSAGE);
		return getElementText(driver, UserRegisterPageUI.CONFIRM_PASSWORD_ERROR_MESSAGE);
	}

	public String getWelcomeMessage() {
		waitForElementVisible(driver, UserRegisterPageUI.WELCOME_MESSAGE);
		return getElementText(driver, UserRegisterPageUI.WELCOME_MESSAGE);
	}

	public String getAccountCreatedSuccessfullyMessage() {
		waitForElementVisible(driver, UserRegisterPageUI.ACCOUNT_CREATED_SUCCESSFULLY_MESSAGE);
		return getElementText(driver, UserRegisterPageUI.ACCOUNT_CREATED_SUCCESSFULLY_MESSAGE);
	}

}
