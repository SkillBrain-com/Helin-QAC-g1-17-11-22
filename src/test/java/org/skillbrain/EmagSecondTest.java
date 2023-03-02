package org.skillbrain;

import Utilities.Utils;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import pageObjects.EmagHomePage;

import java.net.MalformedURLException;
import java.time.Duration;

public class EmagSecondTest extends Utils {


    RemoteWebDriver driver;
    EmagHomePage homePage;
    WebDriverWait waitFor;
    @BeforeTest
    public void initializeDriver() throws MalformedURLException {
        driver = getRemoteWebDriver();

    }

    @AfterTest
    public void closeDriver(){
        driver.quit();
    }

    @Test
    public void emagSecondTest() {
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
        homePage.intraInContButton.click();
        wait.until(ExpectedConditions.visibilityOf(homePage.emagLogo));
        System.out.println(homePage.salutMsg.getText());
        // alerts, file uploads, modals - de gasit exemple
        System.out.println("Skillbrain va saluta!");
    }


}
