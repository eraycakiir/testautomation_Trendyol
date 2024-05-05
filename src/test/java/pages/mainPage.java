package pages;

import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import utils.Driver;

import java.time.Duration;

public class mainPage {
    public mainPage() {
        PageFactory.initElements(new AppiumFieldDecorator(Driver.getDriver(), Duration.ofSeconds(25)), this);
    }
    @AndroidFindBy(xpath = "(//android.widget.ImageView[@resource-id=\"trendyol.com:id/navigation_bar_item_icon_view\"])[5]\n")
    public WebElement myAccountbox;
    @AndroidFindBy(xpath = "//android.widget.ImageView[@resource-id=\"trendyol.com:id/buttonDismiss\"]")
    public WebElement dismissButton;
    @AndroidFindBy(xpath = "//android.widget.ImageView[@resource-id=\"trendyol.com:id/imageViewTooltipClose\"]\n")
    public WebElement TooltipCloseButton;

}
