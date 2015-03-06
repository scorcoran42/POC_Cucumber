Feature: Testing GCI website
@Runme
Scenario: Go to Wireless page
	Given I am on the homepage
	When I click on Wireless
	Then I'm taken to the Wireless page

@Runme
Scenario: Go to Broadband page
	Given I am on the homepage
	When I click on Broadband
	Then I'm taken to the Broadband page
	
@Runme
Scenario: Login to myGCI.com with good credentials
	Given I am on the myGCI login page
	When I enter good credentials
	Then I'm taken to the GCI.com home page
	
@Runme
Scenario: Login to myGCI.com with bad credentials
	Given I am on the myGCI login page
	When I enter bad credentials
	Then I'm taken to the Broadband page