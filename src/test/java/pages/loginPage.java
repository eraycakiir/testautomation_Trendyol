package pages;

import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import utils.Driver;

import java.time.Duration;

public class loginPage {
    public loginPage() {
        PageFactory.initElements(new AppiumFieldDecorator(Driver.getDriver(), Duration.ofSeconds(25)), this);
    }
    @AndroidFindBy(xpath = "//android.widget.EditText[@resource-id=\"trendyol.com:id/editTextEmail\"]\n")
    public WebElement ePostaTextBox;
    @AndroidFindBy(xpath = "//android.widget.EditText[@resource-id=\"trendyol.com:id/editTextPassword\"]\n")
    public WebElement passwordTextBox;
    @AndroidFindBy(xpath = "//android.widget.Button[@resource-id=\"trendyol.com:id/buttonLogin\"]\n")
    public WebElement loginButton;
    @AndroidFindBy(xpath = "//android.widget.ImageView[@content-desc=\"Cancel\"]\n")
    public WebElement cancelGooglePopupButton;
}
