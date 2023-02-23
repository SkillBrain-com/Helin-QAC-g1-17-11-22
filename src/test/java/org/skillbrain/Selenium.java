package org.skillbrain;

import Utilities.Utils;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Selenium extends Utils {
    public static void main(String[] args) throws Exception {
        // Unde se afla ChromeDriver?
        System.setProperty("webdriver.chrome.driver","drivers/chromedriver.exe");
        ChromeDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        // WebDriver driver = new ChromeDriver(); legal
//        driver.get("https://demoqa.com/");
//        WebElement header = driver.findElement(By.tagName("header"));
//        WebElement elements = driver.findElement(By.cssSelector(".card.mt-4.top-card"));
//        //Thread.sleep(2000);
//        elements.click();
//        WebElement textBox = driver.findElement(By.id("item-0"));
//        textBox.click();
//        //Thread.sleep(2000);
//        // pentru a nu creea un element webElement putem folosi :
//        driver.findElement(By.id("userName")).sendKeys("iuliana olaru");
//        driver.findElement(By.id("userEmail")).sendKeys("email@email.com");
//        driver.findElement(By.id("currentAddress")).sendKeys("home");
//        driver.findElement(By.id("permanentAddress")).sendKeys("Home");
//        Actions action = new Actions(driver);
//        WebElement submitBtn = driver.findElement(By.cssSelector(".btn.btn-primary"));
//        driver.executeScript("arguments[0].scrollIntoView(true);", submitBtn);
//        //action.moveToElement(submitBtn).build().perform();
//        //Thread.sleep(2000);
//        submitBtn.click();
//        List<WebElement> mbElements = driver.findElements(By.cssSelector(".mb-1"));
//        for (int i = 0; i < mbElements.size(); i++){
//            System.out.println(mbElements.get(i).getText());
//        }
//
//
//        driver.findElement(By.xpath("(//li[@id='item-1'])[1] ")).click();
////        Thread.sleep(2000);
//        driver.findElement(By.cssSelector(".rct-icon.rct-icon-expand-close")).click();
//        driver.findElement(By.xpath("//label[@for='tree-node-desktop']//span[@class='rct-checkbox']//*[name()='svg']")).click();
////        Thread.sleep(2000);
//        System.out.println(driver.findElement(By.id("result")).getText());
//        Thread.sleep(2000);
//        driver.findElement(By.xpath("(//li[@id='item-2'])[1]")).click();
//        Thread.sleep(2000);
//        driver.findElement(By.xpath("(//label[@class='custom-control-label'])[1]")).click();
//        Thread.sleep(2000);
//        String radioBtnMsgRes = driver.findElement(By.tagName("p")).getText().trim();
//        System.out.println(radioBtnMsgRes);
//        boolean isYes = radioBtnMsgRes.equals("You have selected Yes");
//        System.out.println("Result is " + isYes);

        // test click me!!!
        driver.get("https://demoqa.com/buttons");
        //WebElement clickMe = driver.findElement(By.xpath("(//button[normalize-space()='Click Me'])"));
//        clickMe.click();
//        String msg = driver.findElement(By.tagName("p")).getText();
//        System.out.println(msg);

        // test double click me!!!
//        WebElement doubleClickMe = driver.findElement(By.id("doubleClickBtn"));
//        Actions actions = new Actions(driver);
//        actions.doubleClick(doubleClickMe).build().perform();
//        String msg = driver.findElement(By.tagName("p")).getText();
//        System.out.println(msg);

        // test right click me
        WebElement rightClickMe = driver.findElement(By.id("rightClickBtn"));
        Actions actions = new Actions(driver);
        actions.contextClick(rightClickMe).build().perform();
        String msg = driver.findElement(By.tagName("p")).getText();
        System.out.println(msg);
//        takeScreeshot(driver);

        driver.quit();

        //header.click();
        //Thread.sleep(2000);
        // selectori
        // ID:  #ID
        // CSS: .numeClasa (daca exista spatii libere punem punct)
        // ec css: card mt-4
        // Xpath -> //tag[@atribut='valoare'], //div[@class='card mt-4 top-card'])[2]
        //ex
//        WebElement forms = driver.findElement(By.xpath("(//div[@class='card mt-4 top-card'])[2]"));
//        WebElement footer = driver.findElement(By.tagName("footer"));
//
//        String footerMsg = footer.getText();
//
//        System.out.println(footer.getText());
        //forms.click();

        //driver.quit();



    }
}
