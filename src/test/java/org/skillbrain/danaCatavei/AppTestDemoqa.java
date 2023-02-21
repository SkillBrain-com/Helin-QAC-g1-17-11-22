package org.skillbrain.danaCatavei;

import Utilities.Utils;
import org.openqa.selenium.WebDriver;
import pageObjects.DemoqaPage;

import java.util.Iterator;
import java.util.Set;

public class AppTestDemoqa extends Utils {

    public static void main(String[] args) {

        WebDriver driver = getChromeDriver();
        try{
            driver.get("https://demoqa.com/");
//            String firstPageId = driver.getWindowHandle(); // capteaza hash-ul paginii
//            System.out.println(firstPageId);
//




            DemoqaPage demoqaPage = new DemoqaPage(driver);
            demoqaPage.bannerImage.click();

            Set<String> tabIds = driver.getWindowHandles();
            Iterator<String> iter = tabIds.iterator();


            String parentid = iter.next();
            String childId = iter.next();

            driver.switchTo().window(childId);
            demoqaPage.registrationButton.click();
            Thread.sleep(5000);
            demoqaPage.optionRO.click();
            Thread.sleep(5000);


        }
        catch(Exception e) {
            e.printStackTrace();

        }finally {
            driver.quit();
        }



    }
}
