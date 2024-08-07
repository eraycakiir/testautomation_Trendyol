package pages;

import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import utils.Driver;

import java.time.Duration;
import java.util.List;

public class rateTheProduct {
    public rateTheProduct() {
        PageFactory.initElements(new AppiumFieldDecorator(Driver.getDriver(), Duration.ofSeconds(25)), this);
    }

    @AndroidFindBy(xpath = "//android.widget.RadioButton[@resource-id=\"trendyol.com:id/radioButtonProduct\"]\n")
    public WebElement radioButtonProduct;
    @AndroidFindBy(xpath = "//android.widget.Button[@resource-id=\"trendyol.com:id/buttonReviewSubmit\"]\n")
    public WebElement buttonReviewSubmit;
    @AndroidFindBy(xpath = "(//android.widget.ImageView[@resource-id=\"trendyol.com:id/imageViewStar\"])")
    public List<WebElement> starList;
    @AndroidFindBy(xpath = "//android.widget.TextView[@resource-id=\"trendyol.com:id/textViewTitle\"]\n")
    public WebElement thanksForRate;
}
