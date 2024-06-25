package stepdefinations.AccountSteps.PositiveScenarios;

import io.cucumber.java.en.And;
import io.cucumber.java.en.When;
import pages.addAddressPage;
import pages.myAccountPage;
import utils.Driver;
import utils.ReusableMethods;

import java.util.Random;

public class _02AddAdressSteps {
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
        addAddressPageElements.telPhoneTextArea.sendKeys("5336782086");
    }

    @When("Click to City Button")
    public void clickToCityButton() {
        addAddressPageElements.randomClick.click();
        addAddressPageElements.cityButton.click();
        Driver.Wait(2);
    }

    Random rand = new Random();

    @When("Select Random City")
    public void selectRandomCityFunc() throws InterruptedException {

        int randomScroll = rand.nextInt(10 - 1 + 1) + 1;
        ReusableMethods.scroll(Driver.getDriver(), randomScroll);

        Driver.Wait(4);
        ReusableMethods.selectRandomElement(Driver.getDriver(), addAddressPageElements.cityList);

    }

    @When("Select Random District")
    public void selectRandomDistrict() throws InterruptedException {
        ReusableMethods.scroll(Driver.getDriver(), 2);
        Driver.Wait(2);
        ReusableMethods.selectRandomElement(Driver.getDriver(), addAddressPageElements.discrtictList);

    }

    @When("Select Random Neighborhood")
    public void selectRandomNeighborhood() throws InterruptedException {
        ReusableMethods.scroll(Driver.getDriver(), 2);
        Driver.Wait(2);
        ReusableMethods.selectRandomElement(Driver.getDriver(), addAddressPageElements.neighborhoodList);
    }

    @When("Write Detail Adress")
    public void writeDetailAdress() {

        addAddressPageElements.detailAdressTextArea.sendKeys("Kat: 3  , Daire :4 Trendyol Apartmanı ");
    }

    @And("Scroll Page")
    public void scrollPage() throws InterruptedException {
        addAddressPageElements.randomClick.click();
        ReusableMethods.scroll(Driver.getDriver(), 1);

    }

    @And("Click to Adress Name")
    public void clickToAdressName() {
        addAddressPageElements.addressName.click();
    }

    @And("Write  Adress Name")
    public void writeAdressName() {
        int randomNumber = rand.nextInt(100 - 1 + 1) + 1;
        addAddressPageElements.addressName.sendKeys("Ev " + randomNumber);
    }

    @And("Click to Save Button")
    public void clickToSaveButton() {
        addAddressPageElements.randomClick.click();
        addAddressPageElements.saveAddressButton.click();
    }
}
