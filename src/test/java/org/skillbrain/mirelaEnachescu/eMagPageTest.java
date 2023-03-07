package org.skillbrain.mirelaEnachescu;

import Utilities.Utils;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import pageObjects.EmagHomePage;

import java.io.IOException;
import java.net.MalformedURLException;
import java.time.Duration;

public class eMagPageTest extends Utils {

    RemoteWebDriver driver ;



    @BeforeTest
    public void initializeDriver() throws MalformedURLException {
        driver = getRemoteWebDriver();
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

        }

    }

    @Test
    public void secondTest() {

        System.out.println("Second Test");
    }


    @AfterTest
    public void altDriver(){

        driver.quit();
    }

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
