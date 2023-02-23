package org.skillbrain;

import Utilities.Utils;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertTest extends Utils {

    private static ChromeDriver driver;

    public static void main(String[] args)  {

        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
        driver = new ChromeDriver();

        try {

            driver.manage().window().maximize();
            driver.get("https://demoqa.com/alerts");

            // first alert
//            driver.findElement(By.id("alertButton")).click();
//            Alert alert = driver.switchTo().alert();
////          Thread.sleep(2000);
////          accept = Ok, decline = Cancel
//            alert.accept();
//            takeScreeshot(driver);

            // second alert
//            driver.findElement(By.id("timerAlertButton")).click();
//            Thread.sleep(6000);
//            Alert alert1 = driver.switchTo().alert();
//            alert1.accept();

            // third alert
//            driver.findElement(By.id("confirmButton")).click();
//            Alert alert2 = driver.switchTo().alert();
//            alert2.dismiss();
//            String msg2 = driver.findElement(By.xpath("//span[@id='confirmResult']")).getText();
//            System.out.println(msg2);

            // forth alert
            driver.findElement(By.id("promtButton")).click();
            Alert alert3 = driver.switchTo().alert();
//            driver.findElement(By.id("userName")).sendKeys("iuliana olaru");
            alert3.sendKeys("Yes");
            alert3.accept();
            String msg3 = driver.findElement(By.xpath("(//span[@id='promptResult'])")).getText();
            System.out.println(msg3);


        } catch (Exception e){
            System.out.println(e.getMessage());
        } finally {
            driver.quit();
        }


}
}
