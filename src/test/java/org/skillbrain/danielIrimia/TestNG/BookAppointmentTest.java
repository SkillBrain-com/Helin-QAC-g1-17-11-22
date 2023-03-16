package org.skillbrain.danielIrimia.TestNG;

import Utilities.Utils;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import pageObjects.KatalonDemoPage;

import java.io.IOException;
import java.time.Duration;

public class BookAppointmentTest extends Utils {
    WebDriver driver;
    KatalonDemoPage page;

    @BeforeTest
    public void startTest(){
        driver = getChromeDriver();
        page = new KatalonDemoPage(driver);
        driver.get(page.APP_URL);
    }
    // 2.4. Different positive and negative booking scenarios will be tested
    // (at least 1 positive scenario and one negative scenario)
    @Test
    public void verifyBooking() throws IOException {
        Actions action = new Actions(driver);
        page.menuToggle.click();
        page.loginMenu.click();
        Assert.assertTrue(page.form.isDisplayed());
        page.userName.sendKeys("John Doe");
        page.password.sendKeys("ThisIsNotAPassword");
        page.loginButtonForm.submit();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        Assert.assertEquals(driver.getCurrentUrl(),"https://katalon-demo-cura.herokuapp.com/#appointment");
        Assert.assertTrue(page.makeAppointmentBtn.isDisplayed());
        page.makeAppointmentBtn.click();
        Assert.assertEquals(driver.getCurrentUrl(),"https://katalon-demo-cura.herokuapp.com/#appointment");
        Assert.assertTrue(page.makeAppointmentBtn.isDisplayed());
        action.moveToElement(page.facilityDropdown).click().perform();
        action.scrollToElement(page.selectComboFacilitySeoul).click();
        page.checkboxHospitalReadmission.click();
        page.radioProgramMedicare.click();
        page.datePickerVisitDate.click();
        page.datePickerVisitDate.sendKeys("12/12/2020");
        page.appointmentTxtComment.sendKeys("This is a comment");
        page.bookAppointmentBtn.click();
        Assert.assertEquals(driver.getCurrentUrl(),"https://katalon-demo-cura.herokuapp.com/appointment.php#summary");
        Assert.assertTrue(page.goToHomepage.isDisplayed());
        takeScreenshot(driver);
        System.out.println("Booking Test passed");
    }

    @AfterTest
    public void endTest(){
        driver.quit();
    }
}
