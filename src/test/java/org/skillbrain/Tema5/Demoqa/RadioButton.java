package org.skillbrain.Tema5.Demoqa;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class RadioButton {
    public static void main(String[] args) throws Exception {
        radioButton();
    }

    public static void radioButton() throws InterruptedException{
        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
        ChromeDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://demoqa.com/radio-button");
        WebElement radioButtonYes = driver.findElement(By.xpath("//label[@class='custom-control-label' and @for='yesRadio']"));
        radioButtonYes.click();
        Thread.sleep(2000);
        WebElement radioButtonImpressive =driver.findElement(By.xpath("//label[@class='custom-control-label' and @for='impressiveRadio']"));
        radioButtonImpressive.click();
        Thread.sleep(2000);
        driver.quit();
    }
}
