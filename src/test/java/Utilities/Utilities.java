package Utilities;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.RemoteWebDriver;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Utilities {

    public static RemoteWebDriver getRemoteWebdriver() throws MalformedURLException {
        return new RemoteWebDriver(new URL("http://localhost:4444"), new ChromeOptions());
    }
public static WebDriver getChromeDriver() {
    System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
    ChromeDriver driver = new ChromeDriver();
    driver.manage().window().maximize();
    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
    return driver;
}


    public static void takeScreenshot(WebDriver driver) throws Exception {
        String destinationFile = null;
        TakesScreenshot screenshot = (TakesScreenshot) driver;
        File source = screenshot.getScreenshotAs(OutputType.FILE);
        String DATE_FORMATTER = "yyyy-MM-dd-HHmmss";
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern(DATE_FORMATTER);
        String formatDateTime = LocalDateTime.now().format(formatter);
        System.out.println("Formatted Time :" + formatDateTime);
        int i = 1;
        FileUtils.copyFile(source, new File(System.getProperty("user.dir") + "\\Logs\\print-" + formatDateTime + ".png"));
        i += 1;

    }
}



