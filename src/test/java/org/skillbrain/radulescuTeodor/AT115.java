package org.skillbrain.radulescuTeodor;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import pageObjects.DemoqaPage;

import static Utilities.Utils.getChromeDriver;

public class AT115 {
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
    public void radioButtonTest() {
        driver.get("https://demoqa.com/");
        DemoqaPage page = new DemoqaPage(driver);
        page.elementButton.click();
        page.radioButton.click();
        page.radioYes.click();
        String yesMessage = page.radioYesMessage.getText();
        Assert.assertEquals(yesMessage, "You have selected Yes");
        page.impressiveRadioButton.click();
        String impressiveMessage = page.ImpressiveRadioButtonMessage.getText();
        Assert.assertEquals(impressiveMessage,"You have selected Impressive");
//        boolean radioNo= page.radioNo.isEnabled();
//        Assert.assertTrue(radioNo);

        boolean radioNo = page.radioNo.isEnabled();
        System.out.println("Radio button NO is disabled?"+ "  " + radioNo);
    }

}