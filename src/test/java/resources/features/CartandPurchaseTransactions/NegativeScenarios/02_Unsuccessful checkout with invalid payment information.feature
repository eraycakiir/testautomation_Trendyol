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
    Then Confirm Cart
    When the user enters invalid payment information
    And the user clicks on the Place Order button
    Then the user should see an error message