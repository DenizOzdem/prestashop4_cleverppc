Feature:Order and Payment

Background:
Given Navigate to Cleverppc
When Click to sign in and enter valid email and password and click sign in
Then User should login successfully

  @Smoke @Regression
  Scenario: Order and Payment

    When User clicks on cart or Checkout button
    Then User then selects an address
    And  User ticks the post method and terms of service
    Then User select proceeds with the payment process
    And  Payment via Paypal is selected and a warning message should appear
    Then User then navigate back and clicks on Pay by Credit Card and the warning message should appear.
    And  User navigate back and clicks on Bank payment
    Then User sees that the total price equals the shipping price and taxes
    And  The order number is recorded