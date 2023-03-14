package org.skillbrain.radulescuTeodor;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.*;

import static Utilities.Utils.getChromeDriver;
import static org.testng.Assert.assertTrue;

public class testNG_Tema {
    WebDriver driver;

    @BeforeTest
    public void startTest() {
        driver = getChromeDriver();
        driver.get("https://katalon-demo-cura.herokuapp.com/");
    }


    @AfterTest
    public void stopTest() {
        driver.quit();

    }


    @Test()
    public void loginWithValidCredentials() {
        driver.findElement(By.xpath("(//a[@id='menu-toggle'])[1]")).click();
        driver.findElement(By.cssSelector("a[href='profile.php#login']")).click();
        driver.findElement(By.cssSelector("#txt-username")).sendKeys("John Doe");
        driver.findElement(By.cssSelector("#txt-password")).sendKeys("ThisIsNotAPassword");
        driver.findElement(By.cssSelector("#btn-login")).click();
        Assert.assertEquals(driver.getCurrentUrl(), "https://katalon-demo-cura.herokuapp.com/#appointment");

    }

    @Test
    public void logInWithInvalidCredentials() {
        driver.findElement(By.xpath("(//a[@id='menu-toggle'])[1]")).click();
        driver.findElement(By.cssSelector("a[href='profile.php#login']")).click();
        driver.findElement(By.cssSelector("#txt-username")).sendKeys("John");
        driver.findElement(By.cssSelector("#txt-password")).sendKeys("invalidpass");
        driver.findElement(By.cssSelector("#btn-login")).click();
        Assert.assertEquals(driver.findElement(By.xpath("//p[@class='lead text-danger']")).getText(), "Login failed! Please ensure the username and password are valid.");

    }

    @DataProvider(name = "appointmentDataProvider")
    public Object[][] appointmentDataProvider() {
        return new Object[][]{
                {"01/02/2023", "positive scenario", true},
                {"", "negative scenario", false}
        };
    }


    @Test(dataProvider = "appointmentDataProvider")
    public void makeAppointment(String date, String comment, boolean test) {
        driver.findElement(By.cssSelector("#txt_visit_date")).sendKeys(date);
        driver.findElement(By.id("txt_comment")).sendKeys(comment);
        driver.findElement(By.id("btn-book-appointment")).click();
        if (test) {
            assertTrue(driver.findElement(By.xpath("(//h2[normalize-space()='Appointment Confirmation'])[1]")).isDisplayed());
            driver.findElement(By.linkText("Go to Homepage")).click();
        } else {
            String URL = driver.getCurrentUrl();
            Assert.assertEquals(URL, "https://katalon-demo-cura.herokuapp.com/");
        }
    }

    @Test
    public void returnToHomePageFromMenu() {
        driver.findElement(By.cssSelector("#menu-toggle")).click();
        driver.findElement(By.linkText("Home")).click();
        Assert.assertEquals(driver.getCurrentUrl(), "https://katalon-demo-cura.herokuapp.com/");
    }

    @Test
    public void returnToHomePageFromAppointmentPage() {
        driver.findElement(By.cssSelector("#btn-make-appointment")).click();
        driver.findElement(By.cssSelector("#menu-toggle")).click();
        driver.findElement(By.linkText("Home")).click();
        Assert.assertEquals(driver.getCurrentUrl(), "https://katalon-demo-cura.herokuapp.com/");
    }

    @Test
    public void verifyRedirectToLoginWhenUserNotLoggedIn() {
        driver.findElement(By.xpath("(//a[@id='menu-toggle'])[1]")).click();
        driver.findElement(By.xpath("(//a[normalize-space()='Logout'])[1]")).click();
        driver.findElement(By.cssSelector("#btn-make-appointment")).click();
        Assert.assertEquals(driver.findElement(By.xpath("//p[@class='lead']")).getText(), "Please login to make appointment.");
    }

}
