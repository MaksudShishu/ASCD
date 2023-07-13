@regration @smoke @CA-01 @E2E
Feature: Ebay Brand Outline

Description: User should able to filter items by Brand

Scenario Outline: Filter items by Brand
		Given Open Ebay Homepage
		And Search for "<Items>"
		When Filter by "<Brand>"
		Then Item list should have products of "<Brand>"
		
		Examples:
					|Items				|Brand					|
					|Sunglasses		|Gucci					|
					|Waches				|Rolex					|
					|Perfumes			|Chanel					|

