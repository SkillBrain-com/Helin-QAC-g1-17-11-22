package org.skillbrain.crinaSas;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.io.IOException;

import static Utilities.Utils.getChromeDriver;
import static Utilities.Utils.takeScreenshot;

public class AT115_CD extends Utils {

    //variabila globala
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
    public void RadioButtonTest() throws InterruptedException, IOException {
        //logare/ go to pagina Demoqa
        driver.get("https://demoqa.com/");
        //emoqaPage page = new DemoqaPage(driver);
        // vezi obiectul DemoqaPage din pageObjects
        DemoqaPage page = new DemoqaPage(driver);
        page.elementsCard.click();
        Thread.sleep(3000);
        page.radioButton.click();
        Thread.sleep(3000);
        page.radioButtonYes.click();

        Thread.sleep(3000);

        //String yesMessage = driver.findElement(By.cssSelector(".text-success")).getText();
        String yesMessage = driver.findElement(By.cssSelector(".mt-3")).getText();
        System.out.println(yesMessage);
        Assert.assertEquals(yesMessage,"You have selected Yes");
        takeScreenshot(driver);
        page.radioButtonImpressive.click();
        Thread.sleep(3000);

        String impressiveMessage = driver.findElement(By.cssSelector(".mt-3")).getText();
        Assert.assertEquals(impressiveMessage,"You have selected Impressive");
        System.out.println(impressiveMessage);
        takeScreenshot(driver);


        page.radioButtonNo.isDisplayed();
        takeScreenshot(driver);
        System.out.println(page.radioButtonNo.isDisplayed());


    }
}
