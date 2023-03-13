package org.skillbrain.danielIrimia.SeleniumBasics2;

import Utilities.Utils;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import pageObjects.DemoqaPage;

import java.io.IOException;

public class DemoqaWindowsTest extends Utils {
    WebDriver driver;
    DemoqaPage page;

    private final static String APP_URL = "https://demoqa.com/browser-windows";

    @BeforeTest
    public void startTest() {
        driver = getChromeDriver();
        page = new DemoqaPage(driver);
        driver.get(APP_URL);
    }

    @Test
    public void windowsLinkTest() {
        try {
            page.windowsNewTab.click();
            Utils.switchToWindow(driver, "sample");
            String message = page.messageBrowser.getText();
            Assert.assertEquals(message, "This is a sample page");
            System.out.println(message);
            driver.close();
            Utils.switchToWindow(driver, "ToolsQA");

            page.windowsNewWindow.click();
            Utils.switchToWindow(driver, "sample");
            String message2 = page.messageBrowser.getText();
            Assert.assertEquals(message2, "This is a sample page");
            System.out.println(message2);
            driver.close();
            Utils.switchToWindow(driver, "ToolsQA");

            page.windowMessageButton.click();
            driver.close();

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
