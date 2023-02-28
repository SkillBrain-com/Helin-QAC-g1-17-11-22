package org.skillbrain.mirelaEnachescu;
import Utilities.Utils;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import pageObjects.EmagHomePage;

import java.time.Duration;

public class EmagTest extends Utils {

    public static void main(String[] args) {
      WebDriver driver = getChromeDriver();
      try {

          //alerts, file uploads, modals -  de gasit exemple!!

          driver.get("https://www.emag.ro/");
          EmagHomePage homePage = new EmagHomePage(driver);
        //  homePage.closeOfertaZileiButton.click();
//          if(homePage.loginBanner.isDisplayed()){
//                homePage.bannerCloseButton.click();
//          }
          homePage.gdprFooter.click();
          homePage.acceptButton.click();
          driver.navigate().refresh();
          WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
//          wait.until(ExpectedConditions.visibilityOfElementLocated(
//                  By.cssSelector(".gdpr-cookie-banner.js-gdpr-cookie-banner.pad-sep-xs.pad-hrz-none.login-view.login-view-ro.show")));
          //wait.until(ExpectedConditions.visibilityOf(homePage.loginBanner));
          wait.until(ExpectedConditions.visibilityOf(homePage.gdprFooter));
         // homePage.bannerCloseButton.click();
          homePage.acceptButton.click();
          wait.until(ExpectedConditions.visibilityOf(homePage.loginBanner));
          System.out.println("Test finished.");
      }
      catch (Exception e) {
          e.printStackTrace();
      }
      finally {
          driver.quit();
      }

    }

}
