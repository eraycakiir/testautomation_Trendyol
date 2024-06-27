Feature: Shopping Cart and Checkout

  Scenario: Successful Checkout with valid Information
    Given Go to the Main Page
    Then Click to All Categories button
    Then Select Category
    Then Select Sub Category for Text List
    Then Select Sub Category for Image List
    Then Select the Product
    Then Add To Cart
    Then Go to Cart
    And the user selects a payment method