package utils;

import io.appium.java_client.AppiumDriver;

import io.appium.java_client.android.nativekey.AndroidKey;
import io.appium.java_client.android.nativekey.KeyEvent;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Pause;
import org.openqa.selenium.interactions.PointerInput;
import org.openqa.selenium.interactions.Sequence;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


import java.time.Duration;
import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import static utils.Driver.driver;


public class ReusableMethods {
    public static int productCount;
    public static String firstWord;

    public static void scroll(AppiumDriver driver, int scroll) throws InterruptedException {
        Dimension size = driver.manage().window().getSize();
        int startX = size.getWidth() / 2;
        int startY = size.getHeight() / 2;
        int endX = startX;
        int endY = (int) (size.getHeight() * 0.25);
        //buradaki 0,25 şu şekildedir; imleç ekranın ortasında yani 0,50 de,
        // y ekseninde 0,25 seçtiğimizde 0,50 den 0,25 e çekiyor yani aşağı  kayıyor.
        // Eğer 0,75 deseydik ters yönde  kaydıracaktı. Ne kadar kaydıracağı ise değişiyor.


        PointerInput finger1 = new PointerInput(PointerInput.Kind.TOUCH, "finger1");

        for (int i = 0; i < scroll; i++) {
            Sequence sequence = new Sequence(finger1, 1).
                    addAction(finger1.createPointerMove(Duration.ZERO, PointerInput.Origin.viewport(), startX, startY)).
                    addAction(finger1.createPointerDown(PointerInput.MouseButton.LEFT.asArg())).
                    addAction(new Pause(finger1, Duration.ofMillis(100))).
                    addAction(finger1.createPointerMove(Duration.ofMillis(300), PointerInput.Origin.viewport(), endX, endY)).
                    addAction(finger1.createPointerUp(PointerInput.MouseButton.LEFT.asArg()));

            driver.perform(Collections.singletonList(sequence));
        }
        Thread.sleep(3000);
    }

    public double extractPrice(String priceText) {
        // Rakamları, virgül ve noktayı al
        String cleanPriceText = priceText.replaceAll("[^\\d,\\.]", "");

        // Metinde sayı olup olmadığını kontrol et
        if (!cleanPriceText.matches(".*\\d.*")) {
            throw new IllegalArgumentException("Geçerli bir fiyat içermeyen metin: " + priceText);
        }

        // Virgül ve nokta işaretlerini düzelt
        cleanPriceText = cleanPriceText.replace(".", "").replace(",", ".");

        // Sayıyı çift olarak dönüştür
        try {
            return Double.parseDouble(cleanPriceText);
        } catch (NumberFormatException e) {
            throw new IllegalArgumentException("Fiyat metnini çözümleme hatası: " + priceText);
        }
    }


    public static void scrollToTextAndClick(AppiumDriver driver, List<WebElement> elements, String searchText) throws InterruptedException {
        boolean found = false;
        Dimension size = driver.manage().window().getSize();
        int startX = size.getWidth() / 2;
        int startY = size.getHeight() / 2;
        int endX = startX;
        int endY = (int) (size.getHeight() * 0.25);
        PointerInput finger1 = new PointerInput(PointerInput.Kind.TOUCH, "finger1");

        int previousSize = 0;
        int currentSize = elements.size();

        while (!found && previousSize != currentSize) {
            for (WebElement element : elements) {
                System.out.println(element.getText());// Yazdırılan metinleri görüntüle
                if (element.getText().equals(searchText)) {
                    element.click();
                    found = true;
                    break;
                }
            }

            if (!found) {
                previousSize = currentSize;  // Güncellemeden önceki boyut
                Sequence sequence = new Sequence(finger1, 1)
                        .addAction(finger1.createPointerMove(Duration.ZERO, PointerInput.Origin.viewport(), startX, startY))
                        .addAction(finger1.createPointerDown(PointerInput.MouseButton.LEFT.asArg()))
                        .addAction(new Pause(finger1, Duration.ofMillis(100)))
                        .addAction(finger1.createPointerMove(Duration.ofMillis(1000), PointerInput.Origin.viewport(), endX, endY))  // Daha yavaş bir scroll
                        .addAction(finger1.createPointerUp(PointerInput.MouseButton.LEFT.asArg()));

                driver.perform(Collections.singletonList(sequence));
                Driver.Wait(4);  // DOM'un güncellenmesini bekle
                elements = driver.findElements(By.xpath("//android.widget.TextView[@resource-id=\"trendyol.com:id/textViewFilterTitle\"]"));  // Element listesini yenile
                currentSize = elements.size();
            }
        }

        if (!found) {
            System.out.println("Text not found: " + searchText);
        }

        if (previousSize == currentSize) {
            System.out.println("Reached the end of the list.");
        }
    }

