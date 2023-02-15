package org.skillbrain.Tema5.Demoqa;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class Links {
    public static void main(String[] args) throws Exception{

        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
        ChromeDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://demoqa.com/links");
        Thread.sleep(2000);
        WebElement homeLink = driver.findElement(By.id("simpleLink"));
        System.out.println("Home link displays:  " + homeLink.getText());
        homeLink.click();
        Thread.sleep(2000);
        WebElement homeZu8bgLink = driver.findElement(By.id("dynamicLink"));
        System.out.println("HomeZU8BG link displays:  " + homeZu8bgLink.getText());
        homeZu8bgLink.click();
        Thread.sleep(2000);
        WebElement createdLink = driver.findElement(By.id("created"));
        System.out.println("Created link displays:  " + createdLink.getText());
        createdLink.click();
        Thread.sleep(2000);
        WebElement nocontentLink = driver.findElement(By.id("no-content"));
        System.out.println("No Content link displays:  " + nocontentLink.getText());
        nocontentLink.click();
        Thread.sleep(2000);
        WebElement movedLink = driver.findElement(By.id("moved"));
        System.out.println("Moved link displays:  " + movedLink.getText());
        movedLink.click();
        Thread.sleep(2000);
        WebElement badRequestLink = driver.findElement(By.id("bad-request"));
        System.out.println("Bad Request link displays:  " + badRequestLink.getText());
        badRequestLink.click();
        Thread.sleep(2000);
        WebElement unauthorizedLink = driver.findElement(By.id("unauthorized"));
        System.out.println("Unauthorized link displays:  " + unauthorizedLink.getText());
        unauthorizedLink.click();
        Thread.sleep(2000);
        WebElement forbiddenLink = driver.findElement(By.id("forbidden"));
        System.out.println("Forbidden link displays:  " + forbiddenLink.getText());
        forbiddenLink.click();
        Thread.sleep(2000);
        WebElement notFoundLink = driver.findElement(By.id("invalid-url"));
        System.out.println("Not found link displays:  " + notFoundLink.getText());
        notFoundLink.click();
        Thread.sleep(2000);
        driver.quit();
    }
}