package stepdefinations.AccountSteps.PositiveScenarios;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.myAccountPage;
import pages.userInformation;
import utils.Driver;
import utils.ReusableMethods;

public class _03DisplayandUpdateProfileInformation {
    myAccountPage myAccountPageElements = new myAccountPage();
    userInformation userInformationElements = new userInformation();
    @When("the user is on the profile page")
    public void theUserIsOnTheProfilePage() {
        myAccountPageElements.profileButton.click();
    }

    @When("the user views their profile information")
    public void theUserViewsTheirProfileInformation() {
        ReusableMethods.waitForVisibility(Driver.getDriver(),userInformationElements.userInformation,15);
        if(userInformationElements.userInformation.isDisplayed()) {
            System.out.println("User information is displayed as expected");
        }
    }



    @When("the user updates their profile information")
    public void theUserUpdatesTheirProfileInformation() {
        userInformationElements.userHeight.click();
        userInformationElements.userHeight.sendKeys("173");
        userInformationElements.userWeight.click();
        userInformationElements.userWeight.sendKeys("65");
        userInformationElements.updateHeightAndWeight.click();
    }



}
