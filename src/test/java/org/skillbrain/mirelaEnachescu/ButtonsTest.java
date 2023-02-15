package org.skillbrain.mirelaEnachescu;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ButtonsTest {

    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver" , "drivers/chromedriver");
        ChromeDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://demoqa.com/buttons");
        // test click me
//        WebElement clickMe = driver.findElement(By.xpath("//button[normalize-space()='Click Me']"));
//        clickMe.click();
        // double click me
//        WebElement doubleCLickMe = driver.findElement(By.id("doubleClickBtn"));
//        Actions actions = new Actions(driver);
//        actions.doubleClick().build().perform();
        // right click me
        Actions actions = new Actions(driver);
        WebElement rightClickMe = driver.findElement(By.id("rightClickBtn"));
        actions.contextClick(rightClickMe).build().perform();
        String message = driver.findElement(By.tagName("p")).getText();
        Thread.sleep(3000);
        System.out.println(message);


        driver.quit();

    }
}
