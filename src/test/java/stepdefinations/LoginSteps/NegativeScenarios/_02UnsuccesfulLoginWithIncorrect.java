package stepdefinations.LoginSteps.NegativeScenarios;

import io.cucumber.java.en.When;
import pages.loginPage;

public class _02UnsuccesfulLoginWithIncorrect {
    loginPage loginPageElements = new loginPage();

    @When("Click to password and writing to wrong password")
    public void clickToPasswordAndWritingToWrongPassword() {
        loginPageElements.passwordTextBox.click();
        loginPageElements.passwordTextBox.sendKeys("Cakir.test12345");
    }
}
