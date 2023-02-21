package org.skillbrain.radulescuTeodor;


import Utilities.Utils;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;
import pageObjects.EmagHomePage;
import java.time.Duration;



public class EmagTest extends Utils {



    public static void main(String[] args) {
        ChromeOptions options = new ChromeOptions();
        WebDriver driver = new ChromeDriver();
        options.addArguments("start-maximized");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));



        try {
            driver = getChromeDriver();
            driver.get("https://www.emag.ro/");
            EmagHomePage homePage = new EmagHomePage(driver);
            homePage.closeOfertaZilei.click();
            homePage.gdprFooter.click();
            homePage.acceptButton.click();
            Wait<WebDriver> wait = new WebDriverWait(driver, Duration.ofSeconds(5));
            WebElement webElement = (WebElement) wait.until(ExpectedConditions.visibilityOf( homePage.intraInCont));
            homePage.intraInCont.click();
            homePage.username.sendKeys("teodor.rdl@gmail.com");
            homePage.continuaButton.click();
            homePage.password.sendKeys("parola_gresita");



        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            driver.quit();
        }


    }


}
