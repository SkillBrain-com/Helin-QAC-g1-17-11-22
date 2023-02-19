package Utilities;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.File;
import java.io.IOException;
import java.time.LocalDateTime;

public class Utils {


    public static WebDriver getChromeDriver() {
        System.setProperty("webdriver.chrome.driver" , "drivers/chromedriver");
        WebDriver driver = new ChromeDriver();
        return driver;
    }

    public static void takeScreenshot(WebDriver driver) throws IOException {
        String destinationFile = null;
        TakesScreenshot screenshot = (TakesScreenshot) driver;
        File source = screenshot.getScreenshotAs(OutputType.FILE);
        destinationFile = System.getProperty("user.dir")
                + "/Logs/printScreen-" + LocalDateTime.now() + ".png";
        FileUtils.copyFile(source, new File(destinationFile));
    }


}
