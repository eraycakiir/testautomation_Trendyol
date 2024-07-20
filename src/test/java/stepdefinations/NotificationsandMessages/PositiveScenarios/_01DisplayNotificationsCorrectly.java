package stepdefinations.NotificationsandMessages.PositiveScenarios;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import pages.mainPage;
import pages.messagePage;
import utils.Driver;
import utils.ReusableMethods;

public class _01DisplayNotificationsCorrectly {
    mainPage mainPageElements = new mainPage();
    messagePage messagePageElements = new messagePage();
    @Given("the user is on the notifications page")
    public void theUserIsOnTheNotificationsPage() {
        mainPageElements.messagesIconButton.click();
        ReusableMethods.waitForSeconds(5);
        
    }

    @Then("the user should see all notifications correctly")
    public void theUserShouldSeeAllNotificationsCorrectly() {
        ReusableMethods.waitForVisibility(Driver.getDriver(),messagePageElements.sellerMessagesText,15);
        if(messagePageElements.sellerMessagesText.isDisplayed()){
            System.out.println("All notifications are displayed correctly");
        }
    }
}
