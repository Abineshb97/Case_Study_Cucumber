
Feature: Search Engine
  User want to search some product but by typing first four letter itself the product name need to be suggested automatically


  Scenario: Search engine for searching some products
    Given start the browser and login in TestMe App 
    When search product in search engine as "HEAD"
    And proceed upto payment
    Then validation of successful end to end flow in TestMe App

 Scenario: Product name is wrongly entered in the search engine
 		Given Start the browser and proceed to TestMe App
 		When search product in search engine as "dress"
 		Then validate that no product in available message is shown correctly
 		
 Scenario: product name is left blank while searching
	Given Start the browser and proceed to TestMe App 
 	 When search product in search engine as ""
 	 Then validate if the popup displays for leaving the searchbar blank