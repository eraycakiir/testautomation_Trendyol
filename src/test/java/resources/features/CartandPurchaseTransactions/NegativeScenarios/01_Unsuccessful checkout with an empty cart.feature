Feature: : Unsuccessful checkout with an empty cart

  Scenario: Unsuccessful checkout with an empty cart

    Given Go to the Main Page
    Then Click to All Categories button
    Then Select Category
    Then Select Sub Category for Text List
    Then Select Sub Category for Image List
    Then Select the Product
    Then Add To Cart
    Then Go to Cart
    And Delete Product from cart
    When the user attempts to place an order
    Then the user should see an error message indicating the cart is empty
