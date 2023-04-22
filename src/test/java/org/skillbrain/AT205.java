package org.skillbrain;

import Utilities.Utils;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import pageObject.DemoqaPage;

import java.net.MalformedURLException;

public class AT205 extends Utils {

    RemoteWebDriver driver;

    @BeforeTest
    public void StartTest() throws MalformedURLException {
     driver = getRemoteWebDriver();
    }

    @AfterTest
    public void  EndTest(){
        driver.quit();
    }

     @Test
    public void newWindowsTabMessageTest(){
        driver.get("https://demoqa.com/");
         DemoqaPage page = new DemoqaPage(driver);
         page.windowButton.click();

     }




}
