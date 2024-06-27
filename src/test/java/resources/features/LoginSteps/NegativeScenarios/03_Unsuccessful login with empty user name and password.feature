Feature: Unsuccessful login with empty username and password

  Scenario: Unsuccessful login with empty username and password
    Given Go to the Main Page
    When Click to My Account Button
    And Click to Login Button
    Then the user should see an error message
