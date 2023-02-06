package org.skillbrain;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Selenium {

    public static void main(String[] args){
        //Unde se afla chromedriver?

        System.setProperty("webdriver.chrome.", "drivers/chromedriver.exe");
        ChromeDriver driver = new ChromeDriver();
        driver.get("https://demoqa.com/");
// selectori
        //dupa ID : scriem #id
        //dupa CSS -> .numeClasei ( daca sunt spatii libere, le inlocuim cu .
        // ex CSS: .card mt-4 top-card.

        WebElement  forms = driver.findElement(By.xpath("//body/div[@id='app']/div[@class='body-height']/div[@class='home-content']/div[@class='home-body']/div[@class='category-cards']/div[1]"));
WebElement footer = driver.findElement(By.tagName("footer"));

        System.out.println(footer.getText());
       // forms.click();
        driver.quit();




    }
}
