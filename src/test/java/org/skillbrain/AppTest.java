package org.skillbrain;

import Utilities.Utils;
import org.openqa.selenium.WebDriver;
import pageObject.DemoqaPage;

import java.util.Iterator;
import java.util.Set;


public class AppTest extends Utils{

    public static void main(String[] args) {
        WebDriver driver = getChromeDriver();
        try {
            driver.get("https://demoqa.com/");
           // String firstPageId = driver.getWindowHandle();
           // System.out.println("ID = " + firstPageId);
            DemoqaPage demoqaPage = new DemoqaPage(driver);
            demoqaPage.bannerImage.click();
         Set<String>tabIDs =  driver.getWindowHandles();
            Thread.sleep(4000);
            Iterator<String> iterator = tabIDs.iterator();
            String parentid = iterator.next();
            String childId = iterator.next();
            driver.switchTo().window(childId);
            demoqaPage.goToRegistrationButton.click();
            demoqaPage.optionRomania.click();
           takeScreenshot(driver);
            Thread.sleep(4000);


        } catch(Exception e){
                e.printStackTrace();

            }finally {
            driver.quit();
        }






















    }



}

