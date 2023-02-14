package org.skillbrain;

import Utilities.Utils;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.IOException;

public class AlertTest extends Utils {

    private static ChromeDriver driver; // declar fara initializare

    public static void main(String[] args) throws IOException {
        System.setProperty("webdriver.chrome.driver" , "drivers/chromedriver");
        driver = new ChromeDriver();  // initilizare
        try {
            driver.manage().window().maximize();
            driver.get("https://demoqa.com/alerts");
            takeScreenshot(driver);
            driver.findElement(By.id("promtButton")).click();
            // schimbati focus-ul pe fereastra de alerta
            Alert alert = driver.switchTo().alert();
            // accept - OK;    dismiss - cancel
            alert.sendKeys("Selenium Test");
            Thread.sleep(2000);
            alert.accept();
            Thread.sleep(2000);
            System.out.println(driver.findElement(By.id("promptResult")).getText());
            takeScreenshot(driver);
        } catch (Exception exception) {
            System.out.println(exception.getMessage());
            takeScreenshot(driver);
        } finally {
            driver.quit();
        }
    }



}
