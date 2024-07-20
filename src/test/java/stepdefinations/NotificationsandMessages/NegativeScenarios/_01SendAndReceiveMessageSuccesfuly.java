package stepdefinations.NotificationsandMessages.NegativeScenarios;

import io.cucumber.java.en.When;
import pages.messagePage;
import pages.productPage;
import utils.Driver;
import utils.ReusableMethods;

public class _01SendAndReceiveMessageSuccesfuly {
    productPage productPageElement = new productPage();
    messagePage messagePageElement = new messagePage();
    @When("the user attempts to send a message with incomplete or incorrect information")
    public void theUserAttemptsToSendAMessageWithIncompleteOrIncorrectInformation() throws InterruptedException {
        ReusableMethods.waitForSeconds(4);
        productPageElement.askQuestionToSellerButtons.click();
        ReusableMethods.waitForSeconds(4);
        messagePageElement.editTextAskQuestion.click();
        messagePageElement.editTextAskQuestion.sendKeys("Hello.");
        ReusableMethods.scroll(Driver.getDriver(),2);
        messagePageElement.sendAskQuestionButton.click();
        ReusableMethods.waitForSeconds(4);
        ReusableMethods.waitForVisibility(Driver.getDriver(),messagePageElement.errorMessage,13);
        if (messagePageElement.errorMessage.isDisplayed()) {
            System.out.println("Error message displayed: " + messagePageElement.errorMessage.getText());
        }


    }
}
