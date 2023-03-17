package org.skillbrain.danielIrimia.TestNG;

import Utilities.Utils;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import pageObjects.KatalonDemoPage;

import java.io.IOException;
import java.time.Duration;

public class InvalidBookAppointmentTest extends Utils {
    WebDriver driver;
    KatalonDemoPage page;

    @BeforeTest
    public void startTest(){
        driver = getChromeDriver();
        page = new KatalonDemoPage(driver);
        driver.get(page.APP_URL);
    }


    @Test
    public void invalidBookAppointment() throws IOException {
        page.makeAppointmentBtn.click();
        page.login("John Doe", "ThisIsNotAPassword");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        page.facilityDropdown.click();
        page.facilityDropdown.sendKeys("Tokyo CURA Healthcare Center");
        page.checkboxHospitalReadmission.click();
        page.radioProgramMedicaid.click();
        page.datePickerVisitDate.click();
        page.datePickerVisitDate.sendKeys("");
        page.appointmentTxtComment.sendKeys("Test comment");
        page.bookAppointmentBtn.click();
        System.out.println(page.datePickerVisitDate.getAttribute("required"));
        takeScreenshot(driver);
        System.out.println("Book appointment with invalid data Test passed");
    }

    @AfterTest
    public void endTest(){
        driver.quit();
    }

}
