
Feature: Pay Bills Menu
  Background:
    Given the user is on the login page
    When the user enter the valid information
    And the user navigates to Account Pay Bills page

  Scenario: Pay Bills page title is Zero-Pay Bills is displayed
    Then the page is displayed "Zero - Pay Bills"

  Scenario:The user completes a Pay operation
      When the user enter payee dropdownBox
      And the user enter account dropdownbox
      And the user enter amount box
      And the user enter date box
      And the user enter description
      And the user enter submit button
      Then the message The payment was successfully submitted should be displayed

  Scenario:the user tries to make a payment without entering amount
    When the user enter payee dropdownBox
    And the user enter account dropdownbox
    And the user enter amount box empty
    And the user enter date box
    And the user enter description
    And the user enter submit button
    Then the alert message displays Please fill in this field

