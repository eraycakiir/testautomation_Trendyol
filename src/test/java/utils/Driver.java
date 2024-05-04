package utils;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;

public class Driver {
    private static AndroidDriver driver;

    public static AndroidDriver getDriver() {
        if (driver == null) {
            UiAutomator2Options options = new UiAutomator2Options();
            options.setAppPackage("trendyol.com");
            options.setAppActivity("com.trendyol.common.splash.impl.ui.SplashActivity");
            options.setUdid("emulator-5554");
            options.setNoReset(false); //Yapılan şeyler kayıtlı kalsın mı kalmasın mı ?
            options.setNewCommandTimeout(Duration.ofMinutes(19));

            try {
                driver = new AndroidDriver(new URL("http://127.0.0.1:4723"), options);
            } catch (MalformedURLException e) {
                throw new RuntimeException("URL is malformed", e);
            }
        }
        return driver;
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

