package stepdefinations.SignupStepsandFiltering.NegativeScenarios;

import io.appium.java_client.AppiumDriver;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.signUpPage;
import utils.Driver;
import utils.ReusableMethods;

public class _02EmptyInformation {
    signUpPage signUpPageElements = new signUpPage();
    @When("the user leaves any required field empty")
    public void theUserLeavesAnyRequiredFieldEmpty() throws InterruptedException {
        ReusableMethods.waitForVisibility(Driver.getDriver(),signUpPageElements.signUpEmail,12);
        signUpPageElements.signUpEmail.click();
        ReusableMethods.scroll(Driver.getDriver(), 1);
    }

    @Then("the user should see an error message in sign up page")
    public void theUserShouldSeeAnErrorEmptyMessage() {
        ReusableMethods.waitForVisibility(Driver.getDriver(),signUpPageElements.errorEmptyMessage,12);
        if(signUpPageElements.errorEmptyMessage.isDisplayed()){
            System.out.println("The error message is displayed as expected");
        }

    }
}
