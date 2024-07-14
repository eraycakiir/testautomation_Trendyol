package stepdefinations.OrderHistoryandTracking.PositiveScenarios;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.openqa.selenium.WebDriver;
import pages.myAccountPage;
import utils.Driver;
import utils.ReusableMethods;

public class _01DisplayOrderHistoryCorrectly {
    myAccountPage myAccountPageElement = new myAccountPage();
    @And("Click to My All Orders Button")
    public void clickToMyAllOrdersButton() {
        ReusableMethods.waitForSeconds(4);
        myAccountPageElement.allOrders.click();
    }

    @Then("the user should see a list of all past orders with correct details")
    public void theUserShouldSeeAListOfAllPastOrdersWithCorrectDetails() {

    }
}
