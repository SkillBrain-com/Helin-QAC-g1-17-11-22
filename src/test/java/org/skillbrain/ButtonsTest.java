package org.skillbrain;
import PageObjects.DemoqaPage;
import PageObjects.EmagHomePage;
import Utilitis.Utils;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

import java.net.MalformedURLException;

public class ButtonsTest extends Utils {
    DemoqaPage demoqaPage;
    RemoteWebDriver driver;
    EmagHomePage homePage;
    WebDriverWait waitFor;
    public void initializeDriver() throws MalformedURLException {
        driver =getRemoteDriver();

    }

    @AfterTest
    public void closeDriver(){
        driver.quit();
    }

    @Test
    public void buttonTest() {
        System.setProperty("Chromedriver.chrome.driver"," .idea/drivers/chromedriver.exe");
        ChromeDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://demoqa.com/");
        Actions actions =new Actions(driver);
        WebElement rightClickMe=driver.findElement(By.id(" rightClickBtn" ));
        actions.contextClick(rightClickMe ).build().perform();
        String message=driver.findElement(By.tagName(" p" )).getText();



        System.out.println( message);
        driver.quit();
    }
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("Chromedriver.chrome.driver"," .idea/drivers/chromedriver.exe");
        ChromeDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://demoqa.com/");
        Actions actions =new Actions(driver);
        WebElement rightClickMe=driver.findElement(By.id(" rightClickBtn" ));
        actions.contextClick(rightClickMe ).build().perform();
        String message=driver.findElement(By.tagName(" p" )).getText();



        System.out.println( message);
        driver.quit();
    }


    public RemoteWebDriver getRemoteDriver() {
        RemoteWebDriver remoteDriver = null;

        return remoteDriver;
    }

    public void setRemoteDriver(RemoteWebDriver remoteDriver) {
        this.driver = remoteDriver;
    }
}
