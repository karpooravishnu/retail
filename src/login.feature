@pro
Feature: login 
  user needs to login on website

  Background: Trying to login
    Given user is on the login page
    When user clicks on the login 

  @pro2
  Scenario Outline: user login
    And user provide details  "<username>" "<password>"
    And user clicks on login
    Then user able to login 

    Examples: 
      |username | password |
      | admin   | Admin@123| 

  