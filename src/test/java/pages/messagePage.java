package pages;

import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import utils.Driver;

import java.time.Duration;

public class messagePage {
    public messagePage() {
        PageFactory.initElements(new AppiumFieldDecorator(Driver.getDriver(), Duration.ofSeconds(25)), this);
    }
    @AndroidFindBy(xpath = "//android.widget.TextView[@text=\"Satıcı Mesajlarım\"]\n")
    public WebElement sellerMessagesText;
    @AndroidFindBy(xpath = "//android.widget.EditText[@resource-id=\"trendyol.com:id/editTextAskQuestion\"]\n")
    public WebElement editTextAskQuestion;
    @AndroidFindBy(xpath = "//android.widget.Button[@resource-id=\"trendyol.com:id/buttonAskQuestion\"]\n")
    public WebElement sendAskQuestionButton;
    @AndroidFindBy(xpath = "//android.widget.TextView[@text=\"Sorunuzu satıcımıza ilettik.\"]\n")
    public WebElement receiveQuestionText;
    @AndroidFindBy(xpath = "//android.widget.Button[@resource-id=\"android:id/button1\"]\n")
    public WebElement errorMessage;

}
