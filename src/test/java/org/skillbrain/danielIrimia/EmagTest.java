package org.skillbrain.danielIrimia;

import Utilities.Utils;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import pageObjects.EmagHomePage;

import java.time.Duration;

public class EmagTest extends Utils {

    public static void main(String[] args) {
        WebDriver driver = getChromeDriver();
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
            homePage.intraInContButton.click();
            wait.until(ExpectedConditions.visibilityOf(homePage.emagLogo));
            System.out.println(homePage.salutMsg.getText());
            // alerts, file uploads, modals - de gasit exemple
            System.out.println("Skillbrain va saluta!");
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            driver.quit();
        }


    }
}
