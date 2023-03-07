package org.skillbrain;

import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import PageObjects.DemoqaPage;

import java.io.IOException;
import java.net.MalformedURLException;
import java.time.Duration;
import Utilitis.Utils;

public class AT205GT extends Utils {
    RemoteWebDriver driver;

    @BeforeTest
    public void startTest() throws MalformedURLException {
        driver=getRemoteWebdriver();
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
        page.clickwindowButton.click();
        page.clickBrowserWindowButton.click();
        page.newTabMessageButton.click();
        Thread.sleep(2000);
        takeScreenshot(driver);
        System.out.println("Test finished");
    }
}



