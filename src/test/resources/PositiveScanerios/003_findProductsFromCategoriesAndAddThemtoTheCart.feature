Feature:
  Scenario:
    Given Go to the Main Page
    Then Click to All Categories button
    Then Select Category "Erkek"
    Then Select Sub Category for Text List "Ayakkabı"
    Then Select Sub Category for Image List "Sneaker"
    Then Select the Product
    Then Add To Cart
    Then Go to Cart
    Then Check that the price is correct when the number of products increases
    And Click to Trash Button for delete all products in Cart