Feature: Apply valid campaign codes
  Scenario: Apply valid campaign codes
    Given Go to the Main Page
    Then the user is on the discounts page
    Then Select Product
    When the user enters a valid campaign code
    And the user applies the code
    Then the discount should be applied correctly
    And the user should see the updated total amount
