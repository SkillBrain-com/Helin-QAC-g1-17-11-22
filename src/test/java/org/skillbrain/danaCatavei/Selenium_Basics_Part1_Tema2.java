package org.skillbrain.danaCatavei;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class Selenium_Basics_Part1_Tema2 {

    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
        ChromeDriver driver = new ChromeDriver();
        driver.get("https://demoqa.com/webtables");

        // testez add button
        WebElement addButton = driver.findElement(By.id("addNewRecordButton"));
        addButton.click();
        Thread.sleep(2000);

        driver.findElement(By.id("firstName")).sendKeys("Daniela");
        driver.findElement(By.id("lastName")).sendKeys("Catavei");
        driver.findElement(By.id("userEmail")).sendKeys("dana.catavei@gmail.com");
        driver.findElement(By.id("age")).sendKeys("50");
        driver.findElement(By.id("salary")).sendKeys("5000");
        driver.findElement(By.id("department")).sendKeys("QA Engineer");
        driver.findElement(By.id("submit")).click();
        Thread.sleep(3000);
        driver.findElement(By.id("searchBox")).sendKeys("Daniela");
        driver.findElement(By.id("basic-addon2")).click();
        Thread.sleep(3000);
        List<WebElement> rand = driver.findElements(By.xpath("(//div[@class='rt-tr -odd'])[1]"));
        for (int i=0; i<rand.size(); i++){
            System.out.println(rand.get(i).getText());
        }
        driver.quit();

    }
}
