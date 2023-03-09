package org.skillbrain.andaDarjan.Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class Selenium {
    public static void main(String[] args) {

        //Unde se afla chromedriver?
        System.setProperty("webdriver.chrome.driver", "drivers/chromedrv.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://demoqa.com/");
        // selectori
        // ID -> #id
        // css -> numeClasei (daca sunt spatii libere se inlocuiesc cu .)
        // ex css : .card mt-4 top-card -> .card.mt-4.top-card
        // Xpath -> //tag[@atribut='valoare']
        // ex xpath: //a[@target='_blank'],//div[@class='card mt-4 top-card'])[2]
        // tagname -> tagName
        WebElement forms = driver.findElement(By.xpath("(//div[@class='card mt-4 top-card'])[2]"));
        WebElement footer = driver.findElement(By.tagName("footer"));
        String footerMsg = footer.getText();

        System.out.println(footer.getText());
             //   forms.click();
                driver.quit();

                //driver.quit();
    }
}
