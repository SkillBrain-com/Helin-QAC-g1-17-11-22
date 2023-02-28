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
            Iterator<String> iter = tabIDs.iterator();
            String parentID = iter.next();
            String childID = iter.next();
            driver.switchTo().window(childID);
            demoqaPage.goToRegistrationButton.click();
            demoqaPage.firstName.sendKeys("NELUTU");
            demoqaPage.lastName.sendKeys("MOLDOVAN");
            demoqaPage.email.sendKeys("email@yahoo.com");
            demoqaPage.mobile.sendKeys("0754000754");
            demoqaPage.optionRO.click();
            demoqaPage.city.sendKeys("ORAS");
            demoqaPage.message.sendKeys("OK");
            demoqaPage.send.click();


        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            driver.quit();
        }


    }


}

