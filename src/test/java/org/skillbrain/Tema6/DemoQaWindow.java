package org.skillbrain.Tema6;

import org.skillbrain.Tema7.Utils;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import java.io.IOException;

public class DemoQaWindow extends Utils {

    public static void main(String[] args) throws Exception {

        WebDriver driver = new ChromeDriver();
        Actions actions = new Actions(driver);
        String mainWindowHandle = driver.getWindowHandle();
        driver.get("https://demoqa.com/browser-windows");


        try {


            driver.findElement(By.id("tabButton")).click();

            for (String windowHandle : driver.getWindowHandles()) {
                if (!windowHandle.equals(mainWindowHandle)) {
                    driver.switchTo().window(windowHandle);
                    break;
                }
            }

            System.out.println(driver.findElement(By.id("sampleHeading")).getText());
            driver.close();
            driver.switchTo().window(mainWindowHandle);


            driver.findElement(By.id("windowButton")).click();

            for (String windowHandle : driver.getWindowHandles()) {
                if (!windowHandle.equals(mainWindowHandle)) {
                    driver.switchTo().window(windowHandle);
                    break;
                }
            }
            System.out.println(driver.findElement(By.xpath("//h1[@id='sampleHeading']")).getText());
            driver.close();
            driver.switchTo().window(mainWindowHandle);




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