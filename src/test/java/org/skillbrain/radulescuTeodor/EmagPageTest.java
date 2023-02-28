package org.skillbrain.radulescuTeodor;

import Utilities.Utils;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import pageObjects.DemoqaPage;
import pageObjects.EmagHomePage;

import java.time.Duration;
import java.util.Iterator;
import java.util.Set;

public class EmagPageTest extends Utils {

    WebDriver driver;

    @BeforeTest//suite
    public void setUp() {
        driver = getChromeDriver();
    }
    @Test
    public void emagPageTest() {

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

   @Test
    public void emagSecondTest()  {
       System.out.println("SECOND TEST");

   }

   @Test
   public void DEMOQA(){
       driver.get("https://demoqa.com");
       DemoqaPage demoqaPage = new DemoqaPage(driver);
       demoqaPage.bannerImage.click();

       Set<String> tabIDs = driver.getWindowHandles();
       Iterator<String> iter = tabIDs.iterator();
       String parentId = iter.next();
       String childId = iter.next();
       driver.switchTo().window(childId);

       demoqaPage.goToRegistrationButton.click();
       demoqaPage.optionRO.click();

       driver.switchTo().window(parentId);
   }

@AfterTest
    public void CloseDriver() {
    driver.quit();
}



}
