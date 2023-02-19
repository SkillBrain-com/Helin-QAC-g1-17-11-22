package org.skillbrain.danaCatavei;
import Utilities.Utils;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import pageObjects.EmagHomePage;

public class EmagTest extends Utils {

    public static void main(String[] args) {
      WebDriver driver = getChromeDriver();
      try {

          //alerts, file uploads, modals -  de gasit exemple!!

          driver.get("https://www.emag.ro/");
          EmagHomePage homePage = new EmagHomePage(driver);
          homePage.closeOfertaZileiButton.click();
          homePage.gdprFooter.click();
          homePage.acceptButton.click();

      }
      catch (Exception e) {
          e.printStackTrace();
      }
      finally {
          driver.quit();
      }

    }

}
