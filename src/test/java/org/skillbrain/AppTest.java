package org.skillbrain;

import Utilities.Utils;
import org.openqa.selenium.WebDriver;
import pageObjects.DemoqaPage;

import java.util.Iterator;
import java.util.Set;

public class AppTest extends Utils {

    public static void main(String[] args) {
        WebDriver driver = getChromeDriver();
        try {
            driver.get("https://demoqa.com/");
            DemoqaPage demoqaPage = new DemoqaPage(driver);
            demoqaPage.bannerImage.click();
            Set<String> tabIDs = driver.getWindowHandles();
            System.out.println(tabIDs.size());
            Iterator<String> iter = tabIDs.iterator();
            String parentid = iter.next();
            String childId = iter.next();
            driver.switchTo().window(childId);
            demoqaPage.goToRegistrationButton.click();
            demoqaPage.optionRO.click();
            Thread.sleep(5000);


        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            driver.quit();
        }

    }

}