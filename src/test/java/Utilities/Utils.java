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
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Utils {

public static RemoteWebDriver getRemoteWebDriver() throws MalformedURLException {

    return new RemoteWebDriver(new URL("http://192.168.1.6:4444"), new ChromeOptions());
}
    public static WebDriver getChromeDriver(){
        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
        ChromeDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        return driver;

    }

    public static void takeScreenshot(WebDriver driver) throws IOException {
        String destinationFile = null;
        TakesScreenshot screenshot = (TakesScreenshot) driver;



        File source = screenshot.getScreenshotAs(OutputType.FILE);
        // LocalDate today = LocalDate.now();
        //LocalDateTime today_time = LocalDateTime.now();
        String DATE_FORMATTER= "yyyy-MM-dd-HHmmss";
        // System.out.println("Current Date="+today_time);
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern(DATE_FORMATTER);
        String formatDateTime = LocalDateTime.now().format(formatter);
        System.out.println("Formatted Time :" +formatDateTime);


        int i=1;
        FileUtils.copyFile(source, new File(System.getProperty("user.dir")+"\\Logs\\print-"+ formatDateTime + ".png"));
        i+=1;
    }


}