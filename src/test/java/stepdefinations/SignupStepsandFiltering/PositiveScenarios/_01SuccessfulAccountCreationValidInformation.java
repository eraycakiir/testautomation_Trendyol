package stepdefinations.SignupStepsandFiltering.PositiveScenarios;

import io.appium.java_client.android.Activity;
import io.appium.java_client.android.options.UiAutomator2Options;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.gmailAccount;
import pages.signUpPage;
import utils.Driver;
import utils.ReusableMethods;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import static utils.Driver.driver;

public class _01SuccessfulAccountCreationValidInformation {
    signUpPage signUpPageElements = new signUpPage();
    gmailAccount gmailAccountElements = new gmailAccount(); //
    @When("the user enters all required fields with valid information")
    public void theUserEntersAllRequiredFieldsWithValidInformation() {
        ReusableMethods.waitForVisibility(Driver.getDriver(), signUpPageElements.signUpEmail, 12);
        signUpPageElements.signUpEmail.click();
        signUpPageElements.signUpEmail.sendKeys("testtrendyoleray@gmail.com\n");
        signUpPageElements.signUpPassword.click();
        signUpPageElements.signUpPassword.sendKeys("35.Test123");
        signUpPageElements.manButton.click();
        signUpPageElements.approvedButton.click();

        // Gmail uygulamasını aç
        driver.startActivity(new Activity("com.google.android.gm", "com.google.android.gm.ConversationListActivityGmail"));

        ReusableMethods.waitForSeconds(15);
        gmailAccountElements.lastMail.click();
        ReusableMethods.waitForSeconds(8);


        String text = gmailAccountElements.verificationCodeArea.getText();
        System.out.println("Alınan Metin: " + text);

        // Regex ile 6 haneli sayıyı bulma
        Pattern pattern = Pattern.compile("\\b\\d{6}\\b");
        Matcher matcher = pattern.matcher(text);

        String verificationCode;
        if (matcher.find()) {
            verificationCode = matcher.group();
        } else {
            verificationCode = "Kod bulunamadı";
        }

        System.out.println("Doğrulama Kodu: " + verificationCode);
        ReusableMethods.pressAppSwitchButton();
        ReusableMethods.waitForSeconds(2);
        ReusableMethods.pressAppSwitchButton();



        ReusableMethods.waitForVisibility(Driver.getDriver(), signUpPageElements.verificationCodeArea, 12);
        signUpPageElements.verificationCodeArea.click();
        signUpPageElements.verificationCodeArea.sendKeys(verificationCode);
    }

    @Then("the user should see a success message and be redirected to the home page")
    public void theUserShouldSeeASuccessMessageAndBeRedirectedToTheHomePage() {
    }
}
