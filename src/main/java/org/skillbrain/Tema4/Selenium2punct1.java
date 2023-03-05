package org.skillbrain.Tema4;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.w3c.dom.html.HTMLInputElement;

public class Selenium2punct1 {
    private static ChromeDriver driver; // declar fara initializare
    private static HTMLInputElement thirdButton;

    public static void main(String[] args) {
        try {
            System.setProperty("Chromedriver.chrome.driver", " .idea/drivers/chromedriver.exe");
            ChromeDriver driver = new ChromeDriver();
            driver = new ChromeDriver();
            driver.get("https://testpages.herokuapp.com/styled/alerts/alert-test.html ");
            WebElement fisrtButton = driver.findElement(By.id("alertexamples"));
            fisrtButton.click();
            System.out.println("alertexamples");
            Alert firstalert = driver.switchTo().alert();
            System.out.println(firstalert.getText());
            firstalert.accept();
            System.out.println("Is alert open after it has been closed :" + "isAlertOpened(driver)");


            WebElement secondButton = driver.findElement(By.id("confirmexample"));
            System.out.println(" confirmexample");
            secondButton.click();
            for (int i = 0; i <= 1; i++) {
            }
            System.out.println(" Is alert open after click button " + "isAlertOpened(driver)");
            Alert alert = driver.switchTo().alert();
            alert.accept();
            System.out.println(driver.findElement(By.id("confirmexplanation")).getText());
            System.out.println("Is alert open after it has been closed:" + "isAlertOpened(driver)");


            System.out.println("promptexample ");
            WebElement element = driver.findElement(By.xpath("//input[@id='promptexample']"));
            System.out.println(" promptreturn");
            WebElement element1 = driver.findElement(By.id("promptretval "));
            System.out.println("promptretval ");
            thirdButton.click();
            for (int i = 0; i <= 1; i++) {
            }
            System.out.println(driver.findElement(By.id(" promptreturn")).getText());

            Alert alert1 = driver.switchTo().alert();
            alert1.accept();

            System.out.println(driver.findElement(By.id("promptretval ")).getText());

            try {//  driver.manage().window().maximize();
                driver.get("https://testpages.herokuapp.com/styled/index.html ");//
                driver.findElement(By.id("alertButon")).click();
                Alert alert2 = driver.switchTo().alert();//  driver.findElement(By.id("prompButton")).click();

                driver.quit();
            } catch (Exception e) {

                throw new RuntimeException(e);
            }
        } finally {

        }
        driver.quit();
    }
}








