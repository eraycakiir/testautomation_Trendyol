Feature: Profile and Settings

  Scenario: Unsuccessful profile update with incomplete or incorrect information
    Given Go to the Main Page
    When Click to My Account Button
    When the user is on the profile page
    When the user enters incomplete or incorrect information
    And the user saves the changes
    Then the user should see an error message
