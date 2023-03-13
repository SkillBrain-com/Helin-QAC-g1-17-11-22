package org.skillbrain.Tema5.Demoqa;
import org.skillbrain.Tema7.Utils;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Buttons extends Utils {
    public static void main(String[] args) throws Exception {
        clickButtons();
    }

    public static void clickButtons() throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
        ChromeDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://demoqa.com/buttons");
        WebElement doubleClickMe = driver.findElement(By.id("doubleClickBtn"));
        doubleClickMe.click();
        System.out.println("Clicked on Double Click me button and text shown is: " + doubleClickMe.getText());
        Thread.sleep(2000);
        WebElement rightClickMe = driver.findElement(By.id("rightClickBtn"));
        rightClickMe.click();
        System.out.println("Clicked on Right Click me button the text shows: " + rightClickMe.getText());
        Thread.sleep(2000);
        WebElement clickMeClickMe = driver.findElement(By.xpath("//div[3]/button"));
        clickMeClickMe.click();
        System.out.println("Clicked on  Click me button and text shown is: " + clickMeClickMe.getText());
        Thread.sleep(2000);
        driver.quit();
    }
}