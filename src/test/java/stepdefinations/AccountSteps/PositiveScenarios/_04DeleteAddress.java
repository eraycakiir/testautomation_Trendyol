package stepdefinations.AccountSteps.PositiveScenarios;

import io.cucumber.java.en.And;
import io.cucumber.java.en.When;
import pages.addAddressPage;
import pages.myAccountPage;
import utils.Driver;
import utils.ReusableMethods;

public class _04DeleteAddress {
    myAccountPage myAccountPageElement = new myAccountPage();
    addAddressPage addAddressPageElement = new addAddressPage();
    @When("Choose the Address")
    public void chooseTheAddress() throws InterruptedException {
        ReusableMethods.scroll(Driver.getDriver(),2);
        ReusableMethods.waitForSeconds(4);
        int lastIndex = addAddressPageElement.selectAddress.size() - 1;
        if (lastIndex >= 0) {
            addAddressPageElement.selectAddress.get(lastIndex).click();
        } else {
            System.out.println("Address list is empty.");
        }

    }

    @And("Delete the Address")
    public void deleteTheAddress() throws InterruptedException {
        ReusableMethods.scroll(Driver.getDriver(),2);
        addAddressPageElement.deleteButton.click();
         ReusableMethods.waitForSeconds(4);
    }
}
