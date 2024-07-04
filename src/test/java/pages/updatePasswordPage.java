package pages;

import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import utils.Driver;

import java.time.Duration;

public class updatePasswordPage {
    public updatePasswordPage() {
        PageFactory.initElements(new AppiumFieldDecorator(Driver.getDriver(), Duration.ofSeconds(25)), this);
    }
    @AndroidFindBy(xpath = " //android.widget.EditText[@resource-id=\"trendyol.com:id/editTextMail\"]")
    public WebElement eMailTextBox;
    @AndroidFindBy(xpath = "//android.widget.EditText[@resource-id=\"trendyol.com:id/inputPassword\"]\n")
    public WebElement newPasswordTextBox;
    @AndroidFindBy(xpath = "//android.widget.EditText[@resource-id=\"trendyol.com:id/inputPasswordAgain\"]\n")
    public WebElement againNewPaswordTextBox;
    @AndroidFindBy(xpath = "//android.widget.Button[@resource-id=\"trendyol.com:id/buttonSave\"]\n")
    public WebElement saveButton;
}
