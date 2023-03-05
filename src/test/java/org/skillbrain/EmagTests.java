package org.skillbrain;

import PageObjects.EmagHomePage;
import Utilitis.Utils;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.net.MalformedURLException;
import java.time.Duration;

public class EmagTests extends Utils {

    public static void main(String[] args) throws MalformedURLException {
        //  WebDriver driver = getChromeDriver();
        WebDriver driver=getRemoteWebdriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(8));
        driver.navigate().refresh();
        System.out.println("test finish ");
        try {
            System.setProperty("Chromedriver.chrome.driver", " .idea/drivers/chromedriver.exe");
            driver.get(" https://www.emag.ro/");
            driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(8));
            EmagHomePage homePage = new EmagHomePage(driver);

              if (homePage.gdprFooter.isDisplayed()){
             homePage.gdprFooter.click();
             }

            homePage.gdprFooter.click();

            homePage.intraInContButton.click();
            homePage.acceptButton.click();
            homePage.emagLogo.click();
            homePage.salutMsg.getText();
            System.out.println(" test finish  ");
            WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(9));
            wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(".btn.btn-primary.js-accept.gtm_h76e8zjgoo.btn-block")));
            wait.until(ExpectedConditions.visibilityOf(homePage.emagLogo));
            wait.until(ExpectedConditions.visibilityOf(homePage.gdprFooter));
            wait.until(ExpectedConditions.visibilityOf(homePage.intraInCont));
            wait.until(ExpectedConditions.visibilityOf(homePage.acceptButton));
            wait.until(ExpectedConditions.visibilityOf(homePage.salutMsg));


            driver.navigate().refresh();


        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            driver.quit();

        }
    }
}