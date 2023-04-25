package Selenium_Tema2;

import Utilities.Utils;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;

import java.io.IOException;


public class Alerts extends Utils {
    public static void main(String[] args) throws IOException {
        WebDriver driver = getChromeDriver();
        Actions actions = new Actions(driver);
        driver.manage().window().maximize();
        driver.get("https://testpages.herokuapp.com/styled/index.html");

        try{
            actions.moveToElement(driver.findElement(By.xpath("//a[@id='alerttest']")));
            actions.perform();
            driver.findElement(By.xpath("//a[@id='alerttest']")).click();
            driver.findElement(By.xpath("//input[@id='alertexamples']")).click();
            Alert alert = driver.switchTo().alert();
            alert.accept();
            driver.findElement(By.xpath("//input[@id='confirmexample']")).click();
            alert.dismiss();
            System.out.println(driver.findElement(By.xpath("//p[@id='confirmexplanation']")).getText());
            actions.moveToElement(driver.findElement(By.xpath("//input[@id='promptexample']")));
            driver.findElement(By.xpath("//input[@id='promptexample']")).click();
            alert.sendKeys("Test");
            alert.accept();
            System.out.println(driver.findElement(By.xpath("//p[@id='promptexplanation']")).getText());
            // Se incearca localizarea unui element care nu exista pe pagina [entru a prinde eroarea
            driver.findElement(By.xpath("element")).click();


        }
        catch (Exception e) {
            try{
                takeScreenshot(driver);
            }
            catch (IOException exception){
                System.out.println(exception.getMessage());
            }

        }
        finally{

            driver.quit();
        }


    }






}
