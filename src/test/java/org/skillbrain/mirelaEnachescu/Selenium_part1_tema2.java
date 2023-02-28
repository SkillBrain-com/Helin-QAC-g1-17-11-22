package org.skillbrain.mirelaEnachescu;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class Selenium_part1_tema2 {

    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver");
        ChromeDriver driver = new ChromeDriver();
        driver.get("https://demoqa.com/text-box");

        WebElement footer = driver.findElement(By.tagName("footer"));
        String footerMsg = footer.getText();
        System.out.println(footer.getText());

        //Text Box
        WebElement TextBox = driver.findElement(By.xpath("(//li[@id='item-0'])[1]"));
        TextBox.click();
        WebElement header = driver.findElement(By.xpath("//div[@class='main-header']"));
        String headerMsg = header.getText();
        System.out.println(header.getText());

        driver.findElement(By.id("userName")).sendKeys("mirela enachescu");
        driver.findElement(By.id("userEmail")).sendKeys("email@gmail.com");
        driver.findElement(By.id("currentAddress")).sendKeys("Home");
        driver.findElement(By.id("permanentAddress")).sendKeys("Home");
        WebElement Submit = driver.findElement(By.id("submit"));
        driver.executeScript("arguments[0].scrollIntoView(true);", Submit); //optional...
        Submit.click();
        //...optional...
        List<WebElement> mbElements = driver.findElements(By.tagName("p"));
        for (int i= 0; i <mbElements.size(); i++) {
            System.out.println(mbElements.get(i).getText());
        }///...optional scriere in terminal a datelor completate in textbox-uri


        //Check Box
        WebElement CheckBox = driver.findElement(By.xpath("(//li[@id='item-1'])[1]"));
        CheckBox.click();
        System.out.println(header.getText());


        //Radio Button
        WebElement RadioButton = driver.findElement(By.xpath("(//li[@id='item-2'])[1]"));
        RadioButton.click();
        System.out.println(header.getText());

        WebElement YesLabel= driver.findElement(By.xpath("(//label[@class='custom-control-label'])[1]"));
        WebElement ImpressiveLabel  = driver.findElement(By.xpath("(//label[@class='custom-control-label'])[2]"));
        YesLabel.click();
        ImpressiveLabel.click();


        //Web Tables
        WebElement WebTables = driver.findElement(By.xpath("(//li[@id='item-3'])[1]"));
        WebTables.click();
        System.out.println(header.getText());

        WebElement DeleteBtn = driver.findElement(By.xpath("(//button[@type='button'])[4]"));
        DeleteBtn.click();



        //Buttons
        WebElement Buttons = driver.findElement(By.xpath("(//li[@id='item-4'])[1]"));
        Buttons.click();
        System.out.println(header.getText());

        WebElement DoubleClickMe = driver.findElement(By.id("doubleClickBtn"));
        WebElement RightClickMe = driver.findElement(By.id("rightClickBtn"));
        WebElement ClickMe = driver.findElement(By.xpath("(//button[@type='button'])[4]"));
        DoubleClickMe.click();
        DoubleClickMe.click();
        RightClickMe.click();
        ClickMe.click();


        //Links
        WebElement Links = driver.findElement(By.xpath("(//li[@id='item-5'])[1]"));
        Links.click();
        System.out.println(header.getText());

        WebElement LinkHome = driver.findElement(By.xpath("(//a[@target='_blank'])[1]"));
        WebElement LinkHometHRhr = driver.findElement(By.xpath("(//a[@target='_blank'])[2]"));
        LinkHome.click();
        LinkHometHRhr.click();


        driver.quit();

    }
}
