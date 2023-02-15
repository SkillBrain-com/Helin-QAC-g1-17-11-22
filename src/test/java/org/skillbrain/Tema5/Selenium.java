package org.skillbrain.Tema5;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Selenium {
    public static void main(String[] args) throws Exception {
        //unde se afla chromedriver?
        System.setProperty("webdriver.chrome.driver","drivers/chromedriver.exe");
       ChromeDriver driver = new ChromeDriver();
       driver.manage().window().maximize();
       //WebDriver driver = ChromeDriver(); legal
        //accesare pagina web
        driver.get("https://demoqa.com/");

        WebElement header=driver.findElement(By.tagName("header"));
        WebElement elements= driver.findElement(By.cssSelector(".card.mt-4.top-card"));
        Thread.sleep(2000);
     //   header.click();
        Thread.sleep(2000);
        elements.click();
        WebElement textBox=driver.findElement(By.id("item-0")); // fara diez
        textBox.click();
        Thread.sleep(2000);
        driver.findElement(By.id("username")).sendKeys("Luc Sim");
        driver.findElement(By.id("userEmail")).sendKeys("Luc@sim.msn");
        driver.findElement(By.id("currentAddress")).sendKeys("Vaslui");
        driver.findElement(By.id("permanentAddress")).sendKeys("Tecuci");
        driver.findElement(By.cssSelector(".btn.btn-primary")).click();
     //   Thread.sleep(4000);
      //  driver.quit();








        //selectori
        //ID-> #id
        //css -> .numeClasa (daca sunt spatii libere, le inlocuiti cu .
        //ex css: .card mt-4 top-card -> .card.mt-4.top-card
        // xPath -> //tag[@atribut='valoare']
        // ex xPath: //a[@target='_blank'],//div[@class='card mt-4 top-card'])[2]
        // tagname-> tagName


//     forms.click();
//        WebElement forms= driver.findElement(By.xpath("(//div[@class='card mt-4 top-card'])[2]"));
//        WebElement footer = driver.findElement(By.tagName("footer"));
//        String footerMsg=footer.getText();
//
//        System.out.println(footerMsg);

  //     driver.quit();

   // driver.quit();



    }
}
