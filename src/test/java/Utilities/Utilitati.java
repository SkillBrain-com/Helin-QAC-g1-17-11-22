package Utilities;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.RemoteWebDriver;

import java.io.File;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;

public class Utilitati {
    public static RemoteWebDriver getRemoteWebDriver() throws MalformedURLException{
            // define URL Capabilities
//           URL -ul =  new URL("https://localhost:444");
//        ChromeOptions chromeOptions = new ChromeOptions();
        return new RemoteWebDriver(new URL("https://localhost:444"), new ChromeOptions());

    }

      public static ChromeDriver getChromeImplicitwait(int duration){
        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver");
        ChromeDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(duration));
        return driver;
      }

      public static ChromeDriver getChromeDriver() {
        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver" );
        // creez un obiect de tip  chrome driver
          return new ChromeDriver();
     }


    public static void takeScreenshot(String testcaseName, WebDriver driver) {
        String destination = null;

        try {
            TakesScreenshot screenshot = (TakesScreenshot) driver;
            File sourse = screenshot.getScreenshotAs(OutputType.FILE);
            destination = System.getProperty("user.dir") + "/Logs" + testcaseName + "png";
            FileUtils.copyFile(sourse, new File(destination));

        } catch (IOException e) {
            e.printStackTrace();
            System.out.println("Screenshot taken");
        }


    }



























}
