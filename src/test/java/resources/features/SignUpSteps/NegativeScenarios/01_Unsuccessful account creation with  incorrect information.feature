Feature: Sign up page

  Scenario: Unsuccessful account creation with missing or incorrect information
    Given Go to the Main Page
    When Click to My Account Button
    When the user is on the sign-up page
    When the user leaves any required field enters incorrect information
    Then the user clicks on the sign-up button
    Then Write to verification code
    And the user should see an error message for wrong verification code