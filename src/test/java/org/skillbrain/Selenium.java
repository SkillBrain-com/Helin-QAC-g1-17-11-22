package org.skillbrain;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Selenium {
    public static void main(String[] args) {
        // Unde se afla ChromeDriver?
        System.setProperty("webdriver.chrome.driver","drivers/chromedriver.exe");
        ChromeDriver driver = new ChromeDriver();
        // WebDriver driver = new ChromeDriver(); legal
        driver.get("https://demoqa.com/");
        // selectori
        // ID:  #ID
        // CSS: .numeClasa (daca exista spatii libere punem punct)
        // ec css: card mt-4
        // Xpath -> //tag[@atribut='valoare'], //div[@class='card mt-4 top-card'])[2]
        //ex
        WebElement forms = driver.findElement(By.xpath("(//div[@class='card mt-4 top-card'])[2]"));
        WebElement footer = driver.findElement(By.tagName("footer"));

        System.out.println(footer.getText());
        //forms.click();

        driver.quit();



    }
}
