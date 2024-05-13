package stepdefinations;

import io.cucumber.java.en.When;
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
        myAccountPageElements.currentPassword.click();
        myAccountPageElements.currentPassword.sendKeys("Eray.test123");
    }

    @When("Write New Password")
    public void writeNewPassword() {
        Driver.Wait(2);
        myAccountPageElements.newPassword.click();
        myAccountPageElements.newPassword.sendKeys("Eray.test1234");
    }

    @When("Write Confirm Password")
    public void writeConfirmPassword() {
        Driver.Wait(2);
        myAccountPageElements.newPasswordAgain.click();
        myAccountPageElements.newPasswordAgain.sendKeys("Eray.test1234");
    }

    @When("Click to Change Password Button")
    public void clickToChangePasswordButton() {
        Driver.Wait(2);
        myAccountPageElements.updateButton.click();
    }
}
