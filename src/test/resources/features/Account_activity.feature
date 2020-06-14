
Feature: Account Activity Page

  Background:
    Given the user is on the login page
    And the user enter the valid information
    Then the user navigates to Account Activity page

  Scenario: Account Activity page title is Zero-Account activity displayed
    Then the page is displayed "Zero - Account Activity"

  Scenario: Drop down default option should be savings
    Then Account drop down default option should be savings

  Scenario: Account drop down should have the following options
    Then Account drop down have following options
      | Savings     |
      | Checking    |
      | Savings     |
      | Loan        |
      | Credit Card |
      | Brokerage   |

  Scenario:Transaction table column labes
    Then Transaction table have following column names
      | Date        |
      | Description |
      | Deposit     |
      | Withdrawal  |

