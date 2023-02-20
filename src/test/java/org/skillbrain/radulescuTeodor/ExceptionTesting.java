package org.skillbrain.radulescuTeodor;

//import Utilities.Utils;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import java.io.IOException;

import static Utilities.Utils.takeScreenshot;


public class ExceptionTesting  {

    public static void main(String[] args) throws IOException {

        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
        ChromeDriver driver = new ChromeDriver();

        try {
            driver.manage().window().maximize();
            driver.get("https://demoqa.com/buttons");
            Actions action = new Actions(driver);
            WebElement rightClickMe = driver.findElement(By.id("rightClickBtn"));
            action.contextClick(rightClickMe).build().perform();
            String message = driver.findElement(By.tagName("p")).getText();
            Thread.sleep(3000);
            throwError();
            System.out.println(message);
        } catch (Exception e) {
            System.out.println("Exception: " + e.getMessage());
            takeScreenshot(driver);
        } finally {
            takeScreenshot(driver);
            driver.quit();
        }

    }

    public static void findFile(String location) throws IOException {
        throw new IOException("File not found");
    }
    public static void throwError() throws IOException {
        throw new IOException("Runtime error");
    }
}
