package org.skillbrain.Tema5;

//  import jdk.internal.org.jline.terminal.Terminal;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.LocalDateTime;
import java.io.IOException;
import java.util.List;
import java.io.File;

public class Selenium2punct2 {
    private static ChromeDriver driver;
    public static void main(String[] args)   throws IOException  {

           { try {
            System.setProperty("Chromedriver.chrome.driver"," .idea/drivers/chromedriver.exe");
            ChromeDriver driver=new ChromeDriver();
            driver=new ChromeDriver();
            driver.get("https://testpages.herokuapp.com/styled/basic-html-form-test.html ");

               WebElement username= driver.findElement(By.name(" username"));
                WebElement password=driver.findElement(By.name(" password"));
                WebElement comment=driver.findElement(By.name(" comment" ));
               List< WebElement> checkboxes =driver.findElements(By.name(" checkboxes"));
                List< WebElement>radioButtons=driver.findElements(By.name(" radioval"));
                 username.sendKeys( "gabrielajitea77@gmail.com");
                password.sendKeys( "Adddddddddd");
                comment.clear();
                comment.sendKeys(" Acesta este comment ul meu");

                checkboxes.get(1).click();
                radioButtons.get(2).click();
               driver.quit();

               } catch (Exception e) {
             throw new RuntimeException(e);
           }  {

               if (driver!=null){
                      File file=driver.getScreenshotAs(OutputType.FILE);

                    };
                   String destinationFile = null;
                   TakesScreenshot screenshot =  (TakesScreenshot) driver;
                   File source = screenshot.getScreenshotAs(OutputType.FILE);
                   destinationFile = System.getProperty("user.dir");

                   destinationFile= System.getProperty("user.dir")+"C:\\Users\\stelu\\IdeaProjects\\Helin-QAC-g1-17-11-22\\imagine.png"
                           + "/Logs/printScreen-" + LocalDateTime.now() + ".png";

                        try {
                            FileUtils.copyFile(source, new File(destinationFile));
                        }catch (IOException ex){
                            System.out.println("Screenshot copy filed");
                        }


                System.out.println("Driver instance failed to creat succeessfuly. ");
                 }
                 {if (driver!=null){
             driver.quit();
         }

        }
 }

   }     }