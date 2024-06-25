Feature: Display products within categories
  Scenario: Display products within categories
    Given Go to the Main Page
    Then Click to All Categories button
    Then Select Category
    Then Select Sub Category for Text List
    Then Select Sub Category for Image List
    And the user should see products listed within the subcategory
