package org.skillbrain.danielIrimia.TestNG;

import Utilities.Utils;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import pageObjects.KatalonDemoPage;

public class returnToHomePageFromHistoryAppointment extends Utils {
    WebDriver driver;
    KatalonDemoPage page;

    @BeforeTest
    public void startTest(){
        driver = getChromeDriver();
        page = new KatalonDemoPage(driver);
        driver.get(page.APP_URL);
    }

    @Test
    public void returnToHomePageFromHistoryAppointmentTest()  {
        page.makeAppointmentBtn.click();
        page.login("John Doe", "ThisIsNotAPassword");
        page.datePickerVisitDate.click();
        page.datePickerVisitDate.sendKeys("30/12/2023");
        page.bookAppointmentBtn.click();
        page.menuToggle.click();
        page.historyAppointment.click();
        page.menuToggle.click();
        page.home.click();
        Assert.assertEquals(driver.getCurrentUrl(), page.APP_URL);
        System.out.println("Return to home page from history appointment page Test passed");
    }

    @AfterTest
    public void endTest(){
        driver.quit();
    }
}
