package pages;

import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import utils.Driver;

import java.time.Duration;

public class cartPage {
    public cartPage() {
        PageFactory.initElements(new AppiumFieldDecorator(Driver.getDriver(), Duration.ofSeconds(25)), this);
    }
    @AndroidFindBy(xpath = "//android.widget.TextView[@resource-id=\"trendyol.com:id/textViewSalePrice\"]\n")
    public WebElement normalPrice;

    @AndroidFindBy(xpath = "//android.widget.ImageView[@resource-id=\"trendyol.com:id/image_add\"]\n")
    public WebElement addButton;
    @AndroidFindBy(xpath = "//android.widget.ImageView[@resource-id=\"trendyol.com:id/image_subtract\"]\n")
    public WebElement subTractButton;
    @AndroidFindBy(xpath = "//android.widget.ImageButton[@content-desc=\"Ürünü sil\"]\n")
    public WebElement deleteButton;
    @AndroidFindBy(xpath = "\t\n" +"//android.widget.TextView[@resource-id=\"trendyol.com:id/textViewBasketRemoveAction\"]")
    public WebElement deleteButtonAction;
}
