package org.skillbrain.mirelaEnachescu;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Selenium_lectie {

    public static void main(String[] args) {
        // Unde se afla Chromedriver?

        System.setProperty("webdriver.chrome.driver" , "drivers/chromedriver");
        ChromeDriver driver= new ChromeDriver();
        // WebDriver driver = new ChromeDriver();

        driver.get("https://demoqa.com/");
        //selectori
        //ID:  #id
        //css   .numeClasa (daca sunt spatii libere , le inlocuiti cu .)
        //ex css : .card mt-4 top-card -> .card.mt-4.top-card
        //XPath ->  //tag[@atribut='valoare']
        //ex XPath : //a[@target='_blank'], (//div[@class='card mt-4 top-card'])[2]
        //pentru a selecta un singur element dintr-o multime de elemente asemanatoare dam pe SelectorsHub -> index XPath : (//div[@class='card mt-4 top-card'])[2]
        //tagName -> tagName (ex : head, div, footer)

        WebElement forms = driver.findElement(By.xpath("(//div[@class='card mt-4 top-card'])[2]"));
        WebElement footer = driver.findElement(By.tagName("footer"));

        String footerMsg = footer.getText();

        System.out.println(footer.getText());
        forms.click();

        driver.quit();

    }


}
