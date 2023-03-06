package org.skillbrain.mirelaEnachescu;

import PageObjects.EmagHomePage;
import Utilities.Utils;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.io.IOException;
import java.time.Duration;

public class eMagPageTest extends Utils {

    WebDriver driver ;



    @BeforeTest
    public void initializeDriver(){
        driver = getChromeDriver();
    }

   //inlocuieste main, se poate rula
    @Test
    public void emagPageTest() {
       // WebDriver driver = getChromeDriver();
        try {
            driver.get("https://www.emag.ro/");
            EmagHomePage homePage = new EmagHomePage(driver);
            //homePage.closeOfertaZileiButton.click();
            homePage.gdprFooter.click();
            homePage.acceptButton.click();
            driver.navigate().refresh();
            WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
            wait.until(ExpectedConditions.visibilityOf(homePage.gdprFooter)); // 2 s
            homePage.acceptButton.click();
            wait.until(ExpectedConditions.visibilityOf(homePage.loginBanner));
           //homePage.intraInContButton.click();
           //wait.until(ExpectedConditions.visibilityOf(homePage.emagLogo));
           // System.out.println(homePage.salutMsg.getText());
            // alerts, file uploads, modals - de gasit exemple
            System.out.println("Test finished.");
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            driver.quit();
        }

    }

    @Test
    public void secondTest() {

        System.out.println("Second Test");
    }


    @BeforeTest
    public void altDriver(){}

    @DataProvider(name = "endpointList")
    public Object[][] myEndpointProvider(){
        return new Object[][]{
                {"elements"},{"forms"},{"alertsWindows"},{"book"},{"widgets"}
        };
    }

    @Test(dataProvider = "endpointList")
    public void parameterTest(String endpoit)  throws IOException {

        driver.get("https://demoqa.com" +"/"+ endpoit);
        takeScreenshot(driver);
         // boolean isPresent = driver .findElement(By.xpath)
       // Assert.assertFalse(is

    }
}
