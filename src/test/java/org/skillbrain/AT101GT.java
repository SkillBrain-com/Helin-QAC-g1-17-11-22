package org.skillbrain;

import Utilitis.Utils;
import org.openqa.selenium.Alert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import PageObjects.DemoqaPage;

import java.io.IOException;

public class AT101GT extends Utils {
    WebDriver driver;

    @BeforeTest
    public void startTest() {
        driver = getChromeDriver();
    }

    @AfterTest
    public void stopTest() {
         driver.quit();
    }

    @Test
    public void alertTest() throws IOException {
        driver.get("https://demoqa.com/");
        DemoqaPage page = new DemoqaPage(driver);
          ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", page.alertbutton);
        page.alertpanelbutton.click();
        page.alertbutton.click();
        page.clickMebutton_1.click();
        //takeScreenshot(driver);
        Alert alert = driver.switchTo().alert(); // switch pe fereastra de alert
        alert.accept(); // Ok din pagina de alert
        System.out.println("Test finished");
    }


}
