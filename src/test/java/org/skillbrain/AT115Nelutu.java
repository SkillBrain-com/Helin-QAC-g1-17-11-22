package org.skillbrain;

import Utilities.Utils;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import pageObjects.DemoqaPage;

import java.io.IOException;

public class AT115Nelutu extends Utils {

    WebDriver driver;
    @BeforeTest
    public void startTest(){
        driver = getChromeDriver();
    }
    @AfterTest
    public void stopTest(){
        driver.quit();
    }
    @Test
    public void radioButtonTest() throws IOException {
        driver.get("https://demoqa.com/");
        DemoqaPage page = new DemoqaPage(driver);
        page.elementCard.click();
        page.radioButton.click();
        page.yesButton.click();
        String yesMessage = driver.findElement(By.cssSelector(".mt-3")).getText();
        Assert.assertEquals(yesMessage , "You have selected Yes");
        takeScreenshot(driver);
        page.impressiveButton.click();
        String impressiveMessage = driver.findElement(By.cssSelector(".mt-3")).getText();
        Assert.assertEquals(impressiveMessage , "You have selected Impressive");
        takeScreenshot(driver);


    }


}
