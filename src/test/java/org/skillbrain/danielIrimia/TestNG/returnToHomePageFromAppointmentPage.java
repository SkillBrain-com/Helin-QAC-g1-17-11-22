package org.skillbrain.danielIrimia.TestNG;

import Utilities.Utils;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import pageObjects.KatalonDemoPage;

public class returnToHomePageFromAppointmentPage extends Utils {
    WebDriver driver;
    KatalonDemoPage page;

    @BeforeTest
    public void startTest(){
        driver = getChromeDriver();
        page = new KatalonDemoPage(driver);
        driver.get(page.APP_URL);
    }

    @Test
    public void returnToHomePageFromAppointmentPageTest() {
        page.makeAppointmentBtn.click();
        page.login("John Doe", "ThisIsNotAPassword");
        page.menuToggle.click();
        page.home.click();
        Assert.assertEquals(driver.getCurrentUrl(), page.APP_URL);
        System.out.println("Return to home page from appointment page Test passed");
    }

    @AfterTest
    public void endTest(){
        driver.quit();
    }
}
