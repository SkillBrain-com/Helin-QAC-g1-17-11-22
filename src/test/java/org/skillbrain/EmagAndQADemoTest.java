package org.skillbrain;

import Utilities.Utils;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import pageObjects.EmagHomePage;
import pageObjects.QADemoPage;

import java.net.MalformedURLException;
import java.time.Duration;


public class EmagAndQADemoTest extends Utils {

    RemoteWebDriver driver;

    @BeforeTest
    public void initializeDriver() throws MalformedURLException {
        driver = getRemoteWebDriver();
    }

    @AfterTest
    public void closeDriver(){
        driver.quit();
    }
    @Test
    public void emagPageTest(){

        driver.get("https://www.emag.ro");
        EmagHomePage homePage = new EmagHomePage(driver);

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
        wait.until(ExpectedConditions.visibilityOf(homePage.acceptBtn));
//        homePage.closeOfertaZilei.click();
        homePage.acceptBtn.click();
        homePage.loginCont.click();
        wait.until(ExpectedConditions.visibilityOf(homePage.salutMsg));
        System.out.println(homePage.salutMsg.getText());
        String msg = homePage.salutMsg.getText();
        Assert.assertEquals(msg, "Salut!");


        homePage.emailField.sendKeys("abc@email.com");
        homePage.loginContinue.click();
        wait.until(ExpectedConditions.visibilityOf(homePage.passwordMessage));
        homePage.password.sendKeys("abc");
        homePage.continueButton.click();
        System.out.println(homePage.loginError.getText());

    }

    @Test
    public void qademoTest(){

        driver.get("https://demoqa.com/");
        QADemoPage qaPage = new QADemoPage(driver);

        qaPage.formsCard.click();
        System.out.println(qaPage.selectText.getText());
        qaPage.practiceFormBtn.click();
        qaPage.name.sendKeys("iuli");
        qaPage.lastName.sendKeys("ol");
        qaPage.email.sendKeys("io@email.com");
        qaPage.phoneNr.sendKeys("0412345678");
        qaPage.gender.click();
//        qaPage.submit.click();

    }


}
