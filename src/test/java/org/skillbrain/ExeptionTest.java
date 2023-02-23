package org.skillbrain;

import Utilities.Utils;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import java.io.IOException;

public class ExeptionTest extends Utils {

    private static ChromeDriver driver;   // declar fara initializare

    public static void main(String[] args) throws IOException {

        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
        driver = new ChromeDriver();    // aici initializez


        // ii zic lui java ca vreau sa imi execute codul
        try {

            driver.manage().window().maximize();
            driver.get("https://demoqa.com/buttons");
            //takeScreeshot(driver);
            WebElement rightClickMe = driver.findElement(By.id("rightClickBtn"));
            Actions actions = new Actions(driver);
            actions.contextClick(rightClickMe).build().perform();
            //String msg = driver.findElement(By.tagName("p")).getText();
            //ex:
            String msg = driver.findElement(By.tagName("p")).getText();
            Thread.sleep(2000);
            System.out.println(msg);
            // daca apare vreo eroare sa imi prinda eroarea
        } catch (Exception e){
            // si sa imi capturee mesajul
            System.out.println(e.getMessage());

        } finally {

            driver.quit();
        }




        // prinsa la compilare
        //throw new RuntimeException("RunTimmeException");

        // prinsa dupa compilare
        //throwError();











    }

    public static void findFile(String location) throws IOException{
        System.out.println("metoda functioneaza");
    }

    public static void throwError(){
        throw new RuntimeException("RunTimmeException");
    }
}
