package org.skillbrain.danielIrimia.TestNG;

import Utilities.Utils;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.*;
import pageObjects.KatalonDemoPage;

import java.io.IOException;
import java.time.Duration;

public class BookAppointmentTest extends Utils {
    WebDriver driver;
    KatalonDemoPage page;

    @BeforeTest
    public void startTest() {
        driver = getChromeDriver();
        page = new KatalonDemoPage(driver);
        driver.get(page.APP_URL);
    }

    // 2.4. Different positive and negative booking scenarios will be tested
    // (at least 1 positive scenario and one negative scenario)
    // 2.4.1. Positive scenario: Booking an appointment with valid data
    // 2.4.2. Negative scenario: Booking an appointment with invalid data
    @DataProvider(name = "bookAppointmentData")
    public Object[][] bookAppointmentData() {
        return new Object[][]{
                {"28/03/2023", "Test comment"},
        };
    }

    @Test(dataProvider = "bookAppointmentData")
    public void validBookAppointment(String date, String comment) throws IOException {
        page.makeAppointmentBtn.click();
        page.login("John Doe", "ThisIsNotAPassword");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        page.facilityDropdown.click();
        page.facilityDropdown.sendKeys("Tokyo CURA Healthcare Center");
        page.checkboxHospitalReadmission.click();
        page.radioProgramMedicaid.click();
        page.datePickerVisitDate.click();
        page.datePickerVisitDate.sendKeys(date);
        page.appointmentTxtComment.sendKeys(comment);
        page.bookAppointmentBtn.click();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        Assert.assertEquals(driver.getCurrentUrl(), "https://katalon-demo-cura.herokuapp.com/appointment.php#summary");
        Assert.assertTrue(page.goToHomepage.isDisplayed());
        takeScreenshot(driver);
        System.out.println("Book appointment with valid data Test passed");
    }

    @AfterTest
    public void endTest() {
        driver.quit();
    }
}
