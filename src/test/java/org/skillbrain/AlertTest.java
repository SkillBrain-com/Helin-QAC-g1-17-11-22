package org.skillbrain;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.IOException;

import static Utilities.Utils.takeScreenshot;

public class AlertTest {
    private static ChromeDriver driver;
    public static void main(String[] args) throws IOException{

            System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
            driver = new ChromeDriver();
            try {
                driver.manage().window().maximize();
                driver.get("https://demoqa.com/alerts");
                driver.findElement(By.id("confirmButton"));
                // schimbati focusul pe fereastra de alerta
                Alert alert = driver.switchTo().alert();
                Thread.sleep(2000);
                // accept = OK    dismiss = cancel
                alert.dismiss();
                System.out.println(driver.findElement(By.id("confirmResult")).getText());
                Thread.sleep(2000);

            }catch (Exception exception){
                System.out.println(exception.getMessage());
                takeScreenshot(driver);
            }finally {
                driver.quit();
            }

    }

}


