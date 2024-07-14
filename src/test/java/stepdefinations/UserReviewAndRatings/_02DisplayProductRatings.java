package stepdefinations.UserReviewAndRatings;

import io.cucumber.java.en.Then;
import pages.myAccountPage;
import utils.ReusableMethods;

public class _02DisplayProductRatings {
    myAccountPage myAccountPageElement = new myAccountPage();

    @Then("the user should see the product's overall rating and individual ratings")
    public void theUserShouldSeeTheProductSOverallRatingAndIndividualRatings() throws InterruptedException {
        ReusableMethods.scrollUntilTextVisible("Ürün Değerlendirmeleri");
    }


}

