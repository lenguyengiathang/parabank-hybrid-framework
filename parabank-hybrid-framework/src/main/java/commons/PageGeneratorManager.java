package commons;

import org.openqa.selenium.WebDriver;

import pageObjects.paraBank.user.UserAccountServicesPageObject;
import pageObjects.paraBank.user.UserAccountsOverviewPageObject;
import pageObjects.paraBank.user.UserBillPayPageObject;
import pageObjects.paraBank.user.UserCustomerLookupPageObject;
import pageObjects.paraBank.user.UserFindTransactionsPageObject;
import pageObjects.paraBank.user.UserHomepageObject;
import pageObjects.paraBank.user.UserOpenNewAccountPageObject;
import pageObjects.paraBank.user.UserRegisterPageObject;
import pageObjects.paraBank.user.UserRequestLoanPageObject;
import pageObjects.paraBank.user.UserTransferFundsPageObject;
import pageObjects.paraBank.user.UserUpdateContactInfoPageObject;

public class PageGeneratorManager {
	public static UserHomepageObject getUserHomepage(WebDriver driver) {
		return new UserHomepageObject(driver);
	}

	public static UserRegisterPageObject getUserRegisterPage(WebDriver driver) {
		return new UserRegisterPageObject(driver);
	}

	public static UserCustomerLookupPageObject getUserCustomerLookupPage(WebDriver driver) {
		return new UserCustomerLookupPageObject(driver);
	}

	public static UserAccountServicesPageObject getAccountServicesPage(WebDriver driver) {
		return new UserAccountServicesPageObject(driver);
	}

	public static BasePage getOpenNewAccountPage(WebDriver driver) {
		return new UserOpenNewAccountPageObject(driver);
	}

	public static BasePage getAccountsOverviewPage(WebDriver driver) {
		return new UserAccountsOverviewPageObject(driver);
	}

	public static BasePage getTransferFundsPage(WebDriver driver) {
		return new UserTransferFundsPageObject(driver);
	}

	public static BasePage getBillPayPage(WebDriver driver) {
		return new UserBillPayPageObject(driver);
	}

	public static BasePage getFindTransactionsPage(WebDriver driver) {
		return new UserFindTransactionsPageObject(driver);
	}

	public static BasePage getUpdateContactInfoPage(WebDriver driver) {
		return new UserUpdateContactInfoPageObject(driver);
	}

	public static BasePage getRequestLoanPage(WebDriver driver) {
		return new UserRequestLoanPageObject(driver);
	}
}
