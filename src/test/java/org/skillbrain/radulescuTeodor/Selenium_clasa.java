package org.skillbrain.radulescuTeodor;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class Selenium_clasa {

    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","drivers/chromedriver.exe");
        ChromeDriver driver = new ChromeDriver();
        //maximizeaza fereastra
        //driver.manage().window().maximize();
        driver.get("https://demoqa.com/");
        // localizez hedear 1
        WebElement forms = driver.findElement(By.tagName("header"));
        forms.click();
        Thread.sleep(2000);
        WebElement elements =driver.findElement(By.cssSelector(".card.mt-4.top-card"));
        Thread.sleep(2000);
        elements.click();
        WebElement textBox =driver.findElement(By.id("item-0"));
        textBox.click();
        Thread.sleep(2000);
        driver.findElement(By.id("userName")).sendKeys("Dana Catavei");
        driver.findElement(By.id("userEmail")).sendKeys("email@yahoo.com");
        driver.findElement(By.id("currentAddress")).sendKeys("Bucuresti");
        driver.findElement(By.id("permanentAddress")).sendKeys("Home");

        //Actions actions = new Actions(driver);
        WebElement submitButton =  driver.findElement(By.cssSelector(".btn.btn-primary"));
        //actions.moveToElement(submitButton).perform();
        driver.executeScript("arguments[0].scrollIntoView(true);", submitButton);
        Thread.sleep(2000);
        submitButton.click();
        Thread.sleep(2000);
        //List<WebElement> mbElement =driver.findElements(By.cssSelector(".mb-1"));
        List<WebElement> mbElement =driver.findElements(By.tagName("p"));
        for (int i=0; i<mbElement.size(); i++){
            System.out.println(mbElement.get(i).getText());
        }
//de veificat..
//        driver.findElement(By.xpath("(//li[@id='item-1'])[1]"));
//        driver.findElement(By.cssSelector(".rct-icon.rct-icon-expand-close")).click();
//
//        driver.findElement(By.xpath("//label[@for='tree-node-desktop']//span[@class='rct-checkbox']//*[name()='svg']")).click();
//
//        //driver.findElement(By.id("result").getText();
//        System.out.println(driver.findElement(By.id("result")).getText());

        driver.findElement(By.xpath("(//li[@id='item-1'])[1]")).click();
        Thread.sleep(2000);
        driver.findElement(By.cssSelector(".rct-icon.rct-icon-expand-close")).click();
        driver.findElement(By.xpath("//label[@for='tree-node-desktop']//span[@class='rct-checkbox']//*[name()='svg']")).click();
        Thread.sleep(2000);
        System.out.println(driver.findElement(By.id("result")).getText());
        Thread.sleep(2000);
        ///radio button
        driver.findElement(By.xpath("(//li[@id='item-2'])[1]")).click();
        driver.findElement(By.xpath("(//label[@class='custom-control-label'])[1]")).click();
        Thread.sleep(3000);
        String radioButtonResult = driver.findElement(By.tagName("p")).getText().trim();
        boolean isYes = radioButtonResult.equals("You have selected Yes");
        System.out.println(radioButtonResult);
        System.out.println("Result is "+isYes);

        driver.quit();

    }
}
