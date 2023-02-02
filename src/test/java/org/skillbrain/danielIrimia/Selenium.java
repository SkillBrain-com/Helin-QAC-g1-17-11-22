package org.skillbrain.danielIrimia;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Selenium {

    public static void main(String[] args) {
        // Unde se afla chromedriver

        // Setam path-ul catre chromedriver
        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver");

        // Deschidem un browser
        ChromeDriver driver = new ChromeDriver();

        driver.get("https://demoqa.com/");

        WebElement form = driver.findElement(By.xpath("(//div[@class='card mt-4 top-card'][2])"));
        WebElement footer = driver.findElement(By.tagName("footer"));
        WebElement iteractions = driver.findElement(By.xpath("(//div[normalize-space()='Interactions'])[1]"));
        String footerMsg = footer.getText();

        System.out.println(footerMsg);
        //form.click();

        iteractions.click();

        driver.quit();
    }
}
