package org.skillbrain.danielIrimia.TestNG;

import Utilities.Utils;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.*;
import pageObjects.KatalonDemoPage;

import java.io.IOException;
import java.time.Duration;
public class TestKatalonDemoPage extends Utils{
    WebDriver driver;
    KatalonDemoPage page;
    public String APP_URL = "https://katalon-demo-cura.herokuapp.com/";
    @DataProvider(name = "loginData")
    public Object[][] loginData(){
        return new Object[][]{
                {"John Doe","ThisIsNotAPassword", "validCredential"},
                {"","ThisIsNotAPassword", "invalidCredential"}
        };
    }

    @BeforeTest
    public void startTest(){
        driver = getChromeDriver();
        page = new KatalonDemoPage(driver);
        driver.get(APP_URL);
    }




    // 2.1. Login from the menu in the upper right corner, with a valid username and password
    // 2.2. Login from the menu in the upper right corner, with an invalid username and password
    @Test(dataProvider = "loginData")
    public void loginTest(String username, String password,String credentialType) throws IOException {
        driver.get(APP_URL);
        page.menuToggle.click();
        page.loginMenu.click();
        Assert.assertTrue(page.form.isDisplayed());
        page.userName.sendKeys(username);
        page.password.sendKeys(password);
        page.loginButtonForm.submit();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        if(credentialType.equals("validCredential")){
            Assert.assertEquals(driver.getCurrentUrl(),"https://katalon-demo-cura.herokuapp.com/#appointment");
            Assert.assertTrue(page.btnMakeAppointment.isDisplayed());
            page.menuToggle.click();
            page.logoutMenu.click();
            Assert.assertEquals(driver.getCurrentUrl(),"https://katalon-demo-cura.herokuapp.com/");
            takeScreenshot(driver);
            System.out.println("Login with valid credential Test passed");
        } else if (credentialType.equals("invalidCredential")) {
            page.userName.sendKeys(username);
            page.password.sendKeys(password);
            Assert.assertTrue(page.loginErrorMessage.isDisplayed());
            System.out.println(page.loginErrorMessage.getText());
            Assert.assertEquals(driver.getCurrentUrl(),"https://katalon-demo-cura.herokuapp.com/profile.php#login");
            Assert.assertTrue(page.loginButtonForm.isDisplayed());
            takeScreenshot(driver);
            System.out.println("Login with invalid credential Test passed");
        }

    }


    @AfterTest
    public void endTest(){
        driver.quit();
    }
}
