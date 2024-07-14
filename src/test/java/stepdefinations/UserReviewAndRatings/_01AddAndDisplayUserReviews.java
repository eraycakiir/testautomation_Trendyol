package stepdefinations.UserReviewAndRatings;

import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import pages.myAccountPage;
import pages.rateTheProduct;
import utils.ReusableMethods;

import static utils.Driver.driver;
import static utils.Driver.getDriver;

public class _01AddAndDisplayUserReviews {
    myAccountPage myAccountPageElement = new myAccountPage();
    rateTheProduct rateTheProductElement = new rateTheProduct();


    @When("the user submits a review with valid information")
    public void theUserSubmitsAReviewWithValidInformation() throws InterruptedException
    {
        boolean buttonClicked = false;

        while (!buttonClicked) {
            for (WebElement button : myAccountPageElement.viewOrderReview) {
                if (button.isEnabled() && button.isDisplayed()) {
                    button.click();
                    Thread.sleep(2000);  // Click sonrası biraz bekle

                    // ThanksForRate elementi görünüyor mu kontrol et
                    if (isElementDisplayed(rateTheProductElement.thanksForRate)) {
                        driver.navigate().back();  // Geri dön
                    } else {
                        buttonClicked = true;  // Eğer ThanksForRate çıkmazsa işlemi sonlandır
                        break;
                    }
                }
            }

            if (!buttonClicked) {
                // Eğer basılabilir buton bulunamazsa aşağı kaydır
                ReusableMethods.scroll(driver, 1);
                // viewOrderReview listesini güncelle
                myAccountPageElement.viewOrderReview = driver.findElements(By.xpath("(//androidx.compose.ui.platform.ComposeView[@resource-id=\"trendyol.com:id/composeViewOrderReviewButton\"])"));
            }
        }
        ReusableMethods.waitForVisibility(getDriver(),rateTheProductElement.radioButtonProduct,15);
        rateTheProductElement.radioButtonProduct.click();
        ReusableMethods.selectRandomElement(driver, rateTheProductElement.starList);
       rateTheProductElement.buttonReviewSubmit.click();

    }

    private boolean isElementDisplayed(WebElement element)
    {
        try {
            return element.isDisplayed();
        } catch (Exception e) {
            return false;
        }
    }
}
