package Utilitis;

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
import java.time.LocalDateTime;


public class Utils {
     public static RemoteWebDriver getRemoteWebdriver() throws MalformedURLException {
       return new RemoteWebDriver(new URL("http://localhost:4444"), new ChromeOptions());

     }

    // pentru print screen
    public static WebDriver getChromeDriver() {
        ChromeOptions options = new ChromeOptions();
        options.addArguments("start-maximized");
        // options.addArguments("headless");
        // options.setHeadless(true);
        System.setProperty("Chromedriver.chrome.driver", " .idea/drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver(options);
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(19));
        return driver;
    }

    //  public void takeScreenshot(WebDriver driver) throws IOException {
    public static void takeScreenshot(WebDriver driver) throws IOException {
          try {
            String destinationFile = null;
            TakesScreenshot screenshot = (TakesScreenshot) driver;
            File source = screenshot.getScreenshotAs(OutputType.FILE);
            destinationFile = System.getProperty("user.dir");

            destinationFile = System.getProperty("user.dir") + "C:\\Users\\stelu\\IdeaProjects\\Helin-QAC-g1-17-11-22\\imagine.png"
                    + "/Logs/printScreen-" + LocalDateTime.now() + ".png";
            FileUtils.copyFile(source, new File(destinationFile));


         } catch (IOException e) {
            e.printStackTrace();

         }

    }
}








