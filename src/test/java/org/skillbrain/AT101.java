package org.skillbrain;

import Utilities.Utils;
import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import pageObject.DemoqaPage;

public class AT101 extends Utils {
    WebDriver driver;

    @BeforeTest
    public void StartTest() {
        driver = getChromeDriver();

    }


    @AfterTest
    public void StopTest() {
        driver.quit();
    }


    @Test
    public void AlertTest()  {
        // logate pe demoqa.com
       try {


            driver.get("https://demoqa.com/");
        DemoqaPage page = new DemoqaPage(driver);// creare obiect
        page.alertPanelButton.click();
        page.alertButton.click();
        page.clickMeButton_1.click();
        takeScreenshot(driver);
        Alert alert = driver.switchTo().alert();// switch pe tereastre de alert
        alert.accept();  //OK din pagina de alert
        System.out.println("Test finished!");


       } catch(Exception e){
           e.printStackTrace();

       }finally {
           driver.quit();
       }

    }
}
