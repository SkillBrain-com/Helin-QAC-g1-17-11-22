package org.skillbrain.Tema7ChromeGrid;

import PageObjects.DemoqaPage;
import Utilitis.Utils;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.util.Iterator;
import java.util.Set;

public class AT202GT extends Utils {
    WebDriver driver;

    @BeforeTest
    public void start() {
        driver = getChromeDriver();
    }

    @AfterTest
    public void stopTest() {
        driver.quit();
    }

    @Test
    public void windowTest() {
        driver.get("https://demoqa.com/");
        DemoqaPage page = new DemoqaPage(driver);
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", page.windowPanel);
        page.windowPanel.click();
        page.windowButton.click();
        page.newtabbutton.click();
        Set<String> listaId = driver.getWindowHandles();
        Iterator<String> iterator = listaId.iterator();
        String parinte = iterator.next();
        String copil = iterator.next();
        driver.switchTo().window(copil);
        String mesage = page.pagemesage.getText();
        Assert.assertEquals(mesage, "This is a sample page");


    }
}
