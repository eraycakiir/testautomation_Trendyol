package pages;

import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import utils.Driver;

import java.time.Duration;
import java.util.List;

public class gmailAccount {
    public gmailAccount() {
        PageFactory.initElements(new AppiumFieldDecorator(Driver.getDriver(), Duration.ofSeconds(25)), this);
    }
    @AndroidFindBy(xpath = "//android.widget.TextView[@package='com.google.android.gm' and @text='Trendyol' and @resource-id='com.google.android.gm:id/senders']\n")
    public WebElement lastMail;
    @AndroidFindBy(xpath = "//android.view.View[@content-desc='ŞİFREMİ GÜNCELLE']")
    public WebElement updatePassword;
    @AndroidFindBy(xpath = "//android.widget.TextView[@resource-id=\"com.google.android.gm:id/subject_and_folder_view\"]\n")
    public WebElement verificationCodeArea;
    @AndroidFindBy(xpath = "(//android.widget.LinearLayout[@resource-id=\"com.google.android.gms:id/container\"])")
    public List <WebElement>gmailAccounts;
}

