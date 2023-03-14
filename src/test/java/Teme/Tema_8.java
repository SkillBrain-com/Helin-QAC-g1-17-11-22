package Teme;

import TemePageObj.PgObjTema_8;
import Utilities.Utils;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.time.Duration;

public class Tema_8 extends Utils {
    WebDriver driver;
    @BeforeTest
    public void openDriver(){
        driver = Tema_8.getChromeDriver();
    }
    @AfterTest
    public void closeDriver(){
        driver.quit();
    }

    @Test
    public void exercise_1Test(){

        driver.get("https://testpages.herokuapp.com/styled/basic-ajax-test.html");
        PgObjTema_8 obj = new PgObjTema_8(driver);
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));

        Select selectCategory= new Select(obj.categoryDropdown);
        Select selectLanguage = new Select(obj.languageDropdown);
        selectCategory.selectByValue("3");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(6));

        selectLanguage.selectByValue("23");
        String categoryElement = selectCategory.getFirstSelectedOption().getAttribute("value");
        String languageElement = selectLanguage.getFirstSelectedOption().getAttribute("value");
        obj.codeInItBtn.click();
        Assert.assertEquals(categoryElement, obj.valueIdCategory.getText(), "The input those not match the output!");
        Assert.assertEquals(languageElement, obj.valueIdLanguage.getText(), "The input those not match the output!");

    }
    @Test
    public void exercise_2Test() throws InterruptedException {

        driver.get("https://testpages.herokuapp.com/styled/javascript-redirect-test.html");
        PgObjTema_8 obj = new PgObjTema_8(driver);

        WebDriverWait wait1 = new WebDriverWait(driver, Duration.ofSeconds(5));

        obj.fiveSecondsDelayBtn.click();
        wait1.until(ExpectedConditions.visibilityOf(obj.redirectLandingPageTxt));
        Thread.sleep(5000);
        String actualURL = "https://testpages.herokuapp.com/styled/redirected.html";
        String expectedURL = driver.getCurrentUrl();
        Assert.assertEquals(expectedURL, actualURL);

        obj.goBackButton.click();

        WebDriverWait wait2 = new WebDriverWait(driver, Duration.ofSeconds(2));

        obj.twoSecondsDelayBtn.click();
        wait2.until(ExpectedConditions.visibilityOf(obj.redirectLandingPageTxt));
        Assert.assertEquals(expectedURL, actualURL);
    }

    @Test
    public void exercise_3Test(){

        driver.get("https://testpages.herokuapp.com/styled/refresh");
        PgObjTema_8 obj = new PgObjTema_8(driver);

        System.out.println(obj.timestamp.getText());
        String beforeRefresh = obj.refreshDate.getText();

        driver.navigate().refresh();

        System.out.println(obj.timestamp.getText());
        String afterRefresh = obj.refreshDate.getText();

        Assert.assertNotEquals(beforeRefresh, afterRefresh, "The date did not change");

    }

    @Test
    public void exercise_4Test(){

        driver.get("https://testpages.herokuapp.com/styled/dynamic-buttons-simple.html");
        PgObjTema_8 obj = new PgObjTema_8(driver);
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));

        obj.startBtn.click();
        wait.until(ExpectedConditions.visibilityOf(obj.firstBtn));
        obj.firstBtn.click();
        wait.until(ExpectedConditions.visibilityOf(obj.secondBtn));
        obj.secondBtn.click();
        wait.until(ExpectedConditions.visibilityOf(obj.thirsBtn));
        obj.thirsBtn.click();
        wait.until(ExpectedConditions.visibilityOf(obj.buttonsMsg));
        String msg = "All Buttons Clicked";
        Assert.assertTrue(obj.buttonsMsg.isDisplayed(), "You did not click all the buttons");

    }

    @Test
    public void exercise_5Test(){

        driver.get("https://testpages.herokuapp.com/styled/dynamic-buttons-disabled.html");
        PgObjTema_8 obj = new PgObjTema_8(driver);
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));

        obj.startBtn.click();
        wait.until(ExpectedConditions.visibilityOf(obj.firstBtn));
        obj.firstBtn.click();
        wait.until(ExpectedConditions.visibilityOf(obj.secondBtn));
        obj.secondBtn.click();
        wait.until(ExpectedConditions.visibilityOf(obj.thirsBtn));
        obj.thirsBtn.click();
        wait.until(ExpectedConditions.visibilityOf(obj.buttonsMsg));
        Assert.assertTrue(obj.buttonsMsg.isDisplayed(), "You did not click all the buttons");


    }

}
