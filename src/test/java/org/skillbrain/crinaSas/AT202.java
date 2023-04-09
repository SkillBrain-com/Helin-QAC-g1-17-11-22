package org.skillbrain.crinaSas;

import Utilities.Utils;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.util.Iterator;
import java.util.Set;

public class AT202 extends Utils {
    WebDriver driver;
    @BeforeTest
    public void startTest() {
        driver = getChromeDriver();
    }
    @AfterTest
    public void stopTest(){
        driver.quit();
    }
    @Test
    public void windowTest() {
        driver.get("https://demoqa.com/");
        DemoqaPage page = new DemoqaPage(driver);
        page.alertPanelButton.click();
        page.clickWindowButton.click();
        page.clickBrowserWindowButton.click();
        page.newTabButton.click();
        Set<String> lista_id_page = driver.getWindowHandles();
        Iterator<String> iterator = lista_id_page.iterator();
        String parinte = iterator.next();
        String copil = iterator.next();
        driver.switchTo().window(copil);

        String message = page.messageBrowser.getText();
        Assert.assertEquals(message,"This is a sample page");

        System.out.println(message);




    }
}
