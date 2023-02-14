package org.skillbrain.teodorRadulescu.seleniumTest;

import Utilities.Utils;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;


import java.io.IOException;

public class AlertTest extends Utils {

    public static void main(String[] args) throws IOException {
        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver");
        ChromeDriver driver = new ChromeDriver();
        try {
            driver.manage().window().maximize();
            driver.get("https://demoqa.com/alerts");
            driver.findElement(By.id("alertButton")).click();
            Alert alert = driver.switchTo().alert();

        } catch (Exception e) {
            System.out.println("Exception: " + e.getMessage());
            takeScreenshot(driver);
        } finally {
            takeScreenshot(driver);
            driver.quit();
        }

    }
}