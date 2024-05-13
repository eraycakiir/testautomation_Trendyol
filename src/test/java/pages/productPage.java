package pages;

import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import utils.Driver;

import java.time.Duration;
import java.util.List;

public class productPage {
    public productPage() {
        PageFactory.initElements(new AppiumFieldDecorator(Driver.getDriver(), Duration.ofSeconds(25)), this);
    }
    @AndroidFindBy(xpath = "(//androidx.cardview.widget.CardView[@resource-id=\"trendyol.com:id/cardViewOpenFilter\"])[1]\n")
    public WebElement sortByButton;
    @AndroidFindBy(xpath = "//android.widget.RadioButton[@resource-id=\"trendyol.com:id/radioButtonSortingTypeItem\"]")
    public List <WebElement> sortByOptionsList;
    @AndroidFindBy(xpath = "(//android.widget.ImageView[@resource-id=\"trendyol.com:id/imageViewProduct\"])")
    public List <WebElement> allProductsList;
    @AndroidFindBy(xpath = "//android.widget.Button[@text=\"Sepete Ekle\"]\n")
    public  WebElement addToCart;
    @AndroidFindBy(xpath = "//android.widget.TextView[@resource-id=\"trendyol.com:id/productDetailBasketItemCount\"]\n")
    public  WebElement goToCart;


}
