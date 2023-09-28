Feature: Adding functionality

  Background:
    Given Navigate to Cleverppc
    When Click to sign in
    When Send keys email as "teamone.techno@gmail.com" password as "987654321"
    Then Welcome message should be displayed

  Scenario: Adding a new address

    When Click the sitemap button. Then click on the addresses button. Add a new address to the page that opens.
    Then The user should successfully add a new address.