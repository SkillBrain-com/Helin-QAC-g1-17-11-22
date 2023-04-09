package org.skillbrain.crinaSas;

import Utilities.Utils;
import org.openqa.selenium.Alert;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.io.IOException;
import java.net.MalformedURLException;

public class AT202_Remote extends Utils {
    RemoteWebDriver driver;
    @BeforeTest
    public void startTest() throws MalformedURLException {
        driver = getRemoteWebDriver();
    }
    @AfterTest
    public void stopTest() {
        driver.quit();
    }
    @Test
    public void alertTest() throws IOException, InterruptedException {
        driver.get("https://demoqa.com/");
        DemoqaPage page = new DemoqaPage(driver);
        page.alertPanelButton.click();
        page.alertButton.click();
        page.clickMeButton_1.click();
        Thread.sleep(9000);
        //takeScreenshot(driver);
        Alert alert = driver.switchTo().alert(); // switch pe fereastra de alert
        alert.accept(); // Ok din pagina de alert
        System.out.println("Test finished");
    }
}
