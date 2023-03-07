package org.skillbrain;


import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import static Utilities.Utils.takeScreenshot;

public class AlertTest {

    public static ChromeDriver driver;


    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver ", "drivers/chromedriver.exe ");
        driver =new ChromeDriver();// initializare
        try {
            System.out.println(System.getProperty("user.dir"));
            driver.manage().window().maximize();
            driver.get("https://demoqa.com/alerts");
            // test 1
            //   driver.findElement(By.id("alertButton")).click();

            //test 2
            //    driver.findElement(By.id("confirmButton")).click();

            // test 3
            //  driver.findElement(By.id("timerAlertButton"));
            //  Thread.sleep(5000);

            // testul 4
            driver.findElement(By.id("promtButton"));

            // schimbati focus-ul pe fereastra de alerta
            Alert alert = driver.switchTo().alert();
            takeScreenshot(driver);
            Thread.sleep(2000);
            // test 1
            //   alert.accept(); // accept = OK; dismiss = Cancel;

            // test 2
            //    alert.dismiss();

            // test 3
            //    alert.accept();

            // Test 4
            alert.sendKeys("Selenium Test");
            Thread.sleep(6000);
            System.out.println(driver.findElement(By.id("promptResult")).getText());


            //    System.out.println(driver.findElement(By.id("confirmResult")).getText());
        } catch (Exception exception){
            System.out.println(exception.getMessage());
            takeScreenshot(driver);
        }finally {
            takeScreenshot(driver);
            driver.quit();
        }


    }




}
