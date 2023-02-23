package org.skillbrain.Tema6;

import Utilities.Utils;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import java.io.IOException;

public class HerokuAlerts extends Utils {

    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        Actions actions = new Actions(driver);
        driver.get("https://testpages.herokuapp.com/styled/index.html");

        try {

            actions.moveToElement(driver.findElement(By.xpath("//a[@id='htmlformtest']")));
            actions.perform();

            driver.findElement(By.xpath("//a[@id='htmlformtest']")).click();
            driver.findElement(By.xpath("//input[@name='username']")).sendKeys("lucian");
            driver.findElement(By.xpath("//input[@name='password']")).sendKeys("pass12345");
            driver.findElement(By.xpath("//textarea[@name='comments']")).sendKeys("something");
            driver.findElement(By.xpath("//input[@value='cb2']")).click();
            driver.findElement(By.xpath("//input[@value='cb1']")).click();
            actions.moveToElement(driver.findElement(By.xpath("//input[@value='rd1']")));
            actions.perform();
            driver.findElement(By.xpath("//input[@value='rd1']")).click();
            actions.moveToElement(driver.findElement(By.xpath("//option[@value='ms1']")));
            actions.perform();
            driver.findElement(By.xpath("//option[@value='ms1']")).click();
            actions.moveToElement(driver.findElement(By.xpath("//select[@name='dropdown']")));
            actions.perform();
            driver.findElement(By.xpath("//select[@name='dropdown']")).click();
            actions.moveToElement(driver.findElement(By.xpath("//input[@value='submit']")));
            actions.perform();
            driver.findElement(By.xpath("//input[@value='submit']")).click();

            System.out.println(driver.findElement(By.cssSelector("div[class='explanation'] p")).getText());
            System.out.println(driver.findElement(By.cssSelector("#_valueusername")).getText());
            System.out.println(driver.findElement(By.cssSelector("#_valuepassword")).getText());
            System.out.println(driver.findElement(By.cssSelector("#_valuecomments")).getText());
            System.out.println(driver.findElement(By.cssSelector("#_valuecheckboxes0")).getText());
            System.out.println(driver.findElement(By.cssSelector("#_valuemultipleselect0")).getText());

            driver.findElement(By.cssSelector("#back_to_form")).click();


            driver.findElement(By.id("inexistent"));

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
