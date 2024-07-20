Feature:Send and receive messages successfully
  Scenario:Send and receive messages successfully
    Given Go to the Main Page
    Then Click to All Categories button
    Then Select Category
    Then Select Sub Category for Text List
    Then Select Sub Category for Image List
    Then Select the Product
    Then Click to Product reviews
    When the user attempts to send a message with incomplete or incorrect information
    Then the user should see an error message
