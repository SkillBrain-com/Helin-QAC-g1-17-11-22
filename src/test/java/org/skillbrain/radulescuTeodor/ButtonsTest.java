package org.skillbrain.radulescuTeodor;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ButtonsTest {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
        ChromeDriver driver = new ChromeDriver();
        //maximizeaza fereastra
        //driver.manage().window().maximize();
        driver.get("https://demoqa.com/buttons");

        //WebElement clickMe = driver.findElement(By.id("xJHdZ")); // id dinamic. se schimba denumirea de fiecare data cand este apelat
        //test click me
        WebElement clickMe = driver.findElement(By.xpath("//button[normalize-space()='Click Me']"));
        clickMe.click();
        Thread.sleep(2000);
        //captez mesajul afisat in browser la click-ul butonului
        String message = driver.findElement(By.tagName("p")).getText();
        System.out.println(message);
        //click double Click
        WebElement doubleClickMe = driver.findElement(By.xpath("//button[normalize-space()='Double Click Me']"));
        //driver.findElement(By.id("doubleClickBtn"))
        Actions actions = new Actions(driver);
        actions.doubleClick(doubleClickMe).build().perform();

        Thread.sleep(2000);
        //captez mesajul afisat in browser la click-ul butonului
        String message2 = driver.findElement(By.tagName("p")).getText();
        System.out.println(message2);

        //right click me
        WebElement rightClickMe = driver.findElement(By.xpath("//button[normalize-space()='Right Click Me']"));
        actions.contextClick(rightClickMe).build().perform();
        String message3 = driver.findElement(By.tagName("p")).getText();
        System.out.println(message3);
        Thread.sleep(3000);
        driver.quit();
    }
}
