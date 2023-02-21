package org.skillbrain.radulescuTeodor;

import Utilities.Utils;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import pageObjects.DemoqaPage;

import java.util.Iterator;
import java.util.Set;

public class AppTest extends Utils {

    private static ChromeDriver driver;

    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        try {
            driver.get("https://demoqa.com");
            DemoqaPage demoqaPage = new DemoqaPage(driver);
            demoqaPage.bannerImage.click();

            Set<String> tabIDs = driver.getWindowHandles();
            Iterator<String> iter = tabIDs.iterator();
            String parentId = iter.next();
            String childId = iter.next();
            driver.switchTo().window(childId);

            demoqaPage.goToRegistrationButton.click();
            demoqaPage.optionRO.click();

            driver.switchTo().window(parentId);

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            driver.quit();
        }
    }


}

