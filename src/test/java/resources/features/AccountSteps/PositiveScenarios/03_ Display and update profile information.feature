Feature: Profile and Settings

  Scenario: Display and update profile information
    Given Go to the Main Page
    When Click to My Account Button
    When the user is on the profile page
    When the user views their profile information
    Then the user should see their correct profile information
    When the user updates their profile information
    And the user saves the changes
    Then the user should see a success message
