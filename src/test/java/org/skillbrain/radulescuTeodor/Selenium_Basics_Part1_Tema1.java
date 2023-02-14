package org.skillbrain.radulescuTeodor;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Selenium_Basics_Part1_Tema1 {

    public static void main(String[] args) {

      System.setProperty("webdriver.chrome.driver","drivers/chromedriver.exe");
      ChromeDriver driver = new ChromeDriver();
      driver.get("https://testpages.herokuapp.com/styled/basic-web-page-test.html");
      // localizez hedear 1
      WebElement forms = driver.findElement(By.xpath("((//h1[normalize-space()='Basic Web Page Example'])[1])"));
      forms.click();
      //afisez continut header
      System.out.println(forms.getText()); //Basic Web Page Example

      //driver.quit();
      //localizez explicatiile..
      forms = driver.findElement(By.xpath("((//div[@class='explanation'])[1])"));
      forms.click();
      //afisez continut
      System.out.println(forms.getText());
      //Very simple web pages have a structure illustrated by this page. And elements can have id and class attributes for styling and locating
     //localizez paragraf 1
      forms = driver.findElement(By.xpath("((//p[@id='para1'])[1])"));
      forms.click();
      //afisez text paragraf 1
      System.out.println(forms.getText());
      //A paragraph of text

      //localizez paragraf 2
      forms = driver.findElement(By.xpath("((//p[@id='para2'])[1])"));
      forms.click();
      //afisez text paragraf 2
      System.out.println(forms.getText());
      //Another paragraph of text
      //localizez paragraf 2 dupa id
      forms = driver.findElement(By.id("para2"));
      forms.click();
      System.out.println(forms.getText());
      driver.quit();



    }
}
