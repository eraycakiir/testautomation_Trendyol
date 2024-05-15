package pages;

import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import utils.Driver;

import java.time.Duration;
import java.util.List;

public class addAddressPage {
    public addAddressPage()
    {
        PageFactory.initElements(new AppiumFieldDecorator(Driver.getDriver(), Duration.ofSeconds(25)), this);
    }
    @AndroidFindBy(xpath = "//android.widget.TextView[@text=\"Adres Bilgilerim\"]\n")
    public WebElement addressInformation;
    @AndroidFindBy(xpath = "//android.widget.TextView[@resource-id=\"trendyol.com:id/textRightUp\"]\n")
    public  WebElement addAddressButton;
    @AndroidFindBy(className = "android.widget.TextView")
    public List<WebElement> contactInformation;

    @AndroidFindBy(xpath = "//android.widget.EditText[@resource-id=\"trendyol.com:id/editTextCity\"]\n")
    public  WebElement cityButton;

    @AndroidFindBy(className = "android.widget.TextView")
    public List<WebElement> cityList;
    @AndroidFindBy(className = "android.widget.TextView")
    public List<WebElement> discrtictList;
    @AndroidFindBy(className = "android.widget.TextView")
    public List<WebElement> neighborhoodList;

    @AndroidFindBy(xpath = "//android.widget.EditText[@resource-id=\"trendyol.com:id/editTextAddressName\"]\n")
    public  WebElement addressName;
    @AndroidFindBy(xpath = "//android.widget.Button[@resource-id=\"trendyol.com:id/buttonSave\"]\n")
    public  WebElement saveAddressButton;
}
