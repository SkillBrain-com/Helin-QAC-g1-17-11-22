package org.skillbrain;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Selenium {
    public static void main(String[] args) {
        //unde se afla chromedriver?
        System.setProperty("webdriver.chrome.driver","drivers/chromedriver.exe");
       ChromeDriver driver = new ChromeDriver();
       //WebDriver driver = ChromeDriver(); legal
        driver.get("https://demoqa.com/");
        //selectori
        //ID-> #id
        //css -> .numeClasa (daca sunt spatii libere, le inlocuiti cu .
        //ex css: .card mt-4 top-card -> .card.mt-4.top-card
        // xPath -> //tag[@atribut='valoare']
        // ex xPath: //a[@target='_blank'],//div[@class='card mt-4 top-card'])[2]
        // tagname-> tagName



        WebElement forms= driver.findElement(By.xpath("(//div[@class='card mt-4 top-card'])[2]"));
        WebElement footer = driver.findElement(By.tagName("footer"));

        System.out.println(footer.getText());
        forms.click();
     //  driver.quit();

    }
}
