package Utilities;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.time.LocalDateTime;

public class Utils {


    public static WebDriver getChromeDriver() {
        ChromeOptions options = new ChromeOptions();
        options.addArguments("start-maximized");
        options.addArguments("--remote-allow-origins=*");
//        options.setHeadless(true);   browser invizibil
        System.setProperty("webdriver.chrome.driver" , "drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver(options);  // initilizare
//        driver.manage().window().maximize();
        // setam un wait global (implicit)
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
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
