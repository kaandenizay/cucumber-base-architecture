@firstScenario
Feature: Scenario Example

  Scenario: go to web site and login test

    Given Go to Login Page
    When  User types "Kaan" as username
    And   User types "Test1234" as password
    And   User clicks button
    Then  User should see the success message
