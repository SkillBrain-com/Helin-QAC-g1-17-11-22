package org.skillbrain;

import Utilities.Utils;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import pageObject.EmagHomePage;

import java.time.Duration;

public class EmagTest extends Utils {


    public static void main(String[] args) {
        WebDriver driver = getChromeDriver();//sau
        // WebDriver driver = null;

        try {

            //  driver = getChromeDriver();// sau driver.get("https://emag.ro/")
            // alerts, file uploads, modals - de gasit exemple
            driver.get("https://www.emag.ro/");
            EmagHomePage homePage = new EmagHomePage(driver);
            //   homePage.closeOfertaZileiButton.click();
            homePage.gdprFooter.click();
            homePage.acceptButton.click();
            driver.navigate().refresh();
            WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
            wait.until(ExpectedConditions.visibilityOf(homePage.gdprFooter));
            homePage.acceptButton.click();
            wait.until(ExpectedConditions.visibilityOf(homePage.loginBanner));
            homePage.intraInContButton.click();
            wait.until(ExpectedConditions.visibilityOf(homePage.emagLogo));
            System.out.println(homePage.salutMsg.getText());
            //  Thread.sleep(6000);


            System.out.println("Test finished.");
            //   if (homePage.loginBanner.isDisplayed()){
            //       homePage.bannerCloseButton.click();
            //   }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            driver.quit();
        }


    }
}
