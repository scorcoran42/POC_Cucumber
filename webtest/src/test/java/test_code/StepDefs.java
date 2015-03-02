package test_code;

import app_code.GCIWebdriver;
import cucumber.api.PendingException;
import cucumber.api.java.After;
import cucumber.api.java.en.*;

public class StepDefs {
	private GCIWebdriver script;

	public void setUpWebDriver() throws Exception {
		script = new GCIWebdriver();
		script.setUp();
		script.goToHomePage();
	}
/*
	public void tidyUp() {
		script.tearDown();
	}*/
	
	@Given("^I am on the homepage$")
	public void i_am_on_the_homepage() throws Throwable {
	    setUpWebDriver();
	}

	@When("^I click on Wireless$")
	public void i_click_on_Wireless() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    script.clickOnWireless();
	}

	@Then("^I'm taken to the Wireless page$")
	public void i_m_taken_to_the_Wireless_page() throws Throwable {
		script.checkPageTitle();
	}
	
	@After
	public void tearDown() throws Exception {
		script.tearDown();
	}

}
