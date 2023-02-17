package org.skillbrain.lucianSimon;

import Utilities.Utils;
import org.openqa.selenium.WebDriver;
import pageObjects.EmagHomePage;

public class EmagTest extends Utils {

    public static void main(String[] args) {
        WebDriver driver = getChromeDriver();

        try {

            driver.get("https://www.emag.ro/");
            EmagHomePage homePage = new EmagHomePage(driver);
            homePage.closeOfertaZileiButton.click();



            homePage.acceptButton.click();


        } catch (Exception e) {
            e.printStackTrace();

        }
        finally {
            driver.quit();
        }
    }
}
