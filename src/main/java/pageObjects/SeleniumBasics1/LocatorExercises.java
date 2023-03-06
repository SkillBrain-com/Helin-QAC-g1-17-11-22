package pageObjects.SeleniumBasics1;

import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class LocatorExercises {

    public static ChromeDriver getGhromeWithWait() {
        System.setProperty("webdriver.chrome.driver","drivers/chromedriver");
        ChromeDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
        return driver;
    }


}
