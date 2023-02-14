package org.skillbrain;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Selenium {
    public static void main(String[] args) throws InterruptedException {


        //Unde se afla chromedriver
        System.setProperty("webdriver.chrome.driver", "src/driver/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        // acceseaza o pagina web
        driver.get("https://demoqa.com/");
        driver.manage().window().maximize();
        WebElement header = driver.findElement(By.tagName("header"));
        WebElement elements = driver.findElement(By.cssSelector(".card.mt-4.top-card"));
        Thread.sleep(2000);
        header.click();
        Thread.sleep(2000);
        WebElement textBox = driver.findElement(By.id("item-0"));
        Thread.sleep(2000);
        driver.findElement(By.id("UserName")).sendKeys("mircea vasian");
        driver.findElement(By.id("userEmail")).sendKeys("mircea@yahoo.com");
        driver.findElement(By.id("currentAdress")).sendKeys("home");
        driver.findElement(By.id("permanentAdress")).sendKeys("donath29");
        Actions actions = new Actions(driver);
        WebElement submitButton = driver.findElement(By.cssSelector(".btn.btn-primary"));

        driver.findElement(By.xpath("(//li[@id='item-1'])[1]")).click();
        Thread.sleep(2000);
        driver.findElement(By.cssSelector(".rct-icon.rct-icon-expand-close")).click();
        driver.findElement(By.xpath("//label[@for='tree-node-desktop']//span[@class='rct-checkbox']//*[name()='svg']")).click();
        Thread.sleep(2000);
        System.out.println(driver.findElement(By.id("result")).getText());

        submitButton.click();







        //selectori
        //ID   #ID
        //css   se cauta cu . si numele clasei (spatiile libere se inlocuiesc cu punct)
       // WebElement forms = driver.findElement(By.xpath("//h5[normalize-space()='Forms']"));
       // WebElement footer = driver.findElement(By.tagName("footer"));
       // System.out.println(footer.getText());
       // forms.click();
    }


}
