package org.skillbrain;

import Utilities.Utils;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import java.io.IOException;

public class ExceptionTest extends Utils {

    private static ChromeDriver driver;// declar fara initializare obiectul "driver"
           public int a =10;// ca exemplu
       private  String b = "20"; // ca exemplu
    public static void main(String[] args)  {
        System.setProperty("webdriver.chrome.driver ", "drivers/chromedriver.exe ");
        driver =new ChromeDriver();// initializare

        try {

           driver.manage().window().maximize();
           driver.get("https://demoqa.com/buttons");
           takeScreenshot(driver);
           Actions actions = new Actions(driver);
           WebElement rightClickMe = driver.findElement(By.id("rightClickBtn"));
           actions.click(rightClickMe).build().perform();
           String message =driver.findElement(By.tagName("p")).getText();
           throwError();
           System.out.println(message);

       } catch (Exception exception){
           System.out.println(exception.getMessage());
           takeScreenshot(driver);
       }finally {
            takeScreenshot(driver);
         //   Thread.sleep(2000);
           driver.quit();
       }


         // prinsa la conpilare
         // throw new RuntimeException("RuntimeException");

        // prinsa dupa conpilare(metoda prinde viata/sens/forma abia dupa ce se conpileaza codul)
          // throwError();










         //      try {
//            findfile("home");
            //throw new IOException();
//        } catch (IOException e) {
//            System.out.println("Am prins eroarea");
            //driver.quit();
//            System.out.println(e.getMessage());
        //   e.printStackTrace();
//      }
    }
    public static void findfile(String location)throws IOException {
        throw new IOException("Throwing new IOException");
    }

    public static void throwError(){

    }



















}