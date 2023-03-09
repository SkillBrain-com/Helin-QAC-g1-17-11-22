package org.skillbrain;

import PageObjects.DemoqaPage;
import Utilitis.Utils;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class AT115GT extends Utils {
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
        PageObjects.DemoqaPage page = new DemoqaPage(driver);
         page.elemementsCard.click();
         page.radioButton.click();
         page.yes.click();
        System.out.println("You have selected Yes");
        page.impresive.click();
        System.out.println("You have selected Impressive");
        page.no.click();
    }

}