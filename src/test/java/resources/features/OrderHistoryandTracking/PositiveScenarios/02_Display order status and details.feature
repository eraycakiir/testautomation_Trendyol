Feature:Display order history correctly
  Scenario:Display order history correctly
    Given Go to the Main Page
    Then Click to My Account Button
    And Click to My All Orders Button
    When the user clicks on an order
    Then the user should see the order status and detailed information