Feature: Shopping Cart and Checkout

  Scenario: Adding products to the cart
    Given Go to the Main Page
    Then Click to All Categories button
    Then Select Category
    Then Select Sub Category for Text List
    Then Select Sub Category for Image List
    Then Select the Product
    Then Add To Cart
    Then Go to Cart
    Then the product should be added to the cart
    And the cart should be updated correctly