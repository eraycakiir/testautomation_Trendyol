package pages;

import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import utils.Driver;

import java.time.Duration;
import java.util.List;

public class myAccountPage {
    public myAccountPage() {
        PageFactory.initElements(new AppiumFieldDecorator(Driver.getDriver(), Duration.ofSeconds(25)), this);
    }

    @AndroidFindBy(xpath = "//android.widget.TextView[@resource-id=\"trendyol.com:id/textViewEmail\"]\n")
    public WebElement eMailTextForConfirm;
    @AndroidFindBy(xpath = "//android.widget.TextView[@text=\"Önceden Gezdiklerim\"]\n")
    public WebElement previouslyViewedButton;
    @AndroidFindBy(xpath = "//android.widget.TextView[@text=\"Şifre Değişikliği\"]\n")
    public WebElement changePassword;
    @AndroidFindBy(xpath = "//android.widget.TextView[@text=\"Adres Bilgilerim\"]\n")
    public WebElement addressInformation;

    @AndroidFindBy(xpath = "//android.widget.TextView[@text=\"Güncelle\"]\n")
    public WebElement updateButton;
    @AndroidFindBy(xpath = "(//androidx.cardview.widget.CardView[@resource-id=\"trendyol.com:id/cardViewBackground\"])[1]/android.view.ViewGroup\n")
    public WebElement allOrders;
    @AndroidFindBy(className = "android.widget.EditText")
    public List <WebElement>  editTextElements;
    @AndroidFindBy(xpath = "//android.widget.Button[@resource-id=\"android:id/button1\"]\n")
    public  WebElement okayButton;
    @AndroidFindBy(xpath = "//android.widget.TextView[@resource-id=\"trendyol.com:id/textViewBodyMass\"]\n")
    public  WebElement profileButton;
    @AndroidFindBy(xpath = "//android.widget.TextView[@resource-id=\"trendyol.com:id/textViewRegister\"]\n")
    public  WebElement signUpButton;
    @AndroidFindBy(xpath = "(//androidx.compose.ui.platform.ComposeView[@resource-id=\"trendyol.com:id/composeViewOrderReviewButton\"])")
    public List <WebElement> viewOrderReview;




}
