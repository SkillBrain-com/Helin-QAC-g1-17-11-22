package org.skillbrain.radulescuTeodor;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.io.IOException;
import java.time.Duration;
import java.util.Set;

import static Utilities.Utils.takeScreenshot;

public class Selenium_Tema2_3 {

    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();
        Actions actions = new Actions(driver);
        String mainWindowHandle = driver.getWindowHandle();
        driver.get("https://demoqa.com/browser-windows");


        try {

//new tab
            driver.findElement(By.cssSelector("#tabButton")).click();

            for (String windowHandle : driver.getWindowHandles()) {
                if (!windowHandle.equals(mainWindowHandle)) {
                    driver.switchTo().window(windowHandle);
                    break;
                }
            }

            System.out.println(driver.findElement(By.cssSelector("#sampleHeading")).getText());
            driver.close();
            driver.switchTo().window(mainWindowHandle);

//new window
            driver.findElement(By.cssSelector("#windowButton")).click();

            for (String windowHandle : driver.getWindowHandles()) {
                if (!windowHandle.equals(mainWindowHandle)) {
                    driver.switchTo().window(windowHandle);
                    break;
                }
            }
            System.out.println(driver.findElement(By.xpath("//h1[@id='sampleHeading']")).getText());
            driver.close();
            driver.switchTo().window(mainWindowHandle);


//new window message

            driver.findElement(By.cssSelector("#messageWindowButton")).click();

            for (String windowHandle : driver.getWindowHandles()) {
                if (!windowHandle.equals(mainWindowHandle)) {
                    driver.switchTo().window(windowHandle);
                    break;
                }
            }
            driver.close();

        } catch (Exception e) {
            try {
                takeScreenshot(driver);
            } catch (IOException io) {
                System.out.println(io.getMessage());
            }
        } finally {
            driver.quit();
        }
    }
}

