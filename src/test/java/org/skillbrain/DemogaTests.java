package org.skillbrain;

import PageObjects.DemoqaPage;
import Utilitis.Utils;
import org.openqa.selenium.WebDriver;

import java.util.Iterator;
import java.util.Set;

public class DemogaTests extends Utils {

    //  public class App extends Utils {
        public static void main(String[] args){
            System.setProperty("Chromedriver.chrome.driver"," .idea/drivers/chromedriver.exe");
               WebDriver driver=getChromeDriver();
             System.out.println(".bannerImage");
             try {
                  driver.get("https://demoqa.com/");
                 // driver.get("https://www.toolsqa.com/selenium-training/#enroll-form");
              DemoqaPage demoqaPage=new DemoqaPage(driver);
             Thread.sleep(8000);
              demoqaPage.bannerImage.click();
             Set<String> tabIDs = driver.getWindowHandles();
             System.out.println(tabIDs.size());
              Iterator<String> iter = tabIDs.iterator();
             String parentid = iter.next();
             String childId = iter.next();
              driver.switchTo().window(childId);
              demoqaPage.gotoregistrationButton.click();
              demoqaPage.optionRo.click();
              Thread.sleep(5000);



             }catch (Exception e){
              e.printStackTrace();
             }finally {
             driver.quit();
            }

        }
    }



