
Feature: TestMe App
  User wanna signup and login in the TestMe App 

Scenario: SignUp to TestMe App
Given Open browser and proceed to TestMe App
When User enters User Name as "HolaAmigoo"
And User enters First Name as "Hola"
And User enters Last Name as "Amigo"
And User enters Password as "HoLaAmIgO"
And User enters Confirm Password as "HoLaAmIgO"
And User select gender
And User enters E -Mail as "holaamigo@gmail.com"
And User enters Mobile Number as "9876543210"
And User enters DOB as "10/10/2010"
And User enters Address as "YYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYY"
And User enters Answer as "on earth"
And User clicks on register button
Then Check if TestMe App login page is displayed
  

 # @tag2
 # Scenario Outline: Title of your scenario outline
 #   Given I want to write a step with <name>
 
 #   When I check for the <value> in step
 #   Then I verify the <status> in step

 #   Examples: 
 #     | name  | value | status  |
 #     | name1 |     5 | success |
 #     | name2 |     7 | Fail    |
