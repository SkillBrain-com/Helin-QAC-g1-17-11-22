package org.skillbrain.cristianLuca;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Selenium {
    public static void main(String[] args) {
        //Unde se afla chromedriver
        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
        ChromeDriver driver = new ChromeDriver();

        driver.get("https://demoqa.com/");

        WebElement forms = driver.findElement(By.xpath("(//div[@class='card-up'])[2]"));
        forms.click();

        //driver.quit();

        WebElement footer = driver.findElement(By.tagName("footer"));

        System.out.println(footer.getText());

        driver.quit();
    }
}
