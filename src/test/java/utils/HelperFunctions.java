package utils;

import io.appium.java_client.AppiumDriver;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.interactions.Pause;
import org.openqa.selenium.interactions.PointerInput;
import org.openqa.selenium.interactions.Sequence;

import java.time.Duration;
import java.util.Collections;

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
}
