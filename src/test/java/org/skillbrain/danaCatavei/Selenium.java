package org.skillbrain;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Selenium {
// unde se afla chromedriver?
    public static void main(String[] args) {
    System.setProperty("webdriver.chrome.driver","drivers/chromedriver.exe");

        //WebDriver driver = new ChromeDriver(); echivalenta cu cea de mai jos
        ChromeDriver driver = new ChromeDriver();

        driver.get("https://demoqa.com/");


        //selectori
        //recomandare: sa folosim ID daca exista in pagina web, se cauta #id (numele id)
        //css->numele clasei (daca sunt spatii libere se inlocuiesc cu .) ex:card mt-4 => card.mt-4
        // XPath //nume_tag[@atribut='valoare_element'][numar element]
        // exemplu : //a[@target='_blank'], //div..(//div[@class='home-banner'])[1]
        WebElement forms = driver.findElement(By.xpath("(//div[@class='card mt-4 top-card'][2])"));
        //forms.click();
        //driver.quit();

        WebElement footer = driver.findElement(By.tagName("footer"));
        System.out.println(footer.getText());
        driver.quit();


    }


}

