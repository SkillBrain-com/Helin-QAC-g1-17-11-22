package org.skillbrain;

import Utilities.Utils;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import pageObject.DemoqaPage;

import java.util.Iterator;
import java.util.Set;

public class AT202 extends Utils {
    WebDriver driver;

    @BeforeTest
    public void Start() {
        driver = getChromeDriver();

    }

    @AfterTest
    public void StopTest() {
        driver.quit();
    }

    @Test
    public void windowTest() {

        try {


            driver.get("https://demoqa.com/");
            DemoqaPage page = new DemoqaPage(driver);
            ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", page.windowPanelButton);
            page.windowPanelButton.click();
            page.windowButton.click();
            page.newTabButton.click();
            Set<String> listaId = driver.getWindowHandles();
            Iterator<String> iterator = listaId.iterator();
            String parinte = iterator.next();
            String copil = iterator.next();
            driver.switchTo().window(copil);
            String message = page.pageMessage.getText();
            Assert.assertEquals(message, "This is a sample page");
        } catch (Exception e) {
            e.printStackTrace();

        } finally {
            driver.quit();
        }

    }


}
