Feature: Test myGCI login
@Runme
Scenario: Login to myGCI.com with good credentials
	Given I am on the myGCI login page
	When I enter good credentials
	Then I'm taken to the myGCI home page
	
@Runme
Scenario: Login to myGCI.com with bad credentials
	Given I am on the myGCI login page
	When I enter bad credentials
	Then I get a bad credentials error message
	
@Runme
Scenario: Login without a password
	Given I am on the myGCI login page
	When I don't enter a password
	Then I get a no password error message