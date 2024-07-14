Feature:  Display product ratings
  Scenario:  Display product ratings
    Given Go to the Main Page
    Then Click to All Categories button
    Then Select Category
    Then Select Sub Category for Text List
    Then Select Sub Category for Image List
    Then Click to SortBy button
    And Choose the SortBy Options "En Çok Değerlendirilen"
    Then Select the Product
    Then the user should see the product's overall rating and individual ratings
