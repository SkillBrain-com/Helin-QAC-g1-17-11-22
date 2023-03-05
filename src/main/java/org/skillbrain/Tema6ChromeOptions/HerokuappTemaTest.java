package org.skillbrain.Tema6ChromeOptions;

import PageObjects.HerokuappTemaChromeOptins;
import Utilitis.Utils;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.io.IOException;
import java.net.MalformedURLException;
import java.time.Duration;
import java.util.Iterator;
import java.util.Set;

public class HerokuappTemaTest extends Utils {
    RemoteWebDriver driver;
    WebDriverWait waitFor;

    @BeforeTest
    public void start() throws MalformedURLException {
        driver = getRemoteWebdriver();
    }

    @AfterTest
    public void stopTest() {
        driver.quit();
    }

    @Test
    public void windowTest() {
        driver.get("https://testpages.herokuapp.com/styled/basic-html-form-test.html");
        HerokuappTemaChromeOptins page = new HerokuappTemaChromeOptins(driver);
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", page.userName);
        page.userName.click();
        page.password.click();
        driver.navigate().refresh();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
        wait.until(ExpectedConditions.visibilityOf(page.userName));
        page.password.click();
        wait.until(ExpectedConditions.visibilityOf(page.password));
        page.comment.click();
        System.out.println("FHFHFJFJ");
        page.ckeckBox1.click();
        System.out.println("checkBox1");
        Set<String> listaId = driver.getWindowHandles();
        Iterator<String> iterator = listaId.iterator();
        String parinte = iterator.next();
        String copil = iterator.next();
        driver.switchTo().window(copil);

    }

        @DataProvider(name = "endpointList")
        public Object[][] myEndpointProvider(){
            return new Object[][]{
                    {"userName"}, {"password"}, {"comment"}, {"ckeckBox1"}
            };
        }

        @Test(dataProvider = "endpointList")
        public void parameterTest(String endpoit)  throws IOException {

            driver.get("https://testpages.herokuapp.com/styled/basic-html-form-test.html " +"/"+ endpoit);
            takeScreenshot(driver);


        }

    }
