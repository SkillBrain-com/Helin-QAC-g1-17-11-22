package org.skillbrain.lucianSimon.driver;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrowserManager {
    public static ChromeDriver createChromeDriver() {
        WebDriverManager.chromedriver().setup();
        return new ChromeDriver();

    }



}
