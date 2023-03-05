package org.skillbrain;
import PageObjects.DemoqaPage;
import PageObjects.EmagHomePage;
import Utilitis.Utils;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.io.IOException;
import java.net.MalformedURLException;
import java.time.Duration;
import java.util.Iterator;
import java.util.Set;

public class NewEmagPageTest extends Utils{
DemoqaPage demoqaPage;
RemoteWebDriver driver;
EmagHomePage homePage;
WebDriverWait waitFor;
    @BeforeTest
    public void initializeDriver() throws MalformedURLException {
      driver =getRemoteWebdriver();
     }




    @Test
    public void emagPageTest() {

        try {
            driver.get("https://www.emag.ro/");
            homePage = new EmagHomePage(driver);
            homePage.closeOfertaZileiButton.click();
            homePage.gdprFooter.click();
            homePage.acceptButton.click();
            driver.navigate().refresh();
            WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
            wait.until(ExpectedConditions.visibilityOf(homePage.gdprFooter)); // 2 s
            homePage.acceptButton.click();
            wait.until(ExpectedConditions.visibilityOf(homePage.loginBanner));
            homePage.intraInContButton.click();
            wait.until(ExpectedConditions.visibilityOf(homePage.emagLogo));
            String text = homePage.salutMsg.getText();
            Assert.assertNotEquals(text, "Salut!", "La validare mesaj final, a aparut o exceptie.");
            System.out.println(homePage.salutMsg.getText());

            System.out.println("Skillbrain va saluta!");

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            driver.quit();
        }

    }

    @Test(dependsOnMethods = "emagPageTest")
    public void emagSecondTest() throws IOException, InterruptedException {
        homePage.email.sendKeys("abc@abc.com");
        takeScreenshot(driver);
        homePage.loginButton.click();
        waitFor = new WebDriverWait(driver ,Duration.ofSeconds(30));
        waitFor.until(ExpectedConditions.visibilityOf(homePage.passwordHeader));
        homePage.password.sendKeys("Pass@123!");
        homePage.continueButton.click();
        takeScreenshot(driver);
        Thread.sleep(15000);
        String actualLoginMessage = homePage.loginErrorMessage.getText();
        String expectedLoginMessage = "Ai introdus greșit parola sau adresa de email. Te rugăm completează din nou.";
        Assert.assertEquals(actualLoginMessage, expectedLoginMessage);
        System.out.println("Second Test");
    }

    @Test(groups = {"Grupa1"})
    public void demoQaFormPageTest() {
        driver.get("https://demoqa.com/");
        DemoqaPage demoqaPage = new DemoqaPage(driver);
        demoqaPage.bannerImage.click();
        Set<String> tabIDs = driver.getWindowHandles();
        System.out.println(tabIDs.size());
        Iterator<String> iter = tabIDs.iterator();
        String parentid = iter.next();
        String childId = iter.next();
        driver.switchTo().window(childId);
        demoqaPage.gotoregistrationButton.click();
        demoqaPage.optionRo.click();
        String abc ="abc";
    }



    @DataProvider(name ="endpointList")
    public Object[][] myEndpointProvider() {
        return new Object[][] {
                {"elements"},
                {"forms"},
                {"alertsWindows"},
                {"books"},
                {"widgets"}
        };

    }


    @Test(dataProvider = "endpointList")
    public void parameterTest(String endpoint) throws IOException {
        driver.get("https://demoqa.com" +"/" + endpoint);
       takeScreenshot(driver);
        boolean isPresent = driver.findElement(By.xpath("//img[@src='/images/Toolsqa.jpg']")).isDisplayed();
        Assert.assertTrue(isPresent);

    }
}








