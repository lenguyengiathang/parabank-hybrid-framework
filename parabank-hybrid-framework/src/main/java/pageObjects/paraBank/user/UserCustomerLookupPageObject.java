package pageObjects.paraBank.user;

import org.openqa.selenium.WebDriver;

import commons.BasePage;
import pageUIs.paraBank.user.UserCustomerLookupPageUI;

public class UserCustomerLookupPageObject extends BasePage {

	private WebDriver driver;

	public UserCustomerLookupPageObject(WebDriver driver) {
		this.driver = driver;
	}

	public void sendKeysToFirstNameTextbox(String firstName) {
		waitForElementVisible(driver, UserCustomerLookupPageUI.FIRST_NAME_TEXTBOX);
		sendKeysToElement(driver, UserCustomerLookupPageUI.FIRST_NAME_TEXTBOX, firstName);
	}

	public void sendKeysToLastNameTextbox(String lastName) {
		waitForElementVisible(driver, UserCustomerLookupPageUI.LAST_NAME_TEXTBOX);
		sendKeysToElement(driver, UserCustomerLookupPageUI.LAST_NAME_TEXTBOX, lastName);
	}

	public void sendKeysToAddressTextbox(String address) {
		waitForElementVisible(driver, UserCustomerLookupPageUI.ADDRESS_TEXTBOX);
		sendKeysToElement(driver, UserCustomerLookupPageUI.ADDRESS_TEXTBOX, address);
	}

	public void sendKeysToCityTextbox(String city) {
		waitForElementVisible(driver, UserCustomerLookupPageUI.CITY_TEXTBOX);
		sendKeysToElement(driver, UserCustomerLookupPageUI.CITY_TEXTBOX, city);
	}

	public void sendKeysToStateTextbox(String state) {
		waitForElementVisible(driver, UserCustomerLookupPageUI.STATE_TEXTBOX);
		sendKeysToElement(driver, UserCustomerLookupPageUI.STATE_TEXTBOX, state);
	}

	public void sendKeysToZipCodeTextbox(String zipCode) {
		waitForElementVisible(driver, UserCustomerLookupPageUI.ZIP_CODE_TEXTBOX);
		sendKeysToElement(driver, UserCustomerLookupPageUI.ZIP_CODE_TEXTBOX, zipCode);
	}

	public void sendKeysToSocialSecurityNumberTextbox(String ssn) {
		waitForElementVisible(driver, UserCustomerLookupPageUI.SOCIAL_SECURITY_NUMBER_TEXTBOX);
		sendKeysToElement(driver, UserCustomerLookupPageUI.SOCIAL_SECURITY_NUMBER_TEXTBOX, ssn);
	}

	public void clickFindMyLoginInfoButton() {
		waitForElementClickable(driver, UserCustomerLookupPageUI.FIND_MY_LOGIN_INFO_BUTTON);
		clickElement(driver, UserCustomerLookupPageUI.FIND_MY_LOGIN_INFO_BUTTON);
	}

	public String getFirstNameErrorMessage() {
		waitForElementVisible(driver, UserCustomerLookupPageUI.FIRST_NAME_ERROR_MESSAGE);
		return getElementText(driver, UserCustomerLookupPageUI.FIRST_NAME_ERROR_MESSAGE);
	}

	public String getLastNameErrorMessage() {
		waitForElementVisible(driver, UserCustomerLookupPageUI.LAST_NAME_ERROR_MESSAGE);
		return getElementText(driver, UserCustomerLookupPageUI.LAST_NAME_ERROR_MESSAGE);
	}

	public String getAddressErrorMessage() {
		waitForElementVisible(driver, UserCustomerLookupPageUI.ADDRESS_ERROR_MESSAGE);
		return getElementText(driver, UserCustomerLookupPageUI.ADDRESS_ERROR_MESSAGE);
	}

	public String getCityErrorMessage() {
		waitForElementVisible(driver, UserCustomerLookupPageUI.CITY_ERROR_MESSAGE);
		return getElementText(driver, UserCustomerLookupPageUI.CITY_ERROR_MESSAGE);
	}

	public String getStateErrorMessage() {
		waitForElementVisible(driver, UserCustomerLookupPageUI.STATE_ERROR_MESSAGE);
		return getElementText(driver, UserCustomerLookupPageUI.STATE_ERROR_MESSAGE);
	}

	public String getZipCodeErrorMessage() {
		waitForElementVisible(driver, UserCustomerLookupPageUI.ZIP_CODE_ERROR_MESSAGE);
		return getElementText(driver, UserCustomerLookupPageUI.ZIP_CODE_ERROR_MESSAGE);
	}

	public String getSocialSecurityNumberErrorMessage() {
		waitForElementVisible(driver, UserCustomerLookupPageUI.SOCIAL_SECURITY_NUMBER_ERROR_MESSAGE);
		return getElementText(driver, UserCustomerLookupPageUI.SOCIAL_SECURITY_NUMBER_ERROR_MESSAGE);
	}

	public String getInfoMessage() {
		waitForElementVisible(driver, UserCustomerLookupPageUI.INFO_MESSAGE);
		return getElementText(driver, UserCustomerLookupPageUI.INFO_MESSAGE);
	}

	public String getUsername() {
		waitForElementVisible(driver, UserCustomerLookupPageUI.USERNAME);
		return getElementText(driver, UserCustomerLookupPageUI.USERNAME);
	}

	public String getPassword() {
		waitForElementVisible(driver, UserCustomerLookupPageUI.PASSWORD);
		return getElementText(driver, UserCustomerLookupPageUI.PASSWORD);
	}
}
