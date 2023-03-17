package org.skillbrain.danielIrimia.TestNG;

import Utilities.Utils;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import pageObjects.KatalonDemoPage;

import java.io.IOException;

public class returnToHomePageFromMenu extends Utils {
    WebDriver driver;
    KatalonDemoPage page;

    @BeforeTest
    public void startTest(){
        driver = getChromeDriver();
        page = new KatalonDemoPage(driver);
        driver.get(page.APP_URL);
    }

    @Test
    public void returnToHomePageFromMenuTest() throws IOException {
        page.menuToggle.click();
        page.home.click();
        Assert.assertEquals(driver.getCurrentUrl(), page.APP_URL);
        takeScreenshot(driver);
        System.out.println("Return to home page from menu Test passed");
    }

    @AfterTest
    public void endTest(){
        driver.quit();
    }
}
