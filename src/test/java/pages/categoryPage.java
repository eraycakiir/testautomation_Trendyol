package pages;

import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import utils.Driver;

import java.time.Duration;
import java.util.List;

public class categoryPage {
    public categoryPage() {
        PageFactory.initElements(new AppiumFieldDecorator(Driver.getDriver(), Duration.ofSeconds(25)), this);
    }
    @AndroidFindBy(xpath = "//android.widget.TextView[@resource-id=\"trendyol.com:id/textViewTitle\"]")
    public List <WebElement> chooseByCategoryList;

    @AndroidFindBy(xpath = "//android.widget.TextView[@resource-id=\"trendyol.com:id/textViewTitle\"]")
    public List <WebElement> selectSubCategoryListForText;
    @AndroidFindBy(xpath = "(//android.widget.RelativeLayout[@resource-id=\"trendyol.com:id/layoutCollapsibleBannerHeader\"])[1]")
    public  WebElement selectSubCategoryListForTextFirst;
    @AndroidFindBy(xpath = "//android.widget.TextView[@resource-id=\"trendyol.com:id/titleCollapsibleBannerItem\"]")
    public List  <WebElement> selectSubCategoryListForImage;

    @AndroidFindBy(xpath = "//android.widget.TextView[@resource-id=\"trendyol.com:id/titleCollapsibleBannerItem\" and @text=\"Elbise\"]\n")
    public  WebElement elbiseTextVerification;
    @AndroidFindBy(xpath = "//android.widget.TextView[@resource-id=\"trendyol.com:id/titleCollapsibleBannerItem\" and @text=\"Takım Elbise\"]\n")
    public  WebElement takımElbiseTextVerification;
    @AndroidFindBy(xpath = "//android.widget.TextView[@resource-id=\"trendyol.com:id/textViewTitle\" and @text=\"Bebek\"]\n")
    public  WebElement bebekTextVerification;
    @AndroidFindBy(xpath = "//android.widget.TextView[@resource-id=\"trendyol.com:id/textViewTitle\" and @text=\"Sofra & Mutfak\"]\n")
    public  WebElement sofraTextVerification;
    @AndroidFindBy(xpath = "//android.widget.TextView[@resource-id=\"trendyol.com:id/textViewTitle\" and @text=\"Ev & Temizlik\"]\n")
    public  WebElement evTemizlikTextVerification;
    @AndroidFindBy(xpath = "//android.widget.TextView[@resource-id=\"trendyol.com:id/textViewTitle\" and @text=\"Makyaj\"]\n")
    public  WebElement makyajTextVerification;
    @AndroidFindBy(xpath = "//android.widget.TextView[@resource-id=\"trendyol.com:id/titleCollapsibleBannerItem\" and @text=\"Saat\"]\n")
    public  WebElement saatTextVerification;
    @AndroidFindBy(xpath = "//android.widget.TextView[@resource-id=\"trendyol.com:id/textViewTitle\" and @text=\"Küçük Ev Aletleri\"]\n")
    public  WebElement küçükEvAletleriTextVerification;
    @AndroidFindBy(xpath = "//android.widget.TextView[@resource-id=\"trendyol.com:id/textViewTitle\" and @text=\"Spor & Outdoor\"]\n")
    public  WebElement sporOutdorTextVerification;
    @AndroidFindBy(xpath = "//android.widget.TextView[@resource-id=\"trendyol.com:id/textViewTitle\" and @text=\"Hobi\"]\n")
    public  WebElement hobiTextVerification;
}
