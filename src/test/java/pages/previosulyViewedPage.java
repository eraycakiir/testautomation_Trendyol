package pages;

import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import utils.Driver;

import java.time.Duration;

public class previosulyViewedPage {
    public previosulyViewedPage() {
        PageFactory.initElements(new AppiumFieldDecorator(Driver.getDriver(), Duration.ofSeconds(25)), this);
    }
    @AndroidFindBy(xpath = "//android.widget.Switch[@resource-id=\"trendyol.com:id/switchCompatAvailability\"]\n")
    public WebElement switchButtonforPastVisit;
    @AndroidFindBy(xpath = "//android.widget.TextView[@resource-id=\"trendyol.com:id/textView_state_layout_info_title\"]")
    public WebElement verificationMessage;
    @AndroidFindBy(xpath = "//android.widget.Button[@resource-id=\"android:id/button1\"]\n")
    public WebElement closeHistory;

}
