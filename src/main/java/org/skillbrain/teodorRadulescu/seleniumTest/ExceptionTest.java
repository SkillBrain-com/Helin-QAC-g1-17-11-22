package org.skillbrain.teodorRadulescu.seleniumTest;

import Utilities.Utils;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import java.io.IOException;

public class ExceptionTest extends Utils {
    private static ChromeDriver driver; // declar fara intilializare
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
        driver = new ChromeDriver(); // initializare

        try {

            //maximizeaza fereastra
            //driver.manage().window().maximize();
            driver.get("https://demoqa.com/buttons");
            takeScreenshot(driver);
            Actions actions = new Actions(driver);

            WebElement rightClickMe = driver.findElement(By.xpath("//button[normalize-space()='Right Click Me']"));
            actions.contextClick(rightClickMe).build().perform();
            String message3 = driver.findElement(By.tagName("p")).getText();
            System.out.println(message3);
            Thread.sleep(3000);
        }
        catch (Exception e){
            System.out.println(e.getMessage());
//            takeScreenshot(driver);
        }
        finally{
            driver.quit();

//            takeScreenshot(driver);
    }



       // throw new RuntimeException("Am picat la executie");
//        try {
//            findFile("Home");
//        } catch (IOException e) {
//            throw new RuntimeException(e);
//        }

    }


    public static void findFile(String location) throws IOException {

        //System.out.println("metoda functioneaza");
        throw new IOException();

    }

    public static void  throwError(){
        throw new RuntimeException("Runtime Error");

    }
}
