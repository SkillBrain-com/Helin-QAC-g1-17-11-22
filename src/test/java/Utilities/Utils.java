package Utilities;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class Utils {


    /* public static void takeScreeshot(WebDriver driver) throws IOException{
            TakesScreenshot screenshot = (TakesScreenshot) driver;
            File source = screenshot.getScreenshotAs(OutputType.FILE);
           // String destinationFile = System.getProperty("user.dir") + "\\Logs\\printScreen" + LocalDateTime.now() + ".png";
            FileUtils.copyFile(source, new File(System.getProperty("user.dir")+ "\\Logs\\printscreen"+ LocalDate.now() + ".png"));
    }*/
    public static WebDriver getChromeDriver() {
        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        return driver;
    }




}
