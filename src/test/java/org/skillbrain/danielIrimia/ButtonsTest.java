package org.skillbrain.danielIrimia;

import Utilities.Utils;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.net.MalformedURLException;


public class ButtonsTest extends Utils {


    RemoteWebDriver driver;
    WebDriverWait wait;

    @BeforeTest
    public void initializeDriver() throws MalformedURLException {
        driver = getRemoteWebDriver();
    }

    @Test
    public void buttonTest() {

        driver.get("https://demoqa.com/buttons");
        // test click me
//        WebElement clickMe = driver.findElement(By.xpath("//button[normalize-space()='Click Me']"));
//        clickMe.click();
        // double click me
//        WebElement doubleCLickMe = driver.findElement(By.id("doubleClickBtn"));
//        Actions actions = new Actions(driver);
//        actions.doubleClick().build().perform();
        // right click me
        Actions actions = new Actions(driver);
        WebElement rightClickMe = driver.findElement(By.id("rightClickBtn"));
        actions.contextClick(rightClickMe).build().perform();
        String message = driver.findElement(By.tagName("p")).getText();
        System.out.println(message);

        WebElement doubleClick = driver.findElement(By.id("doubleClickBtn"));
        actions.doubleClick(doubleClick).build().perform();
        String message2 = driver.findElement(By.tagName("p")).getText();

        WebElement clickMe = driver.findElement(By.xpath("(//button[normalize-space()='Click Me'])[1]"));
        actions.click(clickMe).build().perform();
        String message3 = driver.findElement(By.tagName("p")).getText();
    }

    @AfterTest
    public void closeDriver(){
        driver.quit();
    }
}
