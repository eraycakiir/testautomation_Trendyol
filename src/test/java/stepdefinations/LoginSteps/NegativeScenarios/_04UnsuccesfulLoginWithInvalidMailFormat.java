package stepdefinations.LoginSteps.NegativeScenarios;

import io.cucumber.java.en.When;
import pages.loginPage;

public class _04UnsuccesfulLoginWithInvalidMailFormat {
    loginPage loginPageElements = new loginPage();

    @When("the user enters an invalid email format")
    public void theUserEntersAnInvalidEmailFormat() {
        loginPageElements.ePostaTextBox.click();
        loginPageElements.ePostaTextBox.sendKeys("testerayggmail.com");
    }
}
