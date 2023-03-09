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

public class Utils {

    public static RemoteWebDriver getRemoteWebDriver() throws MalformedURLException {
        return new RemoteWebDriver(new URL("http://localhost:4444"), new ChromeOptions());

    }


    public static void main(String[] args) {

        System.out.println(System.getProperty("user.dir"));
    }
    public static void takeScreenshot(WebDriver driver){


        try {
            TakesScreenshot screenshot = (TakesScreenshot) driver;
            File sourse = screenshot.getScreenshotAs(OutputType.FILE);
            String destinationFile = System.getProperty("user.dir")
                    +"\\Logs\\printScreen.png";
            FileUtils.copyFile(sourse, new File(destinationFile));
        } catch (IOException e) {
            e.printStackTrace();
            System.out.println("Screenshot taken");

        }
        driver.quit();
        }



        public static WebDriver getChromeDriver(){
            ChromeOptions options = new ChromeOptions();
             options.addArguments("start-maximized");
       //      options.addArguments("--remote-allow-origins==*");
        //     options.addArguments("--headless");
        //     options.setHeadless(true); browser invizibil

            System.out.println("Started chrome driver with version:" +options.getBrowserVersion());
            System.setProperty("webdriver.chrome.driver ", "drivers/chromedriver.exe ");
            WebDriver driver =new ChromeDriver();// initializare
             driver.manage().window().maximize();
            // setam un wait global(implicit)
            driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
            return driver;
        }




    }


