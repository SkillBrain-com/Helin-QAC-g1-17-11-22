package org.skillbrain.Tema6;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import java.io.IOException;

import static Utilities.Utils.takeScreenshot;

public class HerokuForms {

    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        Actions actions = new Actions(driver);
        driver.get("https://testpages.herokuapp.com/styled/index.html");
        try {
            actions.moveToElement(driver.findElement(By.xpath("//a[@id='alerttest']")));
            actions.perform();
            driver.findElement(By.xpath("//a[@id='alerttest']")).click();
            driver.findElement(By.xpath("//input[@id='alertexamples']")).click();
            Alert alert = driver.switchTo().alert();
            alert.accept();
            driver.findElement(By.xpath("//input[@id='confirmexample']")).click();
            alert.accept();
            System.out.println(driver.findElement(By.xpath("//p[@id='confirmexplanation']")).getText());
            actions.moveToElement(driver.findElement(By.xpath("//input[@id='promptexample']")));
            driver.findElement(By.xpath("//input[@id='promptexample']")).click();
            alert.sendKeys("Selenium Test");
            alert.accept();
            System.out.println(driver.findElement(By.xpath("//p[@id='promptexplanation']")).getText());


            driver.findElement(By.id("fake-element"));



        } catch (Exception e) {

            try {
                takeScreenshot(driver);
            } catch (IOException io) {
                System.out.println(io.getMessage());
            }
        } finally {
            driver.quit();
        }
    }
}
