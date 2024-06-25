package stepdefinations.ProductSearchSteps.PositiveScenarios;

import io.cucumber.java.en.And;
import io.cucumber.java.en.When;
import org.testng.Assert;
import pages.myAccountPage;
import pages.previosulyViewedPage;


public class _03PreviouslyViewed {
    myAccountPage myAccountPageElements = new myAccountPage();
    previosulyViewedPage  previosulyViewedPageElements = new previosulyViewedPage ();
    @When("Click to Previously Viewed Button")
    public void clickToPreviouslyViewedButton() {
        myAccountPageElements.previouslyViewedButton.click();
    }

    @When("Switch To Closed Button")
    public void switchToClosedButton() {
        previosulyViewedPageElements.switchButtonforPastVisit.click();
        previosulyViewedPageElements.closeHistory.click();
    }

    @And("Verification Previously Viewed")
    public void verificationPreviouslyViewed() {
        Assert.assertTrue(previosulyViewedPageElements.verificationMessage.getText().equals("Son gezdiğiniz ürünler listesi bulunmamaktadır."));
    }
}
