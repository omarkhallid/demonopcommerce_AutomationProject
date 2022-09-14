@smoke
Feature: F04 users search for products with different parameters
  Scenario Outline: user could search for product using product name
  Given user go to Search Page
  When link of page is valid and user search withPN "<productName>"
  Then user could find "<productName>"
  Examples:
    |productName|
    |book|
    |Laptop|
    |nike|

 @smoke
  Scenario Outline: user could search for product using sku
    Given user go to Search Page
    When user search with "<sku>"
    Then user could find defined "<sku>"
    Examples:
    |sku|
    |SCI_FAITH|
    |APPLE_CAM|
    |SF_PRO_11|