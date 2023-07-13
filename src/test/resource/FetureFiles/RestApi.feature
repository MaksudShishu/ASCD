@regration @api @CAP-10 @E2E
Feature: Petstore API Resting

Scenario: Pet CRUD API

		Given Create The pet
		And Get the pet
		When Update the pet
		Then Delete the pet
		
		