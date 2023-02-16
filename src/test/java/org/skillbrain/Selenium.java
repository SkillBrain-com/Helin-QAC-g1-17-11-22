package org.skillbrain;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class Selenium {
    public static void main(String[] args) throws Exception {

//      Unde se afla Chrome driver-ul
        System.setProperty("webdriver.chrome.driver" , "drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        //ChromeDriver driver = new ChromeDriver;   ambele sunt legale
        driver.manage().window().maximize();
        //acces pagina web -> metoda .get
        driver.get("https://demoqa.com/");
        WebElement header = driver.findElement(By.xpath("//div[@id='app']//header"));
        WebElement elements = driver.findElement(By.cssSelector(".card.mt-4.top-card"));
        Thread.sleep(2000);
        elements.click();
        WebElement textBox = driver.findElement(By.id("item-0")); // se pune # doar la selectorshub , in intelij se scrie fara #
        textBox.click();
        Thread.sleep(2000);
        driver.findElement(By.id("userName")).sendKeys("Moldovan Nelutu");
        driver.findElement(By.id("userEmail")).sendKeys("nelutu@email.com");
        driver.findElement(By.id("currentAddress")).sendKeys("Home");
        driver.findElement(By.id("permanentAddress")).sendKeys("acasa");
        driver.findElement(By.cssSelector(".btn.btn-primary")).click();
        List<WebElement> mbElements = driver.findElements(By.tagName("p"));
        for (int i = 0; i <mbElements.size(); i++){
            System.out.println(mbElements.get(i).getText());
        }

        driver.findElement(By.xpath("(//li[@id='item-1'])[1]")).click();
        Thread.sleep(2000);
        driver.findElement(By.cssSelector(".rct-icon.rct-icon.rct-icon-expand-close")).click();
        driver.findElement(By.xpath("//label[@for='tree-node-desktop']//span[@class='rct-checkbox']")).click();
        Thread.sleep(2002);
        System.out.println(driver.findElement(By.id("result")).getText());

        Thread.sleep(2000);
        driver.findElement(By.xpath("(//li[@id='item-2'])[1]")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("(//label[@class='custom-control-label'])[1]")).click();
        String radioButtonMsg = driver.findElement(By.tagName("p")).getText().trim();
        Thread.sleep(3000);
        //exemplu de validare simplu
        boolean isYes = radioButtonMsg.equals("You have selected Yes");
        System.out.println("result is " + isYes);




        driver.quit();



//        header.click();
//        Thread.sleep(2000);



        //selectori
        //ID -> #ID
        //css -> .numeleClasei (daca sunt spatii libere le inlocuiti cu simbolul . )
        //ex css -> .card mt-4 top-card -> .card.mt-4.top-card
        //Xpath -> //tag[@atribut = 'valoare']
        //ex Xpath -> //a[@target='_blank'] , (//div[@class='card mt-4 top-card'])[2])
        //tagname -> TagName

//        WebElement forms = driver.findElement(By.xpath("(//div[@class='card mt-4 top-card'])[2]"));
//        WebElement footer = driver.findElement(By.tagName("footer"));
//        String footerMesg = footer.getText();
//        System.out.println(footer.getText());
//        forms.click();

 //       driver.quit();


    }
}
