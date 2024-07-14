package pages;

import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import utils.Driver;

import java.time.Duration;

public class userInformation {
    public userInformation() {
        PageFactory.initElements(new AppiumFieldDecorator(Driver.getDriver(), Duration.ofSeconds(25)), this);
    }
    @AndroidFindBy(xpath = "//android.widget.TextView[@resource-id=\"trendyol.com:id/textViewBodyMass\"]\n")
    public WebElement userInformation;
    @AndroidFindBy(xpath = "//androidx.compose.ui.platform.ComposeView[@resource-id=\"trendyol.com:id/bodyMassViewAccountInfo\"]/android.view.View/android.view.View/android.view.View[1]\n")
    public WebElement userWeight;
    @AndroidFindBy(xpath = "//androidx.compose.ui.platform.ComposeView[@resource-id=\"trendyol.com:id/bodyMassViewAccountInfo\"]/android.view.View/android.view.View/android.view.View[2]\n")
    public WebElement userHeight;
    @AndroidFindBy(xpath = "//androidx.compose.ui.platform.ComposeView[@resource-id=\"trendyol.com:id/bodyMassViewAccountInfo\"]/android.view.View/android.view.View/android.view.View[3]/android.widget.Button\n")
    public WebElement updateHeightAndWeight;
    @AndroidFindBy(xpath = "//android.widget.EditText[@resource-id=\"trendyol.com:id/editTextName\"]\n")
    public WebElement nameAndSurname;
    @AndroidFindBy(xpath = "//android.widget.Button[@resource-id=\"trendyol.com:id/buttonUpdateAccountInfo\"]\n")
    public WebElement updateButton;

}
