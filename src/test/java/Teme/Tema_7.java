package Teme;

import TemePageObj.PgObjTema_7;
import Utilities.Utils;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Tema_7 extends Utils {

    WebDriver driver;
    @BeforeTest
    public void openDriver(){
        driver = Tema_7.getChromeDriver();
    }
    @AfterTest
    public void closeDriver(){
        driver.quit();
    }

    @Test
    public void validUserLoginTest(){

        driver.get("https://katalon-demo-cura.herokuapp.com");
        PgObjTema_7 obj = new PgObjTema_7(driver);

        obj.menuButton.click();
        obj.login.click();
        obj.userName.sendKeys("John Doe");
        obj.password.sendKeys("ThisIsNotAPassword");
        obj.loginButton.click();
        String actualURL = "https://katalon-demo-cura.herokuapp.com/#appointment";
        String expectedURL = driver.getCurrentUrl();
        Assert.assertEquals(actualURL, expectedURL);


    }

    @Test
    public void invalidUserLoginTest(){
        driver.get("https://katalon-demo-cura.herokuapp.com");
        PgObjTema_7 obj = new PgObjTema_7(driver);

        obj.menuButton.click();
        obj.login.click();
        obj.userName.sendKeys("abc");
        obj.password.sendKeys("123");
        obj.loginButton.click();
        Assert.assertTrue(obj.failLogin.isDisplayed());

    }

    @Test
    public void makeAnAppoimentTest(){

        driver.get("https://katalon-demo-cura.herokuapp.com");
        PgObjTema_7 obj = new PgObjTema_7(driver);
        String loginUrl = "https://katalon-demo-cura.herokuapp.com/profile.php#login";
        obj.appoimentButton.click();
//        Assert.assertTrue(loginUrl.);
//        if (){

    }

    @Test
    public void positiveAppoimentScenario() {

        driver.get("https://katalon-demo-cura.herokuapp.com");
        PgObjTema_7 obj = new PgObjTema_7(driver);

        obj.menuButton.click();
        obj.login.click();
        obj.userName.sendKeys("John Doe");
        obj.password.sendKeys("ThisIsNotAPassword");
        obj.loginButton.click();
        obj.visitDate.click();
        obj.visitDate.sendKeys("12/03/2022");
        obj.comment.sendKeys("Hello!");
        obj.bookApoimentBtn.click();
        String actualURL = "https://katalon-demo-cura.herokuapp.com/appointment.php#summary";
        String expectedURL = driver.getCurrentUrl();
        Assert.assertEquals(expectedURL, actualURL);

    }

    @Test
    public void negativeAppoimentScenario() {

        driver.get("https://katalon-demo-cura.herokuapp.com");
        PgObjTema_7 obj = new PgObjTema_7(driver);

        obj.menuButton.click();
        obj.login.click();
        obj.userName.sendKeys("John Doe");
        obj.password.sendKeys("ThisIsNotAPassword");
        obj.loginButton.click();
        obj.visitDate.click();
        obj.comment.sendKeys("Hello!");
        obj.bookApoimentBtn.click();
        String actualURL = "https://katalon-demo-cura.herokuapp.com/appointment.php#summary";
        String expectedURL = driver.getCurrentUrl();
        Assert.assertEquals(expectedURL, actualURL);

    }

    @Test
    public void loginRedirection(){

        driver.get("https://katalon-demo-cura.herokuapp.com");
        PgObjTema_7 obj = new PgObjTema_7(driver);

        obj.appoimentButton.click();
        String actualURL = "https://katalon-demo-cura.herokuapp.com/profile.php#login";
        String expectedURL = driver.getCurrentUrl();
        Assert.assertNotEquals(expectedURL, actualURL, "You are logged in the account!");

    }

    @Test(dataProvider = "homeMethod")
    public void homeMenuTest(String p){
        driver.get("https://katalon-demo-cura.herokuapp.com");
        PgObjTema_7 obj = new PgObjTema_7(driver);

        obj.menuButton.click();
        obj.login.click();
        obj.userName.sendKeys("John Doe");
        obj.password.sendKeys("ThisIsNotAPassword");
        obj.loginButton.click();
        driver.get("https://katalon-demo-cura.herokuapp.com" + p);
        obj.menuButton.click();
        obj.homeButton.click();
        String actualURL = "https://katalon-demo-cura.herokuapp.com/";
        String expectedURL = driver.getCurrentUrl();
        Assert.assertEquals(expectedURL, actualURL);
        obj.menuButton.click();
        obj.logoutButton.click();

    }

    @DataProvider(name = "homeMethod")
    public Object[][] homeMethod(){
        return new Object[][]{
//                {driver.findElement(By.xpath("//a[@href='history.php#history']"))},
//                {driver.findElement(By.xpath("//a[@href='profile.php#profile']"))}


                {"/history.php#history"},
                {"/profile.php#profile"},
        };
    }




}

