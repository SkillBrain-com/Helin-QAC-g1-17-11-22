package org.skillbrain.cristianLuca;

import Utilities.Utils;
import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import pageObjects.DemoqaPage;

import java.io.IOException;

public class AT101 extends Utils {
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
        page.alertPanelButton.click();
        page.alertButton.click();
        page.clickMeButton_1.click();
        //takeScreenshot(driver);
        Alert alert = driver.switchTo().alert(); // switch pe fereastra de alert
        alert.accept(); // Ok din pagina de alert
        System.out.println("Test finished");
    }
}
