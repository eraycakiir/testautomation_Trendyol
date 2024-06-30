package pages;

import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import utils.Driver;

import java.time.Duration;

public class signUpPage {
    public signUpPage() {
        PageFactory.initElements(new AppiumFieldDecorator(Driver.getDriver(), Duration.ofSeconds(25)), this);
    }

    @AndroidFindBy(xpath = "//android.widget.EditText[@resource-id=\"trendyol.com:id/editTextEmailOnRegister\"]")
    public WebElement signUpEmail;
    @AndroidFindBy(xpath = "//android.widget.EditText[@resource-id=\"trendyol.com:id/editTextPasswordOnRegister\"]")
    public WebElement signUpPassword;
    @AndroidFindBy(xpath = "//android.widget.RadioButton[@resource-id=\"trendyol.com:id/genderSelectorWoman\"]")
    public WebElement womanButton;
    @AndroidFindBy(xpath = "//android.widget.RadioButton[@resource-id=\"trendyol.com:id/genderSelectorMan\"]")
    public WebElement manButton;
    @AndroidFindBy(xpath = "//android.widget.Button[@resource-id=\"trendyol.com:id/buttonRegister\"]")
    public WebElement registerButton;
    @AndroidFindBy(xpath = "//android.widget.CheckBox[@resource-id=\"trendyol.com:id/checkBoxClarificationMessageConsent\"]\n")
    public WebElement approvedButton;
    @AndroidFindBy(xpath = "//android.widget.EditText[@resource-id=\"trendyol.com:id/editTextCode\"]\n")
    public WebElement verificationCodeArea;
    @AndroidFindBy(xpath = "//android.widget.Button[@resource-id=\"trendyol.com:id/buttonContinue\"]")
    public WebElement continueButton;
  @AndroidFindBy(xpath = "//android.widget.TextView[@resource-id=\"android:id/message\"]\n")
    public WebElement errorMessage;
  @AndroidFindBy(xpath = "//android.widget.TextView[@resource-id=\"trendyol.com:id/textinput_error\"]\n")
    public WebElement errorEmptyMessage;
  @AndroidFindBy(xpath = "//android.widget.FrameLayout[@resource-id=\"trendyol.com:id/buttonGoogleLogin\"]\n")
    public WebElement googleButton;

}
