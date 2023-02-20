package org.skillbrain.radulescuTeodor;

import java.io.IOException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Selenium_Tema1_1 {

    public static void main(String[] args) throws IOException {

      System.setProperty("webdriver.chrome.driver","drivers/chromedriver.exe");
      ChromeDriver driver = new ChromeDriver();
      driver.get("https://testpages.herokuapp.com/styled/basic-web-page-test.html");
      //header
      WebElement forms = driver.findElement(By.xpath("((//h1[normalize-space()='Basic Web Page Example'])[1])"));
      forms.click();
      //header_contains
      System.out.println(forms.getText());

      forms = driver.findElement(By.xpath("((//div[@class='explanation'])[1])"));
      forms.click();
      System.out.println(forms.getText());

      //paragraph1
      forms = driver.findElement(By.xpath("((//p[@id='para1'])[1])"));
      forms.click();
      //paragraph1_contains
      System.out.println(forms.getText());
      //A paragraph of text

      //paragraph2
      forms = driver.findElement(By.xpath("((//p[@id='para2'])[1])"));
      forms.click();
      //paragraph2_contains
      System.out.println(forms.getText());
      //Another paragraph of text
      //paragraph2_find_ById
      forms = driver.findElement(By.id("para2"));
      forms.click();
      System.out.println(forms.getText());
      driver.quit();


    }
}
