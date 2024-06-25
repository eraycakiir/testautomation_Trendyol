Feature: Redirect to correct subcategories
  Scenario: Redirect to correct subcategories
    Given Go to the Main Page
    Then Click to All Categories button
    When the user clicks on a category
    Then the user should be redirected to the correct subcategory page
