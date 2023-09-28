Feature: Add To Cart List functionality

  Background:
    Given Navigate to Cleverppc
    When Click to sign in
    When Send keys email as "teamone.techno@gmail.com" password as "987654321"
    Then Welcome message should be displayed

  Scenario: Add To Cart List

    And Click to Dresses
    And Click to Add to card and continue shopping
    Then Verify products and product amount
