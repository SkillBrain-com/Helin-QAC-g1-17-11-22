package org.skillbrain.danielIrimia.SeleniumBasics2;

import Utilities.Utils;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import pageObjects.SeleniumBasics1.HerokuApp;

import java.io.IOException;

public class HerokuAlertTest extends Utils {
    WebDriver driver;
    HerokuApp page;
    private final static String APP_URL = "https://testpages.herokuapp.com/styled/index.html";

    @BeforeTest
    public void startTest() {
        driver = getChromeDriver();
        page = new HerokuApp(driver);
        driver.get(APP_URL);
    }

    @Test
    public void buttonsAlertTest()  {
        Actions actions = new Actions(driver);
        try {
            page.alertTestPage.click();
            actions.moveToElement(page.alertButton).click().perform();
            Alert alert = driver.switchTo().alert();
            alert.accept();
            takeScreenshot(driver);
            actions.moveToElement(page.alertButtonConfirm).click().perform();
            alert = driver.switchTo().alert();
            alert.dismiss();
            System.out.println(driver.findElement(By.id("confirmexplanation")).getText());
            actions.moveToElement(page.alertButtonPrompt).click().perform();
            alert = driver.switchTo().alert();
            alert.sendKeys("Selenium Test");
            alert.accept();
            System.out.println(driver.findElement(By.id("promptexplanation")).getText());
            // element do not exist on the alert page
            System.out.println(driver.findElement(By.id("fakealert")).getText());
        } catch (Exception exception) {
            try {
                takeScreenshot(driver);
            } catch (IOException e) {
                System.out.println(e.getMessage());
            }
        } finally {
            driver.quit();
        }
    }

}
