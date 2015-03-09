Feature: Test myGCI login
@Runme
Scenario: Login to myGCI.com with good credentials
	Given I am on the myGCI login page
	When I enter good credentials
	Then I'm taken to the MyGCI.com home page
	
@Runme
Scenario: Login to myGCI.com with bad credentials
	Given I am on the myGCI login page
	When I enter bad credentials
	Then I get a bad credentials error message