    public static void waitForSeconds(int s) {
        try {
            Thread.sleep(1000 * s);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

    public static void pressAppSwitchButton() {
        if (Driver.getDriver() != null) {
            Driver.getDriver().pressKey(new KeyEvent(AndroidKey.APP_SWITCH));
        }
    }

    public static void scrollToElementAndClickWithXPATH(AppiumDriver driver, String xpath) throws InterruptedException {
        // Ekran boyutunu al
        Dimension size = driver.manage().window().getSize();
        int startX = size.getWidth() / 2;
        int startY = size.getHeight() / 2;
        int endX = startX;
        int endY = (int) (size.getHeight() * 0.25);  // Kaydırma mesafesi

        // Element bulunana kadar döngü içinde kaydırma işlemi yap
        while (driver.findElements(By.xpath(xpath)).isEmpty()) {
            PointerInput finger = new PointerInput(PointerInput.Kind.TOUCH, "finger1");
            Sequence sequence = new Sequence(finger, 1)
                    .addAction(finger.createPointerMove(Duration.ZERO, PointerInput.Origin.viewport(), startX, startY))
                    .addAction(finger.createPointerDown(PointerInput.MouseButton.LEFT.asArg()))
                    .addAction(new Pause(finger, Duration.ofMillis(100)))
                    .addAction(finger.createPointerMove(Duration.ofMillis(300), PointerInput.Origin.viewport(), endX, endY))
                    .addAction(finger.createPointerUp(PointerInput.MouseButton.LEFT.asArg()));
            driver.perform(Collections.singletonList(sequence));
            Thread.sleep(500); // Biraz beklet, sonra tekrar kontrol et
        }

        // Element artık görünür durumda, tıklama işlemi yap
        WebElement element = driver.findElement(By.xpath(xpath));
        element.click();
        Thread.sleep(1000); // Tıklama sonrası biraz beklet
    }

    public static final Random random = new Random();

    public static void selectRandomElement(AppiumDriver driver, List<WebElement> elements) throws InterruptedException {
        Random rand = new Random();
        int randomIndex = rand.nextInt(elements.size());
        elements.get(randomIndex).click();
        Driver.Wait(2);
    }


    public static <T> T selectRandomElement(List<T> elements) {
        return elements.get(random.nextInt(elements.size()));
    }

    public static void scrollAndCountProducts(AppiumDriver driver, List<WebElement> products) throws InterruptedException {
        Dimension size = driver.manage().window().getSize();
        int startX = size.getWidth() / 2;
        int startY = (int) (size.getHeight() * 0.75);
        int endY = (int) (size.getHeight() * 0.25);

        PointerInput finger = new PointerInput(PointerInput.Kind.TOUCH, "finger1");
        Set<String> seenTexts = new HashSet<>();
        boolean isScrollNeeded = true;

        while (isScrollNeeded) {

            if (products.size() == 0) {
                System.out.println("Ürün yok, scroll bitiriliyor.");
                break;
            }

            // Tüm yüklenen ürünleri kontrol et
            isScrollNeeded = false;
            for (WebElement product : products) {

                String productText = product.getText();
                if (seenTexts.add(productText)) {
                    isScrollNeeded = true;
                }
            }

            if (isScrollNeeded) {
                // Scroll işlemi
                Sequence scrollSequence = new Sequence(finger, 0)
                        .addAction(finger.createPointerMove(Duration.ZERO, PointerInput.Origin.viewport(), startX, startY))
                        .addAction(finger.createPointerDown(PointerInput.MouseButton.LEFT.asArg()))
                        .addAction(new Pause(finger, Duration.ofMillis(200)))
                        .addAction(finger.createPointerMove(Duration.ofMillis(600), PointerInput.Origin.viewport(), startX, endY))
                        .addAction(finger.createPointerUp(PointerInput.MouseButton.LEFT.asArg()));

                driver.perform(Collections.singletonList(scrollSequence));
                Thread.sleep(2000);  // Sayfanın tamamen yüklenmesini bekleyin
            }
        }

        System.out.println("Toplam görülen farklı ürün sayısı: " + seenTexts.size());
        productCount = seenTexts.size();
    }

    public static int extractNumberFromText(String text) {
        Pattern pattern = Pattern.compile("\\d+");
        Matcher matcher = pattern.matcher(text);

        // Eğer bir sayı bulunursa, bunu integer'a çevir ve döndür
        if (matcher.find()) {
            return Integer.parseInt(matcher.group());
        }

        // Eğer sayı bulunamazsa, bir hata döndür veya 0 dön
        return 0; // Veya throw new IllegalArgumentException("No numbers found in the text.");
    }

    public static void waitForVisibility(WebDriver driver, WebElement element, int timeout) {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(timeout));
        wait.until(ExpectedConditions.visibilityOf(element));
    }

    /**
     * This method retrieves the text from the given WebElement
     * and returns only the first word.
     *
     * @param element The WebElement from which to get the text
     * @return The first word from the text
     */
    public static String getFirstWordFromElement(WebElement element) {
        // Get the text from the element
        String fullText = element.getText();

        // Split the text by space and take the first word
        firstWord = fullText.split(" ")[0];

        // Return the first word
        return firstWord;
    }

    public static void scrollUntilTextVisible(String text) throws InterruptedException {
        boolean found = false;
        Dimension size = driver.manage().window().getSize();
        int startX = size.getWidth() / 2;
        int startY = size.getHeight() / 2;
        int endX = startX;
        int endY = (int) (size.getHeight() * 0.25);
        PointerInput finger1 = new PointerInput(PointerInput.Kind.TOUCH, "finger1");

        while (!found) {
            try {
                WebElement element = driver.findElement(By.xpath("//android.widget.TextView[@text='" + text + "']"));
                if (element.isDisplayed()) {
                    found = true;
                    System.out.println("Element found: " + text);
                }
            } catch (Exception e) {
                // Create the swipe action
                Sequence swipe = new Sequence(finger1, 1)
                        .addAction(finger1.createPointerMove(Duration.ZERO, PointerInput.Origin.viewport(), startX, startY))
                        .addAction(finger1.createPointerDown(PointerInput.MouseButton.LEFT.asArg()))
                        .addAction(new Pause(finger1, Duration.ofMillis(100)))
                        .addAction(finger1.createPointerMove(Duration.ofMillis(500), PointerInput.Origin.viewport(), endX, endY))
                        .addAction(finger1.createPointerUp(PointerInput.MouseButton.LEFT.asArg()));

                // Perform the swipe action
                driver.perform(Collections.singletonList(swipe));

                // Wait a bit for the page to load
                Thread.sleep(2000);
            }
        }
    }

}




