package utils;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.nativekey.AndroidKey;
import io.appium.java_client.android.nativekey.KeyEvent;
import io.appium.java_client.android.options.UiAutomator2Options;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;

public class Driver {
    public static AndroidDriver driver;

    public static WebDriverWait wait = new WebDriverWait(Driver.getDriver(), Duration.ofSeconds(10)); // WebDriverWait nesnesini başlatma

    public static AndroidDriver getDriver() {
        if (driver == null) {
            UiAutomator2Options options = new UiAutomator2Options();
            options.setAppPackage("trendyol.com");
            options.setAppActivity("com.trendyol.common.splash.impl.ui.SplashActivity");
            options.setUdid("emulator-5554");
            options.setCapability("automationName", "UiAutomator2");
            options.setNoReset(true); //Yapılan şeyler kayıtlı kalsın mı kalmasın mı ?
            options.setNewCommandTimeout(Duration.ofMinutes(19));

            try {
                driver = new AndroidDriver(new URL("http://127.0.0.1:4723"), options);
            } catch (MalformedURLException e) {
                throw new RuntimeException("URL is malformed", e);
            }
        }
        return driver;
    }
    public static AndroidDriver androidDriver;

    public static void pressBackButton() {
        if (driver != null) {
            driver.pressKey(new KeyEvent(AndroidKey.BACK));
        }
    }



    public static void Wait(int s) {
        try {
            Thread.sleep(1000 * s);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);

        }
    }

    public static void closeDriver() {
        if (driver != null) {
            driver.quit();
            driver = null;
        }
    }

    @BeforeClass
    public static void setUp() {
        getDriver();
    }

    @AfterClass
    public static void endOf() {
        closeDriver();
    }

}

