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