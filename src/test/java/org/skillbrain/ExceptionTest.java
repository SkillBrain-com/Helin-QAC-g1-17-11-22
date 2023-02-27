package org.skillbrain;

import Utilities.Utils;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ExceptionTest extends Utils {
    public static void main(String[] args) throws Exception {
        WebDriver driver = null;

        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
        driver = new ChromeDriver();
        try {
            //ChromeDriver driver = new ChromeDriver;   ambele sunt legale
            driver.manage().window().maximize();
            driver.get("https://demoqa.com/buttons");
            takeScreenshot(driver);
            Actions actions = new Actions(driver);
            WebElement rightClickMe = driver.findElement(By.id("rightClickBtn"));
            actions.contextClick(rightClickMe).build().perform();
            String message = driver.findElement(By.tagName("p1d5")).getText();
            Thread.sleep(3000);
            System.out.println(message);
        } catch (Exception exception) {
            System.out.println(exception.getMessage());
            takeScreenshot(driver);
        } finally {
            takeScreenshot(driver);
            driver.quit();
        }


    }

}




