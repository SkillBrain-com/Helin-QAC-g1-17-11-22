package org.skillbrain;

import Utilities.Utils;
import org.openqa.selenium.WebDriver;
import pageObjects.QADemoPage;

import java.util.Iterator;
import java.util.Set;

public class DemoQAAppTest extends Utils {

    public static void main(String[] args) {
        WebDriver driver = getChromeDriver();

        try {
            driver.get("https://demoqa.com/");
            QADemoPage qademo = new QADemoPage(driver);
            qademo.bannerImg.click();
            Set<String> tabIDs = driver.getWindowHandles();
            Iterator<String> iter = tabIDs.iterator();
            String parrentID = iter.next();
            String childID = iter.next();
            driver.switchTo().window(childID);
            qademo.goToRegistrationButton.click();
            qademo.optionRO.click();

        } catch (Exception e){
            e.printStackTrace();
        }finally {
            driver.quit();
        }
    }

}
