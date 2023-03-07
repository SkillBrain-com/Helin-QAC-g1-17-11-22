package org.skillbrain;

import Utilities.Utils;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Iterator;
import java.util.Set;


public class Selenium_part2 extends Utils {

    private static ChromeDriver driver;

    public static void main(String[] args) throws Exception {
        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver");
        driver = new ChromeDriver();  // initilizare

        try {
            System.out.println(System.getProperty("user.dir"));
            driver.manage().window().maximize();
            driver.get("https://demoqa.com/browser-windows");


            Set<String> tabIDs = driver.getWindowHandles();
            System.out.println(tabIDs.size());
            Iterator<String> iter = tabIDs.iterator();
            String parentid = iter.next();
            String childId = iter.next();
            driver.switchTo().window(childId);//face printscreen doar la prima pagina si nu si la taburile noi deschise


            takeScreenshot(driver);

            WebElement WindowMessage = driver.findElement(By.id("windowButton"));
            WebElement NewWindowMessage = driver.findElement(By.id("messageWindowButton"));

            NewWindowMessage.click();
            Thread.sleep(5000);
            takeScreenshot(driver);
            WindowMessage.click();
            Thread.sleep(5000);


        } catch (Exception exception) {
            System.out.println(exception.getMessage());
            takeScreenshot(driver);
        } finally {
            takeScreenshot(driver);
            driver.quit();
        }
    }
}