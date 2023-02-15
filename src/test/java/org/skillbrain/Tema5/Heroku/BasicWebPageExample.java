package org.skillbrain.Tema5.Heroku;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BasicWebPageExample {
    public static void main(String[] args) throws Exception {
        landOnBasicWebPageExample();
    }

    public static void landOnBasicWebPageExample() throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
        ChromeDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get ("https://testpages.herokuapp.com/styled/index.html");
        WebElement firstLink = driver.findElement(By.id("basicpagetest"));
        System.out.println("First link displays:  " + firstLink.getText());
        firstLink.click();
        WebElement getFirstPara = driver.findElement(By.className("explanation"));
        System.out.println("First paragraph:  " + getFirstPara.getText());
        WebElement getMiddlePara = driver.findElement(By.id("para1"));
        System.out.println("Middle paragraph:  " + getMiddlePara.getText());
        WebElement getLastPara = driver.findElement(By.cssSelector("p#para2.sub"));
        System.out.println("First paragraph:  " + getLastPara.getText());
        WebElement bottomLink1 = driver.findElement(By.linkText("EvilTester.com"));
        bottomLink1.click();
        Thread.sleep(2000);
        WebElement bottomLink2 = driver.findElement(By.linkText("Compendium Developments"));
        bottomLink2.click();
        Thread.sleep(2000);
        WebElement returnToIndex = driver.findElement(By.linkText("Index"));
        returnToIndex.click();
        Thread.sleep(2000);
        driver.quit();
    }
}
