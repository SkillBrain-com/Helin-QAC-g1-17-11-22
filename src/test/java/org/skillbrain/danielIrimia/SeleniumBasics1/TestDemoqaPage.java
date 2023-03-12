package org.skillbrain.danielIrimia.SeleniumBasics1;

import Utilities.Utils;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
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

    @Test
    public void testWebTables() throws IOException {
        page.webTables.click();
        page.addButton.click();
        WebElement firstName = driver.findElement(By.id("firstName"));
        firstName.sendKeys( "Daniel");
        WebElement lastName = driver.findElement(By.id("lastName"));
        lastName.sendKeys("Dan");
        WebElement email = driver.findElement(By.id("userEmail"));
        email.sendKeys("test@yahoo.com");
        WebElement age = driver.findElement(By.id("age"));
        age.sendKeys("35");
        WebElement salary = driver.findElement(By.id("salary"));
        salary.sendKeys("16000");
        WebElement departmentName = driver.findElement(By.id("department"));
        departmentName.sendKeys("IT");
        WebElement submitButton = driver.findElement(By.id("submit"));
        submitButton.click();
        takeScreenshot(driver);
        System.out.println("All information was successfully submitted!");
    }

    @Test
    public void buttonsTest() throws IOException {
        Actions actions = new Actions(driver);
        page.buttons.click();
        actions.doubleClick(page.doubleClickButton).build().perform();
        actions.contextClick(page.rightClickButton).build().perform();
        actions.click(page.clickMeButton).build().perform();
        String doubleClickMessage = page.doubleClickMessage.getText();
        Assert.assertEquals(doubleClickMessage, "You have done a double click");
        String rightClickMessage = page.rightClickMessage.getText();
        Assert.assertEquals(rightClickMessage, "You have done a right click");
        String clickMeMessage = page.clickMeMessage.getText();
        Assert.assertEquals(clickMeMessage, "You have done a dynamic click");
        takeScreenshot(driver);
    }

    @Test
    public void testLinks(){
        page.links.click();
        page.homeLink.click();
        page.createdLink.click();
        WebElement linkResponse = driver.findElement(By.id("linkResponse"));
        System.out.println(linkResponse.getText());
        page.noContentLink.click();
        System.out.println(linkResponse.getText());
        page.movedLink.click();
        System.out.println(linkResponse.getText());
        page.badRequestLink.click();
        System.out.println(linkResponse.getText());
        page.unauthorizedLink.click();
        System.out.println(linkResponse.getText());
        page.forbiddenLink.click();
        System.out.println(linkResponse.getText());
        page.invalidLink.click();
        System.out.println(linkResponse.getText());
        System.out.println("All links were successfully tested!");
    }

    @AfterTest
    public void closeTest() {
        driver.quit();
    }

}
