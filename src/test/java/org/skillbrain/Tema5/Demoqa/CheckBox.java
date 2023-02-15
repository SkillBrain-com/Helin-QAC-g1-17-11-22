
package org.skillbrain.Tema5.Demoqa;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CheckBox {
    public static void main(String[] args) throws Exception {
        goToCheckbox1();
    }
    public static void goToCheckbox1() throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
        ChromeDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://demoqa.com/checkbox");
        WebElement checkBox = driver.findElement(By.xpath("//label/span[1]"));
        checkBox.click();
        Thread.sleep(2000);
        WebElement expandPlusSign = driver.findElement(By.cssSelector(".rct-icon.rct-icon-expand-all"));
        expandPlusSign.click();
        Thread.sleep(2000);
        driver.quit();

        }
    }

