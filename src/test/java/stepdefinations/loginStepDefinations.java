package stepdefinations;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.nativekey.AndroidKey;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import pages.loginPage;
import pages.mainPage;
import pages.myAccountPage;
import utils.Driver;

import java.awt.event.KeyEvent;

public class loginStepDefinations extends Driver {
    mainPage mainPageElements = new mainPage();
    loginPage loginPageElements = new loginPage();
    myAccountPage myAccountPageElements = new myAccountPage();


    @Given("Go to the Main Page")
    public void goToTheMainPage() {
        Driver.getDriver();
    }
    @When("Click to Dismiss Button")
    public void clickToDismissButton() {
        mainPageElements.dismissButton.click();
    }
    @When("Click to Dismiss Button Again")
    public void clickToDismissButtonAgain() {
        Driver.Wait(3);
        mainPageElements.TooltipCloseButton.click();
    }

    @When("Click to My Account Button")
    public void clickToMyAccountButton() {
        mainPageElements.myAccountbox.click();
    }

   // @When("Click to Cancel GooglePopupButton")
    //public void clickToCancelGooglePopupButton() {
      //  loginPageElements.cancelGooglePopupButton.click();
    //}

    @When("Click to e-mail and writing to e-mail")
    public void clickToEMailAndWritingToEMail() {
        loginPageElements.ePostaTextBox.click();
        loginPageElements.ePostaTextBox.sendKeys("test.erayqua@gmail.com");
    }

    @When("Click to password and writing to password")
    public void clickToPasswordAndWritingToPassword() {
        loginPageElements.passwordTextBox.click();
        loginPageElements.passwordTextBox.sendKeys("Eray.test123");
    }

    @And("Click to Login Button")
    public void clickToLoginButton() {
        loginPageElements.loginButton.click();
        Driver.Wait(5);
    }
    @And("Press Back Button")
    public void pressBackButtonFunction() {
        Driver.Wait(5);
        pressBackButton();
    }
    @And("Method to check that you are logged in")
    public void methodToCheckThatYouAreLoggedIn() {
        if (myAccountPageElements.eMailTextForConfirm.getText().equals("test.erayqua@gmail.com")) {
            System.out.println("Test Basarili");
        } else {
            System.out.println("Test Basarisiz");
        }
    }
}
