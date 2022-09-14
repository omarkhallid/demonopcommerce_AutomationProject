  @smoke
  Feature: F01_Register | users could register with new accounts
  Scenario: guest user could register with valid data successfully
  Given user go to register page
    And user select gender type
    And user enter first name "automation" and last name "tester"
    And user enter date of birth
    And user enter valid email"omar15fire@gmail.com"
    And user enter his Company name
    And user enter valid Password"654321"
    And user fills Confirm Password field
    When user clicks on register button
    Then success message is displayed