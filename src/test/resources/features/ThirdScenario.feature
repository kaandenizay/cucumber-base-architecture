@firstScenario
Feature: Scenario Example Outline

  Scenario Outline: go to web site and login test

    Given Go to Login Page
    When  User types "<username>" as username
    And   User types "<password>" as password
    And   User clicks button
    Then  User should see the success message
    Examples:
      | username  | password    |
      | Kaan      | Test1234    |
      | Denizay   | Test1234    |

