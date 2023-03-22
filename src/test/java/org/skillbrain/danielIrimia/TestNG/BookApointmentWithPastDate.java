package org.skillbrain.danielIrimia.TestNG;

import Utilities.Utils;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import pageObjects.KatalonDemoPage;

import java.io.IOException;
import java.time.Duration;

public class BookApointmentWithPastDate extends Utils {
    WebDriver driver;
    KatalonDemoPage page;

    @BeforeTest
    public void startTest(){
        driver = getChromeDriver();
        page = new KatalonDemoPage(driver);
        driver.get(page.APP_URL);
    }

    @Test
    public void bookApointmentWithPastDateTest() throws IOException {
        page.makeAppointmentBtn.click();
        page.login("John Doe","ThisIsNotAPassword");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        Assert.assertEquals(driver.getCurrentUrl(),"https://katalon-demo-cura.herokuapp.com/#appointment");
        page.checkboxHospitalReadmission.click();
        page.datePickerVisitDate.click();
        page.datePickerVisitDate.sendKeys("23/06/2020");
        page.appointmentTxtComment.sendKeys("Test with past date");
        page.bookAppointmentBtn.click();
        takeScreenshot(driver);
        System.out.println("Book appointment with past date Test passed");
    }

    @AfterTest
    public void endTest(){
        driver.quit();
    }
}
