package org.skillbrain.danaCatavei;

import Utilities.Utils;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.IOException;

public class AlertTest extends Utils {
    private static ChromeDriver driver; // declar fara intilializare

    public static void main(String[] args) throws IOException {
        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
        driver = new ChromeDriver(); // initializare

        try {
            driver.get("https://demoqa.com/alerts");
            takeScreenshot(driver);
            //driver.findElement(By.id("alertButton")).click();
            //driver.findElement(By.id("confirmButton")).click();
            driver.findElement(By.id("promtButton")).click();
            //schimbati focusulu pe fereastra de alerta
            Alert alert = driver.switchTo().alert();

            Thread.sleep(3000);
            // Ok, adica accept
            //alert.accept();
            // Cancel dismiss
            //alert.dismiss();
            alert.sendKeys("Selenium test");
            Thread.sleep(3000);
            alert.accept();
            //System.out.println(driver.findElement(By.id("confirmResult")).getText());
            System.out.println(driver.findElement(By.id("promptResult")).getText());
            Thread.sleep(3000);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        } finally {
            driver.quit();
        }

    }
}
