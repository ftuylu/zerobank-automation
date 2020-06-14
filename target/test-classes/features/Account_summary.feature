
Feature: Account Summary page

  Background:
    Given the user is on the login page
    And the user enter the valid information
    Then the user navigates to Account Summary page

  Scenario: Account Summary page title is Zero-Account summary displayed
    And the page is displayed "Zero - Account Summary"

  Scenario: Account Summary Page menu options
    When Account Summary Page should have to following account types
      | Cash Accounts       |
      | Investment Accounts |
      | Credit Accounts     |
      | Loan Accounts       |

  Scenario:Credit Account table columns
    When Credit account table have following columns
      | Account     |
      | Credit Card |
      | Balance     |

