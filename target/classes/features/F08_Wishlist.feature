
#I have mixed two scenarios in one scenario but all functionalities are included
@smoke
Feature: user able to add products to his wishlist
  Scenario: validation message displayed after adding product to user's wishlist
    Given user check number of products
    When user click on wishlist button
    Then validation message displayed that product is added
    And assert success message and check qty is bigger than zero

