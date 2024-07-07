Feature: Successful filtering by categories

  Scenario: Successful filtering by categories
    Given Go to the Main Page
    Then Click to All Categories button
    Then Select Category
    Then Select Sub Category for Text List
    Then Select Sub Category for Image List
    Then Click to Filters Button
    When the user selects a brand filter
    Then the user should see a list of products matching the selected brand
    And the user clicks on the search button
   And Check the  filter results