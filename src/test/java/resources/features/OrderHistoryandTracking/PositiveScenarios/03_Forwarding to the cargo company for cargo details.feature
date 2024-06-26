Feature:Display order history correctly
  Scenario:Display order history correctly
    Given Go to the Main Page
    Then Click to My Account Button
    And Click to My All Orders Button
    When the user clicks on an order
    Then Click to Shipment Details button
    Then Forwarding to the cargo company for cargo details