package org.skillbrain.danielIrimia;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class Selenium {

    public static void main(String[] args) throws Exception {
        // Unde se afla chromedriver?
        System.setProperty("webdriver.chrome.driver" , "drivers/chromedriver");
        ChromeDriver driver = new ChromeDriver();
        // faceti fereastra mare
        driver.manage().window().maximize();
        // WebDriver driver = new ChromeDriver();  legal
        // accesare pagina web
        driver.get("https://demoqa.com/");
        WebElement header = driver.findElement(By.tagName("header"));
        WebElement elements = driver.findElement(By.cssSelector(".card.mt-4.top-card"));
        elements.click();
        WebElement textBox = driver.findElement(By.id("item-0"));  // FARA # !!!!!!!!!!!!
        textBox.click();
        driver.findElement(By.id("userName")).sendKeys("daniel test");
        driver.findElement(By.id("userEmail")).sendKeys("email@email.com");
        driver.findElement(By.id("currentAddress")).sendKeys("Home");
        driver.findElement(By.id("permanentAddress")).sendKeys("Home");
        // Optional
        WebElement submitButton = driver.findElement(By.cssSelector(".btn.btn-primary"));
        driver.executeScript("arguments[0].scrollIntoView(true);", submitButton);
        submitButton.click();
        List<WebElement> mbElements = driver.findElements(By.tagName("p"));
        for (int i= 0; i <mbElements.size(); i++) {
            System.out.println(mbElements.get(i).getText());
        }
        driver.findElement(By.xpath("(//li[@id='item-1'])[1]")).click();
        driver.findElement(By.cssSelector(".rct-icon.rct-icon-expand-close")).click();
        driver.findElement(By.xpath("//label[@for='tree-node-desktop']" +
                "//span[@class='rct-checkbox']//*[name()='svg']")).click();
        System.out.println(driver.findElement(By.id("result")).getText());
        Thread.sleep(2000);
        driver.findElement(By.xpath("(//li[@id='item-2'])[1]")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("(//label[@class='custom-control-label'])[1]")).click();
        Thread.sleep(3000);
        String radioButtonMessageResult = driver.findElement(By.tagName("p")).getText().trim();
        System.out.println(radioButtonMessageResult);
        // exemplu de validare simpla
        boolean isYes = radioButtonMessageResult.equals("You have selected Yes");
        System.out.println("Result is " + isYes);






        driver.quit();







//        driver.quit();



//        header.click();
        Thread.sleep(2000);







        // selectori
        // ID -> #id¯
        // css -> .numeClasei (daca sunt spatii libere, le inlocuiti cu.
        // ex css : .card mt-4 top-card -> .card.mt-4.top-card
        // Xpath -> //tag[@atribut='valoare']
        // ex xpath: //a[@target='_blank'],//div[@class='card mt-4 top-card'])[2]
        // tagname  -> tagName
//
//
//        WebElement forms = driver.findElement(By.xpath("(//div[@class='card mt-4 top-card'])[2]"));
//        WebElement footer = driver.findElement(By.tagName("footer"));
//        String footerMsg = footer.getText();
//
//        System.out.println(footerMsg);
////        forms.click();
//        driver.quit();











    }
}
