package stepdefinations.SignupStepsandFiltering.NegativeScenarios;

import io.cucumber.java.en.When;
import pages.signUpPage;
import utils.Driver;
import utils.ReusableMethods;

public class _06WithoutLetterPassword {
    signUpPage signUpPageElements = new signUpPage();

    @When("the user enters a weak password with out letter")
    public void theUserEntersAWeakPasswordWithOutLetter() {
        ReusableMethods.waitForVisibility(Driver.getDriver(),signUpPageElements.signUpEmail,12);
        signUpPageElements.signUpEmail.click();
        signUpPageElements.signUpEmail.sendKeys("eraygs30gmail.com");
        signUpPageElements.signUpPassword.click();
        signUpPageElements.signUpPassword.sendKeys("123498752.12");
        signUpPageElements.manButton.click();
        signUpPageElements.approvedButton.click();
    }
}
