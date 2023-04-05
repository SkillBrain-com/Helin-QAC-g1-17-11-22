package org.skillbrain.Tema5;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class Selenium1punctele1si2 {
    public static void main(String[] args) {

        System.setProperty("Chromedriver.chrome.driver"," .idea/drivers/chromedriver.exe");
        ChromeDriver driver=new ChromeDriver();

        driver.get("https://testpages.herokuapp.com/styled/index.html ");
        WebElement element=driver.findElement(By.xpath(" //div[@class='page-body']"));
        System.out.println(" //div[@class='page-body']");
          element.click();
         WebElement element1=driver.findElement(By.cssSelector("div.explanation"));
         System.out.println("div.explanation");
         element1.click();
          driver.get("https://testpages.herokuapp.com/styled/attributes-test.html ");
         WebElement element2=driver.findElement(By.xpath("//div[@class='explanation']"));
         System.out.println("//div[@class='explanation']");
          element2.click();
         WebElement element3=driver.findElement(By.cssSelector("div.page-body"));
         System.out.println("div.page-body");
         element3.click();
         driver.get("https://testpages.herokuapp.com/styled/find-by-playground-test.html ");
         WebElement body=driver.findElement(By.tagName("body"));
         System.out.println(" body");
         body.click();
         WebElement element4=driver.findElement(By.id("div1"));
         System.out.println("div1");

        driver.quit();




    }
    }

