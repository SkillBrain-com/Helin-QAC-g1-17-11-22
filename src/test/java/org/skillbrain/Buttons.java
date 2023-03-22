package org.skillbrain;

import Utilities.Utils;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Buttons extends Utils {

    public static void main(String[] args) {
        WebDriver driver = getChromeDriver();

        System.setProperty("webdriver.chrome.driver ", "drivers/chromedriver.exe ");
        WebDriver driver1 = new ChromeDriver();
        driver.get("https://demoqa.com/buttons");
        WebElement doubleClickMe = driver.findElement(By.id("doubleClickBtn"));
        doubleClickMe.click();
        System.out.println("Clicked on Double Click me button and text shown is: " +doubleClickMe.getText());
        WebElement rightClickMe = driver.findElement(By.id("rightClickBtn"));
        rightClickMe.click();
        System.out.println("Clicked on Right Click me button the text shows: " +rightClickMe.getText());
        WebElement clickMeClickMe =driver.findElement(By.xpath("//div[3]/button"));
        clickMeClickMe.click();
        System.out.println("Clicked on  Click me button and text shown is: " +clickMeClickMe.getText());


            driver.quit();



    }
}
