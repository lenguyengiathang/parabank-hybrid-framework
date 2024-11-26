package pageUIs.paraBank.user;

public class UserCustomerLookupPageUI {

	public static final String FIRST_NAME_TEXTBOX = "id=firstName";
	public static final String LAST_NAME_TEXTBOX = "id=lastName";
	public static final String ADDRESS_TEXTBOX = "id=address.street";
	public static final String CITY_TEXTBOX = "id=address.city";
	public static final String STATE_TEXTBOX = "id=address.state";
	public static final String ZIP_CODE_TEXTBOX = "id=address.zipCode";
	public static final String SOCIAL_SECURITY_NUMBER_TEXTBOX = "id=ssn";
	public static final String FIND_MY_LOGIN_INFO_BUTTON = "css=input[value='Find My Login Info']";

	public static final String FIRST_NAME_ERROR_MESSAGE = FIRST_NAME_TEXTBOX + ".errors";
	public static final String LAST_NAME_ERROR_MESSAGE = LAST_NAME_TEXTBOX + ".errors";
	public static final String ADDRESS_ERROR_MESSAGE = ADDRESS_TEXTBOX + ".errors";
	public static final String CITY_ERROR_MESSAGE = CITY_TEXTBOX + ".errors";
	public static final String STATE_ERROR_MESSAGE = STATE_TEXTBOX + ".errors";
	public static final String ZIP_CODE_ERROR_MESSAGE = ZIP_CODE_TEXTBOX + ".errors";
	public static final String SOCIAL_SECURITY_NUMBER_ERROR_MESSAGE = SOCIAL_SECURITY_NUMBER_TEXTBOX + ".errors";
	public static final String INFO_MESSAGE = "css=h1~p";
	public static final String USERNAME = "xpath=//b[contains(text(),'Username')]/following-sibling::text()[1]";
	public static final String PASSWORD = "xpath=//b[contains(text(),'Password')]/following-sibling::text()";

}
