package org.skillbrain;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.chrome.ChromeDriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;


public class ExceptionsTests {

        public static void main(String[] args) throws Exception {

            System.setProperty("Chromedriver.chrome.driver"," .idea/drivers/chromedriver.exe");
            ChromeDriver driver=new ChromeDriver();
            driver.manage().window().maximize();
            // WebDriver driver=new ChromeDriver();
            driver.get("https://demoqa.com/buttons");
            Actions actions=new Actions(driver);
            WebElement RightClickMe;
            RightClickMe =driver.findElement(By.id("rightClickBtn "));
            actions.contextClick(RightClickMe).build().perform();
            String message=driver.findElement(By.tagName(" p" )).getText();

            Thread.sleep(3000);
            System.out.println( message);

              throw new RuntimeException("RuntimeException ");



        }
    }


