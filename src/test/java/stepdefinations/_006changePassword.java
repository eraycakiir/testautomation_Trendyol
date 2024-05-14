package stepdefinations;

import io.cucumber.java.en.And;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebElement;
import pages.myAccountPage;
import utils.Driver;
import utils.HelperFunctions;

public class _006changePassword {
    myAccountPage myAccountPageElements = new myAccountPage();
    @When("Click to My Account Settings")
    public void clickToMyAccountSettings() throws InterruptedException {
        HelperFunctions.scrollToElementAndClickWithXPATH(Driver.getDriver(),"//android.widget.TextView[@resource-id=\"trendyol.com:id/textViewItem\" and @text=\"Hesap Ayarlarım\"]");
    }

    @When("Click to Change Password")
    public void clickToChangePassword()  {
        myAccountPageElements.changePassword.click();
    }

    @When("Write Current Password")
    public void writeCurrentPassword() {
        Driver.Wait(2);
        WebElement currentPassword = myAccountPageElements.editTextElements.get(0);
        currentPassword.click();
        currentPassword.sendKeys("Eray.test12345");
    }

    @When("Write New Password")
    public void writeNewPassword() {
        WebElement newPassword = myAccountPageElements.editTextElements.get(1);
        newPassword.click();
        newPassword.sendKeys("Eray.test123456");
    }

    @When("Write Confirm Password")
    public void writeConfirmPassword() {
        WebElement newPasswordAgain = myAccountPageElements.editTextElements.get(2);
        newPasswordAgain.click();
        newPasswordAgain.sendKeys("Eray.test123456");
    }

    @When("Click to Change Password Button")
    public void clickToChangePasswordButton() {
        Driver.Wait(2);
        myAccountPageElements.updateButton.click();
    }

    @And("Verification Password Change Click Okay Button")
    public void verificationPasswordChangeClickOkayButton() {
        myAccountPageElements.okayButton.click();
    }
}
