Feature: Login functionality

  Background:
    Given Navigate to Cleverppc
    When Click to sign in
    When Send keys email as "teamone.techno@gmail.com" password as "987654321"
    Then Welcome message should be displayed

  Scenario: Login with valid email and password and click sign in

    And navigate to summer dresses
    When user selects a random dress and click add to cart button
    And product should be successfully added to the cart