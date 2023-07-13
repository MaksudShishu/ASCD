@regression @smoke @CA-05 @E2E
Feature: Ebay Sign in Functionality

		Background:
		Given Open Ebay Homepage
	
			
	Scenario: Sign in to ebay
		When click on Sign in
		And click textbox & email or username 
		And click on contune button
		And click on textbox and enter Password
		And click in Sign in button
	  Then user should able to Sign in the homepage
		
