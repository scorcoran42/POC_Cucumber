package test_code;

import app_code.GCIWebdriver;
import cucumber.api.PendingException;
import cucumber.api.java.After;
import cucumber.api.java.en.*;

public class StepDefs {
	private GCIWebdriver gciDriver;

	public void setUpWebDriver() throws Exception {
		gciDriver = new GCIWebdriver();
		gciDriver.setUp();
		gciDriver.goToHomePage();
	}
	
	@After
	public void tearDown() throws Exception {
		gciDriver.tearDown();
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
	    // Write code here that turns the phrase above into concrete actions
	    throw new PendingException();
	}

	@When("^I enter good credentials$")
	public void i_enter_good_credentials() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    throw new PendingException();
	}

	@Then("^I'm taken to the GCI\\.com home page$")
	public void i_m_taken_to_the_GCI_com_home_page() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    throw new PendingException();
	}

	@When("^I enter bad credentials$")
	public void i_enter_bad_credentials() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    throw new PendingException();
	}
}
