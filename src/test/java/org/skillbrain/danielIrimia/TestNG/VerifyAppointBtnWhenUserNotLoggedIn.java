package org.skillbrain.danielIrimia.TestNG;

import Utilities.Utils;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import pageObjects.KatalonDemoPage;

import java.io.IOException;

public class VerifyAppointBtnWhenUserNotLoggedIn extends Utils {
    WebDriver driver;
    KatalonDemoPage page;

    @BeforeTest
    public void startTest(){
        driver = getChromeDriver();
        page = new KatalonDemoPage(driver);
        driver.get(page.APP_URL);
    }

    @Test
    public void verifyMakeAppointBtnWhenUserNotLoggedIn () throws IOException {
        page.makeAppointmentBtn.click();
        Assert.assertEquals(driver.getCurrentUrl(),"https://katalon-demo-cura.herokuapp.com/profile.php#login");
        Assert.assertTrue(page.form.isDisplayed());
        takeScreenshot(driver);
        System.out.println("Verify make appointment button when user is not logged in: Test passed");
    }

    @AfterTest
    public void endTest(){
        driver.quit();
    }
}
