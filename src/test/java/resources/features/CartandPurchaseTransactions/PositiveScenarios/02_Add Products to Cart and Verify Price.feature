Feature: Add Products to Cart and Verify Price
  Scenario: Add Products to Cart and Verify Price
    Given Go to the Main Page
    Then Click to All Categories button
    Then Select Category
    Then Select Sub Category for Text List
    Then Select Sub Category for Image List
    Then Select the Product
    Then Add To Cart
    Then Go to Cart
    Then Check that the price is correct when the number of products increases
    And Click to Trash Button for delete all products in Cart