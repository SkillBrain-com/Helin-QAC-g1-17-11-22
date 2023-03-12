package org.skillbrain.danielIrimia.SeleniumBasics1;

import Utilities.Utils;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import pageObjects.DemoqaPage;

import java.io.IOException;

public class TestDemoqaPage extends Utils {

    //3. Localizați cât mai multe elemente de pe pagina https://demoqa.com/elements,
    // de la tab-urile Text Box, Check Box, Radio Button, Web Tables, Radio Buttons, Links.
    // Folosiți cât mai multe strategii de localizare. Interacționați cu fiecare element.


    WebDriver driver;
    private final static String URL_PAGE = "https://demoqa.com/elements";
    DemoqaPage page;

    @BeforeTest
    public void startTest() {
        driver = getChromeDriver();
    }

    @BeforeMethod
    public void setupObject() {
        page = new DemoqaPage(driver);
        driver.get(URL_PAGE);
    }

    @Test
    public void testTextBox() throws IOException {
        page.textBox.click();
        page.fullName.sendKeys("Daniel Irimia");
        page.email.sendKeys("textbox@yahoo.com");
        page.currentAddress.sendKeys("Copenhagen");
        page.permanentAddress.sendKeys("Copenhagen");
        page.submitButton.click();
        System.out.println(page.outputAfterSummit.getText());
        takeScreenshot(driver);
        System.out.println("Test passed ===================");
    }

    @Test
    public void testCheckBox() throws IOException {
        page.checkBox.click();
        page.toogleButton.click();
        page.downloadsCheckBox.click();
        String messageResult = page.displayResult.getText();
        System.out.println(messageResult);
        takeScreenshot(driver);
        System.out.println("Test passed ===================");
    }

    @Test
    public void testRadioButton() throws IOException {
        page.radioButton.click();
        page.headerRadioButton.getText();
        System.out.println(page.headerRadioButton.getText());
        page.yesButton.click();
        String yesMessage = driver.findElement(By.xpath("(//p[@class='mt-3'])[1]")).getText();
        Assert.assertEquals(yesMessage, "You have selected Yes");
        takeScreenshot(driver);
        page.impressiveButton.click();
        String impressiveMessage = driver.findElement(By.cssSelector(".mt-3")).getText();
        Assert.assertEquals(impressiveMessage, "You have selected Impressive");
        takeScreenshot(driver);
    }

    @AfterTest
    public void closeTest() {
        driver.quit();
    }

}
