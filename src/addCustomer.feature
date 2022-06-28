@pro1
Feature: AddCustomer
  user needs no add a customer

  Background: user login using credentials
    Given user is at profile page

  @pro2
  Scenario Outline: click on add customer
    When user clicks on add customer
    
    And user clicks on add icom
    And user provide details "<firstname>""<lastname>""<email>""<telephone>""<fax>""<password>""<confirm>"
    
    And user save the customer details
    Then customer save successfully

    Examples: 
      | firstname| lastname | telephone |fax  |password |confirm |
      | amit  | luthra      | 12344635  |345345|afsa44  |afsa44| 
      | marques  | brownlee   | 31311|2325125|afsa44ssa  |afsa44ssa|