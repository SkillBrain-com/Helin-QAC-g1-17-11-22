package org.skillbrain;

import Utilites.Utils;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import PageObjects.EmagHomePage;
import Utilites.Utils;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
public class EmagPageTEST extends Utils {
    WebDriver driver =getChromeDriver();
        @BeforeTest



          @Test
    public void EmagPageTEST{
        driver.get("https://www.emag.ro/");
        EmagHomePage homePage = new EmagHomePage(driver);
        //homePage.closeOfertaZileiButton.click();
        homePage.gdprFooter.click();
        homePage.acceptButton.click();
        driver.navigate().refresh();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
        wait.until(ExpectedConditions.visibilityOf(homePage.gdprFooter)); // 2 s
        homePage.acceptButton.click();

    }
}
