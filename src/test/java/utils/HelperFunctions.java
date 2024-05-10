package utils;

import io.appium.java_client.AppiumDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Pause;
import org.openqa.selenium.interactions.PointerInput;
import org.openqa.selenium.interactions.Sequence;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.Collections;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Random;

public class HelperFunctions {
    public static void scroll(AppiumDriver driver, int scroll) throws InterruptedException {
        Dimension size = driver.manage().window().getSize();
        int startX = size.getWidth() / 2 ;
        int startY = size.getHeight() / 2 ;
        int endX = startX;
        int endY = (int) (size.getHeight()*0.25);
        //buradaki 0,25 şu şekildedir; imleç ekranın ortasında yani 0,50 de,
        // y ekseninde 0,25 seçtiğimizde 0,50 den 0,25 e çekiyor yani aşağı  kayıyor.
        // Eğer 0,75 deseydik ters yönde  kaydıracaktı. Ne kadar kaydıracağı ise değişiyor.


        PointerInput finger1 = new PointerInput(PointerInput.Kind.TOUCH, "finger1");

        for (int i = 0; i <scroll ; i++) {
            Sequence sequence = new Sequence(finger1,1).
                    addAction(finger1.createPointerMove(Duration.ZERO,PointerInput.Origin.viewport(), startX, startY)).
                    addAction(finger1.createPointerDown(PointerInput.MouseButton.LEFT.asArg())).
                    addAction(new Pause(finger1, Duration.ofMillis(100))).
                    addAction(finger1.createPointerMove(Duration.ofMillis(300),PointerInput.Origin.viewport(),endX,endY)).
                    addAction(finger1.createPointerUp(PointerInput.MouseButton.LEFT.asArg()));

            driver.perform(Collections.singletonList(sequence));}
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
                Thread.sleep(1000);  // DOM'un güncellenmesini bekle
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



    private static final Random random = new Random();

    public static <T> T selectRandomElement(List<T> elements) {
        return elements.get(random.nextInt(elements.size()));
    }
}
