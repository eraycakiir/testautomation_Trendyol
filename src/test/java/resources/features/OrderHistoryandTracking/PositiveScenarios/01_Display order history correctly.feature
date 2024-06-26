Feature:Display order history correctly
  Scenario:Display order history correctly
    Given Go to the Main Page
    Then Click to My Account Button
    And Click to My All Orders Button
    Then the user should see a list of all past orders with correct details
