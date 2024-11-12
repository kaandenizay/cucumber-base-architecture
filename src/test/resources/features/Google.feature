@google @regression @smoke
Feature: Google Functionality

  Scenario: Google search test

    Given Go to Google Page
    When  User types "Türkiye" to search box
    And   User clicks the query result after search
