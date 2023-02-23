package org.skillbrain.Tema4;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.File;
import java.time.LocalDateTime;

public class Selenium2punct3 {
    public static void main(String[] args) throws Exception {
        System.setProperty("Chromedriver.chrome.driver"," .idea/drivers/chromedriver.exe");
        ChromeDriver driver=new ChromeDriver();

        try {


        driver.get("https://demoqa.com/browser-windows ");
        WebElement element=driver.findElement(By.id("app"));
        System.out.println("app");
        element.click();
        WebElement element1=driver.findElement(By.xpath(" //div[@id='fixedban']" ));
        System.out.println(" //div[@id='fixedban']");
        WebElement element2=driver.findElement(By.cssSelector("div.body-height "));
        System.out.println("div.body-height");

        driver.get("https://demoqa.com/checkbox ");
        WebElement element3=driver.findElement(By.id("fixedban"));
        System.out.println(" fixedban ");
        WebElement element4=driver.findElement(By.xpath(" //div[@id='app']"))  ;
        System.out.println(" //div[@id='app']");
        WebElement element5=driver.findElement(By.cssSelector("div.container.playgound-body"));
        System.out.println("div.container.playgound-body");

        driver.get("https://demoqa.com/radio-button ");
        WebElement element6=driver.findElement(By.cssSelector("div.container.playgound-body "));
        System.out.println("div.container.playgound-body ");
        WebElement element7=driver.findElement(By.id("app"));
        System.out.println("app ");
        WebElement footer=driver.findElement(By.tagName("footer"));
        System.out.println("footer");
        WebElement element8=driver.findElement(By.xpath(" //div[@class='body-height']"));
        System.out.println("//div[@class='body-height']");

        driver.get(" https://demoqa.com/webtables ");

        WebElement element9=driver.findElement(By.id("app"));
        System.out.println("app" );
        WebElement element10=driver.findElement(By.cssSelector("div.container.playgound-body "));
        System.out.println("div.container.playgound-body ");
        WebElement element11=driver.findElement(By.id("app"));
        System.out.println("app ");
        WebElement element12=driver.findElement(By.xpath(" //div[@class='body-height']"));
        System.out.println("//div[@class='body-height']");
        }catch (Exception e){
            String destinationFile = null;
            TakesScreenshot screenshot =  (TakesScreenshot) driver;
            File source = screenshot.getScreenshotAs(OutputType.FILE);
            destinationFile = System.getProperty("user.dir");

            destinationFile= System.getProperty("user.dir")+"C:\\Users\\stelu\\IdeaProjects\\Helin-QAC-g1-17-11-22\\imagine.png"
                    + "/Logs/printScreen-" + LocalDateTime.now() + ".png";
            FileUtils.copyFile(source, new File(destinationFile));

        }
        driver.quit();
    }

}


