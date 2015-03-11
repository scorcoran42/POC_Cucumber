package test_code;

import app_code.GCIWebdriver;
import app_code.MyGCIWebdriver;
import cucumber.api.PendingException;
import cucumber.api.java.After;
import cucumber.api.java.en.*;

public class StepDefs {
	private GCIWebdriver gciDriver;
	private MyGCIWebdriver myGciDriver;

	public void setUpWebDriver() throws Exception {
		gciDriver = new GCIWebdriver();
		gciDriver.setUp();
		gciDriver.goToHomePage();
	}
	
	public void setUpMyGciWebDriver() throws Exception {
		myGciDriver = new MyGCIWebdriver();
		myGciDriver.setUp();
		myGciDriver.goToMyGCI();
	}
	
	@After
	public void tearDown() throws Exception {
		myGciDriver.tearDown();
	}
	
	@Given("^I am on the homepage$")
	public void i_am_on_the_homepage() throws Throwable {
	    setUpWebDriver();
	}

	@When("^I click on Wireless$")
	public void i_click_on_Wireless() throws Throwable {
	    gciDriver.clickOnWireless();
	}

	@Then("^I'm taken to the Wireless page$")
	public void i_m_taken_to_the_Wireless_page() throws Throwable {
		gciDriver.checkWirelessPageTitle();
	}
	
	
	@When("^I click on Broadband$")
	public void i_click_on_Broadband() throws Throwable {
	    gciDriver.clickOnBroadband();
	}

	@Then("^I'm taken to the Broadband page$")
	public void i_m_taken_to_the_Broadband_page() throws Throwable {
		gciDriver.checkBroadbandPageTitle();
	}
	
	@Given("^I am on the myGCI login page$")
	public void i_am_on_the_myGCI_login_page() throws Throwable {
		setUpMyGciWebDriver();
	}

	@When("^I enter good credentials$")
	public void i_enter_good_credentials() throws Throwable {
	    // find username field and fill in valid username
		myGciDriver.goodUsername();
		// find password field and fill in valid password
		myGciDriver.goodPassword();
		// find Login button and click it
		myGciDriver.clickLogin();
	}

	@Then("^I'm taken to the myGCI home page$")
	public void i_m_taken_to_the_myGCI_home_page() throws Throwable {
		myGciDriver.checkMyGciPageTitle();
	}

	@When("^I enter bad credentials$")
	public void i_enter_bad_credentials() throws Throwable {
		// find username field and fill in valid username
		myGciDriver.goodUsername();
		// find password field and fill in bad password
		myGciDriver.badPassword();
		// find Login button and click it
		myGciDriver.clickLogin();
	}
	
	@Then("^I get a bad credentials error message$")
	public void i_get_a_bad_credentials_error_message() throws Throwable {
		myGciDriver.checkLoginError();
	}
	@When("^I don't enter a password$")
	public void i_don_t_enter_a_password() throws Throwable {
		myGciDriver.goodUsername();
		myGciDriver.clickLogin();
	}
	@Then("^I get a no password error message$")
	public void i_get_a_no_password_error_message() throws Throwable {
		myGciDriver.checkNoPasswordError();
	}
}
