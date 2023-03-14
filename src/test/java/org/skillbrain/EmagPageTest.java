package org.skillbrain;


import PageObjects.EmagHomePage;
import Utilitis.Utils;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.io.IOException;
import java.time.Duration;

public class EmagPageTest extends Utils {
    WebDriver driver ;



    @BeforeTest
    public void initializeDriver(){
        driver = getChromeDriver();
    }


    @Test
    public void emagPageTest() {

        try {
            driver.get("https://www.emag.ro/");
            EmagHomePage homePage = new EmagHomePage(driver);

            homePage.gdprFooter.click();
            // homePage.acceptButton.click();
            driver.navigate().refresh();
            WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
            wait.until(ExpectedConditions.visibilityOf(homePage.gdprFooter)); // 2 s
            //  homePage.acceptButton.click();
            wait.until(ExpectedConditions.visibilityOf(homePage.loginBanner));

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


    }
}


