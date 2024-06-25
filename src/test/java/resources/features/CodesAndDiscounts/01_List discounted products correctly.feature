Feature: List discounted products correctly
  Scenario: List discounted products correctly
    Given Go to the Main Page
    Then the user is on the discounts page
    Then the user should see all discounted products listed correctly
