package pageUIs.paraBank.user;

public class UserRegisterPageUI {
	public static final String FIRST_NAME_TEXTBOX = "id=customer.firstName";
	public static final String LAST_NAME_TEXTBOX = "id=customer.lastName";
	public static final String ADDRESS_TEXTBOX = "id=customer.address.street";
	public static final String CITY_TEXTBOX = "id=customer.customer.address.city";
	public static final String STATE_TEXTBOX = "id=customer.address.state";
	public static final String ZIP_CODE_TEXTBOX = "id=customer.customer.address.zipCode";
	public static final String PHONE_TEXTBOX = "id=customer.phoneNumber";
	public static final String SOCIAL_SECURITY_NUMBER_TEXTBOX = "id=customer.ssn";
	public static final String USERNAME_TEXTBOX = "id=customer.username";
	public static final String PASSWORD_TEXTBOX = "id=customer.password";
	public static final String CONFIRM_PASSWORD_TEXTBOX = "id=repeatedPassword";

	public static final String REGISTER_BUTTON = "css=input[value='Register']";

	public static final String FIRST_NAME_ERROR_MESSAGE = FIRST_NAME_TEXTBOX + "errors";
	public static final String LAST_NAME_ERROR_MESSAGE = LAST_NAME_TEXTBOX + "errors";
	public static final String ADDRESS_ERROR_MESSAGE = ADDRESS_TEXTBOX + "errors";
	public static final String CITY_ERROR_MESSAGE = CITY_TEXTBOX + "errors";
	public static final String STATE_ERROR_MESSAGE = STATE_TEXTBOX + "errors";
	public static final String ZIP_CODE_ERROR_MESSAGE = ZIP_CODE_TEXTBOX + "errors";
	public static final String SOCIAL_SECURITY_NUMBER_ERROR_MESSAGE = SOCIAL_SECURITY_NUMBER_TEXTBOX + "errors";
	public static final String USERNAME_ERROR_MESSAGE = USERNAME_TEXTBOX + "errors";
	public static final String PASSWORD_ERROR_MESSAGE = PASSWORD_TEXTBOX + "errors";
	public static final String CONFIRM_PASSWORD_ERROR_MESSAGE = CONFIRM_PASSWORD_TEXTBOX + "errors";
	public static final String WELCOME_MESSAGE = "css=h1.title";
	public static final String ACCOUNT_CREATED_SUCCESSFULLY_MESSAGE = WELCOME_MESSAGE + "~p";

}
