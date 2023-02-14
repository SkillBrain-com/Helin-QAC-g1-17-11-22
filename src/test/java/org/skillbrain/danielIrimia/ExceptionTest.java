package org.skillbrain.danielIrimia;

import Utilities.Utils;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import java.io.IOException;

// JDBC

public class ExceptionTest extends Utils {

    private static ChromeDriver driver; // declar fara initializare

    public static void main(String[] args) throws Exception {
        System.setProperty("webdriver.chrome.driver" , "drivers/chromedriver");
        driver = new ChromeDriver();  // initilizare
        try {
            System.out.println(System.getProperty("user.dir"));
            driver.manage().window().maximize();
            driver.get("https://demoqa.com/buttons");
            takeScreenshot(driver);
            Actions actions = new Actions(driver);
            WebElement rightClickMe = driver.findElement(By.id("rightClickBtn"));
            actions.contextClick(rightClickMe).build().perform();
            String message = driver.findElement(By.tagName("p")).getText(); // selector gresit
            Thread.sleep(3000);
            System.out.println(message);
        } catch (Exception exception) {
            System.out.println(exception.getMessage());
        } finally {
            takeScreenshot(driver);
            driver.quit();
        }




        // prinsa la compilare
//        throw new RuntimeException("RuntimeException");
        // prinsa dupa compilare (metoda prinde viata/sens/forma abia dupa ce se compileaza codul)




    }


    public static void findFile(String location) throws IOException {
        throw new IOException("Throwing new IOException");
    }

    public static void throwError() {
        throw new RuntimeException("RuntimeException");
    }









}
