package stepdefinations.NotificationsandMessages.PositiveScenarios;

import io.cucumber.java.en.Then;
import pages.messagePage;
import pages.productPage;
import utils.Driver;
import utils.ReusableMethods;

public class _02SendMessagesSuccessfuly {
    productPage productPageElement = new productPage();
    messagePage messagePageElement = new messagePage();
    @Then("Click to Product reviews")
    public void clickToProductReviews() throws InterruptedException {
        ReusableMethods.waitForSeconds(4);
        ReusableMethods.scroll(Driver.getDriver(),8);
        ReusableMethods.waitForSeconds(10);
        productPageElement.showSellerQuestionsButtons.click();
    }

    @Then("When the user sends a message")
    public void whenTheUserSendsAMessage() throws InterruptedException {
        ReusableMethods.waitForSeconds(4);
        productPageElement.askQuestionToSellerButtons.click();
        ReusableMethods.waitForSeconds(4);
        messagePageElement.editTextAskQuestion.click();
        messagePageElement.editTextAskQuestion.sendKeys("Hello from Trendyol! I need help with my purchase.");
        ReusableMethods.scroll(Driver.getDriver(),2);
        messagePageElement.sendAskQuestionButton.click();
        ReusableMethods.waitForVisibility(Driver.getDriver(),messagePageElement.receiveQuestionText,14);
       if (messagePageElement.receiveQuestionText.isDisplayed()) {
           System.out.println("Message sent successfully");
       }
    }
}
