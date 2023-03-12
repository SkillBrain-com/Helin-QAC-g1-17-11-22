package org.skillbrain.danielIrimia.SeleniumBasics1;

import Utilities.Utils;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import pageObjects.DemoqaPage;

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
    public void testTextBox() {
        page.textBox.click();
        page.fullName.sendKeys("Daniel Irimia");
        page.email.sendKeys("textbox@yahoo.com");
        page.currentAddress.sendKeys("Copenhagen");
        page.permanentAddress.sendKeys("Copenhagen");
        page.submitButton.click();

        System.out.println(page.outputAfterSummit.getText());
    }

    @AfterTest
    public void closeTest() {
        driver.quit();
    }

}
