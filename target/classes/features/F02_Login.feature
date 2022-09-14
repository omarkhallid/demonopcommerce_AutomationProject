@smoke
Feature: F02_Login | users could use login functionality to use their accounts
  Scenario: user could login with valid email and password
    Given user go to login page
    And user enter valid email"omar15fire@gmail.com"
    And user enter valid Password"654321"
    When user press on login button
    Then user login to the system successfully
@smoke
  Scenario: user couldn't login with Invalid email and password
    Given user go to login page
    And user enter invalid email field
    And user enter invalid Password field
    When user press on login button
    Then user couldn't login to the system


