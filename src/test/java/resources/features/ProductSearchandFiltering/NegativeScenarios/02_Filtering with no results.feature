Feature:  Filtering with no results
  Scenario:  Filtering with no results
    Given Go to the Main Page
    Then Click to All Categories button
    Then Select Category
    Then Select Sub Category for Text List
    Then Select Sub Category for Image List
    Then Click to Filters Button
    When the user applies filters that yield no results
    Then the user should see a message indicating no products found