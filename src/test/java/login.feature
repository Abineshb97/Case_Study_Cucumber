

Feature: LOGIN 
  User want to login to TestMe App

  Scenario Outline: LOGIN PROCESS 
    Given start browser and proceed to login in TestMe App 
    When   username "<name>" password "<name1>" 
    Then check if login is successful

    Examples: 
      | name  ||name1| 
      |lalitha||Password123| 
      |HolaAmigo||HoLaAmIgO|
