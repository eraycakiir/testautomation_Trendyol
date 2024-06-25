Feature: Unsuccessful login with incorrect username

  Scenario: Unsuccessful login with incorrect
    Given Go to the Main Page
    When Click to My Account Button
    When Click to e-mail and  writing to  wrong e-mail
    When Click to password and writing to password
    And Click to Login Button
    Then the user should see an error message