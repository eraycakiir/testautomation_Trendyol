package stepdefinations;

import io.cucumber.java.en.And;
import io.cucumber.java.en.When;
import pages.addAddressPage;
import pages.myAccountPage;
import utils.Driver;
import utils.HelperFunctions;

public class _007AddAdressSteps {
    addAddressPage addAddressPageElements = new addAddressPage();
    myAccountPage myAccountPageElements = new myAccountPage();
    @When("Click to Address Information")
    public void clickToAddressInformation() {
        myAccountPageElements.addressInformation.click();

    }

    @When("Click to Add Address Button")
    public void clickToAddAddressButton() {
        addAddressPageElements.addAddressButton.click();

    }
    @When("Click to Name Button and Write Name")
    public void clickToNameButtonAndWriteName() {
        addAddressPageElements.nameTextArea.click();
        addAddressPageElements.nameTextArea.sendKeys("Test");

    }

    @When("Click to Surname Button and Write Surname")
    public void clickToSurnameButtonAndWriteSurname() {
        addAddressPageElements.surNameTextArea.click();
        addAddressPageElements.surNameTextArea.sendKeys("Auto");
    }

    @When("Click to TellPhone Button and Write TellPhone")
    public void clickToTellPhoneButtonAndWriteTellPhone() {
       addAddressPageElements.telPhoneTextArea.click();
       addAddressPageElements.telPhoneTextArea.sendKeys("5555555555");
    }

    @When("Click to City Button")
    public void clickToCityButton() {
        addAddressPageElements.cityButton.click();
        Driver.Wait(2);
    }

    @When("Select Random City")
    public void selectRandomCityFunc() throws InterruptedException {
        // TODO
        HelperFunctions.selectRandomCity(Driver.getDriver(),addAddressPageElements.cityList);
    }

    @When("Select Random District")
    public void selectRandomDistrict() {
    }

    @When("Select Random Neighborhood")
    public void selectRandomNeighborhood() {
    }

    @When("Write Detail Adress")
    public void writeDetailAdress() {
    }

    @And("Scroll Page")
    public void scrollPage() {
    }

    @And("Click to Adress Name")
    public void clickToAdressName() {
    }

    @And("Write  Adress Name")
    public void writeAdressName() {
    }

    @And("Click to Save Button")
    public void clickToSaveButton() {
    }
}
