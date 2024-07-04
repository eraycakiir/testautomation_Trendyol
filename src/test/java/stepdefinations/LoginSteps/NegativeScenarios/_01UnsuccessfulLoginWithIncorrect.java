package stepdefinations.LoginSteps.NegativeScenarios;

import io.cucumber.java.en.When;
import pages.loginPage;

public class _01UnsuccessfulLoginWithIncorrect {
    loginPage loginPageElements = new loginPage();
    @When("Click to e-mail and  writing to  wrong e-mail")
    public void clickToEMailAndWritingToWrongEMail() {
        loginPageElements.ePostaTextBox.click();
        loginPageElements.ePostaTextBox.sendKeys("test.eraygaa@gmail.com");
    }
}
