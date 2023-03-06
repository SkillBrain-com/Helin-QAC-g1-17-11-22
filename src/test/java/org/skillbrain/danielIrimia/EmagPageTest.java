package org.skillbrain.danielIrimia;

import Utilities.Utils;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.*;
import pageObjects.DemoqaPage;
import pageObjects.EmagHomePage;

import java.io.IOException;
import java.time.Duration;
import java.util.Iterator;
import java.util.Set;

public class EmagPageTest extends Utils {

    WebDriver driver;
    EmagHomePage homePage;
    WebDriverWait waitFor;

    @BeforeSuite
    public void initializeDriver() {
        driver = getChromeDriver();
    }

    @AfterSuite
    public void closeDriver(){
        driver.quit();
    }

    @Test
    public void emagPageTest() {
        driver.get("https://www.emag.ro/");
        homePage = new EmagHomePage(driver);
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
        String text = homePage.salutMsg.getText();
        //Assert.assertNotEquals(text, "Salut!", "La validare mesaj final, a aparut o exceptie.");
        System.out.println(homePage.salutMsg.getText());
        // alerts, file uploads, modals - de gasit exemple
        System.out.println("Skillbrain va saluta!");

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
        demoqaPage.goToRegistrationButton.click();
        demoqaPage.optionRO.click();
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
//        takeScreenshot(driver);
        boolean isPresent = driver.findElement(By.xpath("//img[@src='/images/Toolsqa.jpg']")).isDisplayed();
        Assert.assertTrue(isPresent);

    }







}
