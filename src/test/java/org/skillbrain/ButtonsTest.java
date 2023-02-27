package org.skillbrain;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ButtonsTest {
    public static void main(String[] args) throws Exception {

        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://demoqa.com/buttons");
        //teste click me
        driver.findElement(By.xpath("(//button[normalize-space()='Click Me'])[1]")).click();
        //test doubleClickMe
        WebElement doubleClickMe = driver.findElement(By.id("doubleClickBtn"));
        //right Clickme
        Actions actions = new Actions(driver);
        WebElement rightClickMe = driver.findElement(By.id("rightClickBtn"));
        actions.contextClick(rightClickMe).build().perform();


        String messege = driver.findElement(By.tagName("p")).getText();
        System.out.println(messege);


//        Thread.sleep(3000);
        driver.quit();
    }
}
