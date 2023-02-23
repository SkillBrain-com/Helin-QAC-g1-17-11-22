package org.skillbrain;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.chrome.ChromeDriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class buttonsTest {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("Chromedriver.chrome.driver"," .idea/drivers/chromedriver.exe");
        ChromeDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://demoqa.com/");
        Actions actions =new Actions(driver);
        WebElement rightClickMe=driver.findElement(By.id(" rightClickBtn" ));
        actions.contextClick(rightClickMe ).build().perform();
        String message=driver.findElement(By.tagName(" p" )).getText();


          Thread.sleep(5000);

        System.out.println( message);
        driver.quit();
    }



}
