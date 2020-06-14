Feature: Navigation Menu

  Background:
    Given the user is on the login page

  Scenario: Navigating Account Summary
    And the user enter the valid information
    Then the user navigates to Account Summary page

  Scenario: Navigating Account Activity
    And the user enter the valid information
    Then the user navigates to Account Activity page

  Scenario: Navigating Pay Bills
    And the user enter the valid information
    Then the user navigates to Account Pay Bills page

  Scenario: Navigating Transfer Funds
    And the user enter the valid information
    Then the user navigates to Transfer Funds page

  @wip2
  Scenario Outline: Navigating  following <page>
    And the user enter the valid information
    Then the user navigates to following "<page>"
    And the title should be following "<title>"
    Examples:
      | page              | title                   |
      | Account Summary   | Zero - Account Summary  |
      | Account Activity  | Zero - Account Activity |
      | Account Pay Bills | Zero - Pay Bills        |

