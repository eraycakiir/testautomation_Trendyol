Feature:Display order order status and details
  Scenario:Display order status and details
    Given Go to the Main Page
    Then Click to My Account Button
    And Click to My All Orders Button
    When the user clicks on an order
    Then the user should see the order status and detailed information