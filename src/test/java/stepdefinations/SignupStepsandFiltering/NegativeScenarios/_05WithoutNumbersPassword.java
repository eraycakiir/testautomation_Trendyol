package stepdefinations.SignupStepsandFiltering.NegativeScenarios;

import io.cucumber.java.en.When;
import pages.signUpPage;
import utils.Driver;
import utils.ReusableMethods;

public class _05WithoutNumbersPassword {
    signUpPage signUpPageElements = new signUpPage();

    @When("the user enters a weak password with out number")
    public void theUserEntersAWeakPassword() {
        ReusableMethods.waitForVisibility(Driver.getDriver(),signUpPageElements.signUpEmail,12);
        signUpPageElements.signUpEmail.click();
        signUpPageElements.signUpEmail.sendKeys("eraygs30gmail.com");
        signUpPageElements.signUpPassword.click();
        signUpPageElements.signUpPassword.sendKeys("RandomErayD");
        signUpPageElements.manButton.click();
        signUpPageElements.approvedButton.click();
    }
}
