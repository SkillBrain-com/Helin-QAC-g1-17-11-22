package org.skillbrain;


import Utilities.Utils;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import pageObjects.DemoqaPage;

import java.io.IOException;
import java.net.MalformedURLException;
import java.time.Duration;

public class AT205 extends Utils {

    WebDriver driver;

    @BeforeTest
    public void startTest() throws MalformedURLException {
        driver=getRemoteWebDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
    }

    @AfterTest
    public void endTest(){

        driver.quit();
    }

    @Test
    public void newWindowTabMessageTest() throws IOException, InterruptedException {
        driver.get("https://demoqa.com/");
        DemoqaPage page = new DemoqaPage(driver);
        page.clickWindowButton.click();
        page.clickBrowserWindowButton.click();
        page.newTabMessageButton.click();
        Thread.sleep(2000);
        takeScreenshot(driver);
        System.out.println("Test finished");
    }
}
