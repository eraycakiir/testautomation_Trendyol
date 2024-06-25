Feature: Unsuccessful login with invalid email format

  Scenario: Unsuccessful login with invalid email format
    Given Go to the Main Page
    When Click to My Account Button
    When the user enters an invalid email format
    And Click to Login Button
    Then the user should see an error message


