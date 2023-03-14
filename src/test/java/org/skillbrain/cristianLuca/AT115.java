package org.skillbrain.cristianLuca;

import Utilities.Utils;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import pageObject.DemoqaPage;

public class AT115 extends Utils {

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
    public void RadiobuttonTest(){
        driver.get("https://demoqa.com/");
        DemoqaPage page = new DemoqaPage(driver);
        page.elementCard.click();
        page.radioButton.click();
        page.yesButton.click();
        String yesMessage = driver.findElement(By.cssSelector(".mt-3")).getText();
        Assert.assertEquals(yesMessage, "You have selected Yes");
        takeScreenshot(driver);
        page.impressiveButton.click();
        String impressiveMessage = driver.findElement(By.cssSelector(".mt-3")).getText();
        Assert.assertEquals(impressiveMessage, "You have selected Impressive");


    }





}
