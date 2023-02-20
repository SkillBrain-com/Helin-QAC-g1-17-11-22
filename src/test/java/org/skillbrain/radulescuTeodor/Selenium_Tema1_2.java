package org.skillbrain.radulescuTeodor;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.concurrent.TimeUnit;


public class Selenium_Tema1_2 {

    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
        ChromeDriver driver = new ChromeDriver();
        driver.get("https://demoqa.com/webtables");
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(2));

        try {
            //WEBTABLES

            WebElement addButton = driver.findElement(By.id("addNewRecordButton"));
            addButton.click();
            driver.findElement(By.id("firstName")).sendKeys("prenume");
            driver.findElement(By.id("lastName")).sendKeys("nume");
            driver.findElement(By.id("userEmail")).sendKeys("1111@gmail.com");
            driver.findElement(By.id("age")).sendKeys("25");
            driver.findElement(By.id("salary")).sendKeys("3333");
            driver.findElement(By.id("department")).sendKeys("QA ");
            driver.findElement(By.id("submit")).click();

            Thread.sleep(2000);
            //RADIO BUTTONS
            driver.findElement(By.xpath("(//span[normalize-space()='Radio Button'])[1]")).click();
            driver.findElement(By.xpath("(//label[normalize-space()='Yes'])[1]")).click();
            System.out.println(driver.findElement(By.xpath("//p[@class='mt-3']")).getText());
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            driver.quit();
        }
    }
}


