package org.skillbrain.danielIrimia.SeleniumBasics2;

import Utilities.Utils;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import pageObjects.SeleniumBasics1.HerokuApp;

import java.io.IOException;

public class HerokuForm extends Utils {
    WebDriver driver;
    HerokuApp page;
    private final static String APP_URL = "https://testpages.herokuapp.com/styled/index.html";

    @BeforeTest
    public void startTest() {
        driver = getChromeDriver();
        page = new HerokuApp(driver);
        driver.get(APP_URL);
    }

    @Test
    public void formTest() {
        Actions actions = new Actions(driver);
        try {
            page.formTestPage.click();
            page.inputUsernameForm.sendKeys("seleniumTest");
            page.inputPasswordForm.sendKeys("seleniumTest");
            page.inputTextareaForm.clear();
            page.inputTextareaForm.sendKeys("selenium Test");
            page.inputCheckboxCd1.click();
            actions.moveToElement(page.radioButtonRd3).click().perform();
            actions.moveToElement(page.optionMs2).click().perform();
            page.dropdownOptions.click();
            // actions.moveToElement(page.dropdownDd4).click().perform();
            page.submitButtonForm.click();
            System.out.println(page.formResult.getText());
            takeScreenshot(driver);
            page.backToFormButton.click();
            page.resetButtonForm.click();

            driver.findElement(By.id("fakeName"));
        } catch (Exception exception) {
            try {
                takeScreenshot(driver);
            } catch (IOException e) {
                System.out.println(e.getMessage());
            }
        } finally {
            driver.quit();
        }
    }
}
