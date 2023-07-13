@regration @smoke @Cap-A-02
Feature: Ebay Cart  Functionality

Description: User should able to add items in cart

	Background:
				Given Open Ebay Homepage
		
		
	Scenario: Ebay cart functionality
		Given Search for Big Tall Cotton Tee Made Usa
		When Select the first item on the item list
		And Select Size
		And Select men size
		And select shade
		And Select quantity
		Then Add to shopping cart
			
