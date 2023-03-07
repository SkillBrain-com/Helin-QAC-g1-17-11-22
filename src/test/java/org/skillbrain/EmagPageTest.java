package org.skillbrain;

import Utilities.Utils;
import org.openqa.selenium.By;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import pageObject.DemoqaPage;
import pageObject.EmagHomePage;

import java.net.MalformedURLException;
import java.time.Duration;
import java.util.Iterator;
import java.util.Set;

public class EmagPageTest  extends Utils {

    //WebDriver driver;
    RemoteWebDriver driver;
    EmagHomePage homePage;

    WebDriverWait waitFor;



    @BeforeSuite
   //@BeforeTest // acest Before va fi executat inainte de orice test(o sa faca un Driver)
   public void initializedriver() throws MalformedURLException {
       driver = getRemoteWebDriver();
   }
        @Test
    public void emagPageTest(){

        //  driver = getChromeDriver();// sau driver.get("https://emag.ro/")
        // alerts, file uploads, modals - de gasit exemple
        driver.get("https://www.emag.ro/");
        homePage = new EmagHomePage(driver);
       // homePage.closeOfertaZileiButton.click();
        homePage.gdprFooter.click();
        homePage.acceptButton.click();
        driver.navigate().refresh();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.visibilityOf(homePage.gdprFooter));
        homePage.acceptButton.click();
        wait.until(ExpectedConditions.visibilityOf(homePage.loginBanner));
        homePage.intraInContButton.click();
        wait.until(ExpectedConditions.visibilityOf(homePage.emagLogo));
        String text = homePage.salutMsg.getText();
        //Assert.assertEquals(text,"Salut!");
        System.out.println(homePage.salutMsg.getText());
        //  Thread.sleep(6000);
        System.out.println("Test finished.");
        driver.quit();
        }

    @Test(dependsOnMethods = "emagPageTest")
    public void emagSecondTest() throws InterruptedException {
        //===============================================================//
        waitFor = new WebDriverWait( driver, Duration.ofSeconds(30));
        waitFor.until(ExpectedConditions.visibilityOf(homePage.email));
        //================================================================//
        homePage.email.sendKeys("abc@abc.com");
        takeScreenshot(driver);
        homePage.loginButton.click();
        //................................................................//
        //................................................................//
        waitFor = new WebDriverWait(driver ,Duration.ofSeconds(20));
        waitFor.until(ExpectedConditions.visibilityOf(homePage.passwordHeader));
        //....................................................................//
        homePage.password.sendKeys("Pass@123!");
        homePage.continueButton.click();
        Thread.sleep(15000);
        String actualLoginMessage = homePage.loginErrorMessage.getText();
        String expectedLoginMessage = "Ai introdus greșit parola sau adresa de email. Te rugăm completează din nou.";
        Assert.assertEquals(expectedLoginMessage, expectedLoginMessage );




    }

    @Test(groups = {"Grupa1"})
    public void demoQaFormPageTest()  {
            driver.get("https://demoqa.com/");
            // String firstPageId = driver.getWindowHandle();
            // System.out.println("ID = " + firstPageId);
            DemoqaPage demoqaPage = new DemoqaPage(driver);
            //==============================================//
            waitFor = new WebDriverWait(driver,Duration.ofSeconds(6));
            waitFor.until(ExpectedConditions.visibilityOf(demoqaPage.bannerImage));

            demoqaPage.bannerImage.click();
            Set<String> tabIDs =  driver.getWindowHandles();
            //Thread.sleep(4000);
            Iterator<String> iterator = tabIDs.iterator();
            String parentid = iterator.next();
            String childId = iterator.next();
            driver.switchTo().window(childId);
            demoqaPage.goToRegistrationButton.click();
            demoqaPage.optionRomania.click();
            //Thread.sleep(4000);

        }



        @DataProvider(name = "endpointList")
        public Object[][] myEndpointProvider(){
            return new Object[][] {
                {"elements"},
                {"forms"},
                {"alertsWindows"},
                {"books"},
                {"widgets"}
            };
        }

          @Test(dataProvider = "endpointList")
          public void parameterTest(String endpoint) {
              driver.get("https://demoqa.com/" + "/" + endpoint);
              //takeScreenshot(driver);
              boolean isPresent = driver.findElement(By.xpath("//img[@src='/images/Toolsqa.jpg']")).isDisplayed();
              Assert.assertTrue(isPresent);

            }





       // @AfterTest
        @AfterSuite
    public void  closeDriver() {
            driver.quit();
        }
}
