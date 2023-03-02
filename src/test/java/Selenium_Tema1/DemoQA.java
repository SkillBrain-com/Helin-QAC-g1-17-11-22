package Selenium_Tema1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DemoQA {

    public static void main(String[] args) throws Exception {
        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
        ChromeDriver driver = new ChromeDriver();
//        driver.get("https://demoqa.com/elements");
//        // localizare Full Name TextBox de la tabul textBox
//        WebElement textbox = driver.findElement(By.xpath("//div[@class='element-list collapse show']//li[@id='item-0']"));
//        textbox.click();
//        WebElement FullName = driver.findElement(By.xpath("//label[@id='userName-label']"));
//        System.out.println("Campul 1 din TextBox est: " + FullName.getText());
//       // driver.quit();
//
//        // CheckBox
//        driver.get("https://demoqa.com/elements");
//        WebElement checkBox = driver.findElement(By.xpath("//div[@class='element-list collapse show']//li[@id='item-1']"));
//        checkBox.click();
//        checkBox = driver.findElement(By.xpath("//span[@class='rct-checkbox']//*[name()='svg']"));
//        checkBox.click();
//        checkBox = driver.findElement(By.cssSelector("#result"));
//        System.out.println("Textul afisat la bifarea casute este: " + checkBox.getText());
//       // driver.quit();

        //Links

        driver.manage().window().maximize();
        driver.get("https://demoqa.com/links");
        Thread.sleep(2000);
        WebElement firstLink = driver.findElement(By.id("simpleLink"));
        System.out.println("First link displays:  " + firstLink.getText());
        firstLink.click();
        Thread.sleep(2000);
        WebElement secondLink = driver.findElement(By.id("dynamicLink"));
        System.out.println("Second link  displays:  " + secondLink.getText());
        secondLink.click();
        driver.quit();





    }
}